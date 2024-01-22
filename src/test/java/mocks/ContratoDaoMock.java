package mocks;

import java.util.List;

import dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

	@Override
	public void salvar(Object entity, List repository) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object buscar(long uniqueValue, List repository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean atualizar(Object entity, List repository) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(long uniqueValue, List repository) {
		// TODO Auto-generated method stub
		return false;
	}

}
