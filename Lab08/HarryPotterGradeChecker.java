
public class HarryPotterGradeChecker{
   public static void main (String[] args){
      checkGrade('A');
      checkGrade('O');
      checkGrade('T');
      checkGrade('D');
      checkGrade('X');
   }
/** Takes a grade and reports whether it is a pass, fail or
not recognisable*/
   public static void checkGrade(char grade){
      switch(grade){
         case 'O':
         case 'E':
         case 'A':
            System.out.println("Pass");
            break;
         case 'P':
         case 'D':
         case 'T':
            System.out.println("Fail");
            break;
         default: //if the char stored in grade is not listed as a case, this will apply
            System.out.println("That is not a recognisable grade.");
      }
   }
}
