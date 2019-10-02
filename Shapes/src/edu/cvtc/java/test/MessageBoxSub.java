package edu.cvtc.java.test;

import javax.swing.JOptionPane;

import edu.cvtc.java.Dialog;

public class MessageBoxSub implements Dialog {


	MessageBoxSub() {
		
	}
	
	@Override
	public int Show(String message, String title) {

		return JOptionPane.OK_OPTION;
	}
	
	
}
