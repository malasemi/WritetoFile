package edu.cscc;

import java.io.*;

public class Main {
    private static String FILEPATH = "c:/Users/Public/myfile.txt";
    private static final String[] sArray = {
            "This is the first line.",
            "This is the second line.",
            "This is the third line.",
            "This is the fourth line.",
            "This is the fifth line.111"
    };

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File(FILEPATH)));

            for (String line : sArray) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Successfully wrote to the file:  "+FILEPATH);
        } catch (FileNotFoundException ex) {
            System.out.println("Error opening file " + FILEPATH + ": " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error processing file " + FILEPATH + ": " + ex.getMessage());
        } finally {
            if (bw != null){
                bw.flush();
                bw.close();
            }
        }
    }
}