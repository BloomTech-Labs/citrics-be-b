package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usercities")
@IdClass(UserCitiesId.class)
public class UserCities extends Auditable implements Serializable
{

    @Id
    @ManyToOne
    @NotNull
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties(value = "cities", allowSetters = true)
    private User user;

    @Id
    @ManyToOne
    @NotNull
    @JoinColumn(name = "cityid")
    @JsonIgnoreProperties(value = "users", allowSetters = true)
    private City city;

    public UserCities()
    {
    }

    public UserCities(
        @NotNull User user,
        @NotNull City city)
    {
        this.user = user;
        this.city = city;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof UserCities))
        {
            return false;
        }
        UserCities that = (UserCities) o;
        return ((user == null) ? 0 : user.getUserid()) == ((that.user == null) ? 0 : that.user.getUserid()) &&
            ((city == null) ? 0 : city.getCityid()) == ((that.city == null) ? 0 : that.city.getCityid());
    }

    @Override
    public int hashCode()
    {
        return 37;
    }
}
