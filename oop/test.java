package oop;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("ansuman" , 2002);
        s1.name = "anshuman" ;
        s1.yob = 2002;

        System.out.println(s1.check());

        Student s2 = new Student("man" , 2005);
        s1.name = "man" ;
        s1.yob = 2005;

        System.out.println(s1.check());
    }
}
