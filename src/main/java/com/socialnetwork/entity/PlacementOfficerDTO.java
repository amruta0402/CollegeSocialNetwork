package com.socialnetwork.entity;

public class PlacementOfficerDTO {
	Integer studentId;
	String requirements;
	String placeStudent;
	public PlacementOfficerDTO() {
		super();
	}
	public PlacementOfficerDTO(Integer studentId, String requirements, String placeStudent) {
		super();
		this.studentId = studentId;
		this.requirements = requirements;
		this.placeStudent = placeStudent;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getPlaceStudent() {
		return placeStudent;
	}
	public void setPlacedStudent(String placeStudent) {
		this.placeStudent = placeStudent;
	}
	

}