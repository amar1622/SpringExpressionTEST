package com.Application.Annotation.SpringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringExpressionTest {
	@Value("#{45+55}")
	private int variable1;

	@Value("#{T (java.lang.Math).sqrt(169)}")
	private double variable2;

	@Value("#{T (java.lang.Math).PI}")
	private double varible3;

	public int getVariable1() {
	return variable1;
	}

	public void setVariable1(int variable1) {
	this.variable1 = variable1;
	}

	public double getVariable2() {
	return variable2;
	}

	public void setVariable2(double variable2) {
	this.variable2 = variable2;
	}

	public double getVarible3() {
	return varible3;
	}

	public void setVarible3(double varible3) {
	this.varible3 = varible3;
	}


	}

