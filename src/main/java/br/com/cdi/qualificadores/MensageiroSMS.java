package br.com.cdi.qualificadores;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;

@Urgente
@RequestScoped
public class MensageiroSMS implements Mensageiro {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Enviando mensagem por SMS " + msg);
	}

}
