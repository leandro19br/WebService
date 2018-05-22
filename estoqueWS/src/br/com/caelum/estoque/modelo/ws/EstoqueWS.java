package br.com.caelum.estoque.modelo.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService//anotação utilizada para dizer que é um webService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	/*Método utilizado pelo Web Service para retornar todos os itens da lista ou
	 * passando o filtro*/
	
	
	@WebMethod(operationName = "TodosOsItens")//altera o nome do método no XML
	@WebResult(name="item")//altera o nome do retorno
	
	public List<Item> getItens(@WebParam(name="filtros")Filtros filtros){
		
		System.out.println("Chamando todos os itens");	
		

		List<Filtro> listaFiltros = filtros.getLista();
		
		
		List<Item> itensResultado = dao.todosItens(listaFiltros);		
		
		
		return itensResultado;
	}

}
