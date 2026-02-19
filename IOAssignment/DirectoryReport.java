package IOAssignment;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DirectoryReport {

    static class FileInfo  {
        Path path;
        long size;

        FileInfo(Path path, long size) {
            this.path = path;
            this.size = size;
        }

    }

    public static void main(String[] args) {

        Path startDir = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa");

        int totalFiles = 0;
        int totalDirs = 0;
        long totalSize = 0;

        List<FileInfo> files = new ArrayList<>();

        try {
            // walk recursively
            for (Path p : Files.walk(startDir).toList()) {

                if (Files.isDirectory(p)) {
                    totalDirs++;
                }
                else if (Files.isRegularFile(p)) {

                    totalFiles++;

                    long size = Files.size(p);
                    totalSize += size;

                    files.add(new FileInfo(p, size));
                }
            }

            // sort largest first
            Collections.sort(files, (a, b) -> Long.compare(b.size, a.size));
            //Collections.sort(files, (a, b) ->(long)b.size-(long)a.size);


            // prepare report
            List<String> report = new ArrayList<>();
            report.add("Total Files = " + totalFiles);
            report.add("Total Directories = " + totalDirs);
            report.add("Total Size (bytes) = " + totalSize);
            report.add("");
            report.add("Top 5 Largest Files:");

            for (int i = 0; i < 5 && i < files.size(); i++) {
                report.add((i+1) + ". " + files.get(i).path + " -> " + files.get(i).size + " bytes");
            }

            // write report
            Path reportPath = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOAssignment\\report.txt");
            Files.write(reportPath, report);

            System.out.println("Report generated successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
