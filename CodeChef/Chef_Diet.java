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
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		    
		    int sum=0;
		    int store=0;
		    int count=0;
		    for(int i=0;i<n;i++){
		        sum = arr[i] + store;
		        if(sum - k >= 0){
		            store = sum - k;
		            count = -1;
		        }
		        else{
		            System.out.println("NO" + " " + (i+1));
		            count=0;
		            break;
		        }
		    }
		    if(count == -1)
		    System.out.println("YES");
		}
	}
}
