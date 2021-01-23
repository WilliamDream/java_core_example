package com.william.javacore.pattern.chuangjianxing.prototype.deepcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class TheGreatestSage extends Monkey implements Serializable, Cloneable {

	GoldRingedStaff staff;
	
	public TheGreatestSage() {
		this.staff = new GoldRingedStaff();
		
		this.height = 160;
		this.weight = 40;
		this.birthday = new Date();
		System.out.println("克隆不执行构造方法，直接走字节码复制。");
	}
	
	
	@Override
	protected Object clone() {
		/*try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}*/
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			TheGreatestSage copyGreatestSage = (TheGreatestSage) ois.readObject();
			copyGreatestSage.setBirthday(new Date());
			return copyGreatestSage;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
 


	public void change() {
		TheGreatestSage copygreatestSage = (TheGreatestSage) clone();
		System.out.println("齐天大圣本尊生日："+this.getBirthday().getTime());
		System.out.println("克隆的齐天大圣本尊生日："+copygreatestSage.getBirthday().getTime());
		System.out.println("大圣本尊："+this);
		System.out.println("克隆大圣："+copygreatestSage);
		System.out.println("大圣本尊与克隆大圣是否同一个对象："+(this == copygreatestSage));
		System.out.println("大圣本尊的金箍棒："+this.staff);
		System.out.println("克隆大圣的金箍棒："+copygreatestSage.staff);
		System.out.println("金箍棒是否同一个："+(this.staff == copygreatestSage.staff));
		
	}

	
	public static void main(String[] args) {
		TheGreatestSage copy = new TheGreatestSage();
		copy.change();
	}
	
}
