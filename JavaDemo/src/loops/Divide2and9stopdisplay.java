//by using break wap to divide no by 2 and 9 and stop displaying between 1 to 20. 
package loops;

public class Divide2and9stopdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0 && i%9==0)
			{
					break;
			}
			System.out.println(i);
		}
	}

}
