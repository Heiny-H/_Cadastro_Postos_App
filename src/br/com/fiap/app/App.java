package br.com.fiap.app;

import javax.swing.UIManager;

import br.com.fiap.view.Janela;

public class App {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName()
			);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	new Janela().init();
	}
}
