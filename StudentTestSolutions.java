public class StudentTestSolutions{
   public static void main(String[] args){
      //create Student object
      StudentSolutions student = new StudentSolutions("John", "Deere", 3421, 3.4);
      //print out each property of the student object
      System.out.println(student.getfName());
      System.out.println(student.getlName());
      System.out.println(student.getID());
      System.out.println(student.getGPA());
      //modify the student object
      student.setfName("Jane");
      student.setlName("Doe");
      student.setID(31245);
      student.setGPA(3.2);
      //print modified student object using toString method
      System.out.println("\n" + student.toString());
   }
}