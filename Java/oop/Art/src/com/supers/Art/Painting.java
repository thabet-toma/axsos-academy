package com.supers.Art;

public class Painting extends Art {
	String paintType;

	
	public void viewArt() {
		System.out.println("this art made by"+this.author+"and its name"+this.title);
		System.out.println("made by "+this.paintType);
		System.out.println(this.description);

	}

}
