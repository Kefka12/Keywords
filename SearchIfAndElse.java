package keyword;

import java.util.ArrayList;
import java.util.Stack;

public class SearchIfAndElse {
	public static int[] search(String text)
	{    int[] num= {0,0};//num[0]存放if-else结构数，num[1]存放if-else-if结构数;     
	     ArrayList<String> list= new ArrayList<String>();
	     int index1=0,index2=0,index3=0;
	     boolean flag1=JudgeOfKeywords.judgeif(text, "if");
	     boolean flag2=JudgeOfKeywords.judgeif(text, "else");
	     boolean flag3=JudgeOfKeywords.judgeif(text, "else if");		  
		  while(flag1||flag2||flag3)
		{  if(flag1) index1 = text.indexOf("if");
		   int index=0;
		  String word=null,copytext=text;
		  
		  if(flag2) index2=SearchElse.judge(copytext);
		  if(flag3) index3 = text.indexOf("else if");
		  if(index1<=index2&&index1<=index3) 
		  { word="if";
		    index=index1;
		  }  
		  if(index2<=index1&&index2<=index3)
		  {  word="else";
		    index=index2;
		  }
		  if(index3<=index2&&index3<=index1)
		 {  word="else if";
		    index=index3;
		 }
		  char judge=text.charAt(index+ word.length());
		  char judge2=' ';
		  if(index>0) judge2=text.charAt(index-1);
		  if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')
				  ||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
	      {   text = text.substring(index + word.length());
			  continue;
	      }
		  else
		 {	  list.add(word);
			  text = text.substring(index + word.length());  
		 }
		  //String test=text.substring(0, 10);
		  //System.out.println(test);
		   flag1=JudgeOfKeywords.judgeif(text, "if");
	       flag2=JudgeOfKeywords.judgeif(text, "else");
	       flag3=JudgeOfKeywords.judgeif(text, "else if");	
	   }
	     Stack<String> st=new Stack<String>();
	     int size=list.size();  
	     String[] array = (String[])list.toArray(new String[size]);  
	     for(int i=0;i<array.length;i++)
		{    String s=array[i];
		    //System.out.println(s);
	    	 if(s.equals("if")||s.equals("else if"))
			 {
			   st.push(s);
		     }
			 if(s.equals("else"))
			 { if(st.peek().equals("else if"))
			  { num[1]++;
			    while(!st.peek().equals("if")) st.pop();
			    if(st.peek().equals("if")) st.pop();
			  }
			 else
			 { num[0]++;
			   st.pop();
			 }
			}
		}
		return num;
	}
}
