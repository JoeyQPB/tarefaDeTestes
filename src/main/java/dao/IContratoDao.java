package dao;

import java.util.List;

import entities.Cliente;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao<T> {
    void salvar(T entity, List<T> repository);
    T buscar(long uniqueValue, List<T> repository);
    boolean atualizar(T entity, List<T> repository);
    boolean deletar(long uniqueValue, List<T> repository);
}
