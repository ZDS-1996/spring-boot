package com.example.pojos;

import java.io.Serializable;

public class Student implements Serializable{
 private int stuId;
 private String stuName;
 private String stuPwd;
 private String stuFullName;
 private String stuIdentity;
 private String stuPhone;
 private String stuSex;
 private String stuCity;
 private String stuHeadPortrait;
public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}

public String getStuPwd() {
	return stuPwd;
}
public void setStuPwd(String stuPwd) {
	this.stuPwd = stuPwd;
}
public String getStuFullName() {
	return stuFullName;
}
public void setStuFullName(String stuFullName) {
	this.stuFullName = stuFullName;
}
public String getStuIdentity() {
	return stuIdentity;
}
public void setStuIdentity(String stuIdentity) {
	this.stuIdentity = stuIdentity;
}
public String getStuPhone() {
	return stuPhone;
}
public void setStuPhone(String stuPhone) {
	this.stuPhone = stuPhone;
}
public String getStuSex() {
	return stuSex;
}
public void setStuSex(String stuSex) {
	this.stuSex = stuSex;
}
public String getStuCity() {
	return stuCity;
}
public void setStuCity(String stuCity) {
	this.stuCity = stuCity;
}
public String getStuHeadPortrait() {
	return stuHeadPortrait;
}
public void setStuHeadPortrait(String stuHeadPortrait) {
	this.stuHeadPortrait = stuHeadPortrait;
}
 
 
}
