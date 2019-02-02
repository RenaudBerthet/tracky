package be.rbe.tracky.infrastructure.repository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@Stateless
public class EntityManagerProducer {

    @PersistenceUnit(name = "issuesDB")
    private EntityManager entityManager;

    @Produces
    public EntityManager entityManager() {
        return entityManager;
    }

}
