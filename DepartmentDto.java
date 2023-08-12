package com.restemp.userservice.dto;

public class DepartmentDto {
	private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentDto(Long id, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "DepartmentDto [id=" + id + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + ", getId()=" + getId()
				+ ", getDepartmentName()=" + getDepartmentName() + ", getDepartmentAddress()=" + getDepartmentAddress()
				+ ", getDepartmentCode()=" + getDepartmentCode() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

}
