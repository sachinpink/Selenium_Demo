package javaProgrms;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String message="Selenium java";
		String revmsg=" ";
		String msg[]=message.split(" ");
		for(String ms:msg)
		{
			String rev="";
			for(int i=ms.length()-1;i>=0;i--)
			{
				rev=rev+ ms.charAt(i);
			}
			revmsg=revmsg+rev+" ";
		}
		
		System.out.println(revmsg);
		
		

	}

}
