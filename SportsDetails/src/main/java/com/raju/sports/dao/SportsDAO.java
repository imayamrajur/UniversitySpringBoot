package com.raju.sports.dao;

import java.util.List;


import com.raju.sports.modul.Sports;

public interface SportsDAO {
	public void addSportsDetails(Sports sports);
	public List<Sports> getSportsDetails();
	public Sports getOneSportsDetail(Integer sportId);
	public void updateSportDetail(Sports sports, Integer sportId);
	public void deleteSportDetails(Integer sportId);

}
