# ArrayRepeated
import java.util.Scanner;

public class Asd
{
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
  		int len=sc.nextInt();
  		int a[]=new int[len];
  		for(int i=0;i<len;i++){
  			a[i]=sc.nextInt();
  		}
	for(int i=0;i<a.length;i++){
		int b=a[i];
		for(int j=0;j<a.length;j++){
			int temp=a[j];
			if(i!=j){
			if(b==temp){
				System.out.println(temp);
			}
			}
		}
	}
	}
}
