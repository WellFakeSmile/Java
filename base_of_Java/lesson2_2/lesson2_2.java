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
		int table[] = new int[100];  //定义一维数组对象
		//int sum = 0;
		for(int i=0; i<100; i++)
		{
			//sum += table[i];
			table[i] = i;
		}

		for(int i=0; i<table.length; i++) //.length 获得数组对象的长度
		{
			//System.out.println(table[i]);
		}

		//定义多维数组，每个维度可以有不同长度
		int table2[][] = new int[3][]; //定义一个有3行的数组，每一行的列数在下面定义
		table2[0] = new int[2];
		table2[1] = new int[3];
		//未定义table[2]这一行，那么这一行的地址就为null
		//最终table2具有3行，其中第1行有2列，第2行有3列，第三行为null的数组

		int table3[] = new int[]{3,1,2,4};
		java.util.Arrays.sort(table3); //使用排序函数为数组table3进行排序
		System.out.println("table3[] = ");
		for(int i=0; i<table3.length; i++)
		{
			System.out.println(table3[i]);
		}

		int table4[] = new int[10];
		System.arraycopy(table3, 0, table4, 2, table3.length); 
		//从table3第一个元素开始拷贝其所有内容到table4第3个元素开始的地方
		System.out.println("table4[] = ");
		for(int i=0; i<table4.length; i++)
		{
			System.out.println(table4[i]);
		}
	}
}
