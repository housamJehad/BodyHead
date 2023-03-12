package org.innsys.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.innsys.models.db.Body;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BodyRepository implements PanacheRepository<Body> {
}
