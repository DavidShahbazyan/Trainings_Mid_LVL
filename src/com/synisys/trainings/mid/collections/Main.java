package com.synisys.trainings.mid.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String str = "";
            BufferedReader br;
            BufferedWriter bw;

            int duplicatedLineCounter = 0;

            File file1 = new File("C:\\Users\\David Shahbazyan\\Desktop\\cain.txt");
            File file2 = new File("C:\\Users\\David Shahbazyan\\Desktop\\john.txt");

            List<String> file1Content = new ArrayList<>();
            List<String> file2Content = new ArrayList<>();

            br = new BufferedReader(new FileReader(file1));
            while ((str = br.readLine()) != null) {
                file1Content.add(str);
            }

            br = new BufferedReader(new FileReader(file2));
            while ((str = br.readLine()) != null) {
                file2Content.add(str);
            }

            Set<String> mergeResults = new HashSet<>(file1Content.size() + file2Content.size());
            for (int i = 0; i < file1Content.size() || i < file2Content.size(); i++) {
                if (i < file1Content.size()) {
                    if (!mergeResults.add(file1Content.get(i))) {
                        duplicatedLineCounter++;
                    }
                }
                if (i < file2Content.size()) {
                    if (!mergeResults.add(file2Content.get(i))) {
                        duplicatedLineCounter++;
                    }
                }
            }

            List<String> mergeResultsList = new ArrayList<>(mergeResults);
//            Collections.sort(mergeResultsList, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    return Integer.valueOf(o1.length()).compareTo(o2.length());
//                }
//            });

            bw = new BufferedWriter(new FileWriter(new File(file1.getParent() + "\\3_Merged_" + file1.getName())));
            for (String s : mergeResultsList) {
                bw.write(s);
                bw.newLine();
            }

            System.out.println("File1Content: " + file1Content.size());
            System.out.println("File2Content: " + file2Content.size());
            System.out.println("MergeResults: " + mergeResults.size() + " | Sorted: " + mergeResultsList.size());
            System.out.println("Duplications: " + duplicatedLineCounter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
