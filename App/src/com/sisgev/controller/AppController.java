package com.sisgev.controller;

import com.sisgev.view.ClienteView;

import javafx.stage.Stage;

public class AppController {
    
    private Stage stage;

    public AppController(Stage stage) {
        this.stage = stage;
    }

    public void exibirCaixaView() {
        
    }

    public void exibirClienteView() {
        ClienteView cv = new ClienteView();
        stage.setScene();
        stage.show();
    }

    public void exibirEstoqueView() {}

    public void exibirProdutoView() {}

    public void exibirUsuarioView() {}
}
