package fh3;
/**
 * program for object writing and reading
 * 
 * */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
class Emp{
	int id;
	String name;
	int age;
	
	public Emp(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	//toString to write object in file
	public String toString() {
		return ("empid="+id+" name="+name+" age="+age);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file = new File("data.txt");
		
		Emp obj1 = new Emp(1,"abc",25);
		
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("file created.");
			}else {
				System.out.println("file already exists.");
			}
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
//			StringBuilder sb = new StringBuilder();
//			bw.append(sb.append(obj1.id).toString());
//			bw.append(obj1.name);
//			bw.append(sb.append(obj1.age).toString());
			bw.append(obj1.toString());
			bw.close();
			fw.close();
			
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String temp=br.readLine();
			System.out.println("temp="+temp);
			
		}catch(IOException obj) {
			obj.printStackTrace();
		}
	}

}
