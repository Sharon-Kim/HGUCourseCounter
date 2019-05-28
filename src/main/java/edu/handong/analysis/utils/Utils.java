package edu.handong.analysis.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	public static ArrayList<String> getLines(String file, boolean removerHeader){
		ArrayList<String> lines = new ArrayList<String>();
		while(!removerHeader) {
			BufferedInputStream inputStream= new BufferedInputStream(new FileInputStream(new File(file)));
	        while (inputStream.read()!=-1){
	        	
	        }
			
		return lines;
	}
	
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		try {
            Path path = ;
            Files.createDirectories(path.getParent());

            Files.write(path, "Log log".getBytes());

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
