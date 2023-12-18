package buffwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\stk22\\Desktop\\deneme.txt");
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		Veriokuma veriokuma=new Veriokuma();
	
		
		try {
			fileWriter=new FileWriter(file);
			bufferedWriter=new BufferedWriter(fileWriter);
			try (Scanner scanner = new Scanner(System.in)) {
				String line=null;
				while (!(line=scanner.nextLine()).equals("q")) {
					fileWriter.write(line);				
				}
				scanner.close();
			
			}
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if (fileWriter!=null) {
				try {
					fileWriter.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			
			if (bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
						
			}}
		}veriokuma.veri();	
		System.out.println(file.delete());
		System.out.println(file.canWrite());
		
		System.out.println(file.lastModified());
		System.out.println(file.compareTo(file));
		System.out.println(file.getName());
		
	}
}
