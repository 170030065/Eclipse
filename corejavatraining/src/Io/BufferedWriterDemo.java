package Io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args)throws IOException {
		

		FileWriter fw=new FileWriter("Annu.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.write("tq");
		
		bw.flush();
		bw.close();
		
	}

}
