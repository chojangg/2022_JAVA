package practice;

import java.io.*;
import java.util.*;

public class suhangEx {
	   int length;
	   String[] hakbun = new String[10];
	   String[] name = new String[10];
	   double[] kor = new double[10];
	   double[] eng = new double[10];
	   double[] math = new double[10];
	   double[] total = new double[10];
	   double[] avg = new double[10];
	   String[] grade = new String[10];
	   double[] rank = {1,1,1,1,1,1,1,1,1,1};
	   
	   public void writingData(String fname) throws IOException {
	      try {
	         FileWriter fw = new FileWriter(new File(fname));
	         BufferedWriter bw = new BufferedWriter(fw);
	         bw.write("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
	         bw.write("=======================================================\n");
	         for(int j=0; j<length; j++) {
	            String kor_str=String.format("%.0f", kor[j]);
	            String eng_str=String.format("%.0f", eng[j]);
	            String math_str=String.format("%.0f", math[j]);
	            String total_str=String.format("%.0f", total[j]);
	            String avg_str=String.format("%.1f", avg[j]);
	            bw.write(hakbun[j]+"\t"+name[j]+"\t"+kor_str+"\t"+eng_str+"\t"+math_str+"\t"+total_str+"\t"+avg_str+"\t"+grade[j]+"\t"+(int)(rank[j])+"\n");
	            //bw.write(hakbun[j]+"\t"+name[j]+"\t"+kor[j]+"\t"+eng[j]+"\t"+math[j]+"\t"+total[j]+"\t"+avg[j]);
	            //bw.newLine();
	         }
	         bw.close();   
	         fw.close();
	      }catch(FileNotFoundException e) {
	         System.out.println("잘못된 파일 이름을 입력했습니다.");
	      }
	   }
	   public void readingData(String fname) throws IOException{
	      try {
	         String csvStr = "";
	         String tmpStr = "";
	         FileReader fr = new FileReader(new File(fname));
	         BufferedReader br = new BufferedReader(fr);
	         
	         do {
	            tmpStr = br.readLine();
	            if(tmpStr != null) {
	               csvStr += tmpStr+"\t";
	            }
	         }while(tmpStr != null);
	         
	         StringTokenizer parse = new StringTokenizer(csvStr,"\t");
	         length = parse.countTokens()/5;
	         for(int i=0; i<length; i++) {
	            hakbun[i]=parse.nextToken();
	            name[i]=parse.nextToken();
	            kor[i]=Double.valueOf(parse.nextToken()).doubleValue();
	            eng[i]=Double.valueOf(parse.nextToken()).doubleValue();
	            math[i]=Double.valueOf(parse.nextToken()).doubleValue();
	            total[i]=kor[i]+math[i]+eng[i];
	            avg[i]=total[i]/3.0;
	            if(avg[i] >= 90) 
	               grade[i] = "A";
	            else if(avg[i] >= 80) 
	               grade[i] = "B";
	            else if(avg[i] >= 70) 
	               grade[i] = "C";
	            else if(avg[i] >= 60) 
	               grade[i] = "D";
	            else 
	               grade[i] = "E";
	         }
	         
	         for(int i=0; i<avg.length; i++) {
	            rank[i]=1;
	            for(int j=0; j<avg.length; j++) {
	               if(avg[j]>avg[i]) rank[i]=rank[i]+1;
	            }
	         }
	      }catch(FileNotFoundException e) {
	         System.out.println("잘못된 파일 이름을 입력했습니다.");
	      }
	  }
}
