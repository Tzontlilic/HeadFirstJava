import java.util.*;
public class AutoBoxingTest {
	
	// 在java 5.0之前 ArrayList 无法传入基本的数据类型（int, float 等）
	// 需要先包装成一个对象
	
	public static void main(String args[]) {

		ArrayList arrayListBefor5_0 = new ArrayList(); // 创建一个传统的al
		ArrayList<Integer> arrayListNew = new ArrayList<Integer>(); // 创建一个新的al

		// *** 这是传统的方式 ***
		arrayListBefor5_0.add(new Integer(3)); // 将一个包装好的对象假如到al中 
		Integer one = (Integer) arrayListBefor5_0.get(0); // 新建一个对象来存储取得的值
		System.out.println(one.intValue()); //获取到al中的值，并通过intValue() 这个方法才能获取al中的值
		// *** END ***
		
		

		// *** 这是新的带autoboxing 的方式 ***
		arrayListNew.add(3);
		System.out.println(arrayListNew.get(0));
		// *** END ***


	}
}
