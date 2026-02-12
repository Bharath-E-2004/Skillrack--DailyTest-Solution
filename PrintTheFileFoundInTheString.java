import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] parts = input.split("\\\\n");
        Map<Integer, String> map = new HashMap<>();

        boolean fileFound = false;

        for (String part : parts) {

            int depth = 0;

            // Count number of \t
            while (part.startsWith("\\t")) {
                depth++;
                part = part.substring(2);
            }

            // If depth is 0, it's root
            if (depth == 0) {
                map.put(0, part);
            } else {
                String parentPath = map.get(depth - 1);
                String fullPath = parentPath + "\\" + part;
                map.put(depth, fullPath);
            }

            // If it contains ".", it is a file
            if (part.contains(".")) {
                System.out.println(map.get(depth));
                fileFound = true;
            }
        }

        if (!fileFound) {
            System.out.println(-1);
        }
    }
}

/*
The program must accept a string S representing a file system as the input. The program must print the absolute path to each file in the given file system. If there is no file, then the program must print -1 as the output. The string S contains the names of the directories, sub-directories and files, where \n and \t are used to indicate the difference between the directories and sub-directories.

Boundary Condition(s): 8 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format: The line(s), each contains the absolute path to the file or the first line contains -1.

Example Input/Output 1:

Input:

MyDir\n\tPhotos\n\t\tmyphoto.jpeg\n\t\tMiniProject\n\tDocuments\n\t\tIDProof\n\t\t\tMyAadhaar.

Output MyDir\Photos\myphoto.jpeg MyDir Documents\IDProof\MyAadhaar.pdf

Explanation:

The given file system is

MyDir

-> Photos

-> myphoto.jpeg

MiniProject

Documents

-> -> IDProof

->->-> MyAadhaar.pdf

Example Input/Output 2:

Input: Hector\n\tAndroid\n\tJava\n\t\tNetBeans\n\t\tEclipse\n\tCodeBlocks\n\t\tSampleProject\n\tGeany

Output:

-1
*/
