package dharm.core;

public class TestComprable implements Comparable<TestComprable> {

	public int id;
	public String name;
	public int age;
	
	public TestComprable(int id, String name, int age){
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public int compareTo(TestComprable obj){
		return (this.id<obj.id ?-1:this.id>obj.id?1:0);
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
