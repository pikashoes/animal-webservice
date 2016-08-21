package edu.uchicago.sooji1.controller;

import edu.uchicago.sooji1.domain.Breed;
import edu.uchicago.sooji1.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pikashoes on 8/18/16.
 * Create another controller for API.
 */
@Controller
public class BreedController
{
    private BreedService breedService;

    @Autowired
    public BreedController(BreedService breedService)
    {
        this.breedService = breedService;
    }

    // Index
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    // List + CRUD

    // Random
    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public String random()
    {
        return "random";
    }

    // list get
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model)
    {
        model.addAttribute("breeds", breedService.list());
        return "breedlist";
    }

    // create post
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Breed create(@RequestBody Breed breed)
    {
        return breedService.create(breed);
    }

    // read get
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Breed read(@PathVariable(value = "id") long id)
    {
        Breed post = breedService.read(id);
        return post;
    }

    // update put
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Breed update(@PathVariable(value = "id") long id, @RequestBody Breed breed)
    {
        Breed post = breedService.update(id, breed);
        return post;
    }

    // delete delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id)
    {
        breedService.delete(id);
    }


}
