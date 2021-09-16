package keyword;

public class TrimText {
	public static String trimText (String text)
	//提供了删除CPP文本中的注释，字符串功能，防止提取关键词时出现误判
	{
		while(text.contains("\""))//删除字符串
	    {
			int index=text.indexOf('\"');
			int index2=text.indexOf('\"', index+1);
			String s=text.substring(index,index2+1);
			if(index<0||index2<0) break;
			text=text.replace(s,"");
		}
		while(text.contains("//"))//删除注释
	    {
			int index=text.indexOf("//");
			int index2=text.indexOf("\n", index+1);
			String s=text.substring(index,index2+1);
			if(index<0||index2<0) break;
			text=text.replace(s,"");
		}
		while(text.contains("/*"))//删除多行注释
	    {
			int index=text.indexOf("/*");
			int index2=text.indexOf("*/", index+1);
			String s=text.substring(index,index2+2);
			if(index<0||index2<0) break;
			text=text.replace(s,"");
		}
	    return text;
	}
}
