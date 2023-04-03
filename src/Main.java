import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan source:");
        String source = scanner.nextLine();
        System.out.println("Nhap duong dan dich: ");
        String target = scanner.nextLine();
        File fileSource = new File(source);
        File fileTarget = new File(target);
copyFile(fileSource, fileTarget);
    }
    public static void copyFile(File source,File target ){
        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(target);
            byte[] noiDung = new byte[1000];
            int length;
            while ((length= is.read(noiDung))>0){
                os.write(noiDung, 0, length);
            };


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}