import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a Number of dates: ");
	  int n=sc.nextInt();
	  int[] date=new int[n];
	  
	  for(int i=0;i<n;i++){
	      System.out.print("Enter a date: ");
	       date[i]=sc.nextInt();
	  }
	  boolean allperfect =true;
	  
	  for(int i=0;i<date.length;i++){
	      int month=(date[i]/100)%100;
	      
	      if(month==1 || month==3 ||month==5 || month==7 || month==8 || month==10 ||
	      month==12){
	          continue;
	      }
	      else{
	          allperfect=false;
	          break;
	      }
	  }
	  if(allperfect){
	      System.out.println("Perfect Month");
	  }
	  else{
	      System.out.println("Not Perfect Month");
	  }
	  
	}
}