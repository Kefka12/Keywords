package keyword;

public class JudgeOfKeywords {
	//实现了文段中关键字判别的方法（主要是为了防止误将变量中含有的关键字字符串作为关键字统计和操作）
	public static boolean judgeWords(String text,String word)
	{   boolean flag=false;//标志是传入文本里否含有传入关键字的方法
		if(text.contains(word))//只有当文本中包含有关键字子字符串才进一步判断
		{
		  int index=text.indexOf(word);//找寻子字符串位置
		  if(word.equals("else"))//else的情况 需要额外判断是否是else if
		  {
			  while(text.contains(word)) //不停搜索直到文本不含有关键字子字符串
			   {char judge=' ';
			    if(index+ word.length()<text.length()-1) text.charAt(index+ word.length());
			    char judge2=' ';
			    if(index>0&&index<=text.length()) judge2=text.charAt(index-1);
			    String judges=" ";
			    if(index+7<text.length())judges=text.substring(index, index+7); 
			    //创建三种判断依据变量——关键字子字符串的前一个和后一个字符，以及包含有关键字子字符串后三个字符的字符串
			    if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')||(judges.equals("else if"))//此处额外判断else if情况
			    		||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
			    		//如果关键字子字符串前后含有变量名能包含的字符，则证明关键字子字符串是被包含在变量名中，不能作为关键字被采纳
		        {   text = text.substring(index + word.length());//将已判断过的文本舍去，判断其余文本
				    continue;
		        }
			    else
			    {
			    	flag=true;//关键字子字符串不是被包含在变量名中，也不是elseif情况，可被采纳，判断存在。
			    	break;
			    }
			   }
		  }
		  else
		  {  while(text.contains(word)) 
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
		      //判断方式同上 只不过省去了对于else if情况的判断
		  }
		}
		return flag;
	}
	
}
