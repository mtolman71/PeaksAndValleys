package peaksAndValleys;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	
    		window = primaryStage;
        window.setTitle("Peaks And Valleys");
        
        //Scene 1
        Label label1 = new Label("You are the god of time; your job is keeping track of all existence past, "
        		+ "present and future. Basically the ultimate historian. But suddenly you discover the existence "
        		+ "of someone who well…shouldn’t exist.");
        Button button1 = new Button("I didn't authorize this. \n \n But who did??");
        Button optB = new Button("Meh. Let them be. I have enough things to worry about.");
        Button obtC = new Button("Quick. Get their info. Record it. Otherwise " + "SHE"  + " will find out.");
        Button optD = new Button("You rack your brain. How could this have happend? Where did they come from? "
        		+ "Why are they here? How LONG have they been here? And most importantly, how did you miss it?");
        
        label1.setTextFill(Color.web("#AAAAAA"));
        label1.setStyle("-fx-font: 30 times;" +
        				"-fx-background-color: #000000;" +
        				"-fx-opacity: 0.8;");
        button1.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        optB.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        obtC.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        optD.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        label1.setWrapText(true);
        optB.setWrapText(true);
        obtC.setWrapText(true);
        optD.setWrapText(true);
        
        
        HBox testH = new HBox();
		Button bA = new Button("File");
		Button bB = new Button("Edit");
		Button bC = new Button("Settings");
		testH.setPadding(new Insets(15,15,15,15));
		testH.setSpacing(5);
		bA.setStyle("-fx-background-color: #AAAAAA");
		bB.setStyle("-fx-background-color: #AAAAAA");
		bC.setStyle("-fx-background-color: #AAAAAA");
		testH.getChildren().addAll(bA, bB, bC);
		
		
		VBox testV = new VBox();
		Button vA = new Button("Next");
		vA.setStyle("-fx-font: 14 times;" +
				"-fx-background-color: #AAAAAA");
		vA.setMaxHeight(Double.MAX_VALUE);
		vA.setPrefHeight(300);
		vA.setPrefWidth(75);
		testV.getChildren().addAll(vA);
		testV.setAlignment(Pos.CENTER_RIGHT);
		vA.setOnAction(e -> window.setScene(scene2));
		
		VBox homeButton = new VBox();
		Button hB = new Button("Home");
		hB.setStyle("-fx-font: 14 times;" +
				"-fx-background-color: #AAAAAA");
		hB.setMaxHeight(Double.MAX_VALUE);
		hB.setPrefHeight(300);
		hB.setPrefWidth(75);
		homeButton.getChildren().addAll(hB);
		homeButton.setAlignment(Pos.CENTER_LEFT);
		hB.setOnAction(e -> window.setScene(scene1));
		
		
		GridPane testCent = new GridPane();
		ColumnConstraints c1 = new ColumnConstraints();
		ColumnConstraints c2 = new ColumnConstraints();
		c1.setPercentWidth(50);
		c2.setPercentWidth(50);
		testCent.getColumnConstraints().addAll(c1, c2);
		GridPane.setRowSpan(testCent, 1);
		//testCent.setGridLinesVisible(true);
		testCent.setVgap(10);
		testCent.setHgap(10);
		
		testCent.add(label1, 0, 0);
		GridPane.setColumnSpan(label1, 2);
		GridPane.setHalignment(label1, HPos.CENTER);
		GridPane.setFillWidth(label1, true);
		label1.setMaxWidth(Double.MAX_VALUE);
		label1.setPrefWidth(Double.MAX_VALUE);
		label1.setWrapText(true);
		label1.setTextAlignment(TextAlignment.JUSTIFY);
		
		testCent.add(button1, 0, 1);
		GridPane.setFillHeight(button1, true);
		GridPane.setFillWidth(button1, true);
		button1.setMaxWidth(Double.MAX_VALUE);
		button1.setMaxHeight(Double.MAX_VALUE);
		button1.setPrefWidth(345);
		button1.setWrapText(true);
		GridPane.setFillHeight(button1, true);
		button1.setTextAlignment(TextAlignment.JUSTIFY);
		testCent.add(optB, 1,1);
		GridPane.setFillWidth(optB, true);
		optB.setMaxWidth(Double.MAX_VALUE);
		optB.setMaxHeight(Double.MAX_VALUE);
		optB.setPrefWidth(345);
		GridPane.setHalignment(optB, HPos.CENTER);
		GridPane.setFillWidth(optB, true);
		GridPane.setFillHeight(optB, true);
		GridPane.setColumnSpan(optB, 1);
		testCent.add(obtC, 0, 2);
		GridPane.setFillWidth(obtC, true);
		GridPane.setFillHeight(obtC, true);
		obtC.setMaxHeight(Double.MAX_VALUE);
		obtC.setMaxWidth(Double.MAX_VALUE);
		obtC.setPrefWidth(345);
		GridPane.setHalignment(obtC, HPos.CENTER);
		GridPane.setFillWidth(obtC, true);
		testCent.add(optD, 1, 2);
		optD.setMaxWidth(Double.MAX_VALUE);
		optD.setMaxHeight(Double.MAX_VALUE);
		GridPane.setFillWidth(optD, true);
		GridPane.setFillHeight(optD, true);
		optD.setPrefWidth(345);
		GridPane.setHalignment(optD, HPos.CENTER);
		GridPane.setFillWidth(optD, true);
		testCent.setAlignment(Pos.CENTER);
		
		
		
		BorderPane bp = new BorderPane();
		bp.setLeft(homeButton);
		bp.setRight(testV);
		bp.setCenter(testCent);
		BorderPane.setMargin(testCent, new Insets(50,50,50,50));
		
		String i1 = this.getClass().getResource("mount_grey_trans.png").toExternalForm();
		bp.setStyle("-fx-background-image: url('" + i1 + "'); " +
		           "-fx-background-position: center center; " +
		           "-fx-background-repeat: stretch;");
		
        //Layout 1 - VBox
        scene1 = new Scene(bp, 1000, 600);
        
        /*
        HBox testH2 = new HBox();
		Button bA2 = new Button("File");
		Button bB2 = new Button("Edit");
		Button bC2 = new Button("Settings");
		testH2.setPadding(new Insets(15,15,15,15));
		testH2.setSpacing(5);
		bA2.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
		bB2.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
		bC2.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
		testH2.getChildren().addAll(bA2, bB2, bC2);
		*/
        
		VBox testV2 = new VBox();
		Button vA2 = new Button("Next");
		vA2.setStyle("-fx-font: 14 times;" +
				"-fx-background-color: #AAAAAA");
		vA2.setMaxHeight(Double.MAX_VALUE);
		vA2.setPrefHeight(300);
		vA2.setPrefWidth(75);
		testV2.getChildren().addAll(vA2);
		testV2.setAlignment(Pos.CENTER_RIGHT);
		vA2.setOnAction(e -> window.setScene(scene1));
		
		VBox homeButton2 = new VBox();
		Button hB2 = new Button("Home");
		hB2.setStyle("-fx-font: 14 times;" +
				"-fx-background-color: #AAAAAA");
		hB2.setMaxHeight(Double.MAX_VALUE);
		hB2.setPrefHeight(300);
		hB2.setPrefWidth(75);
		homeButton2.getChildren().addAll(hB2);
		homeButton2.setAlignment(Pos.CENTER_LEFT);
		hB2.setOnAction(e -> window.setScene(scene1));
		
        VBox testCent2 = new VBox();
        Label s2 = new Label("You somehow find out the exact date and time of your death in advance. June 19th. "
        		+ "Six months from now.");
        s2.setTextFill(Color.web("#AAAAAA"));
        s2.setStyle("-fx-font: 30 times;" +
        				"-fx-background-color: #000000;" +
        				"-fx-opacity: 0.8;");
        s2.setTextAlignment(TextAlignment.JUSTIFY);
        testCent2.setMaxWidth(700);
        Button s21 = new Button("You know that nothing else is going to kill you until your time comes, and so "
        		+ "you go all out.");
        Button s22 = new Button("You stare at the words written on the small slip of paper the oracle gave you. I"
        		+ "s she a quack? No- she predicted a whole lot of other things right, things you’ve never told anyone, "
        		+ "like the name of the girl you’re in love with and the fact that you know you’re adopted but your "
        		+ "parents never officially told you. She’s real. It’s all legit.");
        Button s23 = new Button("You spend a few days in a state of panic. There’s so much you haven’t done yet, "
        		+ "you’re only twenty-three, you’ve just barely graduated college and you still have tons of things "
        		+ "you want to do with your life.");
        s21.setStyle("-fx-font: 18 times;" +
        				"-fx-background-color: #AAAAAA");
        s22.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        s23.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
        testCent2.setSpacing(10);
		testCent2.getChildren().addAll(s2, s21, s22, s23);
		testCent2.setAlignment(Pos.CENTER);
		s21.setPrefWidth(Double.MAX_VALUE);
		s21.setTextAlignment(TextAlignment.JUSTIFY);
		s22.setTextAlignment(TextAlignment.JUSTIFY);
		s23.setTextAlignment(TextAlignment.JUSTIFY);
		s2.setWrapText(true);
        s21.setWrapText(true);
        s22.setWrapText(true);
        s23.setWrapText(true);
        
        HBox bottPane = new HBox();
        Button hS = new Button("View High Scores");
		bottPane.setPadding(new Insets(5,5,5,5));
		bottPane.setSpacing(5);
		bottPane.setStyle("-fx-background-color: #000000");
		hS.setStyle("-fx-font: 18 times;" +
				"-fx-background-color: #AAAAAA");
		bottPane.getChildren().addAll(hS);
		hS.setPadding(new Insets(5,50,5,50));
        hS.setAlignment(Pos.CENTER_RIGHT);
        bottPane.setAlignment(Pos.BASELINE_RIGHT);
        
        BorderPane bp2 = new BorderPane();
        bp2.setBottom(bottPane);
        bp2.setLeft(homeButton2);
		bp2.setRight(testV2);
		bp2.setCenter(testCent2);
		String i2 = this.getClass().getResource("mount_grey_trans.png").toExternalForm();
		bp2.setStyle("-fx-background-image: url('" + i2 + "'); " +
		           "-fx-background-position: center center; " +
		           "-fx-background-repeat: stretch;");

        //Layout 2
        scene2 = new Scene(bp2, 1000, 600);
        
        
        //Display scene 1 at first
        
        window.setScene(scene1);
        window.show();
        
    }

}