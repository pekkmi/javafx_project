package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        BorderPane layout = new BorderPane();
        TextArea tekstikentta = new TextArea();
        MenuBar valikko = new MenuBar();

        Button clearText = new Button("Clear");
        Button click2 = new Button("Click2!");
        HBox ylapalkki = new HBox(clearText, click2);
        layout.setTop(ylapalkki);
        clearText.setOnAction(e -> tekstikentta.clear());

        VBox menus = new VBox(valikko, ylapalkki);

        layout.setCenter(tekstikentta);

        Menu menu1 = new Menu("File");
        valikko.getMenus().add(menu1);
        layout.setTop(menus);
        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");
        MenuItem separator = new MenuItem("------");
        MenuItem exit = new MenuItem("Exit");

        menu1.getItems().add(menuItem1);
        menu1.getItems().add(menuItem2);
        menu1.getItems().add(separator);
        menu1.getItems().add(exit);

        exit.setOnAction(e -> System.exit(0));

        Scene content = new Scene(layout,680, 460);
        stage.setScene(content);
        stage.show();


    }
    public static void main(String args[]) {
        launch(args);
    }

}
