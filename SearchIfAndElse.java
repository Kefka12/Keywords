package keyword;

import java.util.ArrayList;

public class SearchIfAndElse {
	//实现了从文段中提取if，else和else if关键字并存入列表以便进一步统计结构数的方法
	public static ArrayList<String>searchIfAndElse(String text)
	{      
	    ArrayList<String> list= new ArrayList<String>();//创建列表，用于按出现顺序存入文本中的所有if,else,else if关键字
	    int index1=0,index2=0,index3=0;//用于分别存储三个关键字的一个
	    boolean flag1=JudgeOfKeywords.judgeWords(text, "if");
	    boolean flag2=JudgeOfKeywords.judgeWords(text, "else");
	    boolean flag3=JudgeOfKeywords.judgeWords(text, "else if");//首先分别判断文本中是否含有这三个关键字		  
		while(flag1||flag2||flag3)//不断提取直到这三个关键字完全被提取完毕（文本中不含有这三个关键字）
		{ 
		  index1=text.length();
		  index2=text.length();
		  index3=text.length();  //每次循环将三个索引置最大值 防止判断出错
		  if(flag1) index1 = text.indexOf("if");
		  int index=0;
		  String word=null,copytext=text;
		  if(flag2) index2=SearchElse.searchIndexOfElse(copytext);
		  if(flag3) index3 = text.indexOf("else if"); //寻找三个关键字在文段中的索引（如果有的话）
		  if(flag1&&index1<=index2&&index1<=index3)  
		  { 
			word="if";
		    index=index1;
		  }  
		  if(flag2&&index2<=index1&&index2<=index3)
		  { 
			word="else";
		    index=index2;
		  }
		  if(flag3&&index3<=index2&&index3<=index1)
		  {  
			word="else if";
		    index=index3;
		  } //找出文段中第一个出现的if,else,else if关键字子字符串
		  char judge=text.charAt(index+ word.length());
		  char judge2=' ';
		  if(index>0) judge2=text.charAt(index-1);
		  if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')
				  ||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
		  {   
			  text = text.substring(index + word.length());
			  continue;
	      }
		  else
		  {	 
			  list.add(word);
			  text = text.substring(index + word.length());  
		  } //判断是否为关键字，若是则加入列表
		  //String test=text.substring(0, 10);
		  //System.out.printf("%s I1:%d I2:%d I3:%d\n",test,index1,index2,index3);
		  flag1=JudgeOfKeywords.judgeWords(text, "if");
	      flag2=JudgeOfKeywords.judgeWords(text, "else");
	      flag3=JudgeOfKeywords.judgeWords(text, "else if");	//再次对文段中是否存在这些关键字进行判断作为下次循环的条件
	   }
	   return list;
	}
}
