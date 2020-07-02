package de.mobiletesting.service;

import de.mobiletesting.model.Phones;
import de.mobiletesting.persistence.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebsiteService {
    @Autowired
    private WebsiteRepository repository;

    public List<Phones> findAll() {

        return repository.findAll();
    }
}
