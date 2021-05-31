package Io;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException{
		File f=new File("Annu.txt");
		FileReader fw=new FileReader(f);
		
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
		System.out.println(fw.read());
	}
}
