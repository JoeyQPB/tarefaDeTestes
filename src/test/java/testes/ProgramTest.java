package testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import application.Program;
import entities.Pessoa;
import junit.framework.Assert;

public class ProgramTest {

	@Test
	public void groupingByGenreTest() {
		List<Pessoa> pessoasParaTest = new ArrayList<>(List.of(new Pessoa("Joao", "M"), new Pessoa("Maria", "F"),
				new Pessoa("Pedro", "M"), new Pessoa("Ana", "F")));
		List<Pessoa> pessoasTest = Program.groupingByGenre(pessoasParaTest);
		List<Pessoa> pessoasF = new ArrayList<>(List.of(new Pessoa("Maria", "F"), new Pessoa("Ana", "F")));

//		assertEquals(pessoasTest, pessoasF);
		for (Pessoa p : pessoasTest) {
			Assert.assertEquals(p.getGender(), "F");
		}
	}
}


