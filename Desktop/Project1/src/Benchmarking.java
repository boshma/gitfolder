/*Name: Bogdan Shmat
CPTS 233 PM #1
Date: 9/20/2020 
gitRepo URL:https://github.com/boshma/PA1.git */



import java.io.*;
import java.util.*; 

public class Benchmarking {

	public static void main(String[] args) {
		
		File f = new File(args[0]);
		
		readfile r = new readfile();
		
		r.openFile(f);
		r.readFile();
		r.closeFile();
	

	}		
}
