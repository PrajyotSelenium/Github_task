package com.practice;

public class Demo_class {
	int x=10;
    static int z=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Java program is in jenkins");
       int x=0;
       System.out.println("Local variable = "+x);
       Demo_class d=new Demo_class();
       System.out.println("instance variable = "+d.x);
       System.out.println("Class variable = "+z);
	}
}
