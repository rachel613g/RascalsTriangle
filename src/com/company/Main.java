package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner (new File(args[0]));
            int numOfSets = scanner.nextInt();
            int iteration = 0;
            while (iteration != numOfSets){
                iteration = scanner.nextInt();
                System.out.println(iteration + " "+  Rascal(scanner.nextInt(), scanner.nextInt()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * formula derived here: https://www.maa.org/sites/default/files/Anggoro2010.pdf
     * @param row in triangle
     * @param index of the number in the row
     * @return Rascal Triangle value
     */
    public static int Rascal(int row, int index){
        return (index * (row - index)) + 1;
    }
}
