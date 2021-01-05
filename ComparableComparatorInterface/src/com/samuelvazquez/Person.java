package com.samuelvazquez;

/* Natural order:
Natural order means that your collection will have only a compare method
 */
public class Person implements Comparable<Person>{
	private int id;
	private String name;
	private int height;

	public Person(int id, String name, int height) {
		this.id = id;
		this.name = name;
		this.height = height;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", height=" + height +
				'}';
	}

	//We are gonna order the collection by name. So, my class Person will only order by name, that means that the way to order
	//my collection is natural order.
	@Override
	public int compareTo(Person o) {
		//First way to order:
		//subtract from the existing attribute 'this.attribute' the input object attribute 'o' for ascending order,
		//and vice versa for descending order.
		//Second way to order:
		//specify the existing attribute 'this.attribute' + .compareTo and as parameter, the input object attribute 'o'for
		//an ascending order and vice versa for a descending order.
		return this.name.compareTo(o.name);
	}
}
