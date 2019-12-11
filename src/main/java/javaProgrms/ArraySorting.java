package javaProgrms;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int num[]={10,5,3,7,9,1};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}

	}

}
