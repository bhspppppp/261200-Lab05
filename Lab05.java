import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        // วันนี้ (ใช้ปีเก่าเพื่อให้ isBirthday() เป็น true)
        int todayYear = LocalDate.now().getYear();
        int todayMonth = LocalDate.now().getMonthValue();
        int todayDay = LocalDate.now().getDayOfMonth();

        // สร้าง User และ Admin โดยตั้ง dob เป็นวันนี้แต่ปีก่อน
        User user1 = new User("Alice", todayYear - 25, todayMonth, todayDay);
        Admin admin1 = new Admin("Nicolas", todayYear - 62, todayMonth, todayDay);

        // ทดสอบ getBirthdayGreeting()
        System.out.println(user1.getBirthdayGreeting());
        System.out.println(admin1.getBirthdayGreeting());
    }
}
