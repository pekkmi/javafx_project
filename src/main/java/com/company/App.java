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
    public void start(Stage stage) {    //Create new window
        stage.setTitle("JavaFX code editor by:Mika Pekkala "); //Set title of the window
        stage.initStyle(StageStyle.DECORATED); //Make a choise of window style
        BorderPane layout = new BorderPane(); //Make a borderpane layout object
        TextArea tekstikentta = new TextArea(); //Make a textarea
        MenuBar valikko = new MenuBar(); // Make top menu

        Button clearText = new Button("Clear"); //Make two buttons and add them to the top of window
        Button click2 = new Button("Click2!");
        HBox ylapalkki = new HBox(clearText, click2); //Here i add the two buttons to horizontal box
        layout.setTop(ylapalkki); //Here i deside to set horizontal box to top of the window
        clearText.setOnAction(e -> tekstikentta.clear()); //This line makes the clear button to clear the text area

        VBox menus = new VBox(valikko, ylapalkki); //Here i make a vertical box and put menu and two buttons in top of the window

        layout.setCenter(tekstikentta); // Here i make the text area to appear in the middle of the window

        //Here i make the menus and menuitems
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
        MenuItem addMenuItem = new MenuItem("Add basic javaFX menu");
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

        //Append text from add menu to textarea(tekstikentta)
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
