package org.jsp.springdemo;

public class HibernateProeperties {

	private String dialect, hbm2ddl_auto;
	private boolean show_sql, format_sql;
	
	
	
	
	public HibernateProeperties() {
		System.out.println("No con arg...");
	}

	public HibernateProeperties(String dialect, String hbm2ddl_auto, boolean show_sql, boolean format_sql) {
		System.out.println("Const with arg(string,string,boolean,boolean");
		this.dialect = dialect;
		this.hbm2ddl_auto = hbm2ddl_auto;
		this.show_sql = show_sql;
		this.format_sql = format_sql;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getHbm2ddl_auto() {
		return hbm2ddl_auto;
	}

	public void setHbm2ddl_auto(String hbm2ddl_auto) {
		this.hbm2ddl_auto = hbm2ddl_auto;
	}

	public boolean isShow_sql() {
		return show_sql;
	}

	public void setShow_sql(boolean show_sql) {
		this.show_sql = show_sql;
	}

	public boolean isFormat_sql() {
		return format_sql;
	}

	public void setFormat_sql(boolean format_sql) {
		this.format_sql = format_sql;
	}
	
	public void displayProperties() {
		System.out.println("Dialect: "+dialect);
		System.out.println("hbm2ddl_auto "+hbm2ddl_auto);
		System.out.println("show_sql : "+show_sql);
		System.out.println("formate_sql: "+format_sql);
		System.out.println("---------------------------------");
	}

}
