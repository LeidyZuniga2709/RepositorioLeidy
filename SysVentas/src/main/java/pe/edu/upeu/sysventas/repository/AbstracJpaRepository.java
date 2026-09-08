package pe.edu.upeu.sysventas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstracJpaRepository <T,ID> implements ICrudGenericoRepository<T,ID> {
    protected final List<T> data=new ArrayList<>();

    protected abstract ID getId(T entity);
    protected abstract void sendId(T entity,ID id);
    protected abstract ID generateId();


    @Override
    public T save(T entity) {
        if(getId(entity)==null){
            sendId(entity,generateId());
        }
        data.add(entity);
        return entity;

    }

    @Override
    public T update(T entity) {
        ID id=getId(entity);
        for (int i=0;i<data.size();i++){
            T item=data.get(i);
            if (getId(item).equals(id)){
                data.set(i,item);
            }
        }
        return new RuntimeException("No se encontro la cantidad con el ID"+id);
    }

    @Override
    public Optional<T> findById(Object id) {
        return data.stream()

                .findFirst();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public boolean existsById(Object id) {
        return false;
    }
}
