package com.diablo.assgn123;

import java.beans.PropertyEditorSupport;

public class CustomPropertyEditor extends PropertyEditorSupport  {
	public void setAsText(String text) {
        setValue(new StudentType(text.toUpperCase()));
    }
}
 