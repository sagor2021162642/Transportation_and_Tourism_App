import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
//extends Application for javaFx
public class CoverPage extends Application{
    //Application's method where argo is parameter and Stage is the object datatype
    @Override
    public void start(Stage arg0) throws Exception {
//background image
//Declare Image class to locate image from file
        Image img = new Image(new FileInputStream("C:\\Users\\sagorMahmud\\eclipse-workspace\\Group2Project\\src\\images\\Ridephoto.png"));

                ImageView imgView = new ImageView(img); //set the image in image view

        imgView.setLayoutX(0); //set the position of level horizontally
        imgView.setLayoutY(0); //set the position of level vertically
        Label introLabel1 = new Label("Welcome to"); //Declare label class for display

        text

        introLabel1.setTextFill(Color.DARKGREY); // set label text color
        introLabel1.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 40)); //set the font of the label text

        introLabel1.setLayoutX(30); //set the position of level horizontally
        introLabel1.setLayoutY(250); //set the position of level vertically
        Label introLabel2 = new Label("Niye Jao"); //Declare label class for display text
        introLabel2.setTextFill(Color.RED); // set label text color
        introLabel2.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 40)); //set the font of the label text

        introLabel2.setLayoutX(30); //set the position of level horizontally
        introLabel2.setLayoutY(300); //set the position of level vertically
//Rides Section
        Label Rides = new Label("Rides"); //Declare label class for display text
        Rides.setTextFill(Color.BLUE); // set label text color
        Rides.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 25)); //set the font of the label text

        Rides.setLayoutX(30); //set the position of level horizontally
        Rides.setLayoutY(480); //set the position of level vertically
//Bike ride
//Declare Image class to locate image from file
        Image bikeimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\bike.png"));
                ImageView bikeview = new ImageView(bikeimg); //set the image in image view
        bikeview.setFitHeight(80); //set image height
        bikeview.setPreserveRatio(true); //preserve the image
        Button bikebtn = new Button(); //Declare a Button class for bike img
        bikebtn.setTranslateX(150); //set button position horizontally
        bikebtn.setTranslateY(525); //set button position vertically
        bikebtn.setPrefSize(80, 80); //set button size
        bikebtn.setGraphic(bikeview); // set the img on the button
//used lambda method for button's action
        bikebtn.setOnAction(e->{
            Bike obj = new Bike(); //Call the bike page class
            obj.btnClick(); //Call the method from sign up class
        });
        Label bikeLabel = new Label("Bike"); //Declare label class for display text
        bikeLabel.setTextFill(Color.RED); // set label text color
        bikeLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        bikeLabel.setLayoutX(180); //set the position of level horizontally
        bikeLabel.setLayoutY(610); //set the position of level vertically

//Car ride
//Declare Image class to locate image from file
        Image carimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\car.png"));
                ImageView carview = new ImageView(carimg); //set the image in image view
        carview.setFitHeight(80); //set image height
        carview.setPreserveRatio(true); //preserve the image
        Button carbtn = new Button(); //Declare a Button class for car img
        carbtn.setTranslateX(400); //set button position horizontally
        carbtn.setTranslateY(525); //set button position vertically
        carbtn.setPrefSize(80, 80); //set button size
        carbtn.setGraphic(carview); // set the img on the button
//used lambda method for button's action
        carbtn.setOnAction(e->{
            Car obj = new Car(); //Call the bike page class
            obj.btnClick(); //Call the method from sign up class
        });
        Label carLabel = new Label("Car"); //Declare label class for display text
        carLabel.setTextFill(Color.RED); // set label text color
        carLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        carLabel.setLayoutX(440); //set the position of level horizontally
        carLabel.setLayoutY(610); //set the position of level vertically
//tour section
        Label tourPakages = new Label("Tour Pakages"); //Declare label class for

        display text

        tourPakages.setTextFill(Color.BLUE); // set label text color
        tourPakages.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 25)); //set the font of the label text

        tourPakages.setLayoutX(30); //set the position of level horizontally
        tourPakages.setLayoutY(650); //set the position of level vertically
//pakage1
//Declare Image class to locate image from file
        Image pakage1img = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\coxsbazar.jfif"));
                ImageView pakage1view = new ImageView(pakage1img); //set the image in image
        view
        pakage1view.setFitHeight(180); //set img height
        pakage1view.setFitWidth(180); //set img width
        pakage1view.setPreserveRatio(true); //preserve the image
        Button pakage1viewbtn = new Button(); //Declare a Button class for pakage1 img
        pakage1viewbtn.setTranslateX(50); //set button position horizontally
        pakage1viewbtn.setTranslateY(695); //set button position vertically
        pakage1viewbtn.setPrefSize(180, 180); //set button size
        pakage1viewbtn.setGraphic(pakage1view); // set the img on the button

