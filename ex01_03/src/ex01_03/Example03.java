package ex01_03;

public class Example03 {
	static String getFileName1(String path) {
		String str= path.substring(path.lastIndexOf("/")+1);
		return str;
	}

	static String getFileName2(String path) {
		String[] array=path.split("/");
		return array[array.length-1];
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx", "c:/www/mainpage.html", "c:/program files/java/javac.exe" };
		for (String s : a) {
			String fileName1 = getFileName1(s);
			String fileName2 = getFileName2(s);
			System.out.printf("%s, %s\n", fileName1, fileName2);
		}
	}
}
