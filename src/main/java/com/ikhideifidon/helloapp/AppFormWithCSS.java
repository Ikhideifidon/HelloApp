package com.ikhideifidon.helloapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AppFormWithCSS extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Welcome!");
        stage.show();

        // Create a GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        // Add Texts, Labels and Text Fields
        Text sceneTitle = new Text("Welcome");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User Name");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password");
        grid.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);
//        grid.setGridLinesVisible(true);

        // Add a Button and Text
        Button signInButton = new Button("Sign in");
        HBox  horizontalLayout = new HBox(10);
        signInButton.setAlignment(Pos.BOTTOM_RIGHT);
        horizontalLayout.getChildren().add(signInButton);
        grid.add(horizontalLayout, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        actionTarget.setId("actiontarget");

        // Add code to handle an event
        signInButton.setOnAction(e -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in Button pressed");
        });

        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        scene.getStylesheets().add("application.css");
        stage.show();
    }
}
