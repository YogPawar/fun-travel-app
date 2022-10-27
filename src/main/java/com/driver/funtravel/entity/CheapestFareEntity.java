package com.driver.funtravel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cheapest_fare")
public class CheapestFareEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "search_id")
  private int searchId;

  @Column(name = "cheapest_fare")
  private double cheapestFare;

  @Column(name = "total_distance")
  private int totalDistance;

  public int getSearchId() {
    return searchId;
  }

  public void setSearchId(int searchId) {
    this.searchId = searchId;
  }

  private int distTravelUnit;

  private int costPerDistTraveled;

  public CheapestFareEntity() {
    super();
  }

  public CheapestFareEntity(double cheapestFare, int totalDistance, int distTravelUnit,
      int costPerDistTraveled) {
    super();
    this.cheapestFare = cheapestFare;
    this.totalDistance = totalDistance;
    this.distTravelUnit = distTravelUnit;
    this.costPerDistTraveled = costPerDistTraveled;
  }

  public int getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(int totalDistance) {
    this.totalDistance = totalDistance;
  }

  public int getDistTravelUnit() {
    return distTravelUnit;
  }

  public void setDistTravelUnit(int distTravelUnit) {
    this.distTravelUnit = distTravelUnit;
  }

  public int getCostPerDistTraveled() {
    return costPerDistTraveled;
  }

  public void setCostPerDistTraveled(int costPerDistTraveled) {
    this.costPerDistTraveled = costPerDistTraveled;
  }

  public double getCheapestFare() {
    return cheapestFare;
  }

  public void setCheapestFare(double cheapestFare) {
    this.cheapestFare = cheapestFare;
  }

  @Override
  public String toString() {
    return "CheapestFareResponse [cheapestFare=" + cheapestFare + ", totalDistance=" + totalDistance
        + ", distTravelUnit=" + distTravelUnit + ", costPerDistTraveled=" + costPerDistTraveled
        + "]";
  }

}
