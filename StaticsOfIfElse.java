package keyword;

import java.util.ArrayList;
import java.util.Stack;

public class StaticsOfIfElse {
	public static int[] staticsOfStructs(ArrayList<String> list) //���Ѿ�����źõ�if else else-if�ؼ����б���ͳ�ƽṹ��
	{   int[] num= {0,0};//num[0]���if-else�ṹ����num[1]���if-else-if�ṹ��;     
		Stack<String> st=new Stack<String>(); //�����¶�ջ�����жϽṹ��
	    int size=list.size();  
	    String[] array = (String[])list.toArray(new String[size]);//��Ϊ���趯̬��ӣ����б�רΪ������ڲ���  
	    for(int i=0;i<array.length;i++)
		{    String s=array[i];
		     //System.out.println(s);
	    	 if(s.equals("if")||s.equals("else if"))//�����if ��else-if����ջ
			 {
			   st.push(s);
		     }
			 if(s.equals("else"))//�����else�������ж�ջ��
			 { if(!st.empty()&&st.peek().equals("else if"))//ջ��Ϊelse if������else if��ջֱ��ջ��Ϊif
			   { num[1]++;//if-else-if�ṹ��+1
			     while(!st.empty()&&!st.peek().equals("if")) st.pop();
			     if(!st.empty()&&st.peek().equals("if")) st.pop();//ջ��Ϊif����ջ
			   }
			   else
			   { num[0]++;//if-else�ṹ��+1
			     if(!st.empty()) st.pop(); //ջ��Ϊif����ջ
			   }
			}
		}
	    return num;
	}
}
