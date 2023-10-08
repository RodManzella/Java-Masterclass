package sectionChallenges;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = 0, remainingKb = 0;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            megaBytes = kiloBytes / 1024;
            remainingKb = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKb+ " KB" );
        }
        
    }
}
