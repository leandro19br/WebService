package br.com.caelum.estoque.modelo.usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/*precisamos dizer que essa classe é um adapter do JAX-B. Para isso, iremos extender a classe abstrata XmlAdapter*/
public class DateAdapter extends XmlAdapter {
	
	private String pattern = "dd/MM/yyyy";
	
	//convertendo a Date em String
	public Date unmarshal(String dateString) throws ParseException{
		
		return new SimpleDateFormat(pattern).parse(dateString);
		
	}
	
	//convertendo String em Date
	public String marshal(Date date) throws Exception {
		   return new SimpleDateFormat(pattern).format(date);
		}

	@Override
	public Object marshal(Object arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object unmarshal(Object arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
