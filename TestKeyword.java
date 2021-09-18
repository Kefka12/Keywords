/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import keyword.JudgeOfKeywords;
import keyword.SearchCases;
import keyword.SearchIfAndElse;
import keyword.StaticsOfIfElse;

/**
 * @author 123456
 *
 */
class TestKeyword {

	@Test
	void testSearchCases() {
		String test1="switch(i){\r\n"
				+ "        case 0:\r\n"
				+ "            break;\r\n"
				+ "        case 1:\r\n"
				+ "            break;\r\n"
				+ "        case 2:\r\n"
				+ "            break;\r\n"
				+ "        default:\r\n"
				+ "            break;\r\n"
				+ "    }";
		String test2="switch(j){\r\n"
				+ "        case 0:\r\n"
				+ "            break;\r\n"
				+ "        case 1:\r\n"
				+ "            break;\r\n"
				+ "        default:\r\n"
				+ "            break;\r\n"
				+ "    }";		
		String test3=	"switch(j){\r\n"
				+ "        default:\r\n"
				+ "            break;\r\n"
				+ "    }";	
		assertEquals(0, SearchCases.searchCases(test3));
		assertEquals(2, SearchCases.searchCases(test2));
		assertEquals(3, SearchCases.searchCases(test1));
	}
	
	@Test
	void testJudgeOfKeywords() {
		String test1="kelse";
		String test2="else if(k==2){}";
		String test3="else{}";
		String test4="else if(k==2){}";
		String test5="else2=\"if\"" ;
		String test6="double" ;
		String test7=null ;
		String test8="";
		assertFalse(JudgeOfKeywords.judgeWords(test1,"else"));
		assertFalse(JudgeOfKeywords.judgeWords(test2,"else"));
		assertTrue(JudgeOfKeywords.judgeWords(test3,"else"));
		assertTrue(JudgeOfKeywords.judgeWords(test4,"else if"));
		assertFalse(JudgeOfKeywords.judgeWords(test5,"else if"));
		assertFalse(JudgeOfKeywords.judgeWords(test6,"do"));
		assertFalse(JudgeOfKeywords.judgeWords(test7,"else"));
		assertFalse(JudgeOfKeywords.judgeWords(test8,"else"));
	}
	
	@Test
	void testStaticsOfIfElse() {
	    String t1="if(i<0){\r\n"
	    		+ "        if(i<-1){};\r\n"
	    		+ "        else{};\r\n"
	    		+ "    }\r\n"
	    		+ "    else if(i>0){\r\n"
	    		+ "        if (i>2){};\r\n"
	    		+ "        else if (i==2) {};\r\n"
	    		+ "        else if (i>1) {};\r\n"
	    		+ "        else {};\r\n"
	    		+ "    }\r\n"
	    		+ "    else{\r\n"
	    		+ "        if(j!=0){};\r\n"
	    		+ "        else{}\r\n"
	    		+ "    }";
	    String t2="if(i<0){\r\n"
	    		+ "        if(i<-1){}\r\n"
	    		+ "        else{}\r\n"
	    		+ "    }\r\n"
	    		+ "    else if(i>0){\r\n"
	    		+ "        if (i>2){}\r\n"
	    		+ "        else if (i==2) {}\r\n"
	    		+ "        else if (i>1) {}\r\n"
	    		+ "        else {}\r\n"
	    		+ "    }\r\n"
	    		+ "    else{\r\n"
	    		+ "        if(j!=0){}\r\n"
	    		+ "        else{}"
	    		+ "}\r\n"
	    		+ "    return 0;";
	    String t3="if(i<-1){};\r\n"
	    		+ "        else{};\r\n"
	    		+ "        if(i<-1){};\r\n"
	    		+ "        else{};";
	    String t4="if(i<-1){};\r\n"
	    		+ "        else if{};\r\n"
	    		+ "        else{};\r\n"
	    		+ "        if (i>2){};\r\n"
	    		+ "        else if (i==2) {};\r\n"
	    		+ "        else if (i>1) {};\r\n"
	    		+ "        else {};";
	    String t5="";
	    String t6=null;
		ArrayList<String> test1= SearchIfAndElse.searchIfAndElse(t1);
		ArrayList<String> test2= SearchIfAndElse.searchIfAndElse(t2);
		ArrayList<String> test3= SearchIfAndElse.searchIfAndElse(t3);
		ArrayList<String> test4= SearchIfAndElse.searchIfAndElse(t4);
		ArrayList<String> test5= SearchIfAndElse.searchIfAndElse(t5);
		ArrayList<String> test6= SearchIfAndElse.searchIfAndElse(t6);
		int[] num1= {2,2};
		int[] num2= {2,2};
		int[] num3= {2,0};
		int[] num4= {0,2};
		int[] num5= {0,0};
		int[] num6= {0,0};
		assertArrayEquals(num1,StaticsOfIfElse.staticsOfStructs(test1));
		assertArrayEquals(num2,StaticsOfIfElse.staticsOfStructs(test2));
		assertArrayEquals(num3,StaticsOfIfElse.staticsOfStructs(test3));
		assertArrayEquals(num4,StaticsOfIfElse.staticsOfStructs(test4));
		assertArrayEquals(num5,StaticsOfIfElse.staticsOfStructs(test5));
		assertArrayEquals(num6,StaticsOfIfElse.staticsOfStructs(test6));
	}

}
