package com.kaustubh.project;

public class Restaurant {

Tea hotDrink;


public Tea getHotDrink() {
	return hotDrink;
}

public void setHotDrink(Tea hotDrink) {
	this.hotDrink = hotDrink;
}


public void makeTea()
{
hotDrink.prepareTea();
}
}
