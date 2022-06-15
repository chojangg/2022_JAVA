package practice;

import java.io.IOException;

public class suhangExMain {
   public static void main(String[] args) {
      suhangEx wd = new suhangEx();
      try {
         wd.readingData("C:/Temp/sung_read.txt");
         wd.writingData("C:/Temp/sung_write.txt");
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}