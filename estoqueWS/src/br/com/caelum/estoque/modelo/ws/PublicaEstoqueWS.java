package br.com.caelum.estoque.modelo.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	public static void main(String[] args) {

		
		EstoqueWS implementacaoWS = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
	
		
		System.out.println("EstoqueWS Rodando " + url);
		
		//associando URL com a implementacao 
		//classe Endpoint que fará a publicação
		Endpoint.publish(url, implementacaoWS);
		
		

	}

}
