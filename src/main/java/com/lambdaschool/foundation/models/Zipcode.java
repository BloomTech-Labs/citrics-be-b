package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "zipcodes")
public class Zipcode extends Auditable {

  /**
   * Model for City's zipcode data
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private long zipId;

  /**
   * zipcode
   */
  @NotNull
  private String code;

  /**
   * City zipcode belongs to
   */
  @ManyToOne
  @JoinColumn(name = "city_id")
  @NotNull
  @JsonIgnore
  private City city;

  /**
   * Default constructor
   */
  public Zipcode() {}

  /**
   * Main constructor
   * @param code Zipcode
   * @param city City zipcode belongs to
   */
  public Zipcode(@NotNull String code, @NotNull City city) {
    this.code = code;
    this.city = city;
  }

  /**
   * Getters and setters for Zipscode's fields
   *
   ****************************************************************************************/
  public long getZipId() {
    return zipId;
  }

  public void setZipId(long zipid) {
    this.zipId = zipid;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  /**
   * Override default toString()
   * @return String of Zipcode object
   * @return String of Zipcode object
   */
  @Override
  public String toString() {
    return "Zipcode{" + "code='" + code + '\'' + '}';
  }
}
