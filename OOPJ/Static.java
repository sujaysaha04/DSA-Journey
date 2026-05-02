public class Static {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.schoolName="RV";
        Student1 s2=new Student1();
        System.out.println(s2.schoolName);
        s1.schoolName="MNPS";
        System.out.println(s2.schoolName);
    }
}
class Student1 {
    String name;
    int roll;
    static String schoolName;
    static double calculatePercentage(int phy,int chem,int maths) {
        return (phy+chem+maths)/3.0;
    }
    void setName(String name) {
        this.name=name;
    }
    String getName() {
        return name;
    }
}