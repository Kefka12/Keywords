package keyword;

import java.util.ArrayList;

public class Mainproject {
    //��Ŀ���壬����ִ�и�������ͽ��г�������
	public static void main(String[] args) {
		String path=null;
		int level=4;
		if(args.length==0) {path = "d:\\test1.cpp";}
		else path=args[0];
		if(args.length==2) {level=Integer.parseInt(args[1]) ;}//���򴫲β��趨Ĭ��ֵ������һΪ·����������Ϊ��ɵȼ�
        String text=FileToString.fileToString(path);//���ļ�����ȡ�ַ����ı�
        text=TrimText.trimText(text);//ɾ���ı��е��ַ�����ע��
		final String[] keywords={"do","auto","break","case","char","const"
				,"continue","default","double","else","enum"
				,"extern","float","for","goto","if","int","long","register"
				,"return","short","signed","sizeof","static","struct","switch"
				,"typedef","union","unsigned","void","volatile","while"};//����ؼ����б���
		ArrayList<String> list= SearchIfAndElse.searchIfAndElse(text);
		StaticsOfKeywords.staticsOfKeywords(keywords, text,level);//�����ı�����ɵȼ���ɹؼ���ͳ�Ʋ����1��2�����
		int[] num= StaticsOfIfElse.staticsOfStructs(list);//���if-else��if-else-if�ṹͳ��
		if(level>=3) TextOutIfElse.outOfIfElse(num[0]);//�ȼ�Ϊ3������ ���if-else�ṹ��
		if(level>=4) TextOutIfElse.outOfIfElseIfElse(num[1]);//�ȼ�Ϊ4 ���if-else-if�ṹ��
	}
   

}