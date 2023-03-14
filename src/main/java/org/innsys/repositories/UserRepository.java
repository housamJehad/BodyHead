package org.innsys.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.innsys.models.db.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {


    private final EntityManager entityManager;

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> findUserById(String userId) {
        Query query = entityManager.createQuery("SELECT e FROM User e WHERE e.userId = :param1");
        query.setParameter("param1", userId);
        return query.getResultList();
    }


}
