package keyword;

public class TrimText {
	public static String trimText (String text)
	//�ṩ��ɾ��CPP�ı��е�ע�ͣ��ַ������ܣ���ֹ��ȡ�ؼ���ʱ��������
	{
		while(text.contains("\""))//ɾ���ַ���
	    {
			int index=text.indexOf('\"');
			int index2=text.indexOf('\"', index+1);
			String s=text.substring(index,index2+1);
			if(index<0||index2<0) break;
			text=text.replace(s,"");
		}
		while(text.contains("//"))//ɾ��ע��
	    {
			int index=text.indexOf("//");
			int index2=text.indexOf("\n", index+1);
			String s=text.substring(index,index2+1);
			if(index<0||index2<0) break;
			text=text.replace(s,"");
		}
		while(text.contains("/*"))//ɾ������ע��
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
