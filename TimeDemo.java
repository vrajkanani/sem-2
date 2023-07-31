class Time{
    int  hour;
    int minute;
    int second;

     public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
     }
     void add(Time t){
        
        this.second += t.second;
        if(this.second>60){
            this.minute ++;
            this.second -= 60;
        }
        this.minute += t.minute;
        if(this.minute>60){
            this.hour ++;
            this.minute -= 60;
        }
        this.hour += t.hour;
     }
}
public class TimeDemo{
    public static void main(String[] args) {
        Time t1=new Time(11,59,55);
        Time t2=new Time(0,0,6);
        t1.add(t2);
        System.out.println(t1.hour+":"+t1.minute+":"+t1.second);
    }
}