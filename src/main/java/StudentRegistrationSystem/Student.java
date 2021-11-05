package StudentRegistrationSystem;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;
 
public class Student {
    private String name;
    private int age;
    private int ID;
    private DateTime dob;
    private String username;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;
   
    private static int numStudents;
   
    DateTime now = DateTime.now();
    //Constructor
    public Student(String name, DateTime dob){
        this.setName(name);
        this.setDob(dob);
        this.age = new Period(dob, now).getYears();
        Student.numStudents++;
        this.ID = Student.numStudents;
        this.modules = new ArrayList<Module>();
        this.courses = new ArrayList<CourseProgramme>();
    }
    
    public Student(String name, DateTime dob, ArrayList<CourseProgramme> course, ArrayList<Module> module){
        this.setName(name);
        this.setDob(dob);
        this.age = new Period(dob, now).getYears();
        Student.numStudents++;
        this.ID = Student.numStudents;
        this.modules = module;
        this.courses = course;
    }
   
    //Getting the Username of the student
    //Removing whitespace in Username
    public String getUsername(){
        username = name + age;
        username = username.replaceAll("\\s+","");
        return username;
    }
   
    public void addCourse(CourseProgramme course) {
    	course.addStudents(this);
    	this.courses.add(course);
    }
               
    public void addModule(Module modules) {
        this.modules.add(modules);
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setID(int ID) {
        this.ID = ID;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setCourse(ArrayList<CourseProgramme> course) {
        this.courses = course;
    }
 
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public int getID() {
        return ID;
    }
 
    public ArrayList<CourseProgramme> getCourse() {
        return courses;
    }
 
    public ArrayList<Module> getModules() {
        return modules;
    }
 
    public DateTime getDob() {
    	return dob;
    }
 
    public void setDob(DateTime dob) {
    	this.dob = dob;
    }
               
    public String ToString() {
    	String moduleStr = " ";
    	String courseStr = " ";
 	   for(int i=0; i< modules.size(); i++) {
 		   moduleStr += "| " + modules.get(i).getName() + " |\t";
 	   }
 	   
 	  for(int i=0; i< courses.size(); i++) {
		   courseStr += "| " + courses.get(i).getName() + " |";
	   }
 	   
    	return "Student: " + getName() + "\n" + "Age: " + getAge() + "\n" + "ID: " + getID() + "\n" +
        "DOB: " + getDob() + "\n" + "Username: " + getUsername() + "\n" + "Courses: " + courseStr + "\n" + 
    			"Modules: " + moduleStr + "\n";
    }
   
}