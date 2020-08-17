
//Question 7. WAP to list all files from a directory recursively with Java.
// Recursive Java program to print all files 
// in a folder(and sub-folders) 

import java.io.File;
import java.util.*;
public class Question7 {
	static void RecursivePrint(File[] arr, int index, int level) {
		// Base case
		if (index == arr.length)
			return;

		// tabs for internal levels
		for (int i = 0; i < level; i++)
			System.out.print("\t");

		// for files
		if (arr[index].isFile())
			System.out.println("File Name : " + arr[index].getName());

		// for sub-directories
		else if (arr[index].isDirectory()) {
			System.out.println("Subdirectory Name : [" + arr[index].getName() + "]");

			RecursivePrint(arr[index].listFiles(), 0, level + 1);
		}

		// for main directory
		RecursivePrint(arr, ++index, level);
	}

	// Driver Method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of directory ");
		
		// Provide full path for directory
		//String mainDirectoryPath = "C:\\Users\\Gunjan\\eclipse-workspace\\Thread";
		String mainDirectoryPath= s.next();
		
		// object of file
		File mainDirectory = new File(mainDirectoryPath);

		if (mainDirectory.exists() && mainDirectory.isDirectory()) {
			// array for files and sub-directories
			// of directory pointed by mainDirectory
			File arr[] = mainDirectory.listFiles();

			System.out.println();
			System.out.println("Files from main directory are : " + mainDirectory);
			System.out.println();

			// recursive method call
			RecursivePrint(arr, 0, 0);
		}
		s.close();
	}
}
/*
output
Enter the name of directory.
Files from main directory are : C:\Users\Gunjan\eclipse-workspace\Thread

File Name : .classpath
File Name : .project
Subdirectory Name : [.settings]
	File Name : org.eclipse.jdt.core.prefs
Subdirectory Name : [bin]
	File Name : demo.class
	File Name : Multithread.class
Subdirectory Name : [src]
	File Name : Multithread.java

*/
