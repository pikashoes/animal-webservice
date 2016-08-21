package edu.uchicago.sooji1.service;

import edu.uchicago.sooji1.domain.Breed;

/**
 * Breed Service.
 */
public interface BreedService
{
    // list + CRUD

    Iterable<Breed> list();

    Breed create(Breed breed);

    Breed read(long id);

    Breed update(long id, Breed animal);

    void delete(long id);
}
