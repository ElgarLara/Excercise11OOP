package com.Excercise11OOP.model;

public abstract class Cat implements Catable
//propertities
{
	private int id;
	private String name;
	private int age;
	
	public Cat()
	{
		
	}
	public Cat(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	//getters and Setbters(un get y un set por propiedad)
	public int getId() {
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	//tostring
	public String ToString()
	{
		return "id:["+id+"], name:["+name+"], age:["+age+"]";
	}

}
