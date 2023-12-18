package buffwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Veriokuma {
	
	public void veri() {
	File file=new File("C:\\Users\\stk22\\Desktop\\Data.txt");
    BufferedReader bufferedreader=null;

    FileReader fileReader=null;
    
    try {
    	fileReader=new FileReader(file);
        bufferedreader=new BufferedReader(fileReader);
        String line=null;
        
        while ((line=bufferedreader.readLine())!=null) {
			System.out.println(line+"\n");;
			
		}
        
       
		
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
    finally {
		if (bufferedreader!=null) {
			try {
				bufferedreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (fileReader!=null) {
			try {
				fileReader.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
		}
	}
    

}}
