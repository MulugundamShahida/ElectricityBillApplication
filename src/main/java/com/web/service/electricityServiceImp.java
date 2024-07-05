package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.electricity;

import com.web.repo.electricityRepo;


@Service
public class electricityServiceImp implements electricityService {
	@Autowired
	private electricityRepo repo;

	@Override
	public electricity saveElectricity(electricity electricity) {
		int units=0;
		double totalbill=0.0;
		units=electricity.getCurrentreading()-electricity.getPreviousreading();
		if(units<300)
		{
			totalbill=units*1.75;
		}
		else if(units>300 && units<500)
		{
			totalbill=units*3.25;
		}
		else 
		{
			totalbill=units*7.25;
		}
		electricity.setUnits(units);
		electricity.setTotalbill(totalbill);
		electricity saveelectricity=repo.save(electricity);
		return saveelectricity;
	}

	@Override
	public electricity getOneElectricity(int consumerid) {
		electricity emp=repo.findById(consumerid).get();
		return emp;
	}

	@Override
	public void deleteElectricity(int consumerid) {
		repo.deleteById(consumerid);
		
	}

	@Override
	public List<electricity> getAllElectricity() {
		List<electricity> electricity=repo.findAll();
		return electricity;
	}

	@Override
	public electricity updateelectricity(electricity electricity) {
		// TODO Auto-generated method stub
		return null;
	}
}
	