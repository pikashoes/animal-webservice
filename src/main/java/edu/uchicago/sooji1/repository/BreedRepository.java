package edu.uchicago.sooji1.repository;

import edu.uchicago.sooji1.domain.Breed;
import org.springframework.data.repository.CrudRepository;

/**
 * Breed Repository
 */
public interface BreedRepository extends CrudRepository<Breed, Long>
{
}
