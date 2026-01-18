package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BaseConverter extends Application {

    // Create an instance of your Logik class
    private Logik logik = new Logik();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Base Converter");

        // Create all UI elements
        Label inputLabel = new Label("Enter Number:");
        TextField inputField = new TextField();

        Label baseLabel = new Label("From Base (2-36):");
        TextField baseField = new TextField();

        Button convertButton = new Button("Convert to Decimal");

        Label resultLabel = new Label("Result:");
        TextField resultField = new TextField();
        resultField.setEditable(false);

        Label errorLabel = new Label("");
        errorLabel.setStyle("-fx-text-fill: red;"); // Make errors red

        // THIS IS WHERE YOU CONNECT YOUR CODE
        // When the button is clicked, this code runs
        convertButton.setOnAction(e -> {
            try {
                // Get the values from the text fields
                String input = inputField.getText().toUpperCase();
                int base = Integer.parseInt(baseField.getText());

                // Call YOUR conversion method
                int result = logik.conversionToDecimal(input, base);

                // Display the result
                resultField.setText(String.valueOf(result));
                errorLabel.setText(""); // Clear any previous errors

            } catch (NumberFormatException ex) {
                errorLabel.setText("Invalid base! Enter a number 2-36.");
            } catch (Exception ex) {
                errorLabel.setText("Invalid input! Check your number and base.");
            }
        });

        // Add all elements to the VBox container
        VBox root = new VBox(10);
        root.getChildren().addAll(
                inputLabel,
                inputField,
                baseLabel,
                baseField,
                convertButton,
                resultLabel,
                resultField,
                errorLabel
        );

        Scene scene = new Scene(root, 500, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}