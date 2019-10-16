package com.Excercise11OOP.app;
import com.Excercise11OOP.model.Cat;
public class Cato {

	public static void main(String[] args) 
	{
		Cat michi = new Cat();
		
		michi.setId(1);
		michi.setName("michi");
		michi.setAge(3);
		
		System.out.println("Michi's Id:"+michi.getId());
		System.out.println("Michi's name:"+michi.getName());
		System.out.println("Michi's Age:"+michi.getAge());
		
		System.out.println(michi.ToString());

	}

}
