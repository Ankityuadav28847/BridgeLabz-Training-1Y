import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int r=q;
		int rem=0;
		int temp=0;
		while(q!=0)
		{
			rem=q%10;
			temp=temp*10+rem;
			q=q/10;
		}
		if(r==temp)
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("is not plalindrome");
		}
		
	}
}