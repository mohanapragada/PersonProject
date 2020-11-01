package com.css.project;

public class Project {
	private int projectID;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
	public int getProjectID() {
		return projectID;
	
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProjectHead() {
		return projectHead;
	}
	
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	
	public int getNoOfResources() {
		return noOfResources;
	}
	
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int projectID, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}
	
	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}

	
}
