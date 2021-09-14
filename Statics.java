package keyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statics {
	  
	  public static void countofcpp(String[] words,String text)
	  { Map<String,Integer>map = new HashMap<>();
	     int totalnum=0;
		  ArrayList<Integer> list= new ArrayList<Integer>();
		  //list.add(2);
		  for(int i=0;i<words.length;i++)
	   { String word=words[i];
	    int count=0;
	    String copytext=text;
		while(copytext.contains(words[i]))
		{ int index = copytext.indexOf(word);
			if(words[i].equals("do"))
		 {
			
			if (copytext.charAt(index+2)!='u')
			{
				count++;
				copytext = copytext.substring(index + word.length());
				totalnum++;
			}
			else
			{
				copytext = copytext.substring(index + word.length());
			}
		 }
		 else
		 {	count++;
			copytext = copytext.substring(index + word.length());
			totalnum++;
			if(words[i].equals("switch"))
			{Integer countofcase=Searchcases.search(copytext);
			list.add(countofcase);
			}
		 }	
		}
	    
		if(count>0)
		{   
		    map.put(words[i],count);
		} 
	   }
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
