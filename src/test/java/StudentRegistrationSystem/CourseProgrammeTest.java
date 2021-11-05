/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package StudentRegistrationSystem;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;
 
public class CourseProgrammeTest {
               
    CourseProgramme testCourse;
    Module testModule;
    Student testStudent;
    ArrayList<Student> students;
    ArrayList<Module> modules;
    DateTime start, end;
 
    public CourseProgrammeTest() {
       
        modules = new ArrayList<>(3);
        students = new ArrayList<>(3);
       
        Student conorF = new Student("Conor Fogarty", new DateTime(1999, 7, 15 ,0 , 0 , 0 ));
        Student seanF = new Student("Sean Fogarty", new DateTime(1997, 7, 12 ,0 , 0 , 0 ));
        Student kelanF = new Student("Kelan Fogarty", new DateTime(2001, 1, 31 ,0 , 0 , 0 ));
       
        Module m1 = new Module("CT401", "001");
        Module m2 = new Module("CT402", "002");
        Module m3 = new Module("CT403", "003");
       
        students.add(conorF);
        students.add(seanF);
        students.add(kelanF);
       
        modules.add(m1);
        modules.add(m2);
        modules.add(m3);     
        
        start = new DateTime(2021, 9, 01 ,0 , 0 , 0 );
        end = new DateTime(2022, 5, 19 ,0 , 0 , 0 );
        testCourse = new CourseProgramme("Computer Science", start, end, modules, students);
        testModule = new Module("CT400", "001");
       
        System.out.println(testCourse.ToString());
    }
   
    // Testing get/set name method
    @Test
    public void testGetName() {
        assertEquals(testCourse.getName(), "Computer Science");
    }
 
    @Test
    public void testSetName() {
        testCourse.setName("Mechanical Engineering");
        assertEquals(testCourse.getName(), "Mechanical Engineering");
    }
   
    // Testing get/set module method
    @Test
    public void testSetModules() {
        testCourse.setModules(modules);
    }
 
    @Test
    public void testGetModules() {
        assertEquals(testCourse.getModules(), modules);
    }
   
    // Testing add module method
    @Test
    public void testAddModule() {
        testCourse.addModule(testModule);
    }
   
    @Test
    public void testSetStudents() {
        testCourse.setStudents(students);
    }
 
    @Test
    public void testGetStudents() {
        assertEquals(testCourse.getStudents(), students);
    }
 
    // Testing get/set startDate method
    @Test
    public void testGetStartDate() {
        assertEquals(testCourse.getStartDate(), start);
    }
 
 
    @Test
    public void testSetStartDate() {
        DateTime newstart = new DateTime(2021, 9, 8 ,0 , 0 , 0 ); //setting new start time and testing against that
        testCourse.setStartDate(newstart);
        assertEquals(testCourse.getStartDate(), newstart);
    }
   
    // Testing get/set endDate method
    @Test
    public void testGetEndDate() {
        assertEquals(testCourse.getEndDate(), end);
    }
 
    @Test
    public void testSetEndDate() {
        DateTime newEnd = new DateTime(2022, 5, 19 ,0 , 0 , 0 ); //setting new end time and testing against that
        testCourse.setEndDate(newEnd);
        assertEquals(testCourse.getEndDate(), newEnd);
    }
 
}