package com.shrinivasb.lombokdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

/**
 * Creating this Json Structure in POJO
 * 
{
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

public class Employee2{
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Emp2 emp=new Emp2(2005,"John Doe",40000,new ArrayList<String>(Arrays.asList("Java", "SQL", "jQuery"))
				,new Address2(100, "Delhi", "India", "231245"));
		String jsonString=mapper.writeValueAsString(emp);
		System.out.println(jsonString);
	}
}



@AllArgsConstructor
class Emp2
{
  public int id;
  public String name;
  public int salary;
  public List<String> skills;
  public Address2 address;
}

@AllArgsConstructor
class Address2{
	public int id;
	public String city;
	public String country;
	public String pin;
}





