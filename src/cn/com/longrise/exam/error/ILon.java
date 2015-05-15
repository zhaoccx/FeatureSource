package cn.com.longrise.exam.error;

abstract class ILon {
	private String	name;

	public boolean isRightName(String name) {
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getTest() {
		short s = 1;
		s += 1;
	}
}
