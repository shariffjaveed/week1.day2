package week1.day2;
import java.util.Arrays;
public class MissingElements {
	    public static void main( String args[] )
	    {
	        int numbers[]={9,6,4,5,7,0,1};//0,1,4,5,6,7,9
	        Arrays.sort(numbers);
	        int i=1;	        
	        while ( i < numbers.length )//1<7->condition true
	        {
	            if ( numbers[i] - numbers[i-1] == 1 )//1-0==1//true
	            	//
	            {
	            }
	            else
	            {
	                System.out.println( "Missing number is " + ( numbers[i-1] + 1 ) );
	            }
	            i++;
	        }
	    }
	}



