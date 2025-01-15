package fh2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for file with extension:");
		String fname=sc.next();
		File file = new File(fname);
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("file created successfully");
			}else {
				System.out.println("File name already Exists");
				file.canWrite(); //if file exists user can add content
				file.canRead();
			}
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		
		
		
		//WRITING
		try {
			//FileWriter fw = new FileWriter(file,true);
			FileWriter fw = new FileWriter(file,true); //boolean param to append into file
			//BufferedWriter bw = new BufferedWriter(fw);
			BufferedWriter bw = new BufferedWriter(fw);
				System.out.println("Enter the number of lines in the file:");
				int lno=sc.nextInt();
				String content[] = new String[lno];
				
				for(int i=0;i<lno;i++) {
					System.out.println("line=");
					content[i]=sc.next();
					bw.append(content[i]);
			}
			bw.close();
			fw.close();
			
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		
		
		//READING
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		System.out.println("Exit");
	}
}
