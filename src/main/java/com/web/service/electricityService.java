package com.web.service;

import java.util.List;

import com.web.model.electricity;


public interface electricityService {
public electricity saveElectricity(electricity electricity);
public electricity getOneElectricity(int consumerid);
public void deleteElectricity(int consumerid);
public List<electricity> getAllElectricity();
public electricity updateelectricity(electricity electricity);
}
