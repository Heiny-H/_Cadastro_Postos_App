package br.com.fiap.components;

import javax.swing.JTextArea;

public class MeuTextArea extends JTextArea {

	private static final long serialVersionUID = 1L;
	
	private int colunas = 10;
	private int linhas = 1;
	
	public MeuTextArea() {
		init();
	}

	private void init() {
		this.setColumns(colunas);
		this.setRows(linhas);
	}
}