import java.io.*;
import java.util.Scanner;

public class Write{
	private static final String FILENAME = "textfile.txt";
public static void main(String[] args) throws IOException {
	BufferedWriter bw = null;
	FileWriter fw = null;

    try {
        /*Process p = Runtime.getRuntime().exec("git log");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
        BufferedWriter writer = null;

        String line = null;
        while ((line = in.readLine()) != null) {

            writer = new BufferedWriter(new FileWriter("textfile.txt"));
            writer.write(line);
            System.out.println(line);

            writer.close();*/
    	Process p = Runtime.getRuntime().exec("git log");
    	BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
    	
    	 FileWriter writer = (new FileWriter ("textfile.txt"));
    	 

    	    String line =null;
    	    while ((line= in.readLine()) !=null) {
    	    	fw = new FileWriter(FILENAME);
    			bw = new BufferedWriter(fw);
    	        writer.write(line);
    	    
    	        System.out.println("line");
    	        
    	    }
    	    writer.close();
        

    } catch (IOException e) {
        e.printStackTrace();

    }

   }
}