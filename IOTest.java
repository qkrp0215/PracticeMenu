package step02_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOTest {

	public static void fileSave() throws IOException {
		FileOutputStream fos = new FileOutputStream("IOTest.txt");
		fos.write(89);
		fos.write(300);
		fos.write(90);
		
		fos.close();
	}
	
		static byte[] data = {65,66,67};
	
	public static void fileOpen() throws IOException {
		int data;
		FileInputStream fis = new FileInputStream("IOTest.txt");
		while( (data=fis.read()) != -1) {
			System.out.println(data);
		}
	}
	
	static String name;
	
	public static void stringName() {
		while(name instanceof String) {
			if(name !=null && name instanceof String) {
				System.out.println(name);
			} else {
				System.out.println("이름을 입력해주세요.");
				
			}
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			fileSave();
			fileOpen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	System.out.println("=========이름을 입력해주세요=======");
	Scanner scannerName = new Scanner(System.in);
	String name = scannerName.next();
	stringName();
	
	

	System.out.println("=========MBTI를 입력해주세요=======");
	
	
	Scanner mbti = new Scanner(System.in);
	String mbtiQ= mbti.next();
	
	
	
	}
	

}
