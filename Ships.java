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
public class Ships extends Application{
    //Application's method where Stage is parameter
    @Override

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ship Booking"); //set title for this window
        ComboBox<String> boxes = new ComboBox<>(); //Declaring ComboBox class

        for choosing items

//add all items
        boxes.getItems().addAll("Dhaka To Saint Martin(8am)", "Dhaka To Saint
                Martin(1pm)", "Dhaka To Saint Martin(7pm)","Dhaka To Saint Martin(11pm)");

                boxes.getItems().addAll("Saint Martin To Dhaka(10:30am)","Saint Martin To
                        Dhaka(1:30pm)","Saint Martin To Dhaka(7:15pm)","Saint Martin To Dhaka(10:30pm)");
        boxes.setPromptText("Choose a time: "); //This text displays in ComboBox to

        help the user what he want to choose

        Label sitclass = new Label("Select class"); //Declare label class for display text
        TextField classInput = new TextField(); //Declare TextField class to take input

        from user

        classInput.setPromptText("Ex: For 1st class type 1"); //This text displays in

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
            int shipPrice = msgLength*70; //multiplying 70 with the msg length and

            that will be the price

            String sitclasstring = classInput.getText().toString(); //the TextFeild of sit

            class converted string

            int sitclassNum = Integer.parseInt(sitclasstring); // the TextFeild of sit

            class converted string to double

            int sitclassPrice = sitclassNum*50; // Multiply 20 with sit class
            int totalPrice = shipPrice + sitclassPrice; //sum ship price and sit class
            Alert al=new Alert(AlertType.CONFIRMATION); //declaring Alert class

            for alert box

            al.setHeaderText("Your Price is"); // set header text in alert box
            al.setTitle("Price"); //set title in alert box
            al.setContentText(String.valueOf(totalPrice)+" tk"); //show the total ship

            cost

            al.show(); //alert box will display
        });
        Button confirm = new Button("Confirm"); //Declare a Button class for confirm

        order

        confirm.setTextFill(Color.WHITE); //set button text color
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

        root.getChildren().addAll(boxes, sitclass, classInput, pricebtn, confirm); //Adding

        all items(nodes) in VBox layout

        Scene scene = new Scene(root, 500, 350); //Declare Scene class for display the
        layout
        primaryStage.setResizable(false); //Stage can't be resize
        primaryStage.setScene(scene); //set the scene in the stage
        primaryStage.show(); //show the stage
    }
}