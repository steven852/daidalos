package fileManager;

import java.io.*;
import java.util.Scanner;

public class FileLoader {
	private File targetFile;
	
	public FileLoader(String fileName) throws IOException{
		targetFile = new File(fileName);
	}
	
	public String loadFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(targetFile);
		String content = content(scanner);
		scanner.close();
		return content;
	}
	
	public String content(Scanner scanner) {
		String content = "";
		int i = 0;
		while(scanner.hasNextLine()) {
			if (i != 0) {
				content += "\r\n" + scanner.nextLine();
			}
			else {
				content += scanner.nextLine();
			}
			i++;
		}
		return content;
	}
}
