package com.demo.propertyEditor;

import java.beans.PropertyEditorSupport;

public class NameProperty extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String value = text.toUpperCase();

		setValue(value);
	}

}
