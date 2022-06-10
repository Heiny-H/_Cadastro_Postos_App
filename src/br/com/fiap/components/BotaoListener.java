package br.com.fiap.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.function.ToIntFunction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import br.com.fiap.app.App;
import br.com.fiap.dao.PostosDao;
import br.com.fiap.model.ListaPostos;
import br.com.fiap.view.Janela;

public class BotaoListener implements ActionListener, MouseListener{

	 private Janela janela; 
	 PostosDao dao = new PostosDao();
	 
	 public BotaoListener(Janela janela) {
			this.janela = janela;
		}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		ListaPostos ListaPostos = new ListaPostos();
		ListaPostos.setNome(janela.getInputText().getText());
		ListaPostos.setRua(janela.getMeuTextAreaRua().getText());
		ListaPostos.setBairro(janela.getMeuTextAreaBairro().getText());
		ListaPostos.setCidade(janela.getMeuTextAreaCidade().getText());
		ListaPostos.setPreco(janela.getMeuTextAreaPreco().getText());
		ListaPostos.setEstado(janela.getEstado().getSelectedItem().toString());
		ListaPostos.setTipoConector(janela.getRadios().getSelectedButtonText());
		ListaPostos.setFavorito(janela.getFavorito().isSelected());
		ListaPostos.setStarRate(janela.getStarRater().getSelection());
		
		dao.inserir(ListaPostos);
	
		janela.CarregarDados();
		
		List<ListaPostos>lista = dao.listarTodos();
	}

	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getClickCount() == 2){
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse posto?");
			if(resposta == JOptionPane.YES_OPTION){
				JTable tabela = (JTable) e.getSource();
				String id = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
				dao.apagar(Long.valueOf(id));
				janela.CarregarDados();
			}
		}	
	}

	@Override
	public void mousePressed(MouseEvent e){
		
	}

	@Override
	public void mouseReleased(MouseEvent e){

	}

	@Override
	public void mouseEntered(MouseEvent e){

	}

	@Override
	public void mouseExited(MouseEvent e){

	}

}
