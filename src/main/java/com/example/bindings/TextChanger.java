package com.example.bindings;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TextChanger {
    private StringProperty cleverString = new SimpleStringProperty ();

    public TextChanger(StringProperty cleverString) {
        this.cleverString = cleverString;
    }
}


