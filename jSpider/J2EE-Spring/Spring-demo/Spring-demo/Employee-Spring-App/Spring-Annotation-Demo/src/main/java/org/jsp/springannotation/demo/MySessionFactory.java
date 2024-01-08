package org.jsp.springannotation.demo;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {

	@Autowired
	private List<String> mappingResource;
	@Autowired
	private Properties hibernateProperties;
	@Autowired
	private MyDataSource mydatasource;

	public List<String> getMappingResource() {
		return mappingResource;
	}

	public void setMappingResource(List<String> mappingResource) {
		this.mappingResource = mappingResource;
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

	public MyDataSource getMydatasource() {
		return mydatasource;
	}

	public void setMydatasource(MyDataSource mydatasource) {
		this.mydatasource = mydatasource;
	}

}
