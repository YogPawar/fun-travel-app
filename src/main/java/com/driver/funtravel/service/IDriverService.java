package com.driver.funtravel.service;

import com.driver.funtravel.entity.DriverEntity;
import com.driver.funtravel.model.DriverDetails;

public interface IDriverService {

  DriverDetails saveOrUpdate(DriverDetails driver);

  void delete(int driverId);

}
