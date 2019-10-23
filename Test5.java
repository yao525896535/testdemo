public class Test5 {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(2009,4,1);
        d1.print();
        d2.print();
        d1.isRunyear();
        d2.isRunyear();
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;
    private boolean isRunyear;

    public MyDate(int year,int month,int day){
       this.year=year;
       this.month=month;
       this.day=day;
    }
    public MyDate(){

    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print(){
        System.out.println(getYear()+"年"
                +getMonth()+"月"
                +getDay()+"日");
    }
    public void isRunyear(){
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println(getYear()+"是闰年!");
        }
        else {
            System.out.println(getYear()+"不是闰年!");
        }
    }
//    public MyDate(int year,int month,int day){
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
}
