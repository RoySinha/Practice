package Java_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereader {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/royar/OneDrive/Desktop/Javafileread.txt");
		Scanner Scan = new Scanner(file);
		
		
		String filecontent="";
		while(Scan.hasNextLine()){
	    filecontent = filecontent.concat(Scan.nextLine() + "\n");
	    
		}
	    
	    FileWriter filewriter=new FileWriter("/Users/royar/OneDrive/Desktop/Copiedfile.txt");
	    filewriter.write(filecontent);
	    filewriter.close();
	   

	}

}
