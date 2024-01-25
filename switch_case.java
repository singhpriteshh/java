import java.util.*;
class switch_case { 
  // // void sum_avg(int array[])
  //  {
  //      int sum=0;
  //      int avg=0;
  //      for(int i=0;i<array.length;i++)
  //      {
  //          sum = sum+array[i];
  //      }
  //      avg=(sum/array.length);
//
   //     System.out.println("sum=" + sum);
  //      SYstem.out.println("avg =" + avg);
  //  }

    public static void main(String[] args)
    {
       
       
        Scanner sc = new Scanner(System.in);
        int i;
        int n;
        System.out.println("enter the number of elements");
        n = sc.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the elements of an array");
        for(i=0;i<n;i++);
        {
            array[i] = sc.nextInt();
        }
        System.out.println("elements entered are:");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
