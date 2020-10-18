package com.lambdaschool.foundation.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserCitiesId implements Serializable
{

    /**
     * Model for complex Id needed for UserCities
     *
     */

    /**
     * User Id
     */
    private long user;

    /**
     * City Id
     */
    private long city;

    /**
     * Default constructor
     */
    public UserCitiesId()
    {
    }

    /**
     * Getters and setters for UserCitiesId's field
     * @return
     */
    public long getUser()
    {
        return user;
    }

    public void setUser(long user)
    {
        this.user = user;
    }

    public long getCity()
    {
        return city;
    }

    public void setCity(long city)
    {
        this.city = city;
    }

    /**
     * Because this is a join table and implements Serializable,
     * equals and hashcode methods are required
     * @param o Object being compared
     * @return return boolean if object matches
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        UserCitiesId that = (UserCitiesId) o;
        return user == that.user &&
            city == that.city;
    }

    /**
     * Override of default hasCode(), we always want it to default to equals()
     * so we return a default value
     * @return default value
     */
    @Override
    public int hashCode()
    {
        return 37;
    }
}
