package com.supers.Art;

public class Sculpture extends Art {
	String material;
	public void viewArt() {
		System.out.println("this art made by"+this.author+"and its name"+this.title);
		System.out.println("made by "+this.material);
		System.out.println(this.description);
		

	}
}
