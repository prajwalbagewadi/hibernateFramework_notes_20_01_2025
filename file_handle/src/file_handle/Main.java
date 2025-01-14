package file_handle;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		try {
			
			File file = new File("Logcat1.txt");
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("new File created");
			}else {
				System.out.println("File Already exists");
			}
			
			//writing
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			Scanner sc=new Scanner(System.in);
			String var;
			System.out.println("Enter text:");
			var=sc.next();
			//bw.append(var);
			bw.write(var);
			bw.close();
			//reading file
			//br.read() for single char
			//System.out.println("read="+br.read());
			String line;
			while((line=br.readLine())!=null) {
				System.out.println("readfile="+line);
			}
			
		}catch(IOException obj) {
			System.out.println("Error:");
			obj.printStackTrace();
		}
	}
}
