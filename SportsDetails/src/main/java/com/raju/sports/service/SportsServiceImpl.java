package com.raju.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.sports.dao.SportsDAO;
import com.raju.sports.modul.Sports;

@Service
public class SportsServiceImpl implements SportsService {

	@Autowired
	SportsDAO sportsDAO;
	
	@Override
	public void addSportsDetails(Sports sports) {
		sportsDAO.addSportsDetails(sports);
		
	}

	@Override
	public List<Sports> getSportsDetails() {
		
		return sportsDAO.getSportsDetails();
	}

	@Override
	public Sports getOneSportsDetail(Integer sportId) {
		
		return sportsDAO.getOneSportsDetail(sportId);
	}

	@Override
	public void updateSportDetail(Sports sports, Integer sportId) {
		sportsDAO.updateSportDetail(sports, sportId);
		
	}

	@Override
	public void deleteSportDetails(Integer sportId) {
		sportsDAO.deleteSportDetails(sportId);
		
	}

}
