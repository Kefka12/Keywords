package keyword;

import java.util.ArrayList;
import java.util.Map;

public class TextOut {
	 //输出文档中关键字及其个数和Switch结构中cases个数的方法
	  public static void textOut(Map<String,Integer>map,ArrayList<Integer> list,int totalnum,int level)
	  //传入保存好的关键字—个数映射，cases个数列表，关键字总数用于输出
	  {   int sum=0;
		  System.out.printf("total num: %d\n",totalnum);//输出关键字总数
		  for (String i : map.keySet())
		  {
			    if(i!="case") System.out.printf("%s num: %d\n",i,map.get(i));//关键字不是case时，只输出个数
			    else
			    {   if(level>=2)//完成等级为2及以上时，输出cases个数列表
			     {	System.out.printf("%s num:",i);
			    	for(int k=0;k<list.size();k++)
			    	{System.out.printf(" %d",list.get(k));
			    	}
			    	System.out.printf("\n");
			     }
			       else //完成等级为1时，只输出cases个数
			     { for(int k=0;k<list.size();k++)
			    	{ sum+=list.get(k);
			    	}
			        System.out.printf("%s num: %d\n",i,sum);
			     }	 
			    }
	    }
	  }
}
