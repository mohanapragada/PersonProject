package com.css.project;

public class Main {
	public static void main(String[] args)
	{
		Project project = new Project();
		project.setProjectID(123);
		project.setProjectName("Music Player");
		project.setProjectHead("Manager");
		project.setNoOfResources(2);
		System.out.println(project);
	}

}
