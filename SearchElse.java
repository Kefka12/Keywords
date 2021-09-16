package keyword;

public class SearchElse {
	//实现了从文段中搜索并提取第一个else关键字位置的方法（主要为了与else-if中的else区分）	
	public static int searchIndexOfElse(String copytext)
	{   int index2=copytext.length()-1;
		while(copytext.contains("else"))
		{   int index=copytext.indexOf("else");
			  char judge=copytext.charAt(index+ 4);
			  String judges=copytext.substring(index, index+7);
			  char judge2=' ';
			  if(index>0) judge2=copytext.charAt(index-1);
		      if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')||(judges=="else if")
		    	||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))//else if特别判断
	          {   copytext = copytext.substring(index + 4);
			    continue;
	          }
		      else  
		      {
		    	index2=index;
		    	break;
		      }
		}  //该方法了搜寻出一串子文本中第一个else的位置的方法，具体实现与JudgeOfKeywords类似
	    return index2;
	}
}
