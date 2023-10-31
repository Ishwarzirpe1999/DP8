//Write a code to display no bet 1 to 50 if no is divisible by 3 then display think if the no is divisible by 5 display quotient and if the no is divisible by both then display think quotient.
package loops;

public class ThinkQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		for(int i=1;i<=50;i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println(i+" = Think Quotient");  
			}
			else if(i%3==0)
			{	
				System.out.println(i+" = Think");  
			}
			else if(i%5==0)
			{
				System.out.println(i+" = Quotient");  
			}
		}
	}

}
