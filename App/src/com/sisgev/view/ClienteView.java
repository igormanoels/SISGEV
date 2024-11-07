package com.sisgev.view;

import com.sisgev.controller.AppController;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ClienteView {
    
    private AppController control;

    public ClienteView(AppController controller) {
        this.control = controller;
    }

    public Scene getScene() {
        GridPane grid = new GridPane();
        Button btnGoTela2 = new Button("Ir para Tela 2");
        TextField txtTeste = new TextField("Tela de Cliente");
        //btnGoToTela2.setOnAction(e -> controller.showTela2());
        grid.add(btnGoTela2, 0, 0);
        grid.add(txtTeste, 1, 0);
        return new Scene(grid, 800, 600);

    }
}