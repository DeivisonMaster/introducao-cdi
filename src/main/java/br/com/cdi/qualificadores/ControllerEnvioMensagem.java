package br.com.cdi.qualificadores;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;


@Named("envioMensagem")
@RequestScoped
public class ControllerEnvioMensagem {
	
	private String texto;
	
	@Inject 
	private Mensageiro mensageiro;
	
	public void enviarMensagem() {
		this.mensageiro.enviarMensagem(texto);
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
