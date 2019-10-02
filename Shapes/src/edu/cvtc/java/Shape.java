package edu.cvtc.java;

public abstract class Shape {
	
	private Dialog messageBox;

	protected Dialog getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}

	public Shape(Dialog messageBox) {
		setMessageBox(messageBox);
	}

	public abstract float surfaceArea();
	
	public abstract float volume();
}
