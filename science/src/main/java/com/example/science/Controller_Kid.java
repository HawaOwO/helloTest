package com.example.science;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
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

    @FXML
    private RadioButton r1;
    @FXML
    private RadioButton r2;
    @FXML
    private RadioButton r3;

    @FXML
    private RadioButton rr1;
    @FXML
    private RadioButton rr2;
    @FXML
    private RadioButton rr3;

    @FXML
    private Line ar1;
    @FXML
    private Line br1;
    @FXML
    private Line cr1;
    @FXML
    private Line ar2;
    @FXML
    private Line br2;
    @FXML
    private Line cr2;
    @FXML
    private Line ar3;
    @FXML
    private Line br3;
    @FXML
    private Line cr3;

    @FXML
    private Button rightButton1;
    @FXML
    private Button wrongButton1;
    @FXML
    private Button rightButton2;
    @FXML
    private Button wrongButton2;

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

    public void sch1m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch1m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch1n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch1n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch1x(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch1x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void sch2m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch2m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch2n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch2n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch2x(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch2x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void sch3m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch3m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch3n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch3n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch3x(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch3x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void sch4m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch4m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch4n(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch4n.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch4x(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch4x.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void sch5m(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch5m.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch5ma(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch5ma.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sch5mb(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sch5mb.fxml"));
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
    public static String matching = "";
    public void match(ActionEvent event) throws IOException {
        if (event.getSource() == r1) {
            matching = "a";
        }
        if (event.getSource() == r2) {
            matching = "b";
        }
        if (event.getSource() == r3) {
            matching = "c";
        }

        ar1.setVisible(false);
        ar2.setVisible(false);
        br1.setVisible(false);
        br3.setVisible(false);
        cr2.setVisible(false);
        cr3.setVisible(false);
        trueLabel.setVisible(false);
        falseLabel.setVisible(false);
        if (event.getSource() == rr1) {
            matching += "a";
            if(matching.equals("aa"))
            {

                ar1.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            if(matching.equals("ba"))
            {
                ar2.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            if(matching.equals("ca"))
            {
                ar3.setVisible(true);
                trueLabel.setVisible(true);
                falseLabel.setVisible(false);
            }
            matching="";
        }
        if (event.getSource() == rr2) {
            matching += "b";
            if(matching.equals("ab"))
            {

                br1.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            if(matching.equals("bb"))
            {

                br2.setVisible(true);
                trueLabel.setVisible(true);
                falseLabel.setVisible(false);
            }
            if(matching.equals("cb"))
            {
                br3.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            matching="";
        }
        if (event.getSource() == rr3) {
            matching += "c";
            if(matching.equals("ac"))
            {

                cr1.setVisible(true);
                trueLabel.setVisible(true);
                falseLabel.setVisible(false);
            }
            if(matching.equals("bc"))
            {
                cr2.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            if(matching.equals("cc"))
            {
                cr3.setVisible(true);
                trueLabel.setVisible(false);
                falseLabel.setVisible(true);
            }
            matching="";
        }
        }

    public void select2(ActionEvent event) throws IOException{
        trueLabel.setVisible(false);
        falseLabel.setVisible(false);
        if(event.getSource() == rightButton1||event.getSource() == rightButton2) {
            matching+="a";
        }
        if(event.getSource() == wrongButton1||event.getSource() == wrongButton2) {
            matching+="b";
        }

        if(matching.equals("aa"))
        {
            trueLabel.setVisible(true);
            matching = "";
        }

        if(matching.equals("ab")||matching.equals("bb")||matching.equals("ba"))
        {
            falseLabel.setVisible(true);
            matching = "";
        }
    }

    public void match2(ActionEvent event) throws IOException{
        if (event.getSource() == r1) {
            matching = "a";
        }
        if (event.getSource() == r2) {
            matching = "b";
        }
        if (event.getSource() == r3) {
            matching = "c";
        }

        ar2.setVisible(false);
        br1.setVisible(false);
        cr2.setVisible(false);
        trueLabel.setVisible(false);
        falseLabel.setVisible(false);

        if(event.getSource() == rr1){
            if(matching.equals("a")||matching.equals("c")){
                trueLabel.setVisible(true);
                if(matching.equals("a"))
                    ar1.setVisible(true);
                else
                    cr1.setVisible(true);
            }
            else{
                falseLabel.setVisible(true);
                matching = "";
                br1.setVisible(true);
            }
        }
        if(event.getSource() == rr2) {
            if (matching.equals("b")) {
                trueLabel.setVisible(true);
                matching = "";
                br2.setVisible(true);
            }
            else{
                falseLabel.setVisible(true);
                if(matching.equals("a"))
                    ar2.setVisible(true);
                else
                    cr2.setVisible(true);
                matching = "";
            }
        }
    }
    }