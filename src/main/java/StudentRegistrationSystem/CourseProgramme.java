package StudentRegistrationSystem;
 
import java.util.ArrayList;
import org.joda.time.DateTime;
 
public class CourseProgramme {
        private String name;
        private ArrayList<Module> modules;
        private ArrayList<Student> students;
        private DateTime startDate;
        private DateTime endDate;
       
        //Constructors
        public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
            this.setName(name);
            this.setModules(modules);
            this.setStudents(students);
            this.setStartDate(startDate);
            this.setEndDate(endDate);
            this.students = new ArrayList<Student>();
            this.modules = new ArrayList<Module>();
        }
        
        public CourseProgramme(String name, DateTime startDate, DateTime endDate, ArrayList<Module> modules, ArrayList<Student> students) {
            this.setName(name);
            this.setModules(modules);
            this.setStudents(students);
            this.setStartDate(startDate);
            this.setEndDate(endDate);
            this.students = students;
            this.modules = modules;
        }
               
        public void addStudents(Student student) {
        	this.students.add(student);
        }
       
        public void addModule(Module module) {
        	module.addCourse(this);
        	this.modules.add(module);
        }
               
        public String getName() {
        	return name;
        }
 
        public void setName(String name) {
        	this.name = name;
        }
 
        public ArrayList<Module> getModules() {
        	return modules;
        }
 
        public void setModules(ArrayList<Module> modules) {
        	this.modules = modules;
        }
 
        public ArrayList<Student> getStudents() {
        	return students;
        }
 
        public void setStudents(ArrayList<Student> students) {
        	this.students = students;
        }
 
        public DateTime getStartDate() {
        	return startDate;
        }
 
        public void setStartDate(DateTime startDate) {
        	this.startDate = startDate;
        }
 
        public DateTime getEndDate() {
        	return endDate;
        }
 
        public void setEndDate(DateTime endDate) {
        	this.endDate = endDate;
        }
               
        public String ToString() {
        	String moduleStr = " ";
        	String studentStr = " ";
        	for(int i=0; i< modules.size(); i++) {
      		   moduleStr += "| " + modules.get(i).getName() + " |\t";
      	   	}
        	for(int i=0; i< students.size(); i++) {
       		   studentStr += "| " + students.get(i).getName() + " |\t";
       	   	}
             return "Course: " + getName() + "\n" + "Modules: " + moduleStr + "\n" + "Students: " + studentStr + "\n"
                            + "Start Date: " + getStartDate() + "\n" + "End Date: " + getEndDate() + "\n";
        }
}