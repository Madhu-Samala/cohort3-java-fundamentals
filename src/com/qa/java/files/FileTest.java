package com.qa.java.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		/*
		 * Read data.txt file
		 */
		
		File file = new File("C://qa//data.txt");
		File fileout = new File("C://qa//data-copy.txt");
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		if(!fileout.exists())
			try {
				fileout.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		/*System.out.println(file.exists());
		System.out.println(file.canRead());
		try {
			file.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}*/
		
		try {
			 fr = new FileReader(file);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(new FileWriter(fileout));
			/*try {
				int ch = (char) fr.read();
				while(ch != -1) {
				System.out.print((char)ch);
				ch = fr.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} */
			String line = null;
			try {
				line = br.readLine();
				while(line != null) {
					//System.out.println(line);
					bw.write(line);
					bw.write("\n");
					bw.flush();
					line = br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
