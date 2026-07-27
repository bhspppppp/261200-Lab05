import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        this("unknow", LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());

    }

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | User type: admin";
    }

    public String getInfo(boolean full) {
        if (full) {
            return this.getInfo() + " " + LocalDate.now();
        } else {
            return "Name: " + this.name;

        }
    }

    // คำนวณอายุของ admin ในหน่วยปี
    public int getAge() {
        return LocalDate.now().getYear() - dob.getYear();
    }

    // แก้ไขข้อความทักทายวันเกิดสำหรับ admin
    @Override
    public String getBirthdayGreeting() {
        String baseMessage = super.getBirthdayGreeting();
        if (isBirthday()) {
            return baseMessage + " You are " + getAge() + " years old!";
        } else {
            return baseMessage;
        }
    }
}

