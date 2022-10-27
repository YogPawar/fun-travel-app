package com.driver.funtravel.service.impl;

import com.driver.funtravel.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl {

  @Autowired
  DriverRepository driverRepository;
}
