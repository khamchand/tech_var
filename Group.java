/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khamchand Saha
 */
public class Group {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] s = new Student[10];
        for(int i=0; i<10; i++)
        {
            s[i] = new Student();
            s[i].setName("s"+(i+1)); //start with 1
            s[i].setRoll_no(i+1); 
            s[i].setAge(i+16);
            s[i].setScore(0+i*10);
        }
        displayTemplate(); //   
        for(int i=0; i<10; i++)
        {
            System.out.print(s[i].getName()+"\t");
            System.out.print(s[i].getRoll_no()+"\t\t");
            System.out.print(s[i].getAge()+"\t");
            System.out.print(s[i].getScore()+"\n");
        }
        //Students Scoring o - 50
        System.out.println("\nStudents scoring 0-50 are:");
        System.out.print("Name\t");
        System.out.print("Roll No \t");
        System.out.print("Age\t");
        System.out.print("Score\n");
        for(int i=0; i<10; i++)
        {
            if(s[i].getScore()<50)
            {
                System.out.print(s[i].getName()+"\t");
                System.out.print(s[i].getRoll_no()+"\t\t");
                System.out.print(s[i].getAge()+"\t");
                System.out.print(s[i].getScore()+"\n");
            }
        }
        
        //Students Scoring 50-65
        System.out.println("\nStudents scoring 50-65 are:");
        System.out.print("Name\t");
        System.out.print("Roll No \t");
        System.out.print("Age\t");
        System.out.print("Score\n");
        for(int i=0; i<10; i++)
        {
            if(s[i].getScore()<65 && 50<=s[i].getScore())
            {
                System.out.print(s[i].getName()+"\t");
                System.out.print(s[i].getRoll_no()+"\t\t");
                System.out.print(s[i].getAge()+"\t");
                System.out.print(s[i].getScore()+"\n");
            }
        }
        
        //Students Scoring 65-80
        System.out.println("\nStudents scoring 65-80 are:");
        System.out.print("Name\t");
        System.out.print("Roll No \t");
        System.out.print("Age\t");
        System.out.print("Score\n");
        for(int i=0; i<10; i++)
        {
            if(s[i].getScore()<80 && 65<=s[i].getScore())
            {
                System.out.print(s[i].getName()+"\t");
                System.out.print(s[i].getRoll_no()+"\t\t");
                System.out.print(s[i].getAge()+"\t");
                System.out.print(s[i].getScore()+"\n");
            }
        }
        
        //Students Scoring 80-100
        System.out.println("\nStudents scoring 80-100 are:");
        System.out.print("Name\t");
        System.out.print("Roll No \t");
        System.out.print("Age\t");
        System.out.print("Score\n");
        for(int i=0; i<10; i++)
        {
            if(s[i].getScore()<100 && 80<=s[i].getScore())
            {
                System.out.print(s[i].getName()+"\t");
                System.out.print(s[i].getRoll_no()+"\t\t");
                System.out.print(s[i].getAge()+"\t");
                System.out.print(s[i].getScore()+"\n");
            }
        }
    }
    
    //for display template
    public static void displayTemplate()
    {
        System.out.print("Name\t");
        System.out.print("Roll No \t");
        System.out.print("Age\t");
        System.out.print("Score\n");
    }

}
