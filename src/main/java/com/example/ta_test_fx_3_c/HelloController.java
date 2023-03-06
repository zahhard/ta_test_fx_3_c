package com.example.ta_test_fx_3_c;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private ImageView imageView;

    Image imageOn = new Image("on.jpg");
    Image imageOff = new Image("off.png");


    @FXML
    protected void change(ActionEvent event) {
        if (myCheckBox.isSelected()){
            System.out.println("On");
            imageView.setImage(imageOn);
            welcomeText.setText("on");

        }
        else{
            System.out.println("off");
            imageView.setImage(imageOff);
            welcomeText.setText("off");

    }
}}