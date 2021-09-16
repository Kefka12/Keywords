package keyword;

public class SearchCases {
   //实现了在一组Switch结构中统计case数的方法
   public static Integer searchCases(String copytext)
   {
	    int indexofendcase=copytext.indexOf("default");
	    //由于默认CPP文件能通过编译且无嵌套switch，因此将default关键字作为一组Switch结构结束的标志
		Integer countofcase=0;			  
                 String temptext=copytext.substring(0,indexofendcase);//将一组switch结构截取进行判断
		while(	JudgeOfKeywords.judgeWords(temptext,"case"))//判断
		{  int indexofcase=temptext.indexOf("case");
			countofcase++;
			temptext = temptext.substring(indexofcase + 4);
		}//判断switch结构中case数
		return countofcase;
   }
}
