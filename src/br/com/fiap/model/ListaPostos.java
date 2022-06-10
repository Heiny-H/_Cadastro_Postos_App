package br.com.fiap.model;

import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListaPostos {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	private String rua;
	private String bairro;
	private String cidade;
	private String preco;
	private String Estado;
	private String tipoConector;
	private boolean favorito;
	private int starRate;
	
//------------------------------------------------------------------------------
	
	public String getEstado() {
		return Estado;
	}
	@Override
	public String toString() {
		return "ListaPostos [Nome=" + nome + ", Rua=" + rua + 
			   ", Bairro=" + bairro + ", Cidade=" + cidade + 
			   ", Preco=" + preco + ", Estado=" + Estado + 
			   ", TipoConector=" + tipoConector + ", Favorito=" + favorito + 
			   ", StarRate=" + starRate + "]";
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
//------------------------------------------------------------------------------
	
	public String getTipoConector() {
		return tipoConector;
	}
	
	public void setTipoConector(String tipoConector) {
		this.tipoConector = tipoConector;
	}
	
//------------------------------------------------------------------------------
	
	public String isFavorito(boolean favorito) {
		String ass = "Não favorito";
		
		if(favorito) {
			ass = "Favorito";
		}
		
		return ass;
	}
	
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
	
//------------------------------------------------------------------------------
	
	public Long getStarRate() {
		return (long) starRate;
	}
	public void setStarRate(int starRate) {
		this.starRate = starRate;
	}
	
//------------------------------------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//------------------------------------------------------------------------------
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
//------------------------------------------------------------------------------	
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
//------------------------------------------------------------------------------
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
//------------------------------------------------------------------------------
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
//------------------------------------------------------------------------------
	
	public Vector<String> getData() {
		
		Vector<String> data = new Vector<String>(); 
		
		data.add(id.toString());
		data.add(nome);
		data.add(rua);
		data.add(bairro);
		data.add(cidade);
		data.add(preco);
		data.add(Estado);
		data.add(tipoConector);
		data.add(isFavorito(favorito));
		data.add(getStarRate().toString());
	
		return data;
	}
	
}
