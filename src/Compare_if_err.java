import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare_if_err {
	public static void main(String[] args) throws IOException{
		String pwd = "C:\\Users\\Administrator\\Desktop\\实验\\实验一\\实验1.0.1\\testProgram\\tempFile";
		File fileA = new File(pwd + "\\file1_1.txt");
		File fileB = new File(pwd + "\\file1_2.txt");
		if(!fileA.exists()||fileA.isDirectory()||!fileB.exists()||fileB.isDirectory()){
			System.out.println("File not found");
		}
		BufferedReader brA = new BufferedReader(new FileReader(fileA));
		BufferedReader brB = new BufferedReader(new FileReader(fileB));
		int count = 0;
		boolean isNull = false;
		while(!isNull){
			String tempLine = brA.readLine();
			if(tempLine == null)break;
			count ++;
			System.out.println(tempLine);
			System.out.println(count);
		}
		System.out.println(count);
		brA.close();
		brB.close();
	}
	
}
