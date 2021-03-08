package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final int TWO_COLUMN_SPAN = 2;
        Label userIdLbl = new Label("User ID:");
        TextField userIdTxt = new TextField();
        Label userPwdLbl = new Label("Password");
        userPwdLbl.getStyleClass().add("bluelabel");
        PasswordField userPwdTxt = new PasswordField();
        GridPane root = new GridPane();
        root.setVgap(20);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        GridPane.setConstraints(userIdLbl, 0, 0);
        GridPane.setConstraints(userIdTxt, 1, 0);
        GridPane.setConstraints(userPwdLbl, 0, 1);
        GridPane.setConstraints(userPwdTxt, 1, 1);
        root.getChildren().addAll(userIdLbl, userIdTxt, userPwdLbl, userPwdTxt);
        Button signInBtn = new Button("Sign In");
        signInBtn.setId("submitBtn");
        signInBtn.setPrefWidth(Double.MAX_VALUE);
        root.add(signInBtn, 0, 2, TWO_COLUMN_SPAN, 1);
        Scene scene = new Scene(root, 250, 180);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
//       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//       primaryStage.setTitle("Hello World");
//       primaryStage.setScene(new Scene(root, 300, 275));
//       primaryStage.show();
    }
}
