package interview.hascodedemo;

import java.util.Random;

public class Entity1 {
	
	private String firstName;
	private int age;
	
	public Entity1 (String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		Random r = new Random(1000);
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode()) + r.nextInt();
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity1 other = (Entity1) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
