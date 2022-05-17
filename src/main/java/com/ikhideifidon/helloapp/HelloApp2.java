package com.ikhideifidon.helloapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApp2 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Improved Hello JavaFX Application");
        VBox root = new VBox();
        root.setSpacing(5);
        Label nameLabel = new Label("Your Name: ");
        Label nameLabelMessage = new Label();
        TextField nameField = new TextField();


        Label locationLabel = new Label("Where are you located?");
        Label locationLabelMessage = new Label();
        TextField locationField = new TextField();

        Label identifierLabel = new Label("Are you a Manufacturer or a Supplier?");
        Label identifierLabelMessage = new Label();
        TextField identifierField = new TextField();

        Button homeButton = new Button("Welcome");
        homeButton.setStyle("-fx-text-fill: blue;");
        homeButton.setOnAction(e -> {
            String name;
            while (true) {
                name = nameField.getText();
                if (name.trim().length() > 0) {
                    nameLabelMessage.setText("Hello " + name);
                    break;
                } else {
                    nameLabelMessage.setText("Please enter a valid name");
                }
            }
        });

        Button locationButton = new Button("Location");
        locationButton.setOnAction(e -> {
            String location = locationField.getText();
            if (location.trim().length() > 0)
                locationLabelMessage.setText("Based on your information, you are located in " + location);
            else
                locationLabelMessage.setText("Your default location is United States of America");
        });

        Button identifierButton = new Button("Chain Identifier");
        identifierButton.setOnAction(e -> {
            String identifier = identifierField.getText();
            if (identifier.trim().length() > 0)
                identifierLabelMessage.setText("You are a " + identifier);
            else
                identifierLabelMessage.setText("Your default merchandise chain is supplier");
        });

        root.getChildren().addAll(homeButton, locationButton, identifierButton, nameLabel,
                locationLabel, identifierLabel, nameLabelMessage, locationLabelMessage, identifierLabelMessage,
                nameField, locationField, identifierField);
        Scene scene = new Scene(root, 500, 350);
        scene.getStylesheets().add("application.css");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
