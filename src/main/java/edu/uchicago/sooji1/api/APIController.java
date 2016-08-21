package edu.uchicago.sooji1.api;

/**
 * Created by pikashoes on 8/18/16.
 * Taken from Prof. Gerber's post on Piazza
 */

import edu.uchicago.sooji1.domain.Breed;
import edu.uchicago.sooji1.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Adam on 7/20/2016.
 */

@RestController
@RequestMapping("/api")
public class APIController
{
    private BreedService breedService;

    @Autowired
    public APIController(BreedService breedService)
    {
        this.breedService = breedService;
    }

    //    //list
    @RequestMapping( value = "/", method = RequestMethod.GET )
    public Iterable<Breed> list()
    {
        return breedService.list();
    }

    //create
    @RequestMapping( value = "/", method = RequestMethod.POST )
    public Breed create(@RequestBody Breed attr)
    {
        return breedService.create(attr);
    }

    //read
    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public Breed read(@PathVariable(value="id") long id)
    {
        Breed post = breedService.read(id);
        return post;
    }

    //update
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    public Breed update(@PathVariable(value="id") long id, @RequestBody Breed attr)
    {
        return breedService.update(id,attr);
    }

    //delete
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    public void delete(@PathVariable(value="id") int id)
    {
        breedService.delete(id);
    }

}
