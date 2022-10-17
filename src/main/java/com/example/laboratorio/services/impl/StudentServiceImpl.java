package com.example.laboratorio.services.impl;

import com.example.laboratorio.model.Student;
import com.example.laboratorio.services.UserService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements UserService {
    private List<Student> listElement = new ArrayList<>();

    public StudentServiceImpl(List<Student> listElement) {
        this.listElement = listElement;
    }

    public List<Student> getListElement() {
        return listElement;
    }

    public void setListElement(List<Student> listElement) {
        this.listElement = listElement;
    }



    @Override
    public void addStudent(String id, String name, String email, String number, Integer loans, String career, Integer semester) {

    }
}
