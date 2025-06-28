class students {
    String name;
    int marks;
}

public class video13 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        
        // for student1
        students s1 = new students();
        s1.name = "basu c k";
        s1.marks = 100;
        // for student2
        students s2 = new students();
        s2.name = "basu c k";
        s2.marks = 100;
        // for student3
        students s3 = new students();
        s3.name = "basu c k";
        s3.marks = 100;

        // create an array of students
        students stud[] = new students[3];
        stud[0] = s1; // first student
        stud[1] = s2; // second student
        stud[2] = s3; // third student

        //Enhanced for loop
        for (students s: stud) {
            System.out.println(s.name + " " + s.marks);
        }

    }
}
