public class Stringcomparision {
    public static void main(String[] args) {
        String s1 ="tony";
        String s2 ="tony";
        String s3 = new String ("tony");
        if(s1==s2){
            System.out.println("Strings are equal ");

        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal ");

        }else{
            System.out.println("Strings are not equal");
        }
    if(s1.equals(s3)){
        System.out.println("Strings are equal ");
    }
    }
// Here in the output it is showing s1 and s2 are equal but
    // s1 and s3 are not equal this is due to a concept called interning
    // Here due to using new Fn in the creation of s3 , there is one new string created
    // instead of pointing it to the first string
    // while s2 just points to s1 making it equal :)

    // SO for solvin this conflict we use String builder
    // s1.equals(s3);-- it is a boolean type function


}
