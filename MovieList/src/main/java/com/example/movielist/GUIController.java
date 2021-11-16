package com.example.movielist;


import com.example.movielist.contollers.DBConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public String input;

    @FXML
    private TextField testTextField;

    public void startToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loginToStart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("start-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void startToCreate(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("createUser-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void createToStart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("start-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void createUserButton(ActionEvent event) {
        input = testTextField.getText();
        System.out.println("User Name Is " + input);
        if (input != "User Added"){
            DBConnect db = new DBConnect("testMovie.db");
            db.createNewDatabase();
            db.addUserTable();
            db.addUserData(input);
            testTextField.setText("User Added");
        }


    }
    public void exit(ActionEvent event) {
        //for now just exit, then later make sure saves occur
        System.exit(0);
    }



}