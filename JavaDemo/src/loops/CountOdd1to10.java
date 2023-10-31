//No of count between the 1 to 10
package loops;

public class CountOdd1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int i=1;
		while(i<=10)
		{
			if(i%2!=0)
			{
				count++;
			}
			i++;
		}
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2!=0)
//			{
//				count++;
//			}
//		}
		
		System.out.println(count);
	}

}
