package keyword;

public class SearchCases {
   public static Integer search(String copytext)
   {
	   int indexofendcase=copytext.indexOf("default");
		Integer countofcase=0;			  
         String temptext=copytext.substring(0,indexofendcase);
		 while(	JudgeOfKeywords.judgeif(temptext,"case"))
		 {  int indexofcase=temptext.indexOf("case");
			countofcase++;
			temptext = temptext.substring(indexofcase + 4);
		 }
       
		return countofcase;
   }
}
