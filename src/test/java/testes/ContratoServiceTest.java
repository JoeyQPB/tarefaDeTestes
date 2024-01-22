package testes;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.ContratoDao;
import entities.Cliente;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {
	
    private ContratoDao contratoDao;
    private List<Cliente> repository;

    @Before
    public void setUp() {
        contratoDao = new ContratoDao();
        repository = new ArrayList<>();
    }
    
    @Test
    public void salvarTest() {
    	Cliente clientTest = new Cliente(1L, "Jhon Doe");
    	contratoDao.salvar(clientTest, repository);
    	assertEquals(1, repository.size());
    	assertTrue(repository.contains(clientTest));
    }


    @Test
    public void buscarTest() {
    	Cliente clientTest = new Cliente(1L, "Jhon Doe");
    	repository.add(clientTest);
    	Cliente resultSearch = contratoDao.buscar(1L, repository);
    	assertEquals(clientTest, resultSearch);
    }


    @Test
    public void BuscarNaoExistente() {
        Cliente resultado = contratoDao.buscar(1, repository);
        assertNull(resultado);
    }
    
    @Test
    public void alterarTest() {
    	Cliente clientTest = new Cliente(1L, "Jhon Doe");
    	contratoDao.salvar(clientTest, repository);
    	
    	Cliente updatedCliente = new Cliente(1L, "novo nome");
    	assertTrue(contratoDao.atualizar(updatedCliente, repository));
        assertEquals(1, repository.size());
        assertTrue(repository.contains(updatedCliente));
    }
    
    @Test
    public void testAtualizarNaoExistente() {
        assertFalse(contratoDao.atualizar(new Cliente(1L, "John Doe"), repository));
    }
    
    @Test
    public void testDeletarExistente() {
        Cliente cliente = new Cliente(1L, "John Doe");
        repository.add(cliente);
        assertTrue(contratoDao.deletar(1L, repository));
        assertEquals(0, repository.size());
    }

    @Test
    public void testDeletarNaoExistente() {
        assertFalse(contratoDao.deletar(1L, repository));
        assertEquals(0, repository.size());
    }
}
