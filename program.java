
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int total=row*col;
		int[] arr=new int[total];
		for(int i=0;i<total;i++){
			arr[i]=s.nextInt();
		}
		int r=s.nextInt();
		int count=0,num=0;
		int[] counted=new int[total];
		for(int i=0;i<total;i++){
			count=0;
			int val=arr[i];
			if(!(Arrays.stream(counted)
				.anyMatch(x -> x == val)))
			{
			counted[num++]=arr[i];
			for(int j=0;j<total;j++){
				if(arr[i]==arr[j]){
					count=count+1;
				}
				}
			}
			if(count==r){
				System.out.println(arr[i]);
			}
			
		}
	}
}