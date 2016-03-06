package com.pershing.ppm.dao;

import java.util.List;

import com.pershing.ppm.model.IBD;


public interface IbdDAO {
	//public List<IBD> getIBDDetails();
	public List<String> searchIBD(String name);
	public List<IBD> getIBD();

}
