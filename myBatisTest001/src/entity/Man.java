package entity;
/**********************2016-09-10 15:11:50*********************/
public class Man {
/**********************2016-09-10 15:13:51*********************/
	//property
	private int id;	private String name;private String age;
/**********************2016-09-10 15:11:52*********************/
	public Man() {}//constructor that have no parameters
/**********************2016-09-10 15:11:59*********************/
public int getId() {return id;}
public void setId(int id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getAge() {return age;}
public void setAge(String age) {this.age = age;}
/**********************2016-09-10 15:15:55*********************/
@Override
public String toString() {
	return "Man [id=" + id + ", name=" + name + ", age=" + age + "]";
}
/**********************2016-09-10 15:11:54*********************/
}
/**********************2016-09-10 15:11:56*********************/