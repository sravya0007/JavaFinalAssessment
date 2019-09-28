package com.dev.finalassessment;

public class Phone {
private String name;
private long number;
private String group;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
@Override
public String toString() {
	return "Phone [name=" + name + ", number=" + number + ", group=" + group + "]";
}




}
