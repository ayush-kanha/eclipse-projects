package Testing;

import java.util.*; 
import java.io.*;

class Main {

  public static String MinWindowSubstring(String[] strArr) {
    String x = strArr[0];
    System.out.println("x= "+x);
    String y = strArr[1];
    System.out.println("y = "+y);
    
    
    int y_len = y.length();
    char[] ch2 = y.toCharArray();
    //char[] ch2_temp = ch2;
    Arrays.sort(ch2);
   // String str2 = Arrays.toString(ch2);
    StringBuilder builder1 = new StringBuilder();
    for(int k=0;k<ch2.length;k++)
    {
    	builder1.append(ch2[k]);
    }
    
    String str2 = builder1.substring(0, y_len);
    //System.out.println("Substring of y : "+str2.substring(0,4));
    
    String result = "";
    //int len = 0;
    
    if(x.length()>=y.length())
    {
    	System.out.println("inside if...");
      for(int i=0;i<x.length();i++)
      {
        for(int j=i+1;j<x.length();j++)
        {
          String sub = x.substring(i,j+1);
          int subLen = sub.length();
          
          if(subLen>=y.length())
          {
        	System.out.println("unsorted sub = "+sub);
            char[] ch1 = sub.toCharArray();
            char[] ch1_temp = ch1;  
            Arrays.sort(ch1);         
            
//            sub = Arrays.toString(ch1);
//            System.out.println("sorted sub = "+sub);
            
            StringBuilder builder = new StringBuilder();
            for(int k=0;k<ch1.length;k++)
            {
            	builder.append(ch1[k]);
            }
            
            System.out.println("Builder = "+builder);
            
            String sub2 = builder.substring(0,y_len);
            System.out.println("substr2 = "+sub2);

            if(sub2.equalsIgnoreCase(y))
            {
            	System.out.println("inside second if");
            	result = Arrays.toString(ch1_temp);
            	System.out.println("result = "+result);
            	break;
            }		

          }
          
        }
        System.out.println("next loop");
      }
    }

    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String[] arr = new String[]{"world","od"};
    System.out.println("Started....");
    System.out.print(MinWindowSubstring(arr)); 
  }

}
