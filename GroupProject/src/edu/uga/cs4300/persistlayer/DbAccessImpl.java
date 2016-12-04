package edu.uga.cs4300.persistlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAccessImpl extends DbAccessConfiguration implements  DbAccessInterface{
	
	@Override
	public Connection connect() {
		Connection con = null;
		try {
			// load the driver
			Class.forName(DRIVER);
			
			// establish a connection
			con = DriverManager.getConnection(CON_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	@Override
	public ResultSet retrieve(Connection con, String query) {
		ResultSet rset = null;
		
		try {
			// create a JDBC statement
			Statement stm = con.createStatement();
			
			// execute a query
			rset = stm.executeQuery(query);
			return rset;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return rset;
		}
	}

	@Override
	public int create(Connection con, String query) {
		int affected=0;
		try {
			Statement stmt = con.createStatement();
			affected = stmt.executeUpdate(query);
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return affected;
		
	}

	@Override
	public int update(Connection con, String query) {
		Statement stmt;
		int affected =0;
		try {
			stmt = con.createStatement();
			affected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return affected;
	}

	@Override
	public int delete(Connection con, String query) {
		
		Statement stmt;
		int rows=0;
		try {
			stmt = con.createStatement();
			rows= stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public void disconnect(Connection con) {
		if(con !=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if
		
	}// disconnect

}


