package Home;

class Student {
    int rollno;
    String name;
    int marks;
}

public class HenaceForLoop {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ezekiel";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "dada";
        s2.marks = 78;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Tolu";
        s3.marks = 98;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Yinka";
        s4.marks = 68;

        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;


        for (Student stud : students) {
            System.out.println(stud.name + " :" + s1.marks);


        //for (int i = 0; i < students.length; i++) {
           // System.out.println(students[i].name + " :" + s1.marks);


            //int nums [] = {3,7,4,7,9,7};
            //nums[1] = 6;

            //System.out.println(nums[1]);


            //int  nums [] = new int [5];
            //nums[0] = 4;
            //nums[1] = 2;
            //nums[2] = 8;
            //nums[3] = 5;
            //nums[4] = 3;

            //for (int n : nums) {
              //  System.out.println(n);
            //}

            //for (int i=0; i < nums.length;i++) {
            //   System.out.println(nums[i]);
            //}
        }
    }
}
