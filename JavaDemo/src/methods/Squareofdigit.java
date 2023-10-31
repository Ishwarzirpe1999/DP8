//find the sum of  of digit number.
//123=1+2+3=?
package methods;

public class Squareofdigit {
	public static int sum(int num)
	{
		
		int sum=0;
		for(int i=num;i>=0;i/=10)
		{
			int rem=num%10;
			sum=sum+rem;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squareofdigit obj=new Squareofdigit();
		int ans=obj.sum(1234);
		System.out.println(ans);
		
	}

}
