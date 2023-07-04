package com.java.concepts;

public class StudentBuilder{

	private String _name;
    private int _age = 14;      // this has a default
    private String _motto = ""; // most students don't have one

    public StudentBuilder() { }

   
    public StudentBuilder name(String _name)
    {
        this._name = _name;
        return this;
    }

    public StudentBuilder age(int _age)
    {
        this._age = _age;
        return this;
    }

    public StudentBuilder motto(String _motto)
    {
        this._motto = _motto;
        return this;
    }
    
    public static void main(String[] args) {
		StudentBuilder sb = new StudentBuilder();
		System.out.println(sb.age(3));
	}
}
