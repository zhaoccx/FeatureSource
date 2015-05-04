package serv;

public class Person {
	private String name;
	private String no;
	public Person(){}
	
	public Person(String no,String name){
		this.no = no;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
}	
