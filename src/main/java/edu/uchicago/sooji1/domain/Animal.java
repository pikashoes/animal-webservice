package edu.uchicago.sooji1.domain;
import javax.persistence.*;

/**
 * Animal - cat, dog, rabbit
 */

@Entity
public class Animal
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public Animal()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
