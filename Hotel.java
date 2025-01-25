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
public class Hotel extends Application{
    //Application's method where Stage is parameter
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hotel Booking"); //set title for this window
        ComboBox<String> boxes = new ComboBox<>();//Declaring ComboBox class for
        choosing items
//add all items
        boxes.getItems().addAll("Prasad Paradise(Cox's Bazar)", "Mermaid Eco Resort(Cox's
                Bazar)", "Lagunga Beach Hotel and Resort(Cox's Bazar)","Hotel Marine Plaza(Cox's Bazar)",
        "Windy Terrace Boutique Hotel(Cox's Bazar)");
        boxes.getItems().addAll("Salka Eco Resort(Sajek)","Sajeck Classic
                Resorts(sajek)","Sajek Resort(Sajek)","Megh Kabbo Hill Top Cottage(Sajek)");
                boxes.getItems().addAll("Milky resort(Saint martin)","Fantasy Hotel and Resort(Saint
                        Martin)","Green Land Resort(Saint Martin)","Sunset Serenty(Saint Martin)");
                boxes.setPromptText("Choose a hotel"); //This text displays in ComboBox to help the
        user what he want to choose

        Label days = new Label("Stay days: "); //Declare label class for display text
        TextField daysInput = new TextField(); //Declare TextField class to take input

        from use

        daysInput.setPromptText("Total days"); //This text displays in TextFeild to help

        the user what he want to input

        Button pricebtn = new Button("Get Price"); //Declare a Button class for price
        pricebtn.setTextFill(Color.WHITE); // set button text color
        pricebtn.setStyle("-fx-background-color: Orange"); //set button color by using

        CSS property

//used lambda method for button's action
        pricebtn.setOnAction(e->{
            String msg = boxes.getValue().toString(); //the box's item which user

            select converted in string

            int msgLength = msg.length(); //get the length of the msg
            int hotelPrice = msgLength*100; //multiplying 100 with the msg length

            and that will be the price

            String dayString = daysInput.getText().toString(); //the TextFeild of days

            converted string

            int daysNum = Integer.parseInt(dayString); // the TextFeild of days

            converted string to double

            int daysPrice = daysNum*50; // Multiply 50 with days
            int totalPrice = hotelPrice + daysPrice; //sum hotel price and days class
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

        root.getChildren().addAll(boxes, days, daysInput, pricebtn, confirm); //Adding all

        items(nodes) in VBox layout

        Scene scene = new Scene(root, 500, 350); //Declare Scene class for display the

        layout

        primaryStage.setResizable(false);//Stage can't be resize
        primaryStage.setScene(scene); //set the scene in the stage
        primaryStage.show(); //show the stage
    }
}