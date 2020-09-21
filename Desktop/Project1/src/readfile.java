import java.io.*;
import java.util.*;


public class readfile {

	private Scanner x;
	private TreeSet<Integer> tree = new TreeSet<Integer>();
	private LinkedList<Integer> list1 = new LinkedList<Integer>();
	public void openFile(File f) {
		try {
			x = new Scanner(f);
		}
		catch(Exception e) {
			System.out.println("File could not open");
		}
	}
	
	public void readFile() {
		
		long startTime = System.nanoTime();
		
		while(x.hasNextInt()) {
			int a = x.nextInt();
			tree.add(a);
		}
		
		list1.addAll(tree);
	
		long endTime = System.nanoTime();
		
		System.out.println("time_insert: " + ((endTime - startTime) / 1000) + " microseconds");
		
		long startTime1 = System.nanoTime();
		
		System.out.println("The min is " + list1.peekFirst());
		
		long endTime1 = System.nanoTime();
		
		System.out.println("time_min: " + ((endTime1 - startTime1) / 1000) + " microseconds");
		
		long startTime2 = System.nanoTime();
		
		System.out.println("The max is " + list1.peekLast());
		
		long endTime2 = System.nanoTime();
		
		System.out.println("time_max: " + ((endTime2 - startTime2) / 1000) + " microseconds");
		
		long startTime3 = System.nanoTime();
		
		int median = list1.size()/2;
		
		System.out.println("The median is " + list1.get(median));
		
		long endTime3 = System.nanoTime();
		
		System.out.println("time_med: " + ((endTime3 - startTime3) / 1000) + " microseconds");
	}
	
	public void closeFile() {
		x.close();
	}
	
	
}
