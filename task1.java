import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
        System.out.print("Enter a NUmber: ");
        int num = sc.nextInt();
        
        int louisDigits =0;
        int ankoDigits =0;
        
        while(num>0){
            int last =num%10;
            if(last == 1 ||last== 3 || last==6 ||last== 8 ||last==0){
                louisDigits = louisDigits + last;
            }
            else{
                ankoDigits = ankoDigits + last;
            }
            num = num/10;
        }
        int diff;
        if(louisDigits>ankoDigits){
            diff = louisDigits-ankoDigits;
        }
        else{
            diff= ankoDigits-louisDigits;
        }
        System.out.println( diff);
        
        
      
      
       
        
      
	    
	 
	                
	             
	   
	}
}
