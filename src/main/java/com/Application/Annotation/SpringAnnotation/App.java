package com.Application.Annotation.SpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
    			"/com/Application/Annotation/SpringAnnotation/ApplicationContext.xml");
    			Student student = context.getBean("student", Student.class);

    			Student student1 = context.getBean("student", Student.class);
    			//Student student2 = new Student();
    			student.print();
    			System.out.println(student.value);
    			System.out.println(student.getStudentName());
    			//System.out.println("***************************");
    			//System.out.println(student);
    			//System.out.println(student1);
    			//System.out.println(student2);
    			//System.out.println("***************************");
    			System.out.println("Employee Detail");

    			Employee obj = context.getBean("empl", Employee.class);
    			//Employee obj1 = context.getBean("empl", Employee.class);
    			//System.out.println(obj.hashCode());
    			//System.out.println(obj1.hashCode());
    			System.out.println(obj.getFirstName());
    			System.out.println(obj.getLastName());
    			System.out.println(obj.getList());

    			System.out.println("***************************");

    			SpringExpressionTest spel = context.getBean("springExpressionTest",SpringExpressionTest.class);
    			System.out.println(spel.getVariable1());
    			System.out.println(spel.getVariable2());
    			System.out.println(spel.getVarible3());



    			}
    			}
