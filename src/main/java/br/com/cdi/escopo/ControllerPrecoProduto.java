package br.com.cdi.escopo;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * Por padrão: @Default	= terá o escopo de quem o invocou
 * @RequestScoped: uma requisição HTTP
 * @SessionScoped: possui duração enquanto a sessão Http existir
 * @ConversationScoped: possui duração semelhante ao Session mas com configuração de duração pré definida
 * 
 * */
@Named("menuBean")
@SessionScoped
public class ControllerPrecoProduto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/* Ponto de Injeção 1 - Atributos*/
	@Inject
	private CalculadoraPreco calculadora;
	
	public ControllerPrecoProduto() {

	}
	
	/* Ponto de Injeção 2 - Construtor*/
	//@Inject
	public ControllerPrecoProduto(CalculadoraPreco calculadora) {
		System.out.println("Construtor Calculadora: " + calculadora);
		this.calculadora = calculadora;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init PrecoProduto");
	}
	
	public double getPreco() {
		return calculadora.calcularPreco(12, 44.55);
	}
	
	
	/* Ponto de Injeção 3 - Método*/
	//@Inject
	public void setCalculadoraPreco(CalculadoraPreco calculadora) {
		System.out.println("setCalculadora: " + calculadora);
		this.calculadora = calculadora;
	}
}	
