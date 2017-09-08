
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class WriteToFileExample {

	private static final String FILENAME = "demo.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter text::");
			String content = sc.nextLine();
			try {
			    Files.write(Paths.get("demo.txt"), content.getBytes(), StandardOpenOption.APPEND);
			}catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
			
			//Scanner sc=new Scanner(System.in);
			//System.out.println("Enter text::");
			
			
			//String content = sc.nextLine();

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		 String fname;
	        Scanner scan = new Scanner(System.in);
	        
	        /* enter filename with extension to open and read its content */
	        
	        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
	        fname = scan.nextLine();
	        
	        /* this will reference only one line at a time */
	        
	        String line = null;
	        try
	        {
	            /* FileReader reads text files in the default encoding */
	            FileReader fileReader = new FileReader(fname);
	            
	            /* always wrap the FileReader in BufferedReader */
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            while((line = bufferedReader.readLine()) != null)
	            {
	                System.out.println(line);
	            }
	            
	            /* always close the file after use */
	            bufferedReader.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println("Error reading file named '" + fname + "'");
	        }		
	}

}
