import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int b = sc.nextInt();
	        int greatest = -1;
	        while(n-->0){
	            int arr[] = new int[3];
	            for(int i=0;i<3;i++){
	                arr[i] = sc.nextInt();
	            }
	            if(arr[2] <= b && greatest < arr[0]*arr[1]){
	                greatest = arr[0]*arr[1];
	            }
	        }
	        if(greatest == -1)
	        System.out.println("no tablet");
	        else
	        System.out.println(greatest);
	    }
	}
}
