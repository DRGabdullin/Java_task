import java.io.*;
public class program_two {
    public static int x = 0;
    public static int y = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        int i = 0;
        while ((str = br.readLine()) != null) {
            System.out.printf("%s\n", str);
            String s = str;        
            String s1=s.replaceAll("[^0-9]+", "");
            if(i==0){
                x = Integer.parseInt (s1.trim ());
            }
            else if(i==1) {
                y = Integer.parseInt (s1.trim ());
            }
            else{
                System.out.printf("В списке больше двух строк");
            }
            i++;         
        }
        //System.out.println(x+y);
        double z = Math.pow(x, y);
        String total = String.valueOf(z);
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(total);
            fileWriter.flush();
        }
    br.close();
    }
}

