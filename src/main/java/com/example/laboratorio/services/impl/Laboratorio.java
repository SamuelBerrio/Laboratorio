package com.example.laboratorio.services.impl;

import com.example.laboratorio.services.ElementService;
import com.example.laboratorio.services.ModelFactoryControllerService;

public class Laboratorio implements ModelFactoryControllerService {
    private final ElementService elementService;

    public Laboratorio(){
        elementService=(ElementService) new ElementServiceImpl();

    }
    public UserService getUserService() {return userService;}
    public ElementService getElementService() {return elementService;}

}
