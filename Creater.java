import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Creater {
  // creating a file
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the filename to create:");
    String filename = scan.nextLine();
    try{
      FileWriter file = new FileWriter(filename);
      System.out.println("\033[0;33m"+"Write some text to the file");
      System.out.println("\033[1;34m");
      while(true){

        String data = scan.nextLine();
        if("exit".equalsIgnoreCase(data))
          break;
        file.write(data);
        file.write(System.lineSeparator());
      }

      System.out.println("\033[1;32m");
      System.out.println("File has been Written");
      System.out.println("\033[0m");
      file.close();
    }catch(IOException e){
      System.out.println("Error");
    }
  }

}
