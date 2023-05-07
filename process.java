import java.util.ArrayList;
import java.util.*;
public class process {
    public Integer arTime;
    public Integer brTime;
    public Integer initialBrTime;
    public String name;

    public Integer comTime;

    public process(String name, Integer arTime, Integer brTime){
        this.name = name;
        this.arTime = arTime;
        this.brTime = brTime;
        initialBrTime = brTime;
    }

    //Geter
    public String getName(){
        return name;
    }
    public int getArTime(){
        return arTime;
    }
    public int getBrTime(){
        return brTime;
    }
    public int getInitialBrTime(){
        return initialBrTime;
    }
    //Mutators
    public void changeBrTime(){
        brTime--;
    }

    public void comTime(){
        System.out.println(name + " with completed time at " + comTime);
    }

}
