
public class ConcatTest {
    public static String concatWithString()    {  
        String t = "Java";  
        for (int i=0; i<1000; i++){  
            t = t + " Training";  
        }  
        return t;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<1000; i++){  
            sb.append(" Training");  
        }  
        return sb.toString();  
    }  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
    }  
}  