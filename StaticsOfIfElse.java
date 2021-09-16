package keyword;

import java.util.ArrayList;
import java.util.Stack;

public class StaticsOfIfElse {
	//实现了从if,else,else if列表中统计if-else结构数和if-else-if结构数的方法
	public static int[] staticsOfStructs(ArrayList<String> list)  //从已经被存放好的if else else-if关键字列表中统计结构数
	{   int[] num= {0,0};//num[0]存放if-else结构数，num[1]存放if-else-if结构数;     
		Stack<String> st=new Stack<String>(); //创建新堆栈用于判断结构数
	    int size=list.size();  
	    String[] array = (String[])list.toArray(new String[size]);//因为无需动态添加，将列表专为数组便于操作  
	    for(int i=0;i<array.length;i++)
		{    String s=array[i];
		     //System.out.println(s);
	    	 if(s.equals("if")||s.equals("else if"))//如果是if 和else-if则入栈
			 {
			   st.push(s);
		     }
			 if(s.equals("else"))//如果是else则首先判断栈顶
			 { if(!st.empty()&&st.peek().equals("else if"))//栈顶为else if则将所有else if出栈直到栈顶为if
			   { num[1]++;//if-else-if结构数+1
			     while(!st.empty()&&!st.peek().equals("if")) st.pop();
			     if(!st.empty()&&st.peek().equals("if")) st.pop();//栈顶为if，出栈
			   }
			   else
			   { num[0]++;//if-else结构数+1
			     if(!st.empty()) st.pop(); //栈顶为if，出栈
			   }
			}
		}
	    return num;
	}
}
