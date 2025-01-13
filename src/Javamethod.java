import java.util.*;
public class Javamethod {
		void sum(int mark[])
		{
	for(int a: mark)
	{
		System.out.print(a);
	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnobj= new Scanner(System.in);
		Javamethod obj = new Javamethod();
		int n= scnobj.nextInt();
		int mark[]=new int[n];
		for(int i=0;i<n;i++)
		{
			mark[i]=scnobj.nextInt();
		}
		obj.sum(mark);
//		int gst=180;
//		int add=sum(carPrice,gst);
//		System.out.println(add);
		scnobj.close();
	}
}
