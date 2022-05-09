class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    int countU=0;
		    int countD=0;
		    char charr[] = s.toCharArray();
		    for(int i=0;i<s.length()-1;i++){
		        for(int j=i+1;j<s.length();j++){
		            if(charr[i] != charr[j]){
		                if(charr[i] == 'U')
		                countU++;
		                else
		                countD++;
		                i=j-1;
		                break;
		            }
		        }
		    }
		    if(charr[charr.length-1] == 'U')
		    countU++;
		    else
		    countD++;
		    
		    System.out.println(Math.min(countD,countU));
		}
	}
}
