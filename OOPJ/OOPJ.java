public class OOPJ {
    public static void main(String[] args) {
        Pen p1=new Pen();
        Student s1=new Student();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
        s1.setDetails("Sujay",21);
        s1.calculatePercentage(78, 98, 99);
        System.out.println(s1.name);
        s1.name="Sujay Saha";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
    }
}

class Pen {
    private String color;
    private int tip;
    String getColor() {
        return color;
    }
    int getTip() {
        return tip;
    }
    void setColor(String color) {
        this.color=color;
    }
    void setTip(int tip) {
        this.tip=tip;
    }
}
class Student {
    String name;
    int age;
    double percentage;
    void setDetails(String studName,int studAge) {
        name=studName;
        age=studAge;
    }
    void calculatePercentage(int phy,int chem,int maths) {
        percentage=(phy+chem+maths)/3.0;
    }
}