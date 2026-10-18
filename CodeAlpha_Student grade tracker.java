import java .util.Scanner;

public class StudentGradeManager
{

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Students number:");
    int numofStudents = input.nextInt();
    
     String[] names = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];

for (int i =0 ; i < numberofStudents;i++)
{
    System.out.println("Enter students " + (i+1) + "name: ");
    names[i] = input.next();

    System.out.print("Enter scores: ");
    scores[i] = input.nextDouble();
}

double total =0;

for(int i = 0 ; i < numberofStudents ; i++)
{
    total = total + scores[i];
}

double average = total/ numberofStudents;

double highest  = scores[0];

for(int i = 0; i < numberofStudents; i++)
{
    if(scores[i] > highest)
    {
        highest = scores[i];
    }
}
double lowest = scores[0];

for(int i = 0; i < numberofStudents; i++)
{
    if(scores[i] < lowest)
    {
        lowest = scores[i];
    }
}
 System.out.println("\n===== STUDENT REPORT =====");

 for(int i = 0; i < numberofStudents; i++)
 {
     System.out.println(names[i] + " : " + scores[i]);
 }
   System.out.println("-------------------------");
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest : " + lowest);


         }
}
