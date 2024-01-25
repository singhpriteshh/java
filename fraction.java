import java.util.*;

public class fraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in decimal");
        String decimal = sc.nextLine();
        int indexOfdecimal = decimal.indexOf(".");
        String s1 = decimal.substring(0,indexOfdecimal);
        String s2 = decimal.substring(indexOfdecimal+1,decimal.length());
        
        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println(""+s1+s2+"/"+""+(int)(Math.pow(10,12)));
    }
    
}
