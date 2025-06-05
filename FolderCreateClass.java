import java.util.*;

class Folder {
    private LinkedHashMap<String, List<String>> fileMap = new LinkedHashMap<>();
    private List<String> order = new ArrayList<>();

    public void addFile(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index == -1) return;

        String name = fileName.substring(0, index);
        String extension = fileName.substring(index);

        if (!fileMap.containsKey(extension)) {
            fileMap.put(extension, new ArrayList<>());
            order.add(extension);
        }
        fileMap.get(extension).add(name);
    }

    public void printStatus() {
        List<String> sortedExtensions = new ArrayList<>(fileMap.keySet());
        Collections.sort(sortedExtensions);

        for (String ext : sortedExtensions) {
            System.out.print(ext + " -");
            for (String name : fileMap.get(ext)) {
                System.out.print(" " + name);
            }
            System.out.println();
        }
    }
}
/*
   Create Class And Store the Same File Extension and Sort and Print The File in Each Folder in The Orded */
