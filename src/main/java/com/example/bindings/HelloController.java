package com.example.bindings;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

  @FXML private Text txt1;
 private StringProperty cleverString= new SimpleStringProperty ();


  @Override
  public void initialize(URL location, ResourceBundle resources) { // starts here
  cleverString.set("Hellooooooo");
    txt1.setText(cleverString.get());
  } // ends here

  @FXML
  void changeValues(ActionEvent event) {
    cleverString.set("And Change !!!");
    txt1.setText(cleverString.get());
  }


}
