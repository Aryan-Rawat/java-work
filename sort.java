import java.io.BufferedReader;
import java.io.FileReader;
  
public class sort  
{
    public static void main(String[] args) throws Exception {
        String line;
        int characters = 0, 
        words = 0, 
        lines = 0;
          
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);
             
        while((line = br.readLine()) != null) {
            lines++;
            characters += line.length();
            words += line.split(" ").length;
        }
         
        System.out.println("Number of words present in given file: " + words);
        System.out.println("Number of lines present in given file: " + lines);
        System.out.println("Number of characters present in given file: " + characters);
        br.close();
    }
}