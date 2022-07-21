package com.Application.Annotation.SpringAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

//@Component("emp")
public class Employee {


@Value("Vicky")
private String firstName;

@Value("Keshri")
private String lastName;

@Value("#{listvalue}")
private List<String> list;

public List<String> getList() {
return list;
}

public void setList(List<String> list) {
this.list = list;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

}