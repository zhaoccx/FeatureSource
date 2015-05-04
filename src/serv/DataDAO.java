package serv;

import java.util.ArrayList;
import java.util.List;

public class DataDAO {
	public static List<Person> getData(){
		List<Person> ps = new ArrayList<Person>();
		for(int i=1;i<=5;i++){
			Person p = new Person("000"+i,"凤姐"+i+"号");
			ps.add(p);
		}
		return ps;
	}
	
	public static List<Person> getSubData(String key){
		List<Person> ps = new ArrayList<Person>();
		int id = Integer.parseInt(key);
		for(int i=1;i<=id;i++){
			Person p = new Person("100"+i,"凤姐"+id+"号的对象犀利哥"+i+"号");
			ps.add(p);
		}
		return ps;
	}
}
