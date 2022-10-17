package com.example.laboratorio.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.laboratorio.model.Element;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ElementController implements Initializable {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addElement;

    @FXML
    private TextField amountElement;

    @FXML
    private TextField materialElement;

    @FXML
    private TextField nameElement;

    @FXML
    private TextField priceElement;

    @FXML
    private TableColumn<?, ?> tableAmountElement;

    @FXML
    private TableColumn<?, ?> tableMaterialElement;

    @FXML
    private TableColumn<Element, String> tableNameElement;
    @FXML
    public TableColumn <Element, Double> tablePriceElement;

    @FXML
    private TableView<Element> tblElement;

    @FXML
    void buttonAddE(ActionEvent event) {
        String name = String.valueOf(this.nameElement.getText());
        String amount = String.valueOf(this.amountElement.getText());
        String material = String.valueOf(this.materialElement.getText());
        Double price = Double.parseDouble(this.amountElement.getText());

        mfc.buttonAddE(name,amount,material,price);
        tblElement.setItems(mfc.laboratorio.getElementService().getObservableListElement());

    }

    @FXML
    void loanChange(ActionEvent event) {

    }

    @FXML
    void studentChange(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableAmountElement.setCellValueFactory(new PropertyValueFactory<>("amount"));
        tableMaterialElement.setCellValueFactory(new PropertyValueFactory<>("material"));
        tableNameElement.setCellValueFactory(new PropertyValueFactory<>("name"));



    }
}



