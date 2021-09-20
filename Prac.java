
public class Prac {
	public static void main(String[] args) {
		
		//int[] a= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int[] a= {1, 2, 4, 0, 2};
		
		int inc[]=new int[a.length-1];
		int dec[]=new int[a.length-1];
		int indexI=0;
		int indexD=0;
		
		if(a[0]>a[1])
		{
			inc[indexI++]=a[1];
			dec[indexD++]=a[0];
		}
		else
		{
			inc[indexI++]=a[0];
			dec[indexD++]=a[1];
		}
		
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>inc[indexI-1])
				inc[indexI++]=a[i];
			else if(a[i]<dec[indexD-1])
				dec[indexD++]=a[i];
			
			if(a[i]<inc[indexI-1]&&a[i]>dec[indexD-1])
			{
				System.out.println(-1+"not possible");
				System.exit(0);
			}
		}
		
		for (int i = 0; i < indexI; i++) 
		{
			System.out.print(inc[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < indexD; i++) 
		{
			System.out.print(dec[i]+" ");
		}
					
		
	}
}
