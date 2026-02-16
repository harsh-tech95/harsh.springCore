package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class employee {
	
	private int id;
	private String name;
    private String	gender;
    private List<Integer>list;
    private Set<Integer>set;
    private Map<Integer, String>map;
		
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public employee(int id, String name, String gender, List<Integer> list, Set<Integer> set, Map<Integer, String> map
			) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.list = list;
		this.set = set;
		this.map = map;
	}



	public List<Integer> getList() {
		return list;
	}



	public void setList(List<Integer> list) {
		this.list = list;
	}



	public Set<Integer> getSet() {
		return set;
	}



	public void setSet(Set<Integer> set) {
		this.set = set;
	}



	public Map<Integer, String> getMap() {
		return map;
	}



	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", gender=" + gender + ", list=" + list + ", set=" + set
				+ ", map=" + map + "]";
	}

	
	
	
	
	

}
