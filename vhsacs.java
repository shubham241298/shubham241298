
public class vhsacs {
	
	
	public static void main(String[] args) 
	{
		
		String s="shubhamm";
		int index=0;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i <s.length(); i++) 
		{
			int j=i+1;
			boolean b=false;
			for (; j < s.length(); j++) 
			{
				for (int k = i; k <j; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
					{
						b=true;
						break;
					}
				}
				if(b==true)
					break;
			}
			if(max<j-i)
			{
				max=j-i;
				index=i;
			}
		}
		System.out.println(index);
		
		for (int i = index; i < index+max; i++) 
		{
			System.out.print(s.charAt(i)+" ");
		}
		
	}
	
	


	}


