/**
 *  Name: Samuel Adams Adjin
 */

public class MegaBytes {

    public static void printMegaBytesAndKiloBytes(int kilobyte) {

        System.out.println(kilobyte < 0? "Invalid Value": kilobyte + " KB = "
                + kilobyte/1024 + " MB and " + kilobyte % 1024 + " KB");

    }


}
