package Io;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File f=new File("Movies");
       System.out.println(f.exists());
       f.mkdir();//it willcreate the folder
       System.out.println(f.exists());
	}

}
