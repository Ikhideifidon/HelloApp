package com.ikhideifidon.helloapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApp extends Application {
    @Override
    public void start(Stage stage) {
        // Improve the App
        Label nameLabel = new Label("Enter your name:");
        TextField nameField = new TextField();

        Label labelMessage = new Label();
        labelMessage.setStyle("-fx-text-fill: blue;");

        // Create buttons
        Button sayHelloButton = new Button("Say Hello");
        Button exitButton = new Button("Exit");

        // Add the event handler for the Say Hello button
        sayHelloButton.setOnAction(e -> {
            String name = nameField.getText();
            if (name.trim().length() > 0)
                labelMessage.setText("Hello " + name);
            else
                labelMessage.setText("Hello Stranger");
        });

        // Add the event handler for the exit button
        exitButton.setOnAction(e -> Platform.exit());

        // Create a VBox root node
        VBox root = new VBox();

        // Set the vertical spacing between children to 5px
        root.setSpacing(5);


        // Add children to the root node.
        root.getChildren().addAll(nameLabel, nameField, labelMessage, sayHelloButton, exitButton);

        // Create a scene
        Scene scene = new Scene(root, 350, 150);

        // Set the scene to the stage
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}