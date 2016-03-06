package com.pershing.ppm.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pershing.ppm.dao.IbdDAO;
import com.pershing.ppm.dao.PlayerDAO;
import com.pershing.ppm.dao.PpmDAO;
import com.pershing.ppm.model.IBD;
import com.pershing.ppm.model.Player;
@Controller
public class PpmDashboardController {
	@Autowired
	private IbdDAO ibdDAO;

	@RequestMapping(value="/movie/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("\nSpring JDBC Template Demostration using spring datasource");
		/*List<String> ibdList=new ArrayList<String>();
		ibdList=ibdDAO.searchIBD("a%");*/
		
		// invokes getPlayer() method supplying PLAYER_ID
		/*System.out.println("\nA. Invoking getPlayer() method supplying player_id in the formal argument");
		Player player1 = playerDAO.getPlayer(1);
		System.out.println("\nID\tName\t\t\tAge\tMatches");
		System.out.println("==\t================\t===\t=======");
		System.out.println(player1.getPlayerId() + "\t" + player1.getName() + "\t" + player1.getAge() + "\t" + player1.getMatches());*/

		model.addAttribute("movie", name);
		return "kyc";

	}
	
	
	@RequestMapping(value="/ibd/{name}", method = RequestMethod.GET)
	public @ResponseBody List<String> getIbd(@PathVariable String name) {
		List<String> ibdList=new ArrayList<String>();
		String query=name+"%";
		ibdList=ibdDAO.searchIBD(query);
		System.out.println("Size of the list is "+ibdList.isEmpty());
		for(String sample:ibdList){
			System.out.println("value is-----------"+sample);
		}
		return ibdList;
	}
	
	@RequestMapping(value="/getIbd/{itemsPerPage}/{pagenumber}", method = RequestMethod.GET)
	public @ResponseBody List<IBD> getAllIbd(@PathVariable int itemsPerPage,@PathVariable int pagenumber) {
		List<IBD> ibdList=new ArrayList<IBD>();
		
		ibdList=ibdDAO.getIBD();
		System.out.println("Size of the list is "+ibdList.size());
		
		return ibdList;
	}
	
	
	
	
}
