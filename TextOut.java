package keyword;

import java.util.ArrayList;
import java.util.Map;

public class TextOut {
	 //����ĵ��йؼ��ּ��������Switch�ṹ��cases�����ķ���
	  public static void textOut(Map<String,Integer>map,ArrayList<Integer> list,int totalnum,int level)
	  //���뱣��õĹؼ��֡�����ӳ�䣬cases�����б��ؼ��������������
	  {   int sum=0;
		  System.out.printf("total num: %d\n",totalnum);//����ؼ�������
		  for (String i : map.keySet())
		  {
			    if(i!="case") System.out.printf("%s num: %d\n",i,map.get(i));//�ؼ��ֲ���caseʱ��ֻ�������
			    else
			    {   if(level>=2)//��ɵȼ�Ϊ2������ʱ�����cases�����б�
			     {	System.out.printf("%s num:",i);
			    	for(int k=0;k<list.size();k++)
			    	{System.out.printf(" %d",list.get(k));
			    	}
			    	System.out.printf("\n");
			     }
			       else //��ɵȼ�Ϊ1ʱ��ֻ���cases����
			     { for(int k=0;k<list.size();k++)
			    	{ sum+=list.get(k);
			    	}
			        System.out.printf("%s num: %d\n",i,sum);
			     }	 
			    }
	    }
	  }
}
