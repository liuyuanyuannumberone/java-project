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

    //������+1s ����1970.1.1 00:00:00��ʱ��  ms
    System.out.println(new Date(1000)); //Thu Jan 01 08:00:01 CST 1970
    System.out.println(new Date().getTime()); //1595418387438  ms

    date.setTime(new Date().getTime());   //��dateʱ��ֵ����Ϊ��ǰ��ʱ��
    System.out.println(date); //Wed Jul 22 19:49:43 CST 2020


    //date���ʽ��Ϊ�ַ���
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
    String dateStr = sdf.format(new Date());
    System.out.println(dateStr); //2020-07-22 19:58:34   2020��07��22�� 19:59:21

    //�ַ���ת��Ϊdate��
    System.out.println(sdf.parse(dateStr));  //Wed Jul 22 20:06:08 CST 2020


    //��������
    GregorianCalendar c = new GregorianCalendar();  //��̬
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

    System.out.println(year + "��" + month + "��" + day + "��" + " " + hour + ":" + minute + ":" + second);//2020��7��30��
    //2020��7��22�� 20:35:24

    //300���
    c.add(Calendar.DAY_OF_MONTH,300);
  }
}
