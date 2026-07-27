import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        int todayYear = LocalDate.now().getYear();
        int todayMonth = LocalDate.now().getMonthValue();
        int todayDay = LocalDate.now().getDayOfMonth();

        User user1 = new User("alice", todayYear - 25, todayMonth, todayDay);
        Admin admin1 = new Admin("nicolas", todayYear - 62, todayMonth, todayDay);

        System.out.println(user1.getBirthdayGreeting());
        System.out.println(admin1.getBirthdayGreeting());
    }
}
