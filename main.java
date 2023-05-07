import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class main {


public static void main(String[]args) throws Exception {

//scanFile one = new scanFile();
//System.out.println("Check");

//String csvFile = "C:/Users/Timur Abdurakhmanov/Desktop/CSCI 330 Operating Systems Spring 2023/CPUSche";
    //scanFile one = new scanFile(csvFile);

     //System.out.println(one);
        Scanner scan = new Scanner(System.in);
        ArrayList<process> proc = new ArrayList<process>();
        Integer amt = 0;
        String name = "";
        String arTime = "";
        String brTime = "";
        //Ask for the path to the file, ask if wanted to check all the files which will run through
        //all the files and outprint them to see if loaded correctly

        //System.out.println("How many processes would you like to add?");
        //amt = scan.nextInt();
        //int k = 0;
        //while(k<amt){
        //System.out.println("Hi! Would you like to input a process? Y/N");
        //String temp = scan.nextLine();
        //if(temp.toLowerCase().equals("n")){
        //    break;
        //}
        //else{
        //System.out.println("Please enter the name of the process:");
        //name = scan.nextLine();
        //System.out.println("Please enter the arrival time of the process:");
        //arTime = scan.nextInt();
        //System.out.println("Please enter the burst time of the process:");
        //brTime = scan.nextInt();
        //proc.add(new process(name,arTime,brTime));
        
        //k++;
        
        //}

       // }
        /*System.out.println("Broke out of the loop");
        for(int i = 0; i<proc.size(); i++){
            System.out.println(proc.get(i));
        }*/

        Scanner sc = new Scanner(new File("CPUSche.csv"));
        sc.useDelimiter("[,\n]");
        while(sc.hasNext()) {

            name = sc.next();
            arTime = sc.next();
            brTime = sc.next().substring(0, 1);
            System.out.print(name);
            System.out.print(arTime);
            System.out.print(brTime);
            System.out.println();
            proc.add(new process(name,Integer.parseInt(arTime),
            Integer.parseInt(brTime)));
        }
        //sc.close();
        // for(int i = 0;i<proc.size();i++){
        //     proc.get(i).getName();
        //     proc.get(i).getArTime();
        //     proc.get(i).getBrTime();
        // }
        System.out.println("Please enter the time quantum:");
        int quant = scan.nextInt();

        CPUScheduler cpu = new CPUScheduler(proc, quant);




    }


}