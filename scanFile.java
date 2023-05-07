/*public class scanFile {
    
    public scanFile(){

    }

}*/

import java.io. * ;
public class scanFile {
  public static final String delimiter = ",";

    public scanFile(String csvFile){
        try{
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line  = "1";
            String[] temp;
            // while((line = br.readLine())!=null){
            //     temp = line.split(delimiter);
            //     for()
            // }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
  /*public scanFile(String csvFile) {
    try {
      File file = new File(csvFile);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = " ";
      String[] tempArr;
      while ((line = br.readLine()) != null) {
        tempArr = line.split(delimiter);
        for (String tempStr: tempArr) {
          System.out.print(tempStr + " ");
        }
        System.out.println();
      }
      br.close();
    }
    catch(IOException ioe) {
      ioe.printStackTrace();
    }
  }*/

}