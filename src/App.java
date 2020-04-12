import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class App {
	
	public static void main(String[] args) throws IOException {
		copyFile("file\\sourceFile.txt","file\\destFile.txt");
	}
	
	private static void copyFile(String sourcePath,String destPath) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(sourcePath);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(destPath);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
			bw.write(line);
			bw.write("\n");
		
		}
		bw.close();
		br.close();
	}
}
