package atividadePais;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTest {

	@Test
	public void test00Carregar() {
		System.out.println("Carregar país");
		System.out.println(PaisDAO.carregar(1));
		System.out.println(PaisDAO.carregar(2));
		System.out.println(PaisDAO.carregar(3));
		System.out.println(PaisDAO.carregar(4));
		System.out.println(PaisDAO.carregar(5));
	}

	public void test01Criar() {
		System.out.println("Criar país");
		PaisDAO.criar("Cuba", 84732832, 6589785);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar país");
		PaisDAO.atualizar(6, "Aleatorio", 761326712, 89213913);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test03Excluir() {
		System.out.println("Excluir país");
		PaisDAO.excluir(13);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test04PaisMaisHab() {
		System.out.println("País mais populoso");
		System.out.println(PaisDAO.buscaPaisMaisHab());
	}
	
	@Test
	public void test05PaisMenor() {
		System.out.println("Menor País");
		System.out.println(PaisDAO.buscaPaisMenor());
	}
	
	@Test
	public void test06Vetor() {
		System.out.println("Vetor 3 países");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais);
		}
	}
}