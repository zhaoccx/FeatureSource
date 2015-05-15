package cn.com.longrise.exam;

public abstract class AbsFather implements SonInter {
	private int	ints;

	public String OneString() {
		return "";
	}

	public int getInts() {
		return ints;
	}

	public void setInts(int ints) {
		this.ints = ints;
	}
}
