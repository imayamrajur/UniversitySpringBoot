package com.raju.sports.service;

import java.util.List;

import com.raju.sports.modul.Sports;

public interface SportsService {
	public void addSportsDetails(Sports sports);
	public List<Sports> getSportsDetails();
	public Sports getOneSportsDetail(Integer sportId);
	public void updateSportDetail(Sports sports, Integer sportId);
	public void deleteSportDetails(Integer sportId);


}
