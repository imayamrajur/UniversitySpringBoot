package com.raju.consumor;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		Consumer<String> con = s ->System.out.println(s.toUpperCase());
		Consumer<String> co = s ->System.out.println(s.toLowerCase());
		//con.accept("raju");
		con.andThen(co).accept("saRa");
		
		BiConsumer<String, String> bio = (s,t) ->System.out.println(s.toLowerCase()+" "+t.toUpperCase());
		bio.accept("RAJU", "sara");
	}

}
