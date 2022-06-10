package br.com.fiap.components;

import java.awt.Color;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{
	
	private static final long serialVersionUID = 1L;

	public MeuLabel (String text){
		super(text);
		init();
	}
	
	private void init() {
		this.setForeground(Color.black);
	}
}
