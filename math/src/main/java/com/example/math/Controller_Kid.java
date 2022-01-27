package com.example.math;

        import javafx.application.Platform;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.fxml.Initializable;
        import javafx.scene.Node;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.*;
        import javafx.stage.Stage;
        import java.io.IOException;
        import java.net.URL;
        import java.util.EventObject;
        import java.util.ResourceBundle;

public class Controller_Kid {

    @FXML
    private Label trueLabel;
    @FXML
    private Label falseLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void homePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void subjectSelection(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("subjectSelectionPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void exitSoftware(ActionEvent event) throws IOException {
        Platform.exit();

    }

    public void mch1m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch1m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch1n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch1n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch1x(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mch1x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mch2m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch2m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch2n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch2n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch2x(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mch2x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mch3m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch3m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch3n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch3n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch3x(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mch3x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mch4m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch4m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch4n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch4n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch4x(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mch4x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mch5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch5.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void mch51(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mch51.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void right(ActionEvent event) throws IOException {

        falseLabel.setVisible(false);
        trueLabel.setVisible(true);
    }

    public void wrong(ActionEvent event) throws IOException {
        trueLabel.setVisible(false);
        falseLabel.setVisible(true);
    }


}