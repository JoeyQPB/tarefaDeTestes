package testes;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author rodrigo.pires
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class, TesteClienteTest.class })
public class AllTests {
}
