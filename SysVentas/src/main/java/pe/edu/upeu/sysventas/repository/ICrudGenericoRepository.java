package pe.edu.upeu.sysventas.repository;

import java.util.List;
import java.util.Optional;

public interface ICrudGenericoRepository <T,IO>{
    T save(T entity);
    T update(T entity);
    Optional<T> findById(IO id);
    List<T>findAll();
    void deleteById(IO id);
    boolean existsById(IO id);
}
