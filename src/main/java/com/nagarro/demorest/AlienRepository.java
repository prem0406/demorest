package com.nagarro.demorest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {


	Connection con = null;
	public AlienRepository() {
		/*aliens = new ArrayList<Alien>();
		Alien a1 = new Alien();
		a1.setName("Prem");
		a1.setPoints(60);
		
		Alien a2 = new Alien();
		a2.setName("Vipul");
		a2.setPoints(100);
		
		aliens.add(a1);
		aliens.add(a2);*/
		
		String url = "jdbc:mysql://localhost:3306/restdb";
		String user= "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		return aliens;
	}
}
