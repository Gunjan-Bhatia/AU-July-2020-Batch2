
//Question 8. WAP to list out all files that are end with “.txt” extension in a folder, and then delete it.
import java.io.*;

import java.util.*;

class Question8 {
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the folder location from which text files are to be deleted");
		// String folderName="C:\\Users\\Gunjan\\Desktop\\Test";
		
		String folderName = s.next();
		
		File folder = new File(folderName);
		
		File[] textfilesArray = folder.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String filename) {
				return filename.endsWith(".txt");
			}
		});
		for (File file : textfilesArray) {
			if (file.delete())
				System.out.println("Deleted the file with name : " + file.getName());
			else
				System.out.println("Failed to delete the file.");

		}
		s.close();
	}
}