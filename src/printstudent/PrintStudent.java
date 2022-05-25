/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudent;


/**
 *
 * @author JAYSHEEL
 */
public class PrintStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[3]; // array of object
        
        //create student object
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("Jaysheel");
        
        Student s2 = new Student();
        s2.setAge(18);
        s1.setName("Kartik");
        
        Student s3 = new Student();
        s3.setAge(19);
        s3.setName("Utsav");
        
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        System.out.print("Age Name");
        for (Student studentList1 : studentList) {
            System.out.print("\n" + studentList1.getAge() + " ");
            System.out.print(studentList1.getName());
        }
    }
    
}
