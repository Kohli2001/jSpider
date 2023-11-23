package org.jsp.test.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.jsp.test.dto.Employee;

public class EmployeeDao {
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;	
	
	{
		Properties p = new Properties();
		FileInputStream fin=null;
		try {
		fin=new FileInputStream("C:\\Users\\hp\\Desktop\\Test\\JDBC file\\JDBC.properties");
		p.load(fin);
		con=DriverManager.getConnection(p.getProperty("url"), p);
	}
		catch(IOException |SQLException e) {
			e.printStackTrace();
		}
	 finally {
		if (fin != null) {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	  }
	}
	
	
	public String saveEmployee(Employee e) {
		String qry = "insert into employee values(?,?,?,?,?,?,?);";
		try {
			pst =con.prepareStatement(qry);
			pst.setInt(1, e.geteId());
			pst.setString(2, e.geteName());
			pst.setString(3, e.geteDesignation());
			pst.setDouble(4, e.geteSalary());
			pst.setString(5, e.geteEmail());
			pst.setLong(6, e.getePhone());
			pst.setString(7, e.getePassword());
			pst.executeUpdate();
			
			return "Employee Saved successfully...!!";
			
		}catch(SQLException exp) {
			return "Unable to save the Employee...";
		}
	}
		
			
			public String updateEmployee(Employee emp) {
				String qry="update employee set name=?,designation=?, salary=? ,email=?, phone=?,password=? where id=?";
				
				try {
					pst=con.prepareStatement(qry);
					pst.setInt(7, emp.geteId());
					pst.setString(1, emp.geteName());
					pst.setString(2, emp.geteDesignation());
					pst.setDouble(3, emp.geteSalary());
					pst.setString(4, emp.geteEmail());
					pst.setLong(5, emp.getePhone());
					pst.setString(6,emp.getePassword());
					pst.executeUpdate();
					return "User Updated successfully..!!";
					
				}
				catch(SQLException e) {
					return "Unable to Update the Employee..!!";
				}
				
			}
			//using phone and passeord
			
			public Employee verifyEmployee(long phone, String password) {
				String qry = "select * from employee where phone=? and password=?";
				try {
					pst = con.prepareStatement(qry);
					pst.setLong(1, phone);
					pst.setString(2, password);
					rs = pst.executeQuery();
					Employee e = new Employee();
					if (rs.next()) {
						e.seteId(rs.getInt(1));
						e.seteName(rs.getString(2));
						e.seteDesignation(rs.getString(3));
						e.seteSalary(rs.getDouble(4));
						e.seteEmail(rs.getString(5));
						e.setePhone(rs.getLong(6));
						e.setePassword(rs.getString(7));
						return e;
					}
					return null;
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
			
			//using email and password
			public Employee verifyEmployee(String email, String password) {
				String qry = "select * from employee where phone=? and password=?";
				try {
					pst = con.prepareStatement(qry);
					pst.setString(1, email);
					pst.setString(2, password);
					rs = pst.executeQuery();
					Employee e = new Employee();
					if (rs.next()) {
						e.seteId(rs.getInt(1));
						e.seteName(rs.getString(2));
						e.seteDesignation(rs.getString(3));
						e.seteSalary(rs.getDouble(4));
						e.seteEmail(rs.getString(5));
						e.setePhone(rs.getLong(6));
						e.setePassword(rs.getString(7));
						return e;
					}
					return null;
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}


			//find employee by id..
			public Employee findEmployeeById(int id) {
				String sql = "select * from employee where id=?";
				try {
					pst = con.prepareStatement(sql);
					pst.setInt(1, id);
					rs = pst.executeQuery();
					Employee e = new Employee();
					if (rs.next()) {
						e.seteId(rs.getInt(1));
						e.seteName(rs.getString(2));
						e.seteDesignation(rs.getString(3));
						e.seteSalary(rs.getDouble(4));
						e.seteEmail(rs.getString(5));
						e.setePhone(rs.getLong(6));
						e.setePassword(rs.getString(7));
						return e;
					}
					return null;
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
			
			//find employee by designation
			
			public List<Employee> findEmployeeByDesignation(String desi){
				String qry = "select * from employee where designation=?";
				List<Employee> empl = new 	ArrayList<Employee>();
				try {
					pst=con.prepareStatement(qry);
					pst.setString(1, desi);
					rs=pst.executeQuery();
					while(rs.next()) {
						Employee e = new Employee();
						e.seteId(rs.getInt(1));
						e.seteName(rs.getString(2));
						e.seteDesignation(rs.getString(3));
						e.seteSalary(rs.getDouble(4));
						e.seteEmail(rs.getString(5));
						e.setePhone(rs.getLong(6));
						e.setePassword(rs.getString(7));
						empl.add(e);
					}
					return empl;
				}catch(SQLException e) {
					e.printStackTrace();
					return empl;
				}
				
			}
			public List<Employee> filterBySalary(double sal){
				String qry = "select * from employee where salary=?";
				List<Employee> empl = new 	ArrayList<Employee>();
				try {
					pst=con.prepareStatement(qry);
					pst.setDouble(1, sal);
					rs=pst.executeQuery();
					while(rs.next()) {
						Employee e = new Employee();
						e.seteId(rs.getInt(1));
						e.seteName(rs.getString(2));
						e.seteDesignation(rs.getString(3));
						e.seteSalary(rs.getDouble(4));
						e.seteEmail(rs.getString(5));
						e.setePhone(rs.getLong(6));
						e.setePassword(rs.getString(7));
						empl.add(e);
					}
					return empl;
				}catch(SQLException e) {
					e.printStackTrace();
					return empl;
				}
				
			}
			
			//a method to exit application or closing all the costly resources..
			
			public String exit() throws SQLException {
				if(con!=null) 
					con.close();
				if(pst!=null)
					pst.close();
				if(rs!=null)
					rs.close();
				
				return "Application Closed..!!!Thank You";
			}
			



}
