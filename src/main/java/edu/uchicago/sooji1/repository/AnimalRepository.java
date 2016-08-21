package edu.uchicago.sooji1.repository;

import edu.uchicago.sooji1.domain.Animal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pikashoes on 8/18/16.
 */
public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
