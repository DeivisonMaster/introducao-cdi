package br.com.cdi.qualificadores;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;

@Default
@RequestScoped
public class MensageiroCorreio implements Mensageiro {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Enviando mensagem por correio " + msg);
	}

}
