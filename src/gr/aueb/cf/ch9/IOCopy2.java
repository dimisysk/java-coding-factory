package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy2 {

    public static void main(String[] args) {
        int b;
        int count = 0;
        long start;
        long end;
        double elapsedTime;
        byte[] buf = new byte[8192];

        try (FileInputStream in =  new FileInputStream("C:\\Users\\syska\\temp\\video.mp4");
        FileOutputStream out = new FileOutputStream("C:\\Users\\syska\\temp\\ video-out.mp4")) {

        start = System.nanoTime();

        while ((b = in.read(buf)) != -1) {
            out.write(buf, 0, b);
            count += b;
        }

        end = System.nanoTime();
        elapsedTime = (end - start) / 1_000_000_000.0;
            System.out.printf("Το αρχείο με μέγεθος %d KBytes (%d bytes) αντιγράφηκε \n", count / 1024, count);
            System.out.printf("Elapsed Time: %.2f seconds",elapsedTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
