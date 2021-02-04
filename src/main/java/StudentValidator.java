public class StudentValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWeeding wedAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);


        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City register is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWeeding checkWedding(StudentOrder so) {
        System.out.println("Wedding is checking");
        AnswerWeeding ans = new AnswerWeeding();
        return ans;
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is checking");
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is checking");
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }

    static void sendMail(StudentOrder so) {

    }
}
