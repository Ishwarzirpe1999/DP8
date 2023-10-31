package loops;

public class Sumofoddbydowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find the sum of odd numbers by do while loop 1-15.
		int i=1;
		int sum=0;
		do {
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		while(i<=15);
		System.out.println(sum);
	}
	

}
