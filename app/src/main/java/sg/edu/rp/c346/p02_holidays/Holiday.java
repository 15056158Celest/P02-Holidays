package sg.edu.rp.c346.p02_holidays;

/**
 * Created by 15056158 on 25/4/2017.
 */

public class Holiday {

    private String name;
    private String date;
    private String holy;



    public Holiday(String name, String date, String holy){
        this.name=name;
        this.date = date;
        this.holy = holy;


    }

    public String getCode() {
        return name;
    }

    public String getDate(){
        return date;
    }
    public String getHoly() {
        return holy;
    }






}

