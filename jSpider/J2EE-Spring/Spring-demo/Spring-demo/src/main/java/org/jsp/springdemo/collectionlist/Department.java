package org.jsp.springdemo.collectionlist;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
	
	List<String> names;
	Set<Integer> ids;
	Map<Integer, String> details;
	
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Integer> getIds() {
		return ids;
	}
	public void setIds(Set<Integer> ids) {
		this.ids = ids;
	}
	public Map<Integer, String> getDetails() {
		return details;
	}
	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}
	
	
	

}
