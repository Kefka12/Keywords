package keyword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToString {
	   
	   public static String filetostring(String path)
	   {
		   
		   String content=null; 
	        try {
	 
	            // default StandardCharsets.UTF_8
	            content = Files.readString(Paths.get(path));
	          
	            return content;
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return content;
	   }
}
