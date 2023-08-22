package collections;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
public class filenotfounf_using_path 
{
	public static  void main(String args[]) throws FileNotFoundException,IOException
	{
		String filePath=" C:\\Users\\rmahe\\OneDrive\\Desktop\\java\\exam\\hey.txt";
		FileInputStream inputStream=new FileInputStream(filePath);
		int data;
		while((data=inputStream.read())!=-1) {
			System.out.println((char) data);
		}
		System.out.println((char) data);
	}

}
