package tank;

public class main {

	public static void main(String[] args) {
		String path = "d:\\test.cpp";
        String text=FileToString.filetostring(path);
		String[] words={"switch","case","if","else"};
		Statics.countofcpp(words, text);
	}

}
