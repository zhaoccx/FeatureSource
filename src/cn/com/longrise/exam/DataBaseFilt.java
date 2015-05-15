package cn.com.longrise.exam;

/**
 * 
 * @author zhaocc
 *         服务器启动时会建立一定数量的池连接，并一直维持不少于此数目的池连接。客户端程序需要连接时，池驱动程序会返回一个未使用的池连接并将其表记为忙
 *         。如果当前没有空闲连接，池驱动程序就新建一定数量的连接，新建连接的数量有配置参数决定。当使用的池连接调用完成后，
 *         池驱动程序将此连接表记为空闲，其他调用就可以使用这个连接。
 */
public class DataBaseFilt {
	/**
	 * 当JAVA程序违反了JAVA的语义规则时，JAVA虚拟机就会将发生的错误表示为一个异常。违反语义规则包括2种情况。一种是JAVA类库内置的语义检查
	 * 。例如数组下标越界,会引发IndexOutOfBoundsException;访问null的对象时会引发NullPointerException。
	 * 另一种情况就是JAVA允许程序员扩展这种语义检查
	 * ，程序员可以创建自己的异常，并自由选择在何时用throw关键字引发异常。所有的异常都是java.lang.Thowable的子类。
	 */
	public void getThrow() {
	}
}
