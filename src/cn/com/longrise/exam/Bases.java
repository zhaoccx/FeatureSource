package cn.com.longrise.exam;

public class Bases {
	private byte	bytes;
	private short	shorts;
	private int		ints;
	private long	longs;
	private float	floats;
	private double	doubles;
	private char	chars;
	private boolean	booleans;

	public byte getBytes() {
		return bytes;
	}

	public void setBytes(byte bytes) {
		this.bytes = bytes;
	}

	public short getShorts() {
		return shorts;
	}

	public void setShorts(short shorts) {
		this.shorts = shorts;
	}

	public int getInts() {
		return ints;
	}

	public void setInts(int ints) {
		this.ints = ints;
	}

	public long getLongs() {
		return longs;
	}

	public void setLongs(long longs) {
		this.longs = longs;
	}

	public float getFloats() {
		return floats;
	}

	public void setFloats(float floats) {
		this.floats = floats;
	}

	public double getDoubles() {
		System.out.println(doubles);
		return doubles;
	}

	public void setDoubles(double doubles) {
		this.doubles = doubles;
	}

	public char getChars() {
		return chars;
	}

	public void setChars(char chars) {
		this.chars = chars;
	}

	public boolean isBooleans() {
		return booleans;
	}

	public void setBooleans(boolean booleans) {
		this.booleans = booleans;
	}

	public void testSwtichint() {
		// Cannot switch on a value of type long. Only convertible int values,
		// strings or enum variables are permitted
		switch (this.ints) {
			case 1:
				System.out.println("能用int");
				break;
			default:
				break;
		}
	}

	public void testShort() {
		switch (this.shorts) {
			case 2:
				System.out.println("能用short");
				break;
			default:
				break;
		}
	}

	public void testByte() {
		switch (this.bytes) {
			case 2:
				System.out.println("能用byte");
				break;
			default:
				break;
		}
	}

	public void testChar() {
		switch (this.chars) {
			case 2:
				System.out.println("能用byte");
				break;
			default:
				break;
		}
	}

	// finally先于return
	public String testTryFinally() {
		try {
			System.out.println("这是Try里的语句");
			return "" + this.getDoubles();
		} catch (Exception e) {
		} finally {
			System.out.println("这是Finally里面的语句");
		}
		return "";
	}

	public static void main(String[] args) {
		Bases bases = new Bases();
		bases.setDoubles(789.9D);
		bases.testTryFinally();
	}
}
