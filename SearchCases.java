package keyword;

public class SearchCases {
   //ʵ������һ��Switch�ṹ��ͳ��case���ķ���
   public static Integer searchCases(String copytext)
   {
	    int indexofendcase=copytext.indexOf("default");
	    //����Ĭ��CPP�ļ���ͨ����������Ƕ��switch����˽�default�ؼ�����Ϊһ��Switch�ṹ�����ı�־
		Integer countofcase=0;			  
        String temptext=copytext.substring(0,indexofendcase);//��һ��switch�ṹ��ȡ�����ж�
		while(	JudgeOfKeywords.judgeWords(temptext,"case"))//�ж�
		{  int indexofcase=temptext.indexOf("case");
			countofcase++;
			temptext = temptext.substring(indexofcase + 4);
		}//�ж�switch�ṹ��case��
		return countofcase;
   }
}
