package rest.RestAssured_Api_Automation.restCommon;

import java.util.List;

public class InfoPojo {
	
	String  name;
	int  age;
	List<String> listarray;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getListarray() {
		return listarray;
	}
	public void setListarray(List<String> listarray) {
		this.listarray = listarray;
	}

	
	
}
