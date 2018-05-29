package br.com.caelum.estoque.modelo.ws;

import javax.xml.ws.WebFault;

@WebFault(name = "AutorizacaoFault")//muda o nome do elemento de erro no wsdl
public class AutorizacaoException extends Exception {

	

	public AutorizacaoException(String mensagem) {
		// TODO Auto-generated constructor stub
		super(mensagem);//passando a mensagem para a classe mae para que seja exibidaS
	}
	
	//customiza a msg padr�o do wsdl dica mais detalhada espec�fico do mundo soap
	public String getFaultInfo(){
		
		return"Token Inv�lido";
	}
	
	

}
