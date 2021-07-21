public class TryCatch {  
	  
    public static void main(String[] args) {  
        int i=25;  
        int j=0;  
        int k;  
        try  
        {  
        k=i/j;   
        }  
        catch(Exception e)  
        {  
            System.out.println(i/(j+2));  
        }  
    }  
}  