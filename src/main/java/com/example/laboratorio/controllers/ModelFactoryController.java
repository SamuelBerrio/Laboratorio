package com.example.laboratorio.controllers;
import com.example.laboratorio.model.Element;
import com.example.laboratorio.services.impl.Laboratorio;
import javafx.collections.ObservableList;

public class ModelFactoryController {
    Laboratorio laboratorio;
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratorio = new Laboratorio();
    }
    public void buttonAddE(String name,String amount,String material,Double price){
        laboratorio.getElementService().buttonAddE(name,amount,material,price);
    }
    public ObservableList<Element> getElementArrayList(){
        return laboratorio.getElementService().getObservableListElement();
    }
}
