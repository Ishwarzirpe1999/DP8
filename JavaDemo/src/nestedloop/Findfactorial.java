//Find the factorial of given number 
package nestedloop;

public class Findfactorial {

		public int calculateFactorial(int num)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				 fact=fact*i;
			}
			return fact;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findfactorial obj=new Findfactorial();
		int res=obj.calculateFactorial(5);
		System.out.println(res);
	}

}
