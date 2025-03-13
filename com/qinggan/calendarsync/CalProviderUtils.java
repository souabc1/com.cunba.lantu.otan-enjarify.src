package com.qinggan.calendarsync;

import java.util.Calendar;
import m54207b69;

public final class CalProviderUtils
{
  public static final String[] OooO00o;
  public static final String[] OooO0O0 = tmp79_71;
  
  static
  {
    String str1 = m54207b69.F54207b69_11("uc0201020F1A121D43150B1811");
    String str2 = m54207b69.F54207b69_11("gj090C08120813111F3D170D2426131922341C1922");
    String str3 = m54207b69.F54207b69_11("*z150E16220C401F201D181E19");
    String[] tmp22_19 = new String[4];
    String[] tmp23_22 = tmp22_19;
    String[] tmp23_22 = tmp22_19;
    tmp23_22[0] = "_id";
    tmp23_22[1] = str1;
    tmp23_22[2] = str2;
    String[] tmp34_23 = tmp23_22;
    tmp34_23[3] = str3;
    OooO00o = tmp34_23;
    String str4 = m54207b69.F54207b69_11("k5415D435C54");
    str1 = m54207b69.F54207b69_11("X%4054424E556E504D4C5A565557");
    str2 = m54207b69.F54207b69_11("mO2A3A2C243F152C32");
    String str5 = m54207b69.F54207b69_11("@&444443524C");
    String[] tmp70_67 = new String[5];
    String[] tmp71_70 = tmp70_67;
    String[] tmp71_70 = tmp70_67;
    tmp71_70[0] = str2;
    tmp71_70[1] = str5;
    String[] tmp79_71 = tmp71_70;
    String[] tmp79_71 = tmp71_70;
    tmp79_71[2] = str4;
    tmp79_71[3] = str3;
    tmp79_71[4] = str1;
  }
  
  private static Calendar getEndTime()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 23);
    int i = 59;
    localCalendar.set(12, i);
    localCalendar.set(13, i);
    localCalendar.set(14, 999);
    return localCalendar;
  }
  
  private static Calendar getStartTime()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    return localCalendar;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.calendarsync.CalProviderUtils
 * JD-Core Version:    0.7.0.1
 */