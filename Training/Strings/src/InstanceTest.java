
public class InstanceTest {
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+" Training";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append(" training");  
        System.out.println(sb.hashCode());  
    }  
}  