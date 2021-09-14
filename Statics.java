package keyword;

public class Statics {
	  public static void countofcpp(String[] words,String text)
	  { int totalnum=0;
		  for(int i=0;i<words.length;i++)
	   {   String word=words[i];
	    int count=0;
	    String copytext=text;
		while(copytext.contains(words[i]))
		{ if(words[i].equals("do"))
		 {
			int index = copytext.indexOf(word);
			if (copytext.charAt(index+2)!='u')
			{
				count++;
				copytext = copytext.substring(index + word.length());
				totalnum++;
			}
			else
			{
				copytext = copytext.substring(index + word.length());
			}
		 }
		 else
		 {	count++;
			int index = copytext.indexOf(word);	
			copytext = copytext.substring(index + word.length());
			totalnum++;
		 }	
		}
		if(count>0) System.out.printf("%s num: %d\n",words[i],count);
	   }
		  System.out.printf("total num: %d\n",totalnum);
	  }
}
