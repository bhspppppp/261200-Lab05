
import java.time.LocalDate;

public class User{
        protected String name;
        protected LocalDate dob;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(int year , int month , int date) {
        if(LocalDate.of(year , month , date).isAfter(LocalDate.now())){
            this.dob = LocalDate.now();
        }else{
            this.dob =  LocalDate.of(year , month , date);
        }

    }

    public User (){
        this("unknow" , LocalDate.now().getYear() , LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    }

    public User(String name , int year , int month , int date){
        this.setName(name);
        this.setDob(year , month , date);
    }

    public String getInfo(){
        return "name: " + this.name  +", Dob " + this.dob;
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue()
            && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + this.name + "!";
        } else {
            return "It is not " + this.name + "'s birthday today.";
        }
    }
}