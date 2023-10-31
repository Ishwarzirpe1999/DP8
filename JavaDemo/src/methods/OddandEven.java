package methods;

public class OddandEven {
	public void oddandeven(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i*i);
			}
			else
			{
				System.out.println("-"+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddandEven obj=new OddandEven();
		obj.oddandeven(50);
	}

}
