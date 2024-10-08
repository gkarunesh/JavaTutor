import java.nio.charset.Charset;
import java.sql.SQLOutput;

public class UnaryOperators {
    public static void main (String[] args) {
        int a=10;
        int b=20;
        System.out.println(a++);
        System.out.println(++a);

        System.out.println(b--);
        System.out.println(--b);

        //turnary operator
        int x= 70, y=30, z=50, result;

        result= ((x > y) ? (x > z) ? x : z : (y > z) ? y : z);
        System.out.println("Max of three numbers : "+result);


        for(int i=0; i<10; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i+" ");
        }

System.out.println("---for loop example---");

        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("---While loop example---");
        int n=1;
        while(n<=5){
            System.out.println(n);
            n++;
        }
        System.out.println("---String example---");

        byte[] b_array={71, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        System.out.println(cs);
        String s_byte_char = new String(b_array, cs);
        System.out.println(s_byte_char);


        System.out.println("---String Character example---");
        char[] char_arr ={'G', 'e', 'e', 'k', 's'};
        String s=new String(char_arr);
        //System.out.println(s);
        //System.out.println(s.length());
        System.out.println(s.charAt(2));

        String s1= new String("Java"); //2 object
        String s2= "Java"; //1 object

        String m = "Money";
        int output = m.indexOf('n');
        System.out.println(output);

        System.out.println("---Reverse in String---");
        String str = "i.like.this.program.very.much";
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev +=str.charAt(i);
        }
        System.out.print(rev);

        System.out.println("---For each loop---");
        int arr[]={10,54,21,35,42,16,84};
        for(int ele : arr){
            System.out.println(ele);
        }
        System.out.println("---Maximum---");
            int marks[]={51,64,83,26,80};
            int highest= maximum(marks);
        }
    }
}
