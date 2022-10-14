package com.example.laboratorio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class StudentController {

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

}
