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
		    int greatest = -1;
		    int greatest2 = -1;
		    for(int i=0;i<arr.length;i++){
		        arr[i] = sc.nextInt();
		        if(greatest < arr[i])
		        greatest = arr[i];
		    }
		    for(int i=0;i<arr.length;i++){
		        if(greatest == arr[i])
		        arr[i] = -1;
		        if(greatest2 < arr[i])
		        greatest2 = arr[i];
		    }
		    System.out.println(greatest + greatest2);
		}
	}
}
