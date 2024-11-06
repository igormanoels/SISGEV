
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane principal = new GridPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(principal, 800, 600));
        primaryStage.show();

        Label lbsisgev = new Label("SISGEV");
        TextField txtUsuario = new TextField("Digite seu usuário");
        TextField txtSenha = new TextField("Digite sua senha");
        Button btnLogin = new Button("Entrar");

        principal.add(lbsisgev, 0, 0);
        principal.add(txtUsuario, 1, 0);
        principal.add(txtSenha, 1, 1);
        principal.add(btnLogin, 1, 2);
        
    }
}
