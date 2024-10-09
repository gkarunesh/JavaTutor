package bean;
/******** Single Dimension Array*********/
/*class Student{
    public int roll_no;
    public String name;
    public String address;

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }
}
public class array {
    public static void main(String[] args) {
        Student[] student_info = new Student[5];

        student_info[0]=new Student(1,"Aman", "Patna");
        student_info[1]=new Student(2,"Rajiv", "Gaya");
        student_info[2]=new Student(3,"Vishal", "Muzaffarpur");
        student_info[3]=new Student(4,"Nidhi", "ara");
        student_info[4]=new Student(5,"Arti", "Motihari");

        for(int i=0; i<student_info.length; i++){
            System.out.println(student_info[i].roll_no+" "+student_info[i].name+" "+student_info[i].address);
        }
    }
}*/

/*********** Second Example **********/
/*class  Student{
    public int roll_no;
    public String name;
    public String Address;

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}


public class array {
    public static void main(String[] args) {
        Student[] stud_info= new Student[]{new Student(1,"Aman", "Patna"),
                new Student(2,"Rajiv", "Gaya"),
                new Student(3,"Vishal", "Muzaffarpur"),
                new Student(4,"Nidhi", "ara"),
        };

        for(Student myStudent : stud_info){
            System.out.println(myStudent);
        }
    }
}*/
// Java Program to Multidimensional Array

public class array {
    public static void main(String[] args) {
        int arr[][] = {{2,7,5,8},{2,6,5,4}, {9,8,7,6}};

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}