package com.william.javacore.pattern.xingweixing.template.v2;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

	private DataSource dataSource;
	
	public JdbcTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}
	
	private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
		return  conn.prepareStatement(sql);
	}
	
	private ResultSet executeQuery(PreparedStatement ps, RowMapper<?> rowMapper, Object[] values) throws SQLException {
		for (int i = 0; i < values.length; i++) {
			ps.setObject(i,values[i]);
		}
		return ps.executeQuery();
	}

    private void closeStatement(Statement st) throws  Exception{
        st.close();
    }

    private void closeResultSet(ResultSet rs) throws  Exception{
        rs.close();
    }

    private void closeConnection(Connection conn) throws  Exception{
    	conn.close();
    }
	
    private List<Object> parseResultSet(ResultSet rs,RowMapper rowMapper) throws  Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;
    }
    
	public List<Object> executeQuery(String sql,RowMapper<?> row,Object [] values){
		
		try {
			// 1.获取连接
			Connection conn = this.getConnection();
			// 2.创建语句集
			PreparedStatement ps = this.createPreparedStatement(conn,sql);
			// 3.执行语句集，获取结果集
			ResultSet res = ps.executeQuery();
			
			// 4.解析语句集
			List<Object> result = this.parseResultSet(res, null);
			
			// 5.关闭结果集
			this.closeResultSet(res);
			// 6.关闭语句集
			this.closeStatement(ps);
			
			// 7.关闭连接
			this.closeConnection(conn);
			
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
}
