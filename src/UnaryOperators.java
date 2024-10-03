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
    }
}
