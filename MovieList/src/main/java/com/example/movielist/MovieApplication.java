package com.example.movielist;

import com.example.movielist.contollers.DBConnect;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            DBConnect db = new DBConnect("testMovie.db");
            db.createNewDatabase();
            db.addUserTable();
            Parent root = FXMLLoader.load(getClass().getResource("start-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}