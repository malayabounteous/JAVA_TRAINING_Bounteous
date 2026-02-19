package IOAssignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LogProcess {
    public static void main(String[] args) throws IOException {

        Path logPath = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOAssignment\\application.log");

        List<String> logs = List.of(
                "INFO Application started",
                "INFO User logged in",
                "WARN Disk space low",
                "ERROR Database connection failed",
                "INFO Processing request",
                "ERROR Null pointer exception",
                "WARN Memory usage high",
                "INFO Application stopped"
        );

        Files.write(logPath, logs);

        // Counters
        int infoCount = 0;
        int warnCount = 0;
        int errorCount = 0;

        //  Read file 
        List<String> allLines = Files.readAllLines(logPath);

        List<String> errorLines = new ArrayList<>();

        for (String line : allLines) {

            if (line.contains("INFO"))
                infoCount++;

            else if (line.contains("WARN"))
                warnCount++;

            else if (line.contains("ERROR")) {
                errorCount++;
                errorLines.add(line); // collect error lines
            }
        }

        //  Write error.log
        Path errorPath = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOAssignment\\error.log");
        Files.write(errorPath, errorLines);

        //  Write summary.txt
        List<String> summary = List.of(
                "INFO = " + infoCount,
                "WARN = " + warnCount,
                "ERROR = " + errorCount
        );

        Path summaryPath = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOAssignment\\summary.txt");
        Files.write(summaryPath, summary);

        System.out.println("Processing completed successfully.");
    }
}
