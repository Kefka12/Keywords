package keyword;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StaticsOfKeywords {
	  //ʵ�������Ķ���ͳ�ƹؼ��ּ��������Switch�ṹ��cases�����ķ���
	  public static void staticsOfKeywords(String[] words,String text,int level)
	  { Map<String,Integer>map = new HashMap<>();//������ϣ��洢�ؼ���-����ӳ��
	    int totalnum=0;//�洢�ܹؼ��ָ���
		ArrayList<Integer> list= new ArrayList<Integer>();//�洢cases�����б�
		for(int i=0;i<words.length;i++)
	    { String word=words[i];
	      int count=0;
	      String copytext=text;//����һ���ַ����ı��Ա�֤����ÿ���ؼ��ֶ����ظ���ȡ
		  while(copytext.contains(words[i]))
		  { 
			int index = copytext.indexOf(word);//�ҵ��ؼ������ַ���λ��
		    char judge=copytext.charAt(index+ word.length());
		    char judge2=' ';
		    if(index>0) judge2=copytext.charAt(index-1);
		    if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')
				  ||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
	        {   copytext = copytext.substring(index + word.length());
			    continue;
	        } //������ַ������ǹؼ���������
		    else
		    {	count++;
			    copytext = copytext.substring(index + word.length());
			    totalnum++;//�ǹؼ�������ȡ
			    if(words[i].equals("switch"))
			    {  Integer countofcase=SearchCases.searchCases(copytext);
			       list.add(countofcase);
			    }//�����switch�����ͳ����ṹ��case����
		    }	
		  }
		  if(count>0)
		  {   
		    map.put(words[i],count);//�����ͳ�Ƶ��ùؼ��֣���ѹؼ���-����ӳ������ϣ��
		  } 
	   }
	   TextOut.textOut(map, list, totalnum,level);//���ͳ����Ϣ
	 }
}
