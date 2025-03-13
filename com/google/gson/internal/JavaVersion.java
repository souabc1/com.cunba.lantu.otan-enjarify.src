package com.google.gson.internal;

import m54207b69;

public final class JavaVersion
{
  private static final int majorJavaVersion = ;
  
  private static int determineMajorJavaVersion()
  {
    return getMajorJavaVersion(System.getProperty(m54207b69.F54207b69_11("JP3A322834822B3B292B424949")));
  }
  
  private static int extractBeginningInt(String paramString)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int i = 0;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break;
        }
        j = paramString.charAt(i);
        boolean bool = Character.isDigit(j);
        if (!bool) {
          break;
        }
        localStringBuilder.append(j);
        i += 1;
      }
      paramString = localStringBuilder.toString();
      return Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1;
  }
  
  public static int getMajorJavaVersion()
  {
    return majorJavaVersion;
  }
  
  public static int getMajorJavaVersion(String paramString)
  {
    int i = parseDotted(paramString);
    int j = -1;
    if (i == j) {
      i = extractBeginningInt(paramString);
    }
    if (i == j) {
      return 6;
    }
    return i;
  }
  
  public static boolean isJava9OrLater()
  {
    int i = majorJavaVersion;
    int j = 9;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  private static int parseDotted(String paramString)
  {
    String str = ">M16641413";
    try
    {
      str = m54207b69.F54207b69_11(str);
      paramString = paramString.split(str);
      int i = 0;
      str = null;
      str = paramString[0];
      i = Integer.parseInt(str);
      int j = 1;
      if (i == j)
      {
        int k = paramString.length;
        if (k > j)
        {
          paramString = paramString[j];
          return Integer.parseInt(paramString);
        }
      }
      return i;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.JavaVersion
 * JD-Core Version:    0.7.0.1
 */