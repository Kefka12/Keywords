package keyword;

public class Mainproject {
	
	public static void main(String[] args) {
		String path=null;
		if(args.length==0) {path = "d:\\test.cpp";}
		else path=args[0];
                String text=FileToString.filetostring(path);
		String[] keywords={"do","auto","break","case","char","const"
				,"continue","default","double","else","enum"
				,"extern","float","for","goto","if","int","long","register"
				,"return","short","signed","sizeof","static","struct","switch"
				,"typedef","union","unsigned","void","volatile","while"};
		Statics.countofcpp(keywords, text);
	}


}
