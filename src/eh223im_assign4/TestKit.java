package eh223im_assign4;

import java.io.*;
import java.net.URL;
import java.util.Random;
import java.util.UUID;

public class TestKit {

    // Histogram test (default: 100 numbers, 200 random integers);
    public void HistogramTest() throws FileNotFoundException {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < 100; i++) {
            pw.write(r.nextInt(200) + "\n");
        }

        pw.close();
    }

    public void HistogramTest(int n) throws FileNotFoundException {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < n; i++) {
            pw.write(r.nextInt(200) + "\n");
        }

        pw.close();
    }

    public void HistogramTest(int n, int bound) throws FileNotFoundException {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < n; i++) {
            pw.write(r.nextInt(bound) + "\n");
        }

        pw.close();
    }

    // CountChar test
    public void CountCharTest() throws FileNotFoundException {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);


        for (int i = 0; i < 100; i++) {
            pw.write(String.valueOf(UUID.randomUUID()));
        }

        pw.close();
    }

    public void CountCharTest(int n) throws FileNotFoundException {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);


        for (int i = 0; i < n; i++) {
            pw.write(String.valueOf(UUID.randomUUID()));
        }

        pw.close();
    }

    public void CountCharTest(URL url) throws Exception {
        File f = new File("input.txt");
        FileInputStream fis = new FileInputStream(f);
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            pw.write(inputLine);
        in.close();

        pw.close();
    }

}