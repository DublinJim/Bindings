package com.example.bindings;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

  @FXML private Text txt1;
  private final StringProperty cleverString = new SimpleStringProperty();

    private void changeValuesOfText(String newValue) {
        cleverString.set(newValue);
        txt1.setText(cleverString.get());
    }


  @Override
  public void initialize(URL location, ResourceBundle resources) { // starts here
      changeValuesOfText ("Hellooooooo");
  } // ends here

  @FXML
  void changeValues() {
      changeValuesOfText ("And Change !!!");
  }


}
