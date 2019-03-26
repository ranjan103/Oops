import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
public class First{
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);
        String str = input.next();
        File file = new File(str);
        Path path =FileSystems.getDefault().getPath("",str);
        FileReader in = null;
        System.out.println("File Existence:"+file.exists());
        System.out.println("Read Permission:"+Files.isReadable(path));
        System.out.println("Write Permission:"+Files.isWritable(path));
        in = new FileReader(str);
        int t=0,c;

        while((c=in.read())!=-1&& file.exists())
        {
            t++;
            //System.out.println(char(c));
        }
        System.out.println("No.of Characters in file are:"+t);
        char d;
        boolean flag = false;
        System.out.println("File Extension:");
        for(int i=0;i<str.length()&&file.exists();i++)
        {
            if((str.charAt(i))=='.' || flag){
                flag=true;
                System.out.println(str.charAt(i));
            }
        }
    }
}
