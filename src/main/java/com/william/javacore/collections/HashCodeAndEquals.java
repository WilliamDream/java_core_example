package com.william.javacore.collections;

public class HashCodeAndEquals {

	
		private Integer id;
		public Integer getId()
		{ return id; }
		public HashCodeAndEquals(Integer id)
		{ this.id = id; }
		//故意先注释掉equals和hashCode方法
		 public boolean equals(Object o) {
			 if (o == null || !(o instanceof HashCodeAndEquals)){ 
				 return false; 
			 }else{
				 return this.getId().equals(((HashCodeAndEquals) o).getId());
			 }
		 }
		
		public int hashCode(){
			return id.hashCode(); 
		}
		 

	
}
