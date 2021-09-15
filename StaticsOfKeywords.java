package keyword;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StaticsOfKeywords {
	  
	  public static void countofcpp(String[] words,String text)
	  { Map<String,Integer>map = new HashMap<>();
	     int totalnum=0;
		  ArrayList<Integer> list= new ArrayList<Integer>();
		  for(int i=0;i<words.length;i++)
	   { String word=words[i];
	    int count=0;
	    String copytext=text;
		while(copytext.contains(words[i]))
		{ int index = copytext.indexOf(word);
		  char judge=copytext.charAt(index+ word.length());
		  char judge2=' ';
		  if(index>0) judge2=copytext.charAt(index-1);
		  if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')
				  ||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
	      {   copytext = copytext.substring(index + word.length());
			  continue;
	      }
		  else
		 {	count++;
			copytext = copytext.substring(index + word.length());
			totalnum++;
			if(words[i].equals("switch"))
			{Integer countofcase=SearchCases.search(copytext);
			list.add(countofcase);
			}
		   }	
		}
		if(count>0)
		{   
		    map.put(words[i],count);
		} 
	  }
		TextOut.out(map, list, totalnum);
	  }
}
