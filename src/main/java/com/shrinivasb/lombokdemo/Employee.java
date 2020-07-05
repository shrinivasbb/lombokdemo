package com.shrinivasb.lombokdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

/**
 * Creating this Json Structure in POJO
 * 
 * {
  "id" : 2005,
  "name" : "John Doe",
  "salary" : 40000,
  "skills" : [ "Java", "SQL", "jQuery" ],
  "address" : {
    "id" : 100,
    "city" : "Delhi",
    "country" : "India",
    "pin" : "231245"
  }
}
 *
 */

public class Employee{
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Emp emp=new Emp();
		emp.setId(2005);
		emp.setName("John Doe");
		emp.setSalary(40000);
		emp.setSkills(new ArrayList<String>(Arrays.asList("Java","SQL","jQuery")));
		Address address=new Address();
		address.setId(100);
		address.setCity("Delhi");
		address.setCountry("India");
		address.setPin("231245");
		emp.setAddress(address);
		String jsonString=mapper.writeValueAsString(emp);
		System.out.println(jsonString);
	}
}


@Data
class Emp
{
    public Integer id;
    public String name;
    public Integer salary;
    public List<String> skills;
    public Address address;
}

@Data
class Address{
	public Integer id;
	public String city;
	public String country;
	public String pin;
}





