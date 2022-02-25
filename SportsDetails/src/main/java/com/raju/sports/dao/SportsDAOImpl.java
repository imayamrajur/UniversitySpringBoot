package com.raju.sports.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raju.sports.modul.Sports;

@Repository
public class SportsDAOImpl implements SportsDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addSportsDetails(Sports sports) {
		jdbcTemplate.update("INSERT INTO sports(sportName, sportType) VALUES(?,?)",sports.getSportName(),sports.getSportType());
		
	}

	@Override
	public List<Sports> getSportsDetails() {
		List<Sports> list = jdbcTemplate.query("SELECT * FROM sports", new BeanPropertyRowMapper<>(Sports.class));
		return list;
	}

	@Override
	public Sports getOneSportsDetail(Integer sportId) {
		Sports sports = (Sports) jdbcTemplate.queryForObject("SELECT * FROM sports WHERE sportId=?", new Object[] {sportId}, new BeanPropertyRowMapper<>(Sports.class));
		return sports;
	}

	@Override
	public void updateSportDetail(Sports sports, Integer sportId) {
		
		jdbcTemplate.update("UPDATE sports SET sportName=?, sportType=? WHERE sportId=?", sports.getSportName(),sports.getSportType(),sportId);
	}

	@Override
	public void deleteSportDetails(Integer sportId) {
		jdbcTemplate.update("DELETE FROM sports WHERE sportId=? ", sportId);
		
	}

}
