package exception01;

import java.io.*;

public class FileExam {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("datarr.txt");
        FileWriter fw = new FileWriter("dataww.txt");
        int c;
        while((c = fr.read()) != -1) {
            fw.write(c);
        }
    }

