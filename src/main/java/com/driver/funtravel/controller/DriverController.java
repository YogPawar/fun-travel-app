package com.driver.funtravel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.driver.funtravel.model.DriverDetails;
import com.driver.funtravel.repository.DriverRepository;

@Controller
@RequestMapping("api/fun/travel")
public class DriverController {

	@Autowired
	DriverRepository driverRepo;
	
	@PostMapping("/add")
	public ModelAndView addDriver(DriverDetails driver) {
		ModelAndView mv = new ModelAndView();
		driverRepo.save(driver);
		mv.addObject("driver", driver);
		mv.setViewName("RegisterSuccess");
		return mv;
	}

	@PutMapping("/update")
	public DriverDetails updateDriver(@RequestBody DriverDetails driver) {
		driverRepo.save(driver);
		return driver;
	}

	@DeleteMapping("/delete/{driverId}")
	public String deleteDriver(@PathVariable int driverId) {
		Optional<DriverDetails> driver = driverRepo.findById(driverId);
		if (driver.isPresent()) {
			driverRepo.delete(driver.get());
			return "Deleted";
		}
		return "Driver not found";
	}

}
