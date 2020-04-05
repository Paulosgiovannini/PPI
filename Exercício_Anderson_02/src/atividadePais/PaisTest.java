package atividadePais;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTest {

	@Test
	public void test00Carregar() {
		System.out.println("Carregar pa�s");
		System.out.println(PaisDAO.carregar(1));
		System.out.println(PaisDAO.carregar(2));
		System.out.println(PaisDAO.carregar(3));
		System.out.println(PaisDAO.carregar(4));
		System.out.println(PaisDAO.carregar(5));
	}

	public void test01Criar() {
		System.out.println("Criar pa�s");
		PaisDAO.criar("Cuba", 84732832, 6589785);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar pa�s");
		PaisDAO.atualizar(6, "Aleatorio", 761326712, 89213913);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test03Excluir() {
		System.out.println("Excluir pa�s");
		PaisDAO.excluir(13);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test04PaisMaisHab() {
		System.out.println("Pa�s mais populoso");
		System.out.println(PaisDAO.buscaPaisMaisHab());
	}
	
	@Test
	public void test05PaisMenor() {
		System.out.println("Menor Pa�s");
		System.out.println(PaisDAO.buscaPaisMenor());
	}
	
	@Test
	public void test06Vetor() {
		System.out.println("Vetor 3 pa�ses");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais);
		}
	}
}