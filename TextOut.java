package keyword;

import java.util.ArrayList;
import java.util.Map;

public class TextOut {
	  public static void out(Map<String,Integer>map,ArrayList<Integer> list,int totalnum)
	  {
		  System.out.printf("total num: %d\n",totalnum);
		  for (String i : map.keySet()) {
			    if(i!="case")
			    System.out.printf("%s num: %d\n",i,map.get(i));
			    else
			    {
			    	System.out.printf("%s num:",i);
			    	for(int k=0;k<list.size();k++)
			    	{System.out.printf(" %d",list.get(k));
			    	}
			    	System.out.printf("\n");
			    }
	        }
		 
	  }
	  
}
