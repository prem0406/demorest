package com.nagarro.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	private String name;
	private int points;
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}
