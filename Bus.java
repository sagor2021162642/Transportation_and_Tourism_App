import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//extends Application for javaFx
public class Bus extends Application{
//Application's method where Stage is parameter

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Bus Booking"); //set title for this window
        ComboBox<String> boxes = new ComboBox<>(); //Declaring

        ComboBox class for choosing items
//add all items
        boxes.getItems().addAll("Dhaka To Cox's Bazar(8am)", "Dhaka To Cox's

                Bazar(12pm)", "Dhaka To Cox's Bazar(6pm)","Dhaka To Cox's Bazar(11pm)");
        boxes.getItems().addAll("Dhaka To Sajek(9:30am)","Dhaka To

                Sajek(12:30pm-1:15pm)","Dhaka To Sajek(6:30pm-7:15pm)","Dhaka To Sajek(10:30pm-
                11:15pm)");

        boxes.getItems().addAll("Sajek To Dhaka(10am)","Sajek To

                Dhaka(1pm)","Sajek To Dhaka(6pm)","Sajek To Dhaka(10:45pm)");

        boxes.getItems().addAll("Cox's Bazar To Dhaka(10:30am)","Cox's Bazar
                To Dhaka(1:30pm)","Cox's Bazar To Dhaka(6:30pm)","Cox's Bazar To Dhaka(10:30pm)");
        boxes.getItems().addAll("Dhaka To Saint Martin(8am)", "Dhaka To Saint

                Martin(1pm)", "Dhaka To Saint Martin(7pm)","Dhaka To Saint Martin(11pm)");

                boxes.getItems().addAll("Saint Martin To Dhaka(10:30am)","Saint Martin
                        To Dhaka(1:30pm)","Saint Martin To Dhaka(7:15pm)","Saint Martin To Dhaka(10:30pm)");
        boxes.setPromptText("Choose a time: "); //This text displays in

        ComboBox to help the user what he want to choose

        Button pricebtn = new Button("Get Price"); //Declare a Button class for

        price

        pricebtn.setTextFill(Color.WHITE); // set button text color
        pricebtn.setStyle("-fx-background-color: Orange"); //set button color by

        using CSS property

//used lambda method for button's action
        pricebtn.setOnAction(e->{
            String msg = boxes.getValue().toString(); //the box's item which

            user select converted in string

            int msgLength = msg.length(); //get the length of the msg
            int busPrice = msgLength*5; //multiplying 5 with the msg length

            and that will be the price

            Alert al=new Alert(AlertType.CONFIRMATION); //declaring

            Alert class for alert box

            al.setHeaderText("Your Price is"); // set header text in alert box
            al.setTitle("Price"); //set title in alert box
            al.setContentText(String.valueOf(busPrice)+" tk"); //show the

            price of the bus ride

            al.show(); //alert box will display
        });
        Button confirm = new Button("Confirm"); //Declare a Button class for

        confirm order

        confirm.setTextFill(Color.WHITE); // set button text color

        confirm.setStyle("-fx-background-color: MediumSeaGreen"); //set button

        color by using CSS property

//used lambda method for button's action
        confirm.setOnAction(e->{
            Alert al=new Alert(AlertType.CONFIRMATION); //declaring

            Alert class for alert box

            al.setHeaderText("Order Confirmation"); // set header text in alert

            box

            al.setTitle("Confirm Order"); //set title in alert box
            al.show(); //alert box will display
        });
        VBox root = new VBox(10); //Declare vBox layout to set all items

        vertically create 10px gap to each other

        root.setPadding(new Insets(20, 20, 20, 20)); //padding creates space in

        four side's border

        root.getChildren().addAll(boxes, pricebtn, confirm); //Adding all

        items(nodes) in VBox layout

        Scene scene = new Scene(root, 500, 350); //Declare Scene class for

        display the layout

        primaryStage.setResizable(false); //Stage can't be resize
        primaryStage.setScene(scene); //set the scene in the stage
        primaryStage.show(); //show the stage

    }
}