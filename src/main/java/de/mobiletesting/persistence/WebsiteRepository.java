package de.mobiletesting.persistence;

import de.mobiletesting.model.Phones;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WebsiteRepository extends MongoRepository<Phones, String> {
}
