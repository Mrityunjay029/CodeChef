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
		    int arr[] = new int[n];
		    int min=999999999;
		    int lcm=0; 
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        if(min>arr[i])
		        min=arr[i];
		    }
		    for(int i=1;i<=min;i++){
		        for(int j=0;j<arr.length;j++){
		            if(arr[j]%i==0)
		            lcm = i;
		            else{
		                lcm=1;
		                break;
		            }
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(i!=n-1)
		        System.out.print(arr[i]/lcm + " ");
		        else
		        System.out.print(arr[i]/lcm);
		    }
		    System.out.println("");
		}
	}
}
