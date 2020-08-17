//Question 10. WAP to copy a file from one dir to another dir.

/* Output 
 Enter source directory path : 
C:\Users\Gunjan\Desktop\AU-July-2020-Batch2\Java-Assignment-Morning-Session
Enter target directory path : 
C:\Users\Gunjan\Desktop\CopyDirectory
Directory Copied

 */

import java.util.*;
import java.io.*;

public class Question10 {

	public static void copyDirectory(File sourceLocation, File targetLocation) throws IOException {

		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(targetLocation, children[i]));
			}
		} else {

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter source directory path : ");
		String sourcePath = s.next();
		File sourceLocation = new File(sourcePath);

		System.out.println("Enter target directory path : ");
		String destinationPath = s.next();
		File targetLocation = new File(destinationPath);
		try {
			copyDirectory(sourceLocation, targetLocation);
			System.out.println("Directory Copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}

}
