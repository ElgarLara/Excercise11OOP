package com.Excercise11OOP.app;
import com.Excercise11OOP.model.Perro;
public class OOP {

	public static void main(String[] args)
	{
	// 
		Perro pluto;
		pluto = new Perro();
	
		//way 2
		Perro tribilin=new Perro();
		pluto.age=15;
		pluto.Height=50;
		pluto.id=10;
		
		System.out.println("pluto´s age:"+pluto.age);
		System.out.println("pluto's height:"+pluto.Height);
		System.out.println("pluto's"+pluto.id);

	}

}
