package StudentRegistrationSystem;
 
import java.util.ArrayList;
 
public class Module {           
	private String name;
   	private String ID;
   	private ArrayList<Student> students;
   	private ArrayList<CourseProgramme> courses;
  
   		//Constructors
       public Module(String name, String ID){
          this.setName(name);
          this.setID(ID);
          this.students = new ArrayList<Student>();
          this.courses = new ArrayList<CourseProgramme>();
       }
       
       public Module(String name, String ID, ArrayList<Student> students, ArrayList<CourseProgramme> courses){
           this.setName(name);
           this.setID(ID);
           this.students = students;
           this.courses = courses;
        }
      
       public void addStudents(Student student) {
    	  student.addModule(this);
          this.students.add(student);
       }
      
       public void addCourse(CourseProgramme course) {
          this.courses.add(course);
       }
 
       public String getName() {
          return name;
       }
 
       public void setName(String name) {
          this.name = name;
       }
 
       public String getID() {
          return ID;
       }
 
       public void setID(String iD) {
          ID = iD;
       }
 
       public ArrayList<Student> getStudents() {
          return students;
       }
 
       public void setStudents(ArrayList<Student> students) {
          this.students = students;
       }
 
       public ArrayList<CourseProgramme> getCourses() {
          return courses;
       }
 
       public void setCourses(ArrayList<CourseProgramme> courses) {
          this.courses = courses;
       }
      
       public String toString() {
    	   String studentStr = " ";
    	   String courseStr = " ";
    	   for(int i=0; i< students.size(); i++) {
    		   studentStr += "| " + students.get(i).getName() + " |";
    	   }
    	   
    	   for(int i=0; i< courses.size(); i++) {
    		   courseStr += "| " + courses.get(i).getName() + " |";
    	   }
    	   
           return "Module: " + getName() + "\n" + "ID: " + getID() + "\n" + "Students: " + studentStr + 
            		  "\n" + "Courses: " + courseStr + "\n";
       }
}