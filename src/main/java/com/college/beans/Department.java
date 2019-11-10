package com.college.beans;

public class Department {
	private Integer did;
	private String dName;
	private Integer cid;

	public Department() {
		super();
	}

	public Department(Integer did, String dName, Integer cid) {
		super();
		this.did = did;
		this.dName = dName;
		this.cid = cid;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dName=" + dName + ", cid=" + cid + "]";
	}

}
