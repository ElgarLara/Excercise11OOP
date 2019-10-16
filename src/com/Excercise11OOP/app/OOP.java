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
		
		System.out.println("pluto´s age:"+pluto.age);
		System.out.println("pluto's height:"+pluto.Height);
		System.out.println("pluto's"+pluto.id);
		
		pluto.age=15;
		pluto.Height=50;
		pluto.id=10;
		
		System.out.println("pluto´s age:"+pluto.age);
		System.out.println("pluto's height:"+pluto.Height);
		System.out.println("pluto's"+pluto.id);
		
		Perro firulais=new Perro(1,"Firullais","labrador",5,60.0);
		System.out.println("Firulais age:"+firulais.age);
		System.out.println("Firulais height:"+firulais.Height);
		System.out.println("Firulais id:"+firulais.id);

	}

}
