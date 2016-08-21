package edu.uchicago.sooji1.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Animal Repository
 */

@Entity
public class Breed
{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String desc;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @ManyToOne
    private Animal animal;

    private String imgUrl;

    public Breed(String name, String desc, Animal animal, String imgUrl)
    {
        this.name = name;
        this.desc = desc;
        this.animal = animal;
        this.imgUrl = imgUrl;
        createTime = new Date();
    }

    public Breed()
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

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString()
    {
        return "Breed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", animal=" + animal +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

}
