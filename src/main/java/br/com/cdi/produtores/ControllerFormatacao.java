package br.com.cdi.produtores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerFormatacao {
	
	@Inject @Brasil
	private DateFormat formatadorData;
	
	private Date dataInformada;
	private String dataFormatada;
	
	
	public void enviar() {
		dataFormatada = formatadorData.format(dataInformada);
	}
	
	public Date getDataInformada() {
		return dataInformada;
	}
	
	public void setDataInformada(Date dataInformada) {
		this.dataInformada = dataInformada;
	}
	
	public String getDataFormatada() {
		return dataFormatada;
	}
}
