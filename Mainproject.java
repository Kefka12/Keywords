package keyword;

import java.util.ArrayList;

public class Mainproject {
    //项目主体，用以执行各项操作和进行程序设置
	public static void main(String[] args) {
		String path=null;
		int level=4;
		if(args.length==0) {path = "d:\\test1.cpp";}
		else path=args[0];
		if(args.length==2) {level=Integer.parseInt(args[1]) ;}//程序传参并设定默认值，参数一为路径，参数二为完成等级
        String text=FileToString.fileToString(path);//从文件中提取字符串文本
        text=TrimText.trimText(text);//删除文本中的字符串和注释
		final String[] keywords={"do","auto","break","case","char","const"
				,"continue","default","double","else","enum"
				,"extern","float","for","goto","if","int","long","register"
				,"return","short","signed","sizeof","static","struct","switch"
				,"typedef","union","unsigned","void","volatile","while"};//定义关键字列表常量
		ArrayList<String> list= SearchIfAndElse.searchIfAndElse(text);
		StaticsOfKeywords.staticsOfKeywords(keywords, text,level);//根据文本和完成等级完成关键字统计并输出1、2级结果
		int[] num= StaticsOfIfElse.staticsOfStructs(list);//完成if-else和if-else-if结构统计
		if(level>=3) TextOutIfElse.outOfIfElse(num[0]);//等级为3或以上 输出if-else结构数
		if(level>=4) TextOutIfElse.outOfIfElseIfElse(num[1]);//等级为4 输出if-else-if结构数
	}
   

}