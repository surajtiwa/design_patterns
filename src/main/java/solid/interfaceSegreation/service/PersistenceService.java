package solid.interfaceSegreation.service;


import solid.interfaceSegreation.entity.Entity;

//common interface to be implemented by all persistence services.
//it should have only the abstract methods which is necessary for implementation class
public interface PersistenceService<T extends Entity> {

    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);

}
