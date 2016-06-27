package OOP;

class Person {

	private String name;
	private int age;
	private String email;

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Person() {
		this("", 0, "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		Person ivancho = new Person("Ivancho", 13, "ivancho@abv.bg");
		Person mariika = new Person("Mariika", 13, "mariika@abv.bg");
		Person daskal = new Person("Daskal", 43, "daskalka@abv.bg");
		System.out.println(ivancho);
		System.out.println(mariika);
		System.out.print(daskal);

	}
}