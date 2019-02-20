package data;

public class Person {
	protected String id;
	protected String name;

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
}
