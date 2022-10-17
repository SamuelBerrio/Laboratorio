package com.example.laboratorio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class StudentController {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @FXML
    private Button addStudent;

    @FXML
    private TextField emailStudent;

    @FXML
    private TextField idStudent;

    @FXML
    private TextField nameStudent;

    @FXML
    private TextField numberStudent;

    @FXML
    public ComboBox comboxCareer;

    @FXML
    private TreeTableColumn<?, ?> tableCareerStudent;

    @FXML
    private TreeTableColumn<?, ?> tableNameStudent;

    @FXML
    private TreeTableColumn<?, ?> tableYearsStudent;

    @FXML
    void elementChange(ActionEvent event) {

    }

    @FXML
    void loanChange(ActionEvent event) {

    }

    public void addStudentBtn(ActionEvent actionEvent) {

    }
}
