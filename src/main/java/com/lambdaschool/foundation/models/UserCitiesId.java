package com.lambdaschool.foundation.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserCitiesId implements Serializable
{

    private long user;

    private long city;

    public UserCitiesId()
    {
    }

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

    @Override
    public int hashCode()
    {
        return 37;
    }
}
