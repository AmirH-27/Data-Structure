public class LabStudents {
    int id;
    String name;
    double cgpa;
    int[] tResult = new int[4];
    void insertMarks(int marks){
        for(int i=0;i<4;i++) {
            if (marks > tResult[i]) {
                int temp = tResult[i];
                tResult[i] = marks;
                marks = temp;
            }
        }
    }
    double getAverage(){
        double sum=0;
        for(int i=0;i<3;i++){
            sum+=tResult[i];
        }
        sum=(sum/3);
        return sum;
    }
    void setId(int id){
        this.id=id;
    }
    void setsName(String sName){
        this.name=name;
    }
    void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
    int getId(){
        return id;
    }
    String getsName(){
        return name;
    }
    double getCgpa(){
        return cgpa;
    }
    void show(){
        System.out.println("Student's ID : "+getId());
        System.out.println("Student's Name : "+getsName());
        System.out.println("Student's CGPA : "+getCgpa());
        System.out.println("Student's Average marks : "+getAverage());
        System.out.println("-------------------------------------------------------------");
    }
}
