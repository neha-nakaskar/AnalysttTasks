package string;

import java.util.Scanner;

public class Longest_SubString_withREPEATING_characters_usingSCANNER {

	
	
	public static String lcp(String x, String y)
	{  
        int a = Math.min(x.length(),y.length());  
        for(int i = 0; i < a; i++){  
            if(x.charAt(i) != y.charAt(i)){  
                return x.substring(0,i);  
            }  
        }  
        return x.substring(0,a);  
    }  
  
    public static void main(String[] args)
    {  
    	System.out.println("Enter String ");
        Scanner dd = new Scanner(System.in);
        String str = dd.next();  
        String lrs="";  
        int a = str.length();  
        for(int i = 0; i < a; i++){  
            for(int j = i+1; j < a; j++)
            {  
                                                               
                String x = lcp(str.substring(i,a),str.substring(j,a));  
                if(x.length() > lrs.length()) lrs=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+lrs);  
        System.out.print("   Length is  "+lrs.length());
    }  




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
