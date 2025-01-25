//Intro.java
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
//extends Application for javaFx
public class Intro extends Application{
    //main method
    public static void main(String[] args) {
        launch(args); //constructed the javaFx application by lauch(args)
    }
    //Application's method where primaryStage is parameter and Stage is the object datatype
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Intro Page"); //set title for this window which displays in

        the top of the stage
//intro Label
        Label introLabel = new Label("Welcome to Niye Jao"); //Declare label class for

        display text

        introLabel.setTextFill(Color.ORANGE); // set label text color
        introLabel.setFont(Font.font("Orelega One", FontWeight.BOLD,

                FontPosture.REGULAR, 40)); //set the font of the label text

        introLabel.setLayoutX(100); //set the position of level horizontally
        introLabel.setLayoutY(110); //set the position of level vertically
//sign up button
        Button SignUpBtn = new Button("Sign Up");//Declare a Button class for sign Up
        SignUpBtn.setTextFill(Color.WHITE); // set button text color
        SignUpBtn.setStyle("-fx-background-color: MediumSeaGreen"); //set button

        color by using CSS property

        SignUpBtn.setLayoutX(190); //set the position of level horizontally
        SignUpBtn.setLayoutY(190); //set the position of level vertically
//used lambda method for button's action
        SignUpBtn.setOnAction(e->{
            SignUpButton objbtn = new SignUpButton(); //Call the SignUp class
            objbtn.btnClick(); //Call the method from sign up class
        });
//sign In button

        Button SignInBtn = new Button("Sign In"); //Declare a Button class for sign Up
        SignInBtn.setTextFill(Color.WHITE); // set button text color
        SignInBtn.setStyle("-fx-background-color: MediumSeaGreen"); //set button color

        by using CSS property

        SignInBtn.setLayoutX(330); //set the position of level horizontally
        SignInBtn.setLayoutY(190); //set the position of level vertically
//used lambda method for button's action
        SignInBtn.setOnAction(e->{
            SignInButton objbtn = new SignInButton(); //Call the SignIn class
            objbtn.btnClick(); //Call the method from sign in class
        });
        Group root = new Group(); //Declare Group layout class
//Adding all items(nodes) in Group layout
        root.getChildren().addAll(introLabel, SignUpBtn, SignInBtn);
        Scene scene = new Scene(root, 650, 400); //Declare Scene class for display the

        layout

        primaryStage.setScene(scene);//set the scene in the stage
        primaryStage.setResizable(false); //Stage can't be resize
        primaryStage.show(); //show the stage
    }
}