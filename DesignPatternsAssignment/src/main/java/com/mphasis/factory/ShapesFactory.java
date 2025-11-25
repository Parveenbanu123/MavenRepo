package com.mphasis.factory;

public class ShapesFactory {
	public static Shape getShape(String type) {
		if(type.equals("circle"))
			return new Circle();
		if(type.equals("square"))
			return new Square();
		if(type.equals("rectangle"))
			return new Rectangle();
		
		return null;
	}
}
