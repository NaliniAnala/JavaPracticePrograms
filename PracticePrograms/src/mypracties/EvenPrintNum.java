package mypracties;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EvenPrintNum
{
    public static void main(String s[])
    {
    	int i;
        int result;
        
    	 for(i=1;i<=50;i++)
    		{
    			result = i%2;
    			
    			if(result == 0)
    			{
    				System.out.println(i);
    			}
    		}
    	 
    	 

    }
   
}
