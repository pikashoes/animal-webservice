package edu.uchicago.sooji1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pikashoes on 8/17/16.
 */

@Entity
public class Make
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Make(String name)
    {
        this.name = name;
    }

    public Make()
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
