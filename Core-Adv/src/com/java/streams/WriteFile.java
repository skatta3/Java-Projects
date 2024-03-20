package com.java.streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {
    /**
     * This class shows how to write file in java
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) {
        String data = "--writeUsingFileWriter----I will write this String to File in Java";
//        String data = "Testing the File Writer class to write into Java";
        int noOfLines = 10;
        
        String fileSeparator = System.getProperty("file.separator");
      	String fileName = "C:" + fileSeparator+"users"+fileSeparator+"skatt"+fileSeparator+"files"+fileSeparator+"Testwrite.txt";
      	
 //       writeUsingFileWriter(data,fileName);
//        
 //       writeUsingBufferedWriter(data, noOfLines,fileName);
//        
//        writeUsingFiles(data,fileName);
        
        writeUsingOutputStream(data,fileName);
        System.out.println("DONE");
    }

    /**
     * Use Streams when you are dealing with raw data
     * @param data
     */
    public static void writeUsingOutputStream(String data, String fileName) {
    	  
        OutputStream os = null;
        try {
            os = new FileOutputStream(fileName,true); //append the text with true
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Use Files class from Java 1.7 to write files, internally uses OutputStream
     * @param data
     */
    private static void writeUsingFiles(String data,String filename) {
        try {
            Files.write(Paths.get(filename), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Use BufferedWriter when number of write operations are more
     * It uses internal buffer to reduce real IO operations and saves time
     * @param data
     * @param noOfLines
     */
    private static void writeUsingBufferedWriter(String data, int noOfLines,String filename) {
        File file = new File(filename);
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Use FileWriter when number of write operations are less
     * @param data
     */
    private static void writeUsingFileWriter(String data, String filename) {
        File file = new File(filename);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
