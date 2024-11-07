
import com.sisgev.controller.AppController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    TextField txtUsuario = new TextField("Digite seu usuário");
    TextField txtSenha = new TextField("Digite sua senha");

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AppController control = new AppController(stage);
        GridPane principal = new GridPane();
        stage.setTitle("Tela Login");
        stage.setScene(new Scene(principal, 800, 600));
        stage.show();

        Label lbsisgev = new Label("SISGEV");
        Button btnLogin = new Button("Entrar");

        principal.add(lbsisgev, 0, 0);
        principal.add(txtUsuario, 1, 0);
        principal.add(txtSenha, 1, 1);
        principal.add(btnLogin, 1, 2);


        btnLogin.setOnAction(e -> verificaLogin(control));

        
        
    }

    public void verificaLogin(AppController control) {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        if ( usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
            control.exibirClienteView();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("ERRO.");
            alert.setHeaderText("ERRO AO TENTAR FAZER LOGIN");
            alert.setContentText("Favor verificar o usuário ou senha!");
            alert.show();
        }
    }
}
