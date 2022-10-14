package com.example.laboratorio.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchScene1(String url, ActionEvent e) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource(url)));
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
