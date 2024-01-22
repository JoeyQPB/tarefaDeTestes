package dao;

import java.util.List;

import entities.Cliente;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao<Cliente> {

	@Override
	public void salvar(Cliente entity, List<Cliente> repository) {
		repository.add(entity);
	}

	@Override
	public Cliente buscar(long uniqueValue, List<Cliente> repository) {
		return repository.stream().filter((el) -> el.getId().equals(uniqueValue)).findFirst().orElse(null);
	}

	@Override
	public boolean atualizar(Cliente entity, List<Cliente> repository) {
		if (buscar(entity.getId(), repository) == null) return false;
		for (Cliente c : repository) {
			if (c.getId().equals(entity.getId())) {
				c = entity;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(long uniqueValue, List<Cliente> repository) {
		return repository.remove(buscar(uniqueValue, repository));
	}

}
