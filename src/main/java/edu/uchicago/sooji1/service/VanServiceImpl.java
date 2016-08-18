package edu.uchicago.sooji1.service;

import edu.uchicago.sooji1.domain.Van;
import edu.uchicago.sooji1.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pikashoes on 8/17/16.
 */
public class VanServiceImpl implements VanService
{

    private VanRepository vanRepository;

    @Autowired // better form to autowire on constructor
    public VanServiceImpl(VanRepository vanRepository)
    {
        this.vanRepository = vanRepository;
    }

    @Override
    public Iterable<Van> list()
    {
        return vanRepository.findAll();
    }

    @Override
    public Van create(Van van)
    {
        return vanRepository.save(van);
    }

    @Override
    public Van read(long id)
    {
        return vanRepository.findOne(id);
    }

    @Override
    public Van update(long id, Van van)
    {
        Van vanInitial = vanRepository.findOne(id);

        vanInitial.setName(van.getName());
        vanInitial.setDesc(van.getDesc());
        vanInitial.setMake(van.getMake());
        vanInitial.setImgUrl(van.getImgUrl());

        return vanRepository.save(vanInitial);

    }

    @Override
    public void delete(long id)
    {
        vanRepository.delete(id);
    }
}
