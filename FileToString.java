package keyword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//ʵ���˽�CPP�ļ���ȡΪ�ַ����ı��ķ���
public class FileToString {
	      
	   public static String fileToString(String path)
	   {		   
		   String content=null; //������ַ����洢��ȡ���ı�
	        try {
	            content = Files.readString(Paths.get(path));//��ָ��·����ȡ�ļ���������������ת��Ϊ�ַ���	       	 
	            } 
	        catch (IOException e) {
	        e.printStackTrace();
	                              }//����׽
	        return content;//����������ַ���
	   }
}
