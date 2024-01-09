package org.jsp.springdemo.collectionlist;

import java.util.Properties;

public class MySessionFactory {

	private MyDataSource daatSource;
	private Properties hibrenateProperties;
	private String[] mappingResource;

	public MyDataSource getDaatSource() {
		return daatSource;
	}

	public void setDaatSource(MyDataSource daatSource) {
		this.daatSource = daatSource;
	}

	public Properties getHibrenateProperties() {
		return hibrenateProperties;
	}

	public void setHibrenateProperties(Properties hibrenateProperties) {
		this.hibrenateProperties = hibrenateProperties;
	}

	public String[] getMappingResource() {
		return mappingResource;
	}

	public void setMappingResource(String[] mappingResource) {
		this.mappingResource = mappingResource;
	}

}
