package edu.cvtc.java;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	@Override
	public int Show(String message, String title) {
		JOptionPane.showMessageDialog(null, message);
		return JOptionPane.OK_OPTION;
	}

	public MessageBox() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}