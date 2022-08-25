/*
 * John Smith
 * CITC 1311 PO2 - Puretskiy
 * Controller class for Calculator application. Contains FXML variables for buttons as well as calculation method to manipulate said variables.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button six;

    @FXML
    private TextField resultDisplay;

    @FXML
    private Button one;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button four;

    @FXML
    private Button divide;

    @FXML
    private Button decimal;

    @FXML
    private Button multiply;

    @FXML
    private Button five;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point;
    String letter;

    @FXML
    void Calculation(ActionEvent event) {

        if (event.getSource() == one) {
            resultDisplay.appendText("1");
        } else if (event.getSource() == two) {
            resultDisplay.appendText("2");
        } else if (event.getSource() == three) {
            resultDisplay.appendText("3");
        } else if (event.getSource() == four) {
            resultDisplay.appendText("4");
        } else if (event.getSource() == five) {
            resultDisplay.appendText("5");
        } else if (event.getSource() == six) {
            resultDisplay.appendText("6");
        } else if (event.getSource() == seven) {
            resultDisplay.appendText("7");
        } else if (event.getSource() == eight) {
            resultDisplay.appendText("8");
        } else if (event.getSource() == nine) {
            resultDisplay.appendText("9");
        } else if (event.getSource() == zero) {
            resultDisplay.appendText("0");
        } else if (event.getSource() == decimal && point == 0) {
            resultDisplay.appendText(".");
            point = 1;
        } else if (event.getSource() == clear) {
            resultDisplay.setText("");

            input1 = 0;
            input2 = 0;
            ps = 0;
        } else if (event.getSource() == plus) {
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 1;
            point = 0;
        } else if (event.getSource() == minus) {
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 2;
            point = 0;
        } else if (event.getSource() == multiply) {
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 3;
            point = 0;
        } else if (event.getSource() == divide) {
            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 4;
            point = 0;
        } else if (event.getSource() == equal && ps > 0) {
            input2 = Double.parseDouble(resultDisplay.getText());
        

            switch (ps) {
                case 1:
                    result = input1 + input2;
                    resultDisplay.setText(String.valueOf(result));
                    break;
                case 2:
                    result = input1 - input2;
                    resultDisplay.setText(String.valueOf(result));
                    break;
                case 3:
                    result = input1 * input2;
                    resultDisplay.setText(String.valueOf(result));
                    break;
                case 4:
                    result = input1 / input2;
                    resultDisplay.setText(String.valueOf(result));
                    break;
            }

            ps = 0;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
