import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author lide
 */
public class fajiofj {
    public static void main(String[] args)throws Exception {
        try {
            Runtime runtime = Runtime.getRuntime();
            String command = "ipconfig";
            Process process = runtime.exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}
