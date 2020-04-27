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
    private int i =0;
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
        Menu menu2 = new Menu("Tools");
        valikko.getMenus().add(menu2);
        Menu subMenu2 = new Menu("Add java");
        Menu menu5 = new Menu("Help");
        valikko.getMenus().add(menu5);
        layout.setTop(menus);
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open file");
        MenuItem saveFile = new MenuItem("Save file");
        MenuItem separator = new MenuItem("------");
        MenuItem exit = new MenuItem("Exit");
        MenuItem aboutApp = new MenuItem("About");
        MenuItem help = new MenuItem("Help");
        MenuItem font = new MenuItem("Change font");
        MenuItem addMenuItem = new MenuItem("Add basic menu");
        subMenu2.getItems().add(addMenuItem);
        
        menu1.getItems().add(newFile);
        menu1.getItems().add(openFile);
        menu1.getItems().add(saveFile);
        menu1.getItems().add(separator);
        menu1.getItems().add(exit);
        menu2.getItems().add(font);
        menu2.getItems().add(subMenu2);
        menu5.getItems().add(aboutApp);
        menu5.getItems().add(help);

        exit.setOnAction(e -> System.exit(0));

        //Append text from add menu to textare(tekstikentta)
        addMenuItem.setOnAction(event -> {
            tekstikentta.appendText("MenuBar topMenu = new MenuBar();");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("VBox menus = new VBox(topMenu);");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("layout.setTop(topMenu)");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("Menu menu1 = new Menu(first menus name here ex.File);");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("topMenu.getMenus().add(menu1);");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("MenuItem menuItem1 = new MenuItem(menu item name here ex.New);");
            tekstikentta.appendText("\n");
            tekstikentta.appendText("menu1.getItems().add(menuItem1);");
        });
        Scene content = new Scene(layout,680, 460);
        stage.setScene(content);
        stage.show();


    }
    public static void main(String args[]) {
        launch(args);
    }

}
