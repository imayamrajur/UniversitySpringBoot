package com.raju.java.seven.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.raju.maps.College;

public class ConsumerFunnction {

	public static void main(String[] args) {
		College clgAnn = new College(1001, "Anna Universit", "Guindy");
		College clgAml = new College(1005, "Annamalai Universit", "Chidambaram");
		College clgVel = new College(1007, "Vels Universit", "Chrompet");
		College clgSrm = new College(1003, "SRM Universit", "Potheri");
		College clgTvl = new College(1002, "Thiruvalluvar Universit", "Vellor");
		College clgBrt = new College(1010, "Bharathi Dhasan Universit", "Tanjor");
		
		List<College> clist = new ArrayList<>();
		clist.add(clgVel);
		clist.add(clgBrt);
		clist.add(clgTvl);
		clist.add(clgSrm);
		clist.add(clgAml);
		clist.add(clgAnn);
		
		Consumer<College> c = a->{
			System.out.println(a.getClgId());
			System.out.println(a.getClgName().toUpperCase());
			System.out.println(a.getPlace());
		};
		
		Consumer<College> c2 = a->{
			System.out.println(a.getClgId());
			System.out.println(a.getClgName().toLowerCase());
			System.out.println(a.getPlace());
		};
		
		clist.forEach(c.andThen(c2));
		

	}

}
