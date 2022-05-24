package no.ntnu.idata2001.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.ntnu.idata2001.MainApp;

import static javafx.application.Application.launch;

public class WarGamesApp extends Application {
    /**
     * Åpner applikasjonen på en seperat skjerm
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scenebuilder.fxml"));
            Parent root = fxmlLoader.load();
            MainMenuController MainMenuController = fxmlLoader.getController();
            Scene scene = new Scene(root, 700, 400);
            primaryStage.setTitle("Wargames");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}