class myclass
{
	public int x;

	public int test()
	{
		return 0;
	}
	
}

class lesson3
{
	public static void main(String [] arge)
	{
		int table[] = new int[100];  //����һά�������
		//int sum = 0;
		for(int i=0; i<100; i++)
		{
			//sum += table[i];
			table[i] = i;
		}

		for(int i=0; i<table.length; i++) //.length ����������ĳ���
		{
			//System.out.println(table[i]);
		}

		//�����ά���飬ÿ��ά�ȿ����в�ͬ����
		int table2[][] = new int[3][]; //����һ����3�е����飬ÿһ�е����������涨��
		table2[0] = new int[2];
		table2[1] = new int[3];
		//δ����table[2]��һ�У���ô��һ�еĵ�ַ��Ϊnull
		//����table2����3�У����е�1����2�У���2����3�У�������Ϊnull������

		int table3[] = new int[]{3,1,2,4};
		java.util.Arrays.sort(table3); //ʹ��������Ϊ����table3��������
		System.out.println("table3[] = ");
		for(int i=0; i<table3.length; i++)
		{
			System.out.println(table3[i]);
		}

		int table4[] = new int[10];
		System.arraycopy(table3, 0, table4, 2, table3.length); 
		//��table3��һ��Ԫ�ؿ�ʼ�������������ݵ�table4��3��Ԫ�ؿ�ʼ�ĵط�
		System.out.println("table4[] = ");
		for(int i=0; i<table4.length; i++)
		{
			System.out.println(table4[i]);
		}
	}
}
