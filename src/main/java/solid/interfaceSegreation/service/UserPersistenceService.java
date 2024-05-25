package solid.interfaceSegreation.service;

import solid.interfaceSegreation.entity.Order;
import solid.interfaceSegreation.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserPersistenceService implements PersistenceService <User>{
    private static final Map<Long, User> Users = new HashMap<>();
    @Override
    public void save(User entity) {
        synchronized (Users){
            Users.put(entity.getId(), entity);
        }


    }

    @Override
    public void delete(User entity) {
        synchronized (Users){
             Users.remove(entity.getId());
        }

    }

    @Override
    public User findById(Long id) {
        synchronized (Users){
            return Users.get(id);
        }
    }

    public List<User> findByName(String name ) {
        return Users.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
