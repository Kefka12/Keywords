package keyword;

public class SearchElse {
	//ʵ���˴��Ķ�����������ȡ��һ��else�ؼ���λ�õķ�������ҪΪ����else-if�е�else���֣�	
	public static int searchIndexOfElse(String copytext)
	{   int index2=copytext.length()-1;
		while(copytext.contains("else"))
		{   int index=copytext.indexOf("else");
			  char judge=copytext.charAt(index+ 4);
			  String judges=copytext.substring(index, index+7);
			  char judge2=' ';
			  if(index>0) judge2=copytext.charAt(index-1);
		      if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')||(judges=="else if")
		    	||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))//else if�ر��ж�
	          {   copytext = copytext.substring(index + 4);
			    continue;
	          }
		      else  
		      {
		    	index2=index;
		    	break;
		      }
		} //�÷�������Ѱ��һ�����ı��е�һ��else��λ�õķ���������ʵ����JudgeOfKeywords����
	    return index2;
	}
}
