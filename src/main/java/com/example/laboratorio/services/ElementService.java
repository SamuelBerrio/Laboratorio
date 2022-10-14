package com.example.laboratorio.services;

import com.example.laboratorio.model.Element;
import javafx.collections.ObservableList;

public interface ElementService {
    void buttonAddE(String name, String amount, String material, Double price);
    public ObservableList<Element> getObservableListElement ();

}
