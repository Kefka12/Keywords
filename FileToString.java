package keyword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//实现了将CPP文件提取为字符串文本的方法
public class FileToString {
	      
	   public static String fileToString(String path)
	   {		   
		String content=null; //定义空字符串存储提取的文本
	        try {
	            content = Files.readString(Paths.get(path));//从指定路径提取文件，读入输入流，转化为字符串	       	 
	            } 
	        catch (IOException e) {
	        e.printStackTrace();
	                              }//错误捕捉
	        return content;//返回输出的字符串
	   }
}
