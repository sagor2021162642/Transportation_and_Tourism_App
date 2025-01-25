import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//extends Application for javaFx
public class Flights extends Application{
    //Application's method where Stage is parameter
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Flight Booking"); //set title for this window
        ComboBox<String> boxes = new ComboBox<>(); //Declaring ComboBox class

        for choosing items
//add all items

        boxes.getItems().addAll("Dhaka To Cox's Bazar(8am-9am)", "Dhaka To Cox's
                Bazar(12pm-1pm)", "Dhaka To Cox's Bazar(6pm-7pm)","Dhaka To Cox's Bazar(10pm-11pm)",
        "Cox's Bazar To Dhaka(8am-9am)","Cox's Bazar To Dhaka(12pm-1pm)","Cox's Bazar To
        Dhaka(6pm-7pm)","Cox's Bazar To Dhaka(10pm-11pm)");

        boxes.getItems().addAll("Dhaka To Sajek(9:30am-10:15am)","Dhaka To

                Sajek(12:30pm-1:15pm)","Dhaka To Sajek(6:30pm-7:15pm)","Dhaka To Sajek(10:30pm-
                11:15pm)");

        boxes.getItems().addAll("Sajek To Dhaka(10am-10:45am)","Sajek To
                Dhaka(1pm-1:45pm)","Sajek To Dhaka(6pm-6:45pm)","Sajek To Dhaka(10pm-10:45pm)");
        boxes.getItems().addAll("Cox's Bazar To Dhaka(10:30am-11:15am)","Cox's
                Bazar To Dhaka(1:30pm-2:15pm)","Cox's Bazar To Dhaka(6:30pm-7:15pm)","Cox's Bazar To
        Dhaka(10:30pm-11:15pm)");

        boxes.setPromptText("Choose a flight"); //This text displays in ComboBox to

        help the user what he want to choose

        Label sitClass = new Label("Select sit class"); //Declare label class for display

        text

        TextField sitClassInput = new TextField(); //Declare TextField class to take input

        from user

        sitClassInput.setPromptText("Ex: For 1st class type 1"); //This text displays in

        TextFeild to help the user what he want to input

        Button pricebtn = new Button("Get Price"); //Declare a Button class for price
        pricebtn.setTextFill(Color.WHITE); // set button text color
        pricebtn.setStyle("-fx-background-color: Orange"); //set button color by using

        CSS property

//used lambda method for button's action
        pricebtn.setOnAction(e->{
            String msg = boxes.getValue().toString(); //the box's item which user

            select converted in string

            int msgLength = msg.length(); //get the length of the msg
            int flightPrice = msgLength*70; //multiplying 70 with the msg length and

            that will be the price

            String sitClasstring = sitClassInput.getText().toString(); //the TextFeild of

            sit class converted string

            int sitClassNum = Integer.parseInt(sitClasstring); // the TextFeild of sit

            class converted string to double

            int sitClassPrice = sitClassNum*50; // Multiply 20 with sit class
            int totalPrice = flightPrice + sitClassPrice; //sum flight price and sit class
            Alert al=new Alert(AlertType.CONFIRMATION); //declaring Alert class

            for alert box

            al.setHeaderText("Your Price is"); // set header text in alert box
            al.setTitle("Price"); //set title in alert box
            al.setContentText(String.valueOf(totalPrice)+" tk"); //show the total flight

            cost

            al.show(); //alert box will display
        });

        Button confirm = new Button("Confirm"); //Declare a Button class for confirm

        order

        confirm.setTextFill(Color.WHITE); // set button text color
        confirm.setStyle("-fx-background-color: MediumSeaGreen"); //set button color

        by using CSS property

//used lambda method for button's action
        confirm.setOnAction(e->{
            Alert al=new Alert(AlertType.CONFIRMATION); //declaring Alert class

            for alert box

            al.setHeaderText("Order Confirmation"); // set header text in alert box
            al.setTitle("Confirm Order"); //set title in alert box
            al.show(); //alert box will display
        });
        VBox root = new VBox(10); //Declare vBox layout to set all items vertically and

        create 10px gap to each other

        root.setPadding(new Insets(20, 20, 20, 20)); //padding creates space in four side's

        border

        root.getChildren().addAll(boxes, sitClass, sitClassInput, pricebtn, confirm);

//Adding all items(nodes) in VBox layout

        Scene scene = new Scene(root, 500, 350); //Declare Scene class for display the

        layout

        primaryStage.setResizable(false); //Stage can't be resize
        primaryStage.setScene(scene); //set the scene in the stage
        primaryStage.show(); //show the stage
    }
}