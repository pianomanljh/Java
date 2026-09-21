import java.util.Scanner;

class Student {
    int id;
    long phone;
    String name, major;

    void setId(int id) {
        this.id = id;
    }
    int getId(){
        return id;
    }
    void setPhone(long phone) {
        this.phone = phone;
    }
    long getPhone(){
        return phone;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setMajor(String major) {
        this.major = major;
    }
    String getMajor(){
        return major;
    }

}
public class Homework2 {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i<3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            s[i] = new Student();

            s[i].setId(sc.nextInt());
            s[i].setName(sc.next());
            s[i].setMajor(sc.next());
            s[i].setPhone(sc.nextLong());
        }

        for (int i = 0; i<3; i++) {
            String phoneStr = "0" + Long.toString(s[i].getPhone());
            String phoneHyphen = phoneStr.substring(0,3) + "-"
                                + phoneStr.substring(3,7) + "-"
                                + phoneStr.substring(7);
            System.out.println((i+1) + "번째 학생: "
                                + s[i].getId() + " "
                                + s[i].getName() + " "
                                + s[i].getMajor() + " "
                                + phoneHyphen);
        }
    }
}
