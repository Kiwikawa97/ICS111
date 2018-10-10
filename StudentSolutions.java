public class StudentSolutions{
      //Declare variables String fName, String lName
      //int id and double gpa
      String fName;
      String lName;
      int id;
      double gpa;
      public StudentSolutions(String fName, String lName, int id, double gpa/*insert fields for constructor*/){
      //Store variables from constructor argument into local variables
      this.fName = fName;
      this.lName = lName;
      this.id = id;
      this.gpa = gpa;
   }
   //create setter and getter methods for fName
   public void setfName(String fName){
      this.fName = fName;
   }
   public String getfName(){
      return fName;
   }
   //create setter and getter methods for lName
   public void setlName(String lName){
      this.lName = lName;
   }
   public String getlName(){
      return lName;
   }
   //create setter and getter methods for id
   public void setID(int id){
      this.id = id;
   }
   public int getID(){
      return id;
   }
   //create setter and getting methods for gpa
   public void setGPA(double gpa){
      this.gpa = gpa;
   }
   public double getGPA(){
      return gpa;
   }
   //create toString method that will print out all value
   public String toString(){
      String result = id + " " + fName + " " + lName + " " + gpa;
      return result;
   }
}