//used lambda method for button's action
        pakage1viewbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Cox_Bazar obj = new Cox_Bazar(); //Call the cox's bazaar class
            obj.start(window); //call the method of cover page class
        });
        Label pakage1Label = new Label("Cox's Bazaar"); //Declare label class for display
        text

        pakage1Label.setTextFill(Color.RED); // set label text color
        pakage1Label.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        pakage1Label.setLayoutX(80); //set the position of level horizontally
        pakage1Label.setLayoutY(880); //set the position of level vertically
//pakage2
//Declare Image class to locate image from file
        Image pakage2img = new Image(new FileInputStream("C:\\Users\\SagorMahmud
                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\sajek.jpg"));
                ImageView pakage2view = new ImageView(pakage2img); //set the image in image
        view
        pakage2view.setFitHeight(180); //set img height
        pakage2view.setFitWidth(180); //set img width
        pakage2view.setPreserveRatio(true); //preserve the image
        Button pakage2viewbtn = new Button(); //Declare a Button class for pakage2 img
        pakage2viewbtn.setTranslateX(330); //set button position horizontally
        pakage2viewbtn.setTranslateY(695); //set button position vertically
        pakage2viewbtn.setPrefSize(180, 180); //set button size
        pakage2viewbtn.setGraphic(pakage2view); // set the img on the button
//used lambda method for button's action
        pakage2viewbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Sajek obj = new Sajek(); //Call the sajek class
            obj.start(window); //call the method of cover page class
        });
        Label pakage2Label = new Label("Sajek"); //Declare label class for display text
        pakage2Label.setTextFill(Color.RED); // set label text color
        pakage2Label.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        pakage2Label.setLayoutX(375); //set the position of level horizontally
        pakage2Label.setLayoutY(880); //set the position of level vertically
//pakage3
//Declare Image class to locate image from file
        Image pakage3img = new Image(new FileInputStream("C:\\Users\\SagorMahmud
                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\saintmartin.jpg"));
                ImageView pakage3view = new ImageView(pakage3img); //set the image in image
        view
        pakage3view.setFitHeight(180); //set img height

        pakage3view.setFitWidth(180); //set img width
        pakage3view.setPreserveRatio(true); //preserve the image
        Button pakage3viewbtn = new Button(); //Declare a Button class for pakage3 img
        pakage3viewbtn.setTranslateX(600); //set button position horizontally
        pakage3viewbtn.setTranslateY(695); //set button position vertically
        pakage3viewbtn.setPrefSize(180, 180); //set button size
        pakage3viewbtn.setGraphic(pakage3view); // set the img on the button
//used lambda method for button's action
        pakage3viewbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Saint_Martin obj = new Saint_Martin(); //Call the saint martin class
            obj.start(window); //call the method of cover page class
        });
        Label pakage3Label = new Label("Saint Martin"); //Declare label class for display text
        pakage3Label.setTextFill(Color.RED); // set label text color
        pakage3Label.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        pakage3Label.setLayoutX(640); //set the position of level horizontally
        pakage3Label.setLayoutY(880); //set the position of level vertically
//others section
        Label others = new Label("Others"); //Declare label class for display text
        others.setTextFill(Color.BLUE); // set label text color
        others.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 25)); //set the font of the label text

        others.setLayoutX(30); //set the position of level horizontally
        others.setLayoutY(950); //set the position of level vertically
//hotels
//Declare Image class to locate image from file
        Image hotelimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\hotel.jpg"));
                ImageView hotelview = new ImageView(hotelimg); //set the image in image
        view
        hotelview.setFitHeight(80); //set img height
        hotelview.setPreserveRatio(true); //preserve the image
        Button hotelbtn = new Button(); //Declare a Button class for pakage3 img
        hotelbtn.setTranslateX(90); //set button position horizontally
        hotelbtn.setTranslateY(990); //set button position vertically
        hotelbtn.setPrefSize(80, 80); //set button size
        hotelbtn.setGraphic(hotelview); // set the img on the button
//used lambda method for button's action
        hotelbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Hotel obj = new Hotel(); //Call the hotel class
//surrounded by try-catch method to catch the exception
            try {

                obj.start(window); //call the method of cover page class

            } catch (Exception e1) {
                e1.printStackTrace(); //console the exception
            }

        });
        Label hotelLabel = new Label("Hotels"); //Declare label class for display text
        hotelLabel.setTextFill(Color.RED); // set label text color
        hotelLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        hotelLabel.setLayoutX(110); //set the position of level horizontally
        hotelLabel.setLayoutY(1080); //set the position of level vertically
