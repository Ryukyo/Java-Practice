public class printMegaBytesAndKiloBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int MegaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
