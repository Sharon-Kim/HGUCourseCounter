package edu.handong.analysis.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import edu.handong.csee.java.example.PrintWriterDemo;

public class Utils {
	public static ArrayList<String> getLines(String file, boolean removerHeader) throws IOException{
		ArrayList<String> lines = new ArrayList<String>();
		try { 
			BufferedReader inputStream= new BufferedReader(new FileReader(file));
			if(removerHeader) inputStream.readLine();
			
			String stringOfLines;
			while ((stringOfLines = inputStream.readLine())!= null){
				
				lines.add(stringOfLines);
			}
			inputStream.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
    
		return lines;
	}
	
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		Path filePath = Paths.get(targetFileName);
		File parentFile = filePath.toFile().getParentFile();
		File finalResultFile = new File(targetFileName);
		boolean result = false;
		
		if(!parentFile.exists()) {
			try {
				parentFile.mkdirs();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream(finalResultFile));
			finalResultFile.createNewFile();
			writer.println("StudentID, TotalNumberOfSemestersRegistered, Semester, NumCoursesTakenInTheSemester");
			for(String newlines:lines) {
				writer.println(newlines);
			writer.close();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
