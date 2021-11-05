import java.io.*;
import java.util.*;

public class StateResearch {

  public static void main (String [] args) throws FileNotFoundException{
    Scanner sc = new Scanner (new File("Ohio.csv"));
    sc.useDelimiter(",");
    sc.nextLine(); //the first line is different so I want to skip that one to start

    String sept = "September";
    String may = "May";
    int startSept = 14;
    int startMay = 15;
    char septNum = '9';
    char mayNum = '5';
    percentMonth("Ohio.csv", sept, startSept, septNum);
    percentMonth("Ohio.csv", may, startMay, mayNum);
    percentMonth("Alabama.csv", sept, startSept, septNum);
    percentMonth("Alabama.csv", may, startMay, mayNum);


  }

  public static void percentMonth (String pathname, String month, int start, char monthNum) throws FileNotFoundException{
    Scanner sc = new Scanner (new File(pathname));
    double totalIP = 0;
    double totalV = 0;
    double totalH = 0;
    double total = 0;
    int timeStart = start;
    int curType = 16;
    String cur = "";
    String [] nextLine = new String [29];
    while(sc.hasNextLine()){
      nextLine = sc.nextLine().split("," , 0);
      if (nextLine[timeStart].charAt(0) == monthNum){
        cur = nextLine[curType];
        if (cur.equals("Virtual")){
          totalV ++;
        }
        else if (cur.equals("Hybrid")){
          totalH ++;

        }
        else if (cur.equals("In-person")){
          totalIP ++;
        }
        else {
          continue;
        }
        total = totalV + totalH + totalIP;
      }
    }
      double pH = 0.0;
      double pV = 0.0;
      double pIP = 0.0;
      pH = totalH/total;
      pH = pH * 100;
      pV = totalV/total;
      pV = pV * 100;
      pIP = totalIP/total;
      pIP = pIP * 100;
      System.out.println("Percent in-person in " + month + " in " + pathname + " : " + pIP + "%");
      System.out.println("Percent virtual in " + month + " in " + pathname + " : " + pV + "%");
      System.out.println("Percent hybrid in " + month + " in " + pathname + " : " + pH + "%");
    }

  // public static void percentMay (String pathname) throws FileNotFoundException{
  //   Scanner sc = new Scanner (new File(pathname));
  //   double totalIP = 0;
  //   double totalV = 0;
  //   double totalH = 0;
  //   double total = 0;
  //   int timeStart = 15;
  //   int curType = 16;
  //   String cur = "";
  //   String [] nextLine = new String [29];
  //   while(sc.hasNextLine()){
  //     nextLine = sc.nextLine().split("," , 0);
  //     if (nextLine[timeStart].charAt(0) == '5'){
  //       cur = nextLine[curType];
  //       if (cur.equals("Virtual")){
  //         totalV ++;
  //       }
  //       else if (cur.equals("Hybrid")){
  //         totalH ++;
  //
  //       }
  //       else if (cur.equals("In-person")){
  //         totalIP ++;
  //       }
  //       else {
  //         continue;
  //       }
  //       total = totalV + totalH + totalIP;
  //     }
  //   }
  //     double pH = 0.0;
  //     double pV = 0.0;
  //     double pIP = 0.0;
  //     pH = totalH/total;
  //     pH = pH * 100;
  //     pV = totalV/total;
  //     pV = pV * 100;
  //     pIP = totalIP/total;
  //     pIP = pIP * 100;
  //     System.out.println("Percent in-person in May in " + pathname + " : " + pIP + "%");
  //     System.out.println("Percent virtual in May in " + pathname + " : " + pV + "%");
  //     System.out.println("Percent hybrid in May in " + pathname + " : " + pH + "%");
  //   }



}
