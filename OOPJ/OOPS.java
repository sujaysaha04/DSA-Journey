public class OOPS {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Sujay";
        s1.roll=123;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Students s2=new Students(s1);
        System.out.println(s2.name+","+s2.marks[0]+","+s2.marks[1]+","+s2.marks[2]);
        s1.marks[2]=100;
        s1.name="Saha";
        System.out.println(s2.name+","+s2.marks[0]+","+s2.marks[1]+","+s2.marks[2]);
    }
}
class Students {
    String name;
    int roll;
    int marks[]=new int[3];

    Students() {
    }
    
    Students(Students s1) {
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    
}