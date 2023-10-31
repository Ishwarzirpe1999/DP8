package methods;
//3 9 10 30 31 93...
public class Series3 {
	public void series(int num){
		int d=3;
		System.out.println(d);
		for(int i=1;i<=num;i++)
		{
			int b=d*3;
			int c=b+1;
			System.out.println(b);
			System.out.println(c);
			d=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series3 obj=new Series3();
		obj.series(9);
	}

}
