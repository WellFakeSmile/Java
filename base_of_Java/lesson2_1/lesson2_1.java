import java.lang.Integer;

class lesson2
{
	
	public static void main(String [] args)
	{
		int x = 0;
	
		myclass.SayHello();

		
		do
		{
			try  //ʹ��System.in.read()һ��Ҫ�ӵ����
			{
				x = System.in.read();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("��������ȡֵ=" + (int)x);
			System.out.println("�����ַ�ȡֵ=" + (char)x);
			System.out.println("���ո�����ȡֵ=" + (double)x);
			
		}while(x != 'q');

		System.out.println("��ӡ��1~10֮�������");
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 0)
			{
				continue;  //ִ��continue�Ļ�������ѭ����continue��������ݾͲ���ִ����
			}
			System.out.println(i);
		}

		System.out.println(Float.intBitsToFloat(0x7f800000)); // = 0*e127 = inf ����
		System.out.println(Float.intBitsToFloat(0x7f800001)); // = 1*e127 = NaN ����
		System.out.println(Float.intBitsToFloat(0x7f7fffff)); .
		// = ���������Ա�ʾ�ľ���ֵ������
		System.out.println(Float.intBitsToFloat(0x00000001)); 
		// = ���������Ա�ʾ�ľ���ֵ��С����
		
		
	}
}
