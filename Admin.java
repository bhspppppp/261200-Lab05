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
        return super.getInfo() + " | user type: admin";
    }

    public String getInfo(boolean full) {
        if (full) {
            return this.getInfo() + " " + LocalDate.now();
        } else {
            return "name: " + this.name;

        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - dob.getYear();
    }

    @Override
    public String getBirthdayGreeting() {
        String baseMessage = super.getBirthdayGreeting();
        if (isBirthday()) {
            return baseMessage + " you are " + getAge() + " years old!";
        } else {
            return baseMessage;
        }
    }
}

