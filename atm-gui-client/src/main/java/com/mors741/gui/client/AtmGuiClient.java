package com.mors741.gui.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AtmGuiClient extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("console.fxml"));

        primaryStage.setTitle("ATM Console");
        Scene scene = new Scene(root, 300, 150);

        String style = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().addAll(style);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
