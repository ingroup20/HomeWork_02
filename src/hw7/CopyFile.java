package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile {
	String originalFile;
	String newFile;

	public CopyFile() {

	}

	public CopyFile(String originalFile, String newFile) {
		copyFile(originalFile, newFile);
		
	}

	public void copyFile(String originalFile, String newFile) {

		try {
			FileInputStream fr = new FileInputStream(originalFile);
			BufferedInputStream br = new BufferedInputStream(fr);

			FileOutputStream fw = new FileOutputStream(newFile);
			BufferedOutputStream bw = new BufferedOutputStream(fw);
			
			int transfer;
		
			while ((transfer= br.read()) != -1) {
				bw.write(transfer);
				bw.flush();
			}

			
			br.close();
			fr.close();
		
			bw.close();
			fw.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

	public static void main(String[] args) {
		
		String originalFile ="C:/CHA104_WorkSpace/HomeWork_02/Sample.txt";
		
		String fileName=originalFile.substring(0,originalFile.lastIndexOf("."));
		String fileType=originalFile.substring(originalFile.lastIndexOf("."));
		String newFile =fileName+"_copy"+fileType;

		CopyFile cf1= new CopyFile(originalFile,newFile);
		
	}

}
