package br.com.cdi.qualificadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cdi.model.Usuario;


@Named("envioMensagem")
@SessionScoped
public class ControllerEnvioMensagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String texto;
	private Usuario usuario = new Usuario();
	
	
	@Inject 
	private Mensageiro mensageiro;
	private List<Usuario> listaNomes = new ArrayList<Usuario>();
	
	
	
	public void enviarMensagem() {
		this.mensageiro.enviarMensagem(texto);
	}
	
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public void salvar() {
		this.listaNomes.add(this.usuario);
		this.usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Usuario> getListaNomes() {
		return listaNomes;
	}
	
}
