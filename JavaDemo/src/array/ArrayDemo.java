package array;

public class ArrayDemo {
	public void arrayCreation()
	{
		//first syntax
		int arr[]=new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//this.showArrayElementWhile(arr);
		this.ReverseOrder(arr);
		//second syntax ...first class object
		int arr1[]= {10,20,30,40,50};
		this.showArrayElementWhile(arr1);
		
	}
//	public void showArrayElement(int obj[])
//	{
//		for(int i=0;i<obj.length;i++)
//			System.out.println(obj[i]);
//		System.out.println("******************");
//	}
	public void showArrayElementWhile(int ob[])
	{
		int i=0;
		while(i<ob.length)
		{
			System.out.println(ob[i]);
			i++;
		}
		System.out.println("**************");
	}
	public void ReverseOrder(int t[])
	{
		for(int i=(t.length-1);i>=0;i--)
			System.out.println(t[i]);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo a=new ArrayDemo();
		a.arrayCreation();
		

	}

}
