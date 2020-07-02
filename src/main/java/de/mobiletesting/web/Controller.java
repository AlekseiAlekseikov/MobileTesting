package de.mobiletesting.web;

import de.mobiletesting.model.Phones;
import de.mobiletesting.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Phones")
public class Controller {
    @Autowired
    private WebsiteService websiteService;

    @RequestMapping
    public List<Phones> getlistOfProviders(){
        return websiteService.findAll();
    }
}
