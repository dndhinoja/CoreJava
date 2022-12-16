package com.dn.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchingStringFromFile {

    public static int countNumberWriteWord() throws FileNotFoundException {
        int count = 0;
        Scanner scanner = new Scanner(new FileInputStream("/Users/dipalidhinoja/Documents/Core-Java-Test-1.txt"));
        while (scanner.hasNext()){
            String line = scanner.next();

            if(line.indexOf("Write")!=-1){
                System.out.println(line);
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(SearchingStringFromFile.countNumberWriteWord());
    }
}
