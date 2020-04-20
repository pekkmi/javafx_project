package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX code editor by:Mika Pekkala ");
        stage.initStyle(StageStyle.DECORATED);
        TextArea tekstikentta = new TextArea();
        BorderPane layout = new BorderPane();
        layout.setCenter(tekstikentta);
        Button clearText = new Button("Clear");
        Button click2 = new Button("Click2!");
        HBox ylapalkki = new HBox(clearText, click2);
        layout.setTop(ylapalkki);
        clearText.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                tekstikentta.clear();
            }
        });
        Scene content = new Scene(layout,680, 460);
        stage.setScene(content);
        stage.show();


    }
    public static void main(String args[]) {
        launch(args);
    }

}
