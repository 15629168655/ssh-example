package test;

public class Student {

	private int id;
	private String name;
	private int age;
	private String sex;
	private String major;
	
	
	public Student() {
	
	}
	
	//此方法会将默认的无参构造方法给覆盖掉，必须加上上面的无参构造方法
	public Student(int id, String name, int age, String sex, String major) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.major = major;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
