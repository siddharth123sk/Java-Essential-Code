import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/siddharthsah/Downloads/captmidn.txt");
		
		Scanner scan = new Scanner(file);
		
		System.out.println(scan.nextLine()); 
		
		String fileContent = "";
		
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("/Users/siddharthsah/Downloads/newTextFile.txt");
		writer.write(fileContent);
		writer.close();
		
		

	}

}
