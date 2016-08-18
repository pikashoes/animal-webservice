package edu.uchicago.sooji1.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pikashoes on 8/17/16.
 */

@Entity
public class Van
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
    private Make make;

    private String imgUrl;

    public Van(String name, String desc, Make make, String imgUrl)
    {
        this.name = name;
        this.desc = desc;
        this.make = make;
        this.imgUrl = imgUrl;
        createTime = new Date();
    }

    public Van()
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

    public Make getMake()
    {
        return make;
    }

    public void setMake(Make make)
    {
        this.make = make;
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
        return "Van{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", make=" + make +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
