import java.lang.Integer;

class lesson2
{
	
	public static void main(String [] args)
	{
		int x = 0;
	
		myclass.SayHello();

		
		do
		{
			try  //使用System.in.read()一定要加的语句
			{
				x = System.in.read();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("按照整数取值=" + (int)x);
			System.out.println("按照字符取值=" + (char)x);
			System.out.println("按照浮点数取值=" + (double)x);
			
		}while(x != 'q');

		System.out.println("打印出1~10之间的奇数");
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 0)
			{
				continue;  //执行continue的话，单次循环中continue后面的内容就不会执行了
			}
			System.out.println(i);
		}

		System.out.println(Float.intBitsToFloat(0x7f800000)); // = 0*e127 = inf 无穷
		System.out.println(Float.intBitsToFloat(0x7f800001)); // = 1*e127 = NaN 非数
		System.out.println(Float.intBitsToFloat(0x7f7fffff)); .
		// = 浮点数可以表示的绝对值最大的数
		System.out.println(Float.intBitsToFloat(0x00000001)); 
		// = 浮点数可以表示的绝对值最小的数
		
		
	}
}
