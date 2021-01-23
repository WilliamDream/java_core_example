package com.william.javacore.pattern.chuangjianxing.prototype.deepcopy;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable {

	private float height = 100;
	private float diameter = 100;
	
	private void big() {
		this.height *= 2;
		this.diameter *= 2;
	}
	
	private void little() {
		this.height /= 2;
		this.diameter = 2;
	}
	
	public float getHeight() {
		return height;
	}
 
	public void setHeight(float height) {
		this.height = height;
	}
 
	public float getDiameter() {
		return diameter;
	}
 
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	
}
