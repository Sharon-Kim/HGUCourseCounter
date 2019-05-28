package edu.handong.analysis.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Utils {
	public static ArrayList<String> getLines(String file, boolean removerHeader) throws IOException{
		BufferedReader inputStream= new BufferedReader(new FileReader(file));
		FileWriter writer;
        while (inputStream.read()!=-1){
        	writer = new FileWriter(file, removerHeader);
        }
        ArrayList<String> lines = new ArrayList<String>();
        while(writer.hasNext()) {
        	lines.add(writer.next());
        }
		return lines;
	}
	
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		BufferedReader inputStream= new BufferedReader(new FileReader(file));
        while (inputStream.read()!=-1){}
	}
}
