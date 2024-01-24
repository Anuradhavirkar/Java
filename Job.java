package com.java;

public class Job {
	String[] Job= {"Job1","Job2","Job3","Job4","Job5","Job5","Job6","Job7","Job8","Job9","JOb10"};
	
	void Jobs(int Task1, int Task2) {
	
	 System.out.println("Job Progress="+(Task1+Task2)/2);
	}
public static void main(String[] args) {
		
		Job job1= new Job();
		job1.Jobs(100, 50);
		
		Job job2= new Job();
		job2.Jobs(75, 75);
		
		Job job3= new Job();
		job3.Jobs(60, 50);
		
		Job job4= new Job();
		job4.Jobs(80, 50);
		
		Job job5= new Job();
		job5.Jobs(100, 70);
		
		
		}
	

	
		

}

