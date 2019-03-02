package com.william.javacore.pattern.template.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.william.javacore.pattern.template.JdbcTemplate;
import com.william.javacore.pattern.template.Member;
import com.william.javacore.pattern.template.RowMapper;

public class MemberDao{

	private JdbcTemplate jdbc = new JdbcTemplate(null);
	
	
	public List<Object> query(){
		String sql = "SELECT * FORM member ";
		return jdbc.executeQuery(sql,new RowMapper<Member>() {
			public Member mapRow(ResultSet rs, int rowNum) throws Exception{
				Member member = new Member();
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		},null);
	}

    public Object processResult(ResultSet rs, int rowNum)throws Exception {
        Member member = new Member();
        member.setUsername(rs.getString("username"));
        member.setPassword(rs.getString("password"));
        member.setAge(rs.getInt("age"));
        member.setAddr(rs.getString("addr"));
        return member;
    }
	
}
