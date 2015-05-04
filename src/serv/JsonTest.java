package serv;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test41();
	}

	/**
	 * 将List集合转换成JSON字符串
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void test4() {
		List list = new ArrayList();
		for (int i = 0; i < 3; i++) {
			list.add(new Person("" + i, "姓名" + i));
		}
		JSONArray arr = JSONArray.fromObject(list);
		System.out.println(arr.toString());
	}

	/**
	 * 将JSON字符串转换成Person数组
	 */
	public static void test41() {
		String str = "[{\"name\":\"姓名0\",\"no\":\"0\"},{\"name\":\"姓名1\",\"no\":\"1\"},{\"name\":\"姓名2\",\"no\":\"2\"}]";
		JSONArray arr = JSONArray.fromObject(str);
		Person[] ps = (Person[]) JSONArray.toArray(arr, Person.class);
		System.out.println(ps[0].getName());
	}

	/**
	 * 使用jsonlib.jar将Person对象转换成JSON字符串
	 *
	 */
	public static void test2() {
		Person p = new Person("10002", "张三");
		JSONObject json = JSONObject.fromObject(p);
		System.out.println(json.toString());
	}

	/**
	 * 使用jsonlib.jar将JSON字符串转换成Person对象
	 */
	public static void test21() {
		String str = "{\"name\":\"翠花\",\"no\":\"10002\"}";
		JSONObject json = JSONObject.fromObject(str);
		Person p = (Person) JSONObject.toBean(json, Person.class);
		System.out.println(p.getName());
	}

	/**
	 * 使用jsonlib.jar将普通变量转换成JSON字符串
	 */
	public static void test3() {
		JSONObject json = new JSONObject();
		json.put("id", 10001);
		json.put("name", "tom");
		System.out.println(json.toString());
	}

	/**
	 * 纯Java实现，麻烦,不建议使用
	 */
	public static void test1() {
		Person p = new Person("10001", "张三");
		String str = "{id:" + p.getNo() + ",name:" + p.getName() + "}";
		System.out.println(str);
	}
}
