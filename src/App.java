import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class App {
	
	
	public static void main(String[] args) throws IOException {
		System.out.print(readFile("file/sourceFile.txt"));
	}

	private static String readFile(String sourcePath) throws FileNotFoundException, IOException {
		StringBuilder sb = new StringBuilder();
		File sourceFile = new File(sourcePath);
		InputStream in = new FileInputStream(sourceFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
	
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + System.lineSeparator());
		}
		return sb.toString();
	}
}
