import java.util.Calendar;
public class formatterTest {
	
	public static void main(String args[]) {
		
		String s = String.format("%, d", 100000000); // 以带逗号的形式输出数字字符
		System.out.println(s);

		System.out.println(String.format("I have %d bugs to fix.", 234));
		
		Calendar mCalendar = Calendar.getInstance() ;

		System.out.println(mCalendar.getTimeInMillis());
	} 
}
