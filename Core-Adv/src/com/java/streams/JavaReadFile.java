package com.java.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class JavaReadFile {

    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
    	String fileName = "C:" + fileSeparator+"users"+fileSeparator+"skatt"+fileSeparator+"files"+fileSeparator+"fileout1.txt";
        
//        //using Java 7 Files class to process small files, get complete file data
 //       readUsingFiles(fileName);
        
        //using Scanner class for large files, to read line by line
       readUsingScanner(fileName);
//        
//        //read using BufferedReader, to read line by line
//       readUsingBufferedReader(fileName);
//         
//        //read using FileReader, no encoding support, not efficient
 //       readUsingFileReader(fileName);
    }

	// Revisit
    private static void readUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Reading text file using FileReader");
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }
        br.close();
        fr.close();
        
    }

//    private static void readUsingInputStream(String fileName, Charset cs) throws IOException {
//        File file = new File(fileName);
//        FileInputStream fis = new FileInputStream(file);
//        InputStreamReader isr = new InputStreamReader(fis, cs);
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//        System.out.println("Read text file using InputStreamReader");
//        while((line = br.readLine()) != null){
//            //process the line
//            System.out.println(line);
//        }
//        br.close();
//        
//    }

    //BufferedReader
      private static void readUsingBufferedReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Read text file using BufferedReader");
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }
        //close resources
        br.close();
        fr.close();
    }

      	//Scanner Class
    private static void readUsingScanner(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");
        //read line by line
        while(scanner.hasNextLine()){
            //process each line
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    //Files Class
    private static void readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        //read file to byte array
        byte[] bytes = Files.readAllBytes(path);
        System.out.println("Read text file using Files class" + path);
        System.out.println("Using Byte ARray");
        System.out.println(new String(bytes));
        
        
        //read file to String list        
       	List<String> allLines = Files.readAllLines(path);
        System.out.println("------------------------------------");
        
        System.out.println("In List");
        System.out.println(allLines);
    }

}
