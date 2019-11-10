package com.college.beans;

import java.util.Date;

public class Students {
	private Integer sid;
	private String sname;
	private Double sfees;
	private Integer did;
	private Date joiningDate;
	private Long time;

	public Students() {
		super();

	}

	public Students(Integer sid, String sname, Double sfees, Integer did, Date joiningDate, Long time) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
		this.did = did;
		this.joiningDate = joiningDate;
		this.time = time;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSfees() {
		return sfees;
	}

	public void setSfees(Double sfees) {
		this.sfees = sfees;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + ", did=" + did + ", joiningDate="
				+ joiningDate + ", time=" + time + "]";
	}

}
