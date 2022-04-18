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
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int greatest = -1;
		    int sum = 0;
		    int arr[] = new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0;i<=arr.length-k;i++){
		        for(int j=i;j<i+k;j++){
		            sum+=arr[j];
		        }
		        if(greatest < sum)
		        greatest = sum;
		        sum = 0;
		    }
		    System.out.println(greatest);
		}
	}
}
