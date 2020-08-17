import java.io.*;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        try {
        	System.out.println("Enter path of file which is to be copied");
        	String pathInputFile = s.next();
            FileReader fr = new FileReader(pathInputFile);
           // FileReader fr = new FileReader("C:\\Users\\Gunjan\\Desktop\\Amazon.txt");
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("Enter path of file where we have to copy");
        	String pathOutputFile = s.next();
           // FileWriter fw = new FileWriter("C:\\Users\\Gunjan\\Desktop\\AmazonCopy.txt", true);
            FileWriter fw = new FileWriter(pathOutputFile, true);
            
            String str;

            while ((str = br.readLine()) != null) { // read a line
                fw.write(str); // write to output file
                fw.flush();
            }
            br.close();
            fw.close();
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.close();
    }
}

/*
Output

File copied
 */