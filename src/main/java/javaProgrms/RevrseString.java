package javaProgrms;

public class RevrseString 
{
	public static void main(String args[])
	{
		String messgae="hi how are you";
		String rev="";
		String msg[]=messgae.split(" ");
		for(int i=msg.length-1;i>=0;i--)
		{
			rev=rev+msg[i]+" ";
		}
		System.out.println(rev);
	}

}
