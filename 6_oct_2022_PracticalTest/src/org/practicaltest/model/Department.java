package org.practicaltest.model;

import java.util.Objects;

public class Department implements Comparable<Departments>{
	
	int departmentid;
	String departmentName;
	int numberOfEmployee;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int departmentid, String departmentName, int numberOfEmployee) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.numberOfEmployee = numberOfEmployee;
	}


	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + ", numberOfEmployee="
				+ numberOfEmployee + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(departmentName, departmentid, numberOfEmployee);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentName, other.departmentName) && departmentid == other.departmentid
				&& numberOfEmployee == other.numberOfEmployee;
	}
	
	


	public int getDepartmentid() {
		return departmentid;
	}


	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}


	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}


	@Override
	public int compareTo(Departments o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
