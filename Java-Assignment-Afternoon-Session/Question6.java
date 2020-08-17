
//Question 6. Create a dummy xml and parse and print its data using java program.

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the full path of the file you want to parse");
			String path = s.next();
			//File inputFile = new File("C:\\Users\\Gunjan\\Documents\\Products-XML-File.xml");
			File inputFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(inputFile);

			doc.getDocumentElement().normalize();

			System.out.println("Root element are : " + doc.getDocumentElement().getNodeName());
			NodeList detailsList = doc.getElementsByTagName("details");
			System.out.println();

			for (int i = 0; i < detailsList.getLength(); i++) {
				Node nthNode = detailsList.item(i);
				System.out.println("\nCurrent Element in file have index :" + (i + 1));

				if (nthNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nthNode;
					System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());

					System.out.println(
							"Category : " + eElement.getElementsByTagName("category").item(0).getTextContent());

					System.out.println("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());

				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		s.close();
	}
}

/*
Output

Enter the full path of the file you want to parse
C:\\Users\\Gunjan\\Documents\\Products-XML-File.xml
Root element are : products


Current Element in file have index :1
Name : Speaker
Category : Electronics
Price : 1000

Current Element in file have index :2
Name : Bed
Category : Furniture
Price : 30,000

Current Element in file have index :3
Name : Badminton
Category : Sports
Price : 600

Current Element in file have index :4
Name : Mixer
Category : Electronics
Price : 10,000

 */
