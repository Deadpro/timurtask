import java.util.ArrayList;

import javax.management.QueryEval;

import java.util.*;
public class CPUScheduler {

    public ArrayList<process> proc;
    public Integer quantum;
    public Integer timer;
    public ArrayList<process> destroyed;
    
    public CPUScheduler(ArrayList<process> proc, Integer quantum){
        this.proc = proc;
        this.quantum = quantum;
        destroyed = proc;
        timer = 0;
        System.out.print("Proc size: " + proc.size());
        System.out.println();
        // error here:
        runCPU();
    }

    public void runCPU(){
        Integer latest = 0;
        int current = 0;
        ArrayList <Integer> queue = new ArrayList<Integer>();
        for(int i = 0; i < proc.size(); i++){
            System.out.print("Proc current arTime: " + proc.get(current).getArTime());
            System.out.println();
            System.out.print("> Proc arTime: " + proc.get(i).getArTime());
            System.out.println();
            System.out.print("Current: " + current);
            System.out.println();
            if(proc.get(current).getArTime() > proc.get(i).getArTime()){
                // This is not working at all
                // Current is always a 0
                System.out.print("Proc current arTime: " + proc.get(current).getArTime());
                System.out.println();
                System.out.print("> Proc arTime: " + proc.get(i).getArTime());
                System.out.println();
                current = i;
                System.out.print("Current: " + current);
                System.out.println();
            }
        }
        /*for(int j = 0; j<destroyed.size();j++){
            
            for(int k = 0; k<destroyed.size();k++){
                if()
            }

        }*/
        while(true){

            //How a process gets selected to process?
            /*
             * Nothing else is processing right now
             * Ran out of time
             * Done processing
             * If another process
             * Virtual queue using ArrayList
             */
            //for(int j = 0; j<proc.size(); j++){
            //    if(proc(i).getArTime)
            //}
            if(proc.get(current).getBrTime()==0){
                current = queue.get(0);
            }
            for(int i = 0; i<proc.size(); i++){
                if(timer == proc.get(i).getArTime()){
                    queue.add(i);
                }
            }
            if(timer%quantum==0){
                // Timer is always a Zero
                System.out.print("Timer 111: " + timer);
                System.out.println();
                if(queue.isEmpty())
                    System.out.print("Queue is empty: " + queue.size());
                System.out.println();
                System.out.print("Queue Size: " + queue.size());
                System.out.println();
                current = queue.get(0);
                queue.remove(0);
                queue.add(current);
            }
            // The code that follows does not work at all
            System.out.print("Timer 222: " + timer);
            System.out.println();

            proc.get(current).changeBrTime();

            timer++;
            System.out.print("Timer 333: " + timer);
            System.out.println();

            
            Integer tempInt = 0;
            for(int l = 0; l<proc.size();l++){
                if(proc.get(l).getBrTime()>0){
                    tempInt++;
                }
            }
            if(tempInt==0){
                break;
            }
        }

        for(int l = 0; l<proc.size();l++){
            proc.get(l).comTime();
        }
    }





}
