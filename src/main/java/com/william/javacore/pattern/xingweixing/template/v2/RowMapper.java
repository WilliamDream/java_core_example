package com.william.javacore.pattern.xingweixing.template.v2;

import java.sql.ResultSet;

public interface RowMapper<T> {

	public T mapRow(ResultSet rs, int rowNum) throws Exception;
	
	
}
