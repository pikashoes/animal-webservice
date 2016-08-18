package edu.uchicago.sooji1.service;

import edu.uchicago.sooji1.domain.Van;

/**
 * Created by pikashoes on 8/17/16.
 */
public interface VanService
{
    // list + CRUD

    Iterable<Van> list();

    Van create(Van van);

    Van read(long id);

    Van update(long id, Van van);

    void delete(long id);
}
