public class SwitchCase {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
       char grade = 'A';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
             System.out.println("Good!"); 
             break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
            break;
         default :
            System.out.println("Invalid grade");
            break;
      }
      System.out.println("Your grade is " + grade);
      
      
//   if(grade == 'A') {
//       System.out.println("Excellent!"); 
//   } else if(grade == 'B') {
//        System.out.println("Good!"); 
//   } else if(grade == 'C') {
//       System.out.println("Well done");
//   } else if(grade == 'D') {
//       System.out.println("You passed");
//   } else {
//       System.out.println("Invalid grade");
//   }
//   
   
   }
}