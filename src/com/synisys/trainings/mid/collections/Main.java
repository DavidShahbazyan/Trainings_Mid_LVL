package com.synisys.trainings.mid.collections;

import java.io.*;
import java.util.*;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String str;
            BufferedReader br;
            BufferedWriter bw;

            int duplicatedLineCounter = 0;
            int mergeResultsLines;

            File inputFile_1 = new File(Main.class.getResource("testResources/cain.txt").getFile());
            File inputFile_2 = new File(Main.class.getResource("testResources/john.txt").getFile());

            File outputFile_1 = new File(Main.class.getResource("testResources").getFile() + "/Merged.wordlist");

            if (outputFile_1.exists()) {
                outputFile_1.delete();
            }

            outputFile_1.createNewFile();

            List<String> file1Content = new ArrayList<>();
            List<String> file2Content = new ArrayList<>();

            br = new BufferedReader(new FileReader(inputFile_1));
            while ((str = br.readLine()) != null) {
                file1Content.add(str);
            }
            System.out.println("File1Content: " + file1Content.size());

            br = new BufferedReader(new FileReader(inputFile_2));
            while ((str = br.readLine()) != null) {
                file2Content.add(str);
            }
            System.out.println("File2Content: " + file2Content.size());

            // Using Set to prevent duplicates.
            Set<String> mergeResults = new HashSet<>(file1Content.size() + file2Content.size());
            for (int i = 0; i < file1Content.size() || i < file2Content.size(); i++) {
                if (i < file1Content.size()) {
                    if (!mergeResults.add(file1Content.get(i))) { // Will return false if item already exists.
                        duplicatedLineCounter++;
                    }
                }
                if (i < file2Content.size()) {
                    if (!mergeResults.add(file2Content.get(i))) { // Will return false if item already exists.
                        duplicatedLineCounter++;
                    }
                }
            }
            file1Content.clear();
            file2Content.clear();
            mergeResultsLines = mergeResults.size();
            System.out.println("Merge Results: " + mergeResultsLines);
            System.out.println("Duplications: " + duplicatedLineCounter);

            List<String> sortedMergeResults = new ArrayList<>(mergeResults);
            Collections.sort(sortedMergeResults, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.valueOf(o1.length()).compareTo(o2.length());
                }
            });
            System.out.println("Sorted Results: " + sortedMergeResults.size());
            mergeResults.clear();

            bw = new BufferedWriter(new FileWriter(outputFile_1));
            for (String s : sortedMergeResults) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("Result address: " + outputFile_1.getPath());
            sortedMergeResults.clear();

            br = new BufferedReader(new FileReader(outputFile_1));
            int resLines = 0;
            while ((str = br.readLine()) != null) {
                resLines++;
            }

            System.out.println("Result Lines: " + resLines);
            System.out.println("Lost Lines Quantity: " + (mergeResultsLines - resLines));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
