package keyword;

public class JudgeOfKeywords {
	//ʵ�����Ķ��йؼ����б�ķ�������Ҫ��Ϊ�˷�ֹ�󽫱����к��еĹؼ����ַ�����Ϊ�ؼ���ͳ�ƺͲ�����
	public static boolean judgeWords(String text,String word)
	{   boolean flag=false;//��־�Ǵ����ı�����д���ؼ��ֵķ���
		if(text.contains(word))//ֻ�е��ı��а����йؼ������ַ����Ž�һ���ж�
		{
		  int index=text.indexOf(word);//��Ѱ���ַ���λ��
		  if(word.equals("else"))//else����� ��Ҫ�����ж��Ƿ���else if
		  {
			  while(text.contains(word)) //��ͣ����ֱ���ı������йؼ������ַ���
			   {char judge=' ';
			    if(index+ word.length()<text.length()-1) text.charAt(index+ word.length());
			    char judge2=' ';
			    if(index>0&&index<=text.length()) judge2=text.charAt(index-1);
			    String judges=" ";
			    if(index+7<text.length())judges=text.substring(index, index+7); 
			    //���������ж����ݱ��������ؼ������ַ�����ǰһ���ͺ�һ���ַ����Լ������йؼ������ַ����������ַ����ַ���
			    if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z')||(judge>='0'&&judge<='9')||(judge=='_')||(judges.equals("else if"))//�˴������ж�else if���
			    		||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
			    		//����ؼ������ַ���ǰ���б������ܰ������ַ�����֤���ؼ������ַ����Ǳ������ڱ������У�������Ϊ�ؼ��ֱ�����
		        {   text = text.substring(index + word.length());//�����жϹ����ı���ȥ���ж������ı�
				    continue;
		        }
			    else
			    {
			    	flag=true;//�ؼ������ַ������Ǳ������ڱ������У�Ҳ����elseif������ɱ����ɣ��жϴ��ڡ�
			    	break;
			    }
			   }
		  }
		  else
		  {  while(text.contains(word)) 
			   {char judge1=text.charAt(index+ word.length());
			    char judge2=' ';
			    if(index>0) judge2=text.charAt(index-1);
			    if((judge1>='a'&&judge1<='z')||(judge1>='A'&&judge1<='Z')||(judge1>='0'&&judge1<='9')||(judge1=='_')
			    	||(judge2>='a'&&judge2<='z')||(judge2>='A'&&judge2<='Z')||(judge2>='0'&&judge2<='9')||(judge2=='_'))
		        {   text = text.substring(index + word.length());
				    continue;
		        }
			    else
			    {
			    	flag=true;
			    	break;
			    }
			  }
		      //�жϷ�ʽͬ�� ֻ����ʡȥ�˶���else if������ж�
		  }
		}
		return flag;
	}
	
}
