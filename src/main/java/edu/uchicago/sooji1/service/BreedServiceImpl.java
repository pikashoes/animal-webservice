package edu.uchicago.sooji1.service;

import edu.uchicago.sooji1.domain.Breed;
import edu.uchicago.sooji1.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Breed Service Impl
 */
@Service
public class BreedServiceImpl implements BreedService
{
    private BreedRepository breedRepository;

    @Autowired // better form to autowire on constructor
    public BreedServiceImpl(BreedRepository breedRepository)
    {
        this.breedRepository = breedRepository;
    }

    @Override
    public Iterable<Breed> list()
    {
        return breedRepository.findAll();
    }

    @Override
    public Breed create(Breed breed)
    {
        return breedRepository.save(breed);
    }

    @Override
    public Breed read(long id)
    {
        return breedRepository.findOne(id);
    }

    @Override
    public Breed update(long id, Breed breed)
    {
        Breed bInitial = breedRepository.findOne(id);

        bInitial.setName(breed.getName());
        bInitial.setDesc(breed.getDesc());
        bInitial.setAnimal(breed.getAnimal());
        bInitial.setImgUrl(breed.getImgUrl());

        return breedRepository.save(bInitial);

    }

    @Override
    public void delete(long id)
    {
        breedRepository.delete(id);
    }
}
