package com.advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class D02_Date {
  public static void main(String[] args) throws ParseException {
    Date date = new Date();
    System.out.println(date); //Wed Jul 22 19:42:04 CST 2020

    //东八区+1s 距离1970.1.1 00:00:00的时间  ms
    System.out.println(new Date(1000)); //Thu Jan 01 08:00:01 CST 1970
    System.out.println(new Date().getTime()); //1595418387438  ms

    date.setTime(new Date().getTime());   //将date时间值设置为当前的时间
    System.out.println(date); //Wed Jul 22 19:49:43 CST 2020


    //date类格式化为字符串
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    String dateStr = sdf.format(new Date());
    System.out.println(dateStr); //2020-07-22 19:58:34   2020年07月22日 19:59:21

    //字符串转换为date类
    System.out.println(sdf.parse(dateStr));  //Wed Jul 22 20:06:08 CST 2020


    //日期运算
    GregorianCalendar c = new GregorianCalendar();  //多态
    //java.util.GregorianCalendar[time=1595420576450,areFieldsSet=true,areAllFieldsSet=true,
    // lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,
    // dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,
    // minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,
    // DAY_OF_MONTH=22,DAY_OF_YEAR=204,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,
    // HOUR_OF_DAY=20,MINUTE=22,SECOND=56,MILLISECOND=450,ZONE_OFFSET=28800000,DST_OFFSET=0]
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DAY_OF_MONTH);
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "年" + month + "月" + day + "日" + " " + hour + ":" + minute + ":" + second);//2020年7月30日
    //2020年7月22日 20:35:24

    //300天后
    c.add(Calendar.DAY_OF_MONTH,300);
  }
}
