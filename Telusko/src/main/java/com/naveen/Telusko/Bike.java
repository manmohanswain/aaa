package com.naveen.Telusko;

import org.springframework.stereotype.Component;

@Component
class Bike implements Vehicle {

	public void drive() {
		System.out.println("bhag raha hai...");
	}
}
