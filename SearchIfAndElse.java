package keyword;

import java.util.ArrayList;

public class SearchIfAndElse {
	//ʵ���˴��Ķ�����ȡif��else��else if�ؼ��ֲ������б��Ա��һ��ͳ�ƽṹ���ķ���
	public static ArrayList<String>searchIfAndElse(String text)
	{      
	    ArrayList<String> list= new ArrayList<String>();//�����б����ڰ�����˳������ı��е�����if,else,else if�ؼ���
	    int index1=0,index2=0,index3=0;//���ڷֱ�洢�����ؼ��ֵ�һ��
	    boolean flag1=JudgeOfKeywords.judgeWords(text, "if");
	    boolean flag2=JudgeOfKeywords.judgeWords(text, "else");
	    boolean flag3=JudgeOfKeywords.judgeWords(text, "else if");//���ȷֱ��ж��ı����Ƿ����������ؼ���		  
		while(flag1||flag2||flag3)//������ȡֱ���������ؼ�����ȫ����ȡ��ϣ��ı��в������������ؼ��֣�
		{ 
		  index1=text.length();
		  index2=text.length();
		  index3=text.length();  //ÿ��ѭ�����������������ֵ ��ֹ�жϳ���
		  if(flag1) index1 = text.indexOf("if");
		  int index=0;
		  String word=null,copytext=text;
		  if(flag2) index2=SearchElse.searchIndexOfElse(copytext);
		  if(flag3) index3 = text.indexOf("else if"); //Ѱ�������ؼ������Ķ��е�����������еĻ���
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
		  } //�ҳ��Ķ��е�һ�����ֵ�if,else,else if�ؼ������ַ���
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
		  } //�ж��Ƿ�Ϊ�ؼ��֣�����������б�
		  //String test=text.substring(0, 10);
		  //System.out.printf("%s I1:%d I2:%d I3:%d\n",test,index1,index2,index3);
		  flag1=JudgeOfKeywords.judgeWords(text, "if");
	      flag2=JudgeOfKeywords.judgeWords(text, "else");
	      flag3=JudgeOfKeywords.judgeWords(text, "else if");	//�ٴζ��Ķ����Ƿ������Щ�ؼ��ֽ����ж���Ϊ�´�ѭ��������
	   }
	   return list;
	}
}