//Flight
//Declare Image class to locate image from file
        Image flightimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\flight.png"));
                ImageView flightview = new ImageView(flightimg); //set the image in image
        view
        flightview.setFitHeight(80); //set img height
        flightview.setPreserveRatio(true); //preserve the image
        Button flightbtn = new Button(); //Declare a Button class for flight img
        flightbtn.setTranslateX(290); //set button position horizontally
        flightbtn.setTranslateY(990); //set button position vertically
        flightbtn.setPrefSize(80, 80); //set button size
        flightbtn.setGraphic(flightview); // set the img on the button
//used lambda method for button's action
        flightbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Flights obj = new Flights(); //Call the flight class
//surrounded by try-catch method to catch the exception
            try {

                obj.start(window); //call the method of cover page class
            } catch (Exception e1) {
// TODO Auto-generated catch block
                e1.printStackTrace(); //console the exception
            }

        });
        Label flightLabel = new Label("Flights"); //Declare label class for display text
        flightLabel.setTextFill(Color.RED); // set label text color
        flightLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        flightLabel.setLayoutX(310); //set the position of level horizontally
        flightLabel.setLayoutY(1080); //set the position of level vertically
//ship
//Declare Image class to locate image from file
        Image shipimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\ship.png"));

                ImageView shipview = new ImageView(shipimg); //set the image in image view
        shipview.setFitHeight(80); //set img height
        shipview.setPreserveRatio(true); //preserve the image
        Button shipbtn = new Button(); //Declare a Button class for ship img
        shipbtn.setTranslateX(490); //set button position horizontally
        shipbtn.setTranslateY(990); //set button position vertically
        shipbtn.setPrefSize(80, 80); //set button size
        shipbtn.setGraphic(shipview); // set the img on the button
//used lambda method for button's action
        shipbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Ships obj = new Ships(); //Call the ship class
//surrounded by try-catch method to catch the exception
            try {

                obj.start(window); //call the method of cover page class
            } catch (Exception e1) {
// TODO Auto-generated catch block
                e1.printStackTrace(); //console the exception
            }

        });
        Label shipLabel = new Label("Ships"); //Declare label class for display text
        shipLabel.setTextFill(Color.RED); //set label text color
        shipLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        shipLabel.setLayoutX(510); //set the position of level horizontally
        shipLabel.setLayoutY(1080); //set the position of level vertically
//bus
//Declare Image class to locate image from file
        Image busimg = new Image(new FileInputStream("C:\\Users\\SagorMahmud

                Ahmed\\eclipse-workspace\\Group2Project\\src\\images\\bus.png"));
                ImageView busview = new ImageView(busimg); //set the image in image view
        busview.setFitHeight(80); //set img height
        busview.setPreserveRatio(true); //preserve the image
        Button busbtn = new Button(); //Declare a Button class for ship img
        busbtn.setTranslateX(690); //set button position horizontally
        busbtn.setTranslateY(990); //set button position vertically
        busbtn.setPrefSize(80, 80); //set button size
        busbtn.setGraphic(busview); // set the img on the button
//used lambda method for button's action
        busbtn.setOnAction(e->{
            Stage window = new Stage(); //Create a new stage
            Bus obj = new Bus(); //Call the ship class
//surrounded by try-catch method to catch the exception
            try {

                obj.start(window); //call the method of cover page class
            } catch (Exception e1) {

                e1.printStackTrace(); //console the exception
            }

        });
        Label busLabel = new Label("Buses"); //Declare label class for display text
        busLabel.setTextFill(Color.RED); //set label text color
        busLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 20)); //set the font of the label text

        busLabel.setLayoutX(710); //set the position of level horizontally
        busLabel.setLayoutY(1080); //set the position of level vertically
//Declare Group layout class
        Group root = new Group();
//Adding all items(nodes) in Group layout
        root.getChildren().addAll(imgView, introLabel1, introLabel2, Rides, bikebtn,
                bikeLabel, carbtn, carLabel, tourPakages, pakage1viewbtn, pakage1Label, pakage2viewbtn,
                pakage2Label, pakage3viewbtn, pakage3Label, others, hotelbtn, hotelLabel, flightbtn,
                flightLabel, shipbtn, shipLabel, busbtn, busLabel);
        ScrollPane scroll = new ScrollPane(); //Declare ScrollPane class for scrolling
        scroll.setPrefSize(800, 690); //set scroll size
        scroll.setContent(root); //set layout in scrollPane
        Scene scene = new Scene(scroll, 800, 690); //Declare Scene class for display the layout
        arg0.setScene(scene); //set the scene in the stage
        arg0.setResizable(false); //Stage can't be resize
        arg0.setTitle("Niye Jao"); //set the title
        arg0.show(); //show the stage
    }
}