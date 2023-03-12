package org.innsys.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.innsys.models.db.Headers;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HeadersRepository implements PanacheRepository<Headers> {
}
