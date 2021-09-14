package tank;

public class Statics {
  public static void countofcpp(String[] words,String text)
  { int totalnum=0;
    for(int i=0;i<words.length;i++)
     {   String word=words[i];
        int count=0;
        String copytext=text;
	while(copytext.contains(words[i]))
	{
		count++;
		int index = copytext.indexOf(word);	
		copytext = copytext.substring(index + word.length());
		totalnum++;
	}
	System.out.printf("%s num: %d\n",words[i],count);
     }
	  System.out.printf("total num: %d\n",totalnum);
 }
}

