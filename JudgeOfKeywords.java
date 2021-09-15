package keyword;

public class JudgeOfKeywords {
	public static boolean judgeif(String text,String word)
	{   boolean flag=false;
		if(!text.contains(word)) return flag;
		else
		{
		  int index=text.indexOf(word);
		  if(word=="else")
		  {
			  while(text.contains(word)) 
			   {char judge=text.charAt(index+ word.length());
			    char judge2=' ';
			    if(index>0) judge2=text.charAt(index-1);
			    String judges=text.substring(index, index+7);
			    if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')||(judges=="else if")
			    		||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
		        {   text = text.substring(index + word.length());
				    continue;
		        }
			    else
			    {
			    	flag=true;
			    	break;
			    }
			   }
		  }
		  else
		  {     while(text.contains(word)) 
	              {char judge1=text.charAt(index+ word.length());
			    char judge2=' ';
			    if(index>0) judge2=text.charAt(index-1);
			    if((judge1>='a'&&judge1<='z')||(judge1>='A'&&judge1<='Z')||(judge1>='0'&&judge1<='9')||(judge1=='_')
			    	||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
		        {   text = text.substring(index + word.length());
				    continue;
		        }
			    else
			    {
			    	flag=true;
			    	break;
			    }
		     }
		  }
		}
		return flag;
	}
	
}
