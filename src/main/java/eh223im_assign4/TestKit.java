package eh223im_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import static eh223im_assign4.TestKit.Mode.NULL;

public class TestKit {

    // Histogram test (default: 100 numbers, 200 random integers); using method overloading
    public void HistogramTest() throws FileNotFoundException {
        File f = new File("input.txt");
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < 100; i++) {
            pw.write(r.nextInt(200) + "\n");
        }

        pw.close();
    }
    public void HistogramTest(int n) throws FileNotFoundException {
        File f = new File("input.txt");
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < n; i++) {
            pw.write(r.nextInt(200) + "\n");
        }

        pw.close();
    }
    public void HistogramTest(int n, int bound) throws FileNotFoundException {
        File f = new File("input.txt");
        Random r = new Random();
        PrintWriter pw = new PrintWriter(f);

        for (int i = 0; i < n; i++) {
            pw.write(r.nextInt(bound) + "\n");
        }

        pw.close();
    }

    // CountCharTest (), using optional parameters
    enum Mode {
        ASCII, WEBPAGE, FILE, UNICODE, ALPHANUMERIC, PARAGRAPH, NULL
    }

    Mode mode;

    public void CountCharTest(Mode mode, Object n) throws Exception {
        File f = new File("input.txt");
        PrintWriter pw = new PrintWriter("temp.txt");

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String print = "\r\n\t ";

        mode = (mode == null) ? NULL : mode;

        switch (mode) {
            case ASCII:
                try {
                    n = Integer.parseInt(n.toString()) ;
                } catch (Exception e) {
                    n = 100;
                }
                for (int i = 0; i < Integer.parseInt(n.toString()); i++) {
                    pw.write(new Random().nextInt(127));
                }
                break;

            case WEBPAGE:
                try {
                    new URL(n.toString()).openStream();
                } catch (Exception e) {
                    System.out.println("Invalid URL, using http://homepage.lnu.se/staff/jlnmsi/java1/HistoryOfProgramming.txt instead.");
                    n = "http://homepage.lnu.se/staff/jlnmsi/java1/HistoryOfProgramming.txt";
                }
                URL url = new URL(n.toString());
                ReadableByteChannel rbc = Channels.newChannel(url.openStream());
                new FileOutputStream("temp.txt").getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                break;

            case FILE:
                n = Files.notExists(Paths.get(n.toString())) ? "input.txt" : n.toString();
                Files.copy(Paths.get(n.toString()),Paths.get("temp.txt"),StandardCopyOption.REPLACE_EXISTING);
                break;

            case UNICODE:
                try {
                    n = Integer.parseInt(n.toString()) ;
                } catch (Exception e) {
                    n = 100;
                }
                for (int i = 0; i < Integer.parseInt(n.toString()); i++) {
                    pw.write(new Random().nextInt(Character.MAX_VALUE));
                }
                pw.println();
                break;

            case ALPHANUMERIC:
                try {
                    n = Integer.parseInt(n.toString()) ;
                } catch (Exception e) {
                    n = 100;
                }
                StringBuilder alphanumeric = new StringBuilder();
                alphanumeric.append(upper).append(lower).append(number);
                for (int i = 0; i < Integer.parseInt(n.toString()); i++) {
                    pw.write(alphanumeric.toString().charAt(new Random().nextInt(alphanumeric.length())));
                }
                break;

            case PARAGRAPH:
                try {
                    n = Integer.parseInt(n.toString()) ;
                } catch (Exception e) {
                    n = 100;
                }
                String paragraph = (upper)+(lower)+(number)+(print);
                for (int i = 0; i < Integer.parseInt(n.toString()); i++) {
                    pw.write(paragraph.charAt(new Random().nextInt(paragraph.length())));
                }
                break;

            default:
                if (Files.notExists(Paths.get("input.txt"))) {
                    Files.createFile(Paths.get("input.txt"));
                } else {
                    Files.copy(Paths.get("input.txt"),Paths.get("temp.txt"),StandardCopyOption.REPLACE_EXISTING);
                }
                break;
        }
        pw.close();
        Files.copy(Paths.get("temp.txt"),Paths.get("input.txt"),StandardCopyOption.REPLACE_EXISTING);
        Files.delete(Paths.get("temp.txt"));
    }

    // Stack? Too hard, can't write the test kit for that.
}
/*
This part is just for fun. Creativity rules.
Some ideas adopted from stackoverflow, otherwise javadocs & apache-commonnet
*/
