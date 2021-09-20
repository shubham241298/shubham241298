
public class Pract1 {

	public static void main(String[] args) {
int cnt1=0;
		for(int i=0;i<6;i++)
		{
			int cnt=cnt1;
			for(int j=0;j<6;j++)
			{
               if(j-i<=0) 
               {
            	   System.out.print((char)(cnt+++65));
            	   cnt=cnt+4;
               }
               else
               {
            	   System.out.print(" "); 
               }
               
            }
			cnt1++;
			System.out.println();
		}
	}

}
