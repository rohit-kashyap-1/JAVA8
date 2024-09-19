import java.io.File;
import java.io.IOException;
public class FileCreator {
  public static void main(String[] args) {
    //creating a file
    File file = new File("helloworld.txt");
    try{
      if(file.createNewFile()){
        System.out.println("File created");
      }else{
        System.out.println("File already exists");
      }
    }catch(IOException error){
      System.out.println("Error creating file...");
      System.out.println(error.getStackTrace());
    }
  }
}
