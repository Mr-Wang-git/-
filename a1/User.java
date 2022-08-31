package com.cn.a1;

public class User {

	int age;
	String name;
	
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this) {
			return true;
		}
		User u = (User)obj;
		if(u.age==this.age&&u.name==this.name) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
}
