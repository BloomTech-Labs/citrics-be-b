package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Model for City's historical housing cost data
 */
@Entity
@Table(name = "historical_home_cost")
public class HistoricalHomeCost extends Auditable {

  /**
   * Data entry ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private long houseId;

  /**
   * Year of entry
   */
  @NotNull
  private int year;

  /**
   * Month of entry
   */
  @NotNull
  private int month;

  /**
   * Average housing cost of recorded data
   */
  @NotNull
  private int homeCost;

  /**
   * City entry belongs to
   */
  @ManyToOne
  @JoinColumn(name = "city_id")
  @NotNull
  @JsonIgnore
  private City city;

  /**
   * Default constructor
   */
  public HistoricalHomeCost() {}

  /**
   * Main constructor
   * @param year Year of entry
   * @param month Month of entry
   * @param homeCost Cost at date of entry
   * @param city City entry belongs to
   */
  public HistoricalHomeCost(
    @NotNull int year,
    @NotNull int month,
    @NotNull int homeCost,
    @NotNull City city
  ) {
    this.year = year;
    this.month = month;
    this.homeCost = homeCost;
    this.city = city;
  }

  /**
   * Getters and setters for HistoricalHomeCost's fields
   *
   ********************************************************************************/
  public long getHouseId() {
    return houseId;
  }

  public void setHouseId(long houseId) {
    this.houseId = houseId;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getHomeCost() {
    return homeCost;
  }

  public void setHomeCost(int homeCost) {
    this.homeCost = homeCost;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  /**
   * Override default toString()
   * @return String of HistoricalHomeCost object
   */
  @Override
  public String toString() {
    return (
      "HistoricalHomeCost{" +
      "year=" +
      year +
      ", month=" +
      month +
      ", homeCost=" +
      homeCost +
      '}'
    );
  }
}
