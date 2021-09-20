import java.util.Arrays;

public class Prac2 {

	public static void main(String[] args) {

          String s="cuwegfujghfufut";
          int cnt=0;
          for (int i = 0; i < s.length(); i++) 
          {
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
		  }
         char[] s1=new char[s.length()-cnt];
         int[] s2=new int[s1.length];
         int index=0;
         for (int i = 0; i < s.length(); i++) 
         {
        	 int cnt2=0;
			for (int j = 0; j < s2.length; j++) 
			{
				if(s1[j]==s.charAt(i))
					cnt2++;
			}
			if(cnt2==0)
				s1[index++]=s.charAt(i);
		 }
         
         
         
         for (int i = 0; i < s2.length; i++) 
         {
        	 int cnt3=01;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s1[i]==s.charAt(j))
					cnt3++;
			}
			s2[i]=cnt3;
		 }
         
        
         
         for (int i = 0; i < s2.length; i++) 
         {
			for (int j =i+1; j < s2.length; j++) 
			{
				if(s2[i]<s2[j])
				{
					int temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
					
					char temp1=s1[i];
					s1[i]=s1[j];
					s1[j]=temp1;
				}
			}
			 
		}
         System.out.println(Arrays.toString(s1));
		 System.out.println(Arrays.toString(s2));
	}

}
