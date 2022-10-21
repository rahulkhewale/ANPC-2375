package question3.main;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException{
       
    	String note = "Rahul";
 
        Path location = Path.of("C:\\Users\\ACER\\git\\ANPC-2375\\PracticalTest_20_oct_2022\\src\\question3\\main\\Main.java");
 
        Files.writeString(location, note);
 
        String str = Files.readString(location);
 
        System.out.println(str);
    }

}