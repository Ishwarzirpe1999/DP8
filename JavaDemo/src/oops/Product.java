package oops;

import java.util.Scanner;

//product details;
public class Product {
	int prodid,quantity;
	String prodname,desc,cata;
	double price,dis,totalprice;
	public void setData(int id,int quan,String name,String descrip,String catag,double p)
	{
		prodid=id;
		quantity=quan;
		prodname=name;
		desc=descrip;
		cata=catag;
		price=p;
	}
	public void discount()
	{
		dis=price*0.3;
	}
	public void totalPrice(int uantity)
	{
		totalprice=uantity*(price-dis);
	}
	public void display()
	{
		System.out.println("Product name "+prodname);
		System.out.println("Product original price is "+price);
		System.out.println("Product discount is"+dis);
		System.out.println("product total price is "+totalprice);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity you want");
		int uantity = sc.nextInt();
		Product obj=new Product();
		obj.setData(1, 5, "Laptop", "Easy to handle,durable","electrical device",100);
		obj.discount();
		obj.totalPrice(uantity);
		obj.display();
		
	}

}
