package fileManager;

import java.io.*;

public class FileSaver {
	private File targetFile;
	private BufferedWriter fileWriter;
	
	public FileSaver(String fileName) throws IOException{
		targetFile = new File(fileName + ".tex");
		targetFile.createNewFile();
		fileWriter = new BufferedWriter(new FileWriter(targetFile));
	}
	
	public void saveFile(String content) throws IOException{
		fileWriter.write(content);
		fileWriter.flush();
		fileWriter.close();
	}
}
