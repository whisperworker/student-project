public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.husbandFirstName = "Alex";
        so.husbandLastName = "Petrov";
        so.wifeFirstName = "Lana";
        so.wifeLastName = "Petrova";

        StudentOrder so1 = new StudentOrder();
        so1.husbandFirstName = "Ivan";
        so1.husbandLastName = "Sidorov";
        so1.wifeFirstName = "Elena";
        so1.wifeLastName = "Sidorova";


        long answer = saveStudentOrder(so);
        System.out.println(answer);
        long answer1 = saveStudentOrder(so1);
        System.out.println(answer1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 200;
        System.out.println("saveStudentOrder: " + studentOrder.wifeLastName);

        return answer;
    }
}
