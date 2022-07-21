package com.Application.Annotation.SpringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

//Student student = new Student();
//StudentAbc studentAbc = new StudentAbc();

int value;

@Value("VICKY KESHRI")
private String studentName;

public String getStudentName() {
return studentName;
}

public void setStudentName(String studentName) {
this.studentName = studentName;
}

void print() {
System.out.println("Print Student Class");
}

}