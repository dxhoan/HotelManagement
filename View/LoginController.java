/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author DXHOAN
 */
public class LoginController implements Initializable {

    @FXML
    private JFXPasswordField txtPass;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Label flagUser;

    @FXML
    private JFXTextField txtUser;

    @FXML
    private Label flagPass;

    @FXML
    private JFXButton btnExit;

    @FXML
    private Label wrongAcc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtUser.setOnKeyReleased(e -> {
            wrongAcc.setVisible(false);
            flagUser.setVisible(false);
            flagPass.setVisible(false);
        });

        txtPass.setOnKeyReleased(e -> {
            wrongAcc.setVisible(false);
            flagUser.setVisible(false);
            flagPass.setVisible(false);
        });

        btnLogin.setOnMouseClicked(e -> {
            if (txtUser.getText().isEmpty()) {
                flagUser.setVisible(true);
                wrongAcc.setVisible(false);
            } else if (txtPass.getText().isEmpty()) {
                flagPass.setVisible(true);
                wrongAcc.setVisible(false);
            } else {
                wrongAcc.setVisible(true);
                flagUser.setVisible(false);
                flagPass.setVisible(false);

                //Check login here
            }
        });

        btnExit.setOnMouseClicked(e -> {
            System.exit(0);
        });

    }

}
