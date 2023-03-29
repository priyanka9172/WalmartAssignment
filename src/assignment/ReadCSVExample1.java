package assignment;
import java.io.*;  
import java.util.Scanner;  
public class ReadCSVExample1  
{  
public static void main(String[] args) throws Exception  
{  
//parsing a CSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("D:/Product_file/Product_details_wallmart.csv"));  
sc.useDelimiter(",");   
while (sc.hasNext())   
{  
System.out.print(sc.next());  
}   
sc.close();  
}  
}  