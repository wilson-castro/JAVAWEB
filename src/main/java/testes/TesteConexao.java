package testes;

import java.util.Calendar;

import dao.ContatoDao;
import modelo.Contato;

public class TesteConexao {
	  public static void main(String[] args) {
		// pronto para gravar
		  Contato contato = new Contato();
		  contato.setNome("Caelum");
		  contato.setEmail("contato@caelum.com.br");
		  contato.setEndereco("R. Vergueiro 3185 cj57");
		  contato.setDataNascimento(Calendar.getInstance());

		  // grave nessa conexão!!!
		  ContatoDao dao = new ContatoDao();

		  // método elegante
		  dao.adiciona(contato);

		  System.out.println("Gravado!");
	    }
}
