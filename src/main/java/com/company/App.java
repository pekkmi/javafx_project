package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX code editor by:Mika Pekkala ");
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(true);
        stage.show();
        Scene clear = new Scene(new Button("Click!"));
        stage.setScene(clear);


    }
    public static void main(String args[]) {
        launch(args);
    }

}
