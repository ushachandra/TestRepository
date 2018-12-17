import java.util.List;
import java.util.Scanner;
public class TestProgram
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        List<String> arrTemp;
        
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of numbers:"+sum);
        //arrTemp.clear();
        average = (float)sum / n;
        System.out.println("Average of :"+ n + "of elements " +average);
        TestProgram tp = new TestProgram();
        tp.test();
        
        
    }
    
    public void test(){
    	System.out.println("Iam inside test method");
        System.out.println("This is for testing purpose");
        System.out.println("Added new line ");
    	
    }
}
