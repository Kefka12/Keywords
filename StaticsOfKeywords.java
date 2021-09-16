package keyword;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StaticsOfKeywords {
	  //实现了在文段中统计关键字及其个数和Switch结构中cases个数的方法
	  public static void staticsOfKeywords(String[] words,String text,int level)
	  { Map<String,Integer>map = new HashMap<>();//建立哈希表存储关键字-个数映射
	    int totalnum=0;//存储总关键字个数
		ArrayList<Integer> list= new ArrayList<Integer>();//存储cases个数列表
		for(int i=0;i<words.length;i++)
	    { String word=words[i];
	      int count=0;
	      String copytext=text;//复制一个字符串文本以保证对于每个关键字都能重复提取
		  while(copytext.contains(words[i]))
		  { 
			int index = copytext.indexOf(word);//找到关键字子字符串位置
		    char judge=copytext.charAt(index+ word.length());
		    char judge2=' ';
		    if(index>0) judge2=copytext.charAt(index-1);
		    if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')
				  ||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
	        {   copytext = copytext.substring(index + word.length());
			    continue;
	        } //如果子字符串不是关键字则跳过
		    else
		    {	count++;
			    copytext = copytext.substring(index + word.length());
			    totalnum++;//是关键字则提取
			    if(words[i].equals("switch"))
			    {  Integer countofcase=SearchCases.searchCases(copytext);
			       list.add(countofcase);
			    }//如果是switch则额外统计其结构内case个数
		    }	
		  }
		  if(count>0)
		  {   
		    map.put(words[i],count);//如果有统计到该关键字，则把关键字-个数映射存入哈希表
		  } 
	   }
	   TextOut.textOut(map, list, totalnum,level); //输出统计信息
	 }
}
