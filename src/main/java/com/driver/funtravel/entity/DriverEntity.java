package com.driver.funtravel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class DriverEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "driver_id")
  private int driverId;
  @Column(name = "name")
  private String dName;
  @Column(name = "surname")
  private String dSurname;
  @Column(name = "email")
  private String dEmail;

  @Column(name = "vehicle_type")
  private String dVehicleType;

  @Column(name = "base_fare_price")
  private double baseFarePrice;
  @Column(name = "base_fare_distance")
  private double bfDistance;

  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }

  public String getdName() {
    return dName;
  }

  public void setdName(String dName) {
    this.dName = dName;
  }

  public String getdSurname() {
    return dSurname;
  }

  public void setdSurname(String dSurname) {
    this.dSurname = dSurname;
  }

  public String getdEmail() {
    return dEmail;
  }

  public void setdEmail(String dEmail) {
    this.dEmail = dEmail;
  }

  public String getdVehicleType() {
    return dVehicleType;
  }

  public void setdVehicleType(String dVehicleType) {
    this.dVehicleType = dVehicleType;
  }

  public double getBaseFarePrice() {
    return baseFarePrice;
  }

  public void setBaseFarePrice(double baseFarePrice) {
    this.baseFarePrice = baseFarePrice;
  }

  public double getBfDistance() {
    return bfDistance;
  }

  public void setBfDistance(double bfDistance) {
    this.bfDistance = bfDistance;
  }

  @Override
  public String toString() {
    return "Driver [driverId=" + driverId + ", dName=" + dName + ", dSurname=" + dSurname
        + ", dEmail=" + dEmail
        + ", dVehicleType=" + dVehicleType + ", baseFarePrice=" + baseFarePrice + ", bfDistance="
        + bfDistance
        + "]";
  }
}

