package com.qinggan.navi;

import org.json.JSONObject;

public class Utils
{
  public static Double OooO00o(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      Double localDouble = new java/lang/Double;
      double d = paramJSONObject.getDouble(paramString);
      localDouble.<init>(d);
      return localDouble;
    }
    catch (Exception localException) {}
    return Double.valueOf(0.0D);
  }
  
  public static Integer OooO0O0(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      Integer localInteger = new java/lang/Integer;
      int i = paramJSONObject.getInt(paramString);
      localInteger.<init>(i);
      return localInteger;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static Long OooO0OO(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      Long localLong = new java/lang/Long;
      long l = paramJSONObject.getLong(paramString);
      localLong.<init>(l);
      return localLong;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static String OooO0Oo(String paramString, JSONObject paramJSONObject)
  {
    String str = " ";
    try
    {
      paramString = paramJSONObject.getString(paramString);
      if (paramString != null)
      {
        paramJSONObject = "";
        boolean bool = paramString.equals(paramJSONObject);
        if (!bool) {
          str = paramString;
        }
      }
    }
    catch (Exception localException)
    {
      label31:
      break label31;
    }
    return str;
  }
  
  public static int getDirectionId(int paramInt)
  {
    int i = 337;
    int j = 7;
    if (paramInt > i)
    {
      i = 360;
      if (paramInt < i) {}
    }
    else
    {
      i = -1;
      if (paramInt > i)
      {
        i = 23;
        if (paramInt < i) {}
      }
      else
      {
        i = 22;
        if (paramInt > i)
        {
          i = 68;
          if (paramInt < i) {
            return 8;
          }
        }
        i = 67;
        if (paramInt > i)
        {
          i = 113;
          if (paramInt < i) {
            return 1;
          }
        }
        i = 112;
        if (paramInt > i)
        {
          i = 158;
          if (paramInt < i) {
            return 2;
          }
        }
        i = 157;
        if (paramInt > i)
        {
          i = 203;
          if (paramInt < i) {
            return 3;
          }
        }
        i = 202;
        if (paramInt > i)
        {
          i = 248;
          if (paramInt < i) {
            return 4;
          }
        }
        i = 247;
        if (paramInt > i)
        {
          i = 293;
          if (paramInt < i) {
            return 5;
          }
        }
        i = 292;
        if (paramInt > i)
        {
          i = 338;
          if (paramInt < i) {
            j = 6;
          }
        }
      }
    }
    return j;
  }
  
  public static TurnByTurnIconInfo getTurnByTurnIconInfo(int paramInt)
  {
    TurnByTurnIconInfo localTurnByTurnIconInfo = TurnByTurnIconInfo.o00o00;
    int i = 93;
    if (i == paramInt)
    {
      localTurnByTurnIconInfo = TurnByTurnIconInfo.o00OooO0;
    }
    else
    {
      i = 92;
      if (i == paramInt)
      {
        localTurnByTurnIconInfo = TurnByTurnIconInfo.o00OooOO;
      }
      else
      {
        i = 91;
        if (i == paramInt)
        {
          localTurnByTurnIconInfo = TurnByTurnIconInfo.o00OooOo;
        }
        else
        {
          i = 90;
          if (i == paramInt)
          {
            localTurnByTurnIconInfo = TurnByTurnIconInfo.o0O00o0;
          }
          else
          {
            i = 97;
            if (i == paramInt)
            {
              localTurnByTurnIconInfo = TurnByTurnIconInfo.o00OoooO;
            }
            else
            {
              i = 96;
              if (i == paramInt)
              {
                localTurnByTurnIconInfo = TurnByTurnIconInfo.o00Ooooo;
              }
              else
              {
                i = 95;
                if (i == paramInt)
                {
                  localTurnByTurnIconInfo = TurnByTurnIconInfo.o00o0000;
                }
                else
                {
                  i = 101;
                  if (i == paramInt)
                  {
                    localTurnByTurnIconInfo = TurnByTurnIconInfo.o00o0O00;
                  }
                  else
                  {
                    i = 94;
                    if (i == paramInt)
                    {
                      localTurnByTurnIconInfo = TurnByTurnIconInfo.o00Ooo0o;
                    }
                    else
                    {
                      i = 76;
                      if (i != paramInt)
                      {
                        i = 5;
                        if (i != paramInt)
                        {
                          i = 64;
                          if (i != paramInt)
                          {
                            i = 65;
                            if (i != paramInt)
                            {
                              i = 66;
                              if (i != paramInt)
                              {
                                i = 67;
                                if (i != paramInt)
                                {
                                  i = 68;
                                  if (i != paramInt)
                                  {
                                    int j = 24;
                                    if (j == paramInt) {
                                      return TurnByTurnIconInfo.o00o0;
                                    }
                                    j = 13;
                                    if (j != paramInt)
                                    {
                                      int k = 15;
                                      if (k != paramInt)
                                      {
                                        int m = 16;
                                        if ((m != paramInt) && (i != paramInt))
                                        {
                                          i = 32;
                                          if (i != paramInt)
                                          {
                                            i = 23;
                                            if (i != paramInt)
                                            {
                                              i = 107;
                                              if (i != paramInt)
                                              {
                                                i = 72;
                                                if (i != paramInt)
                                                {
                                                  i = 1;
                                                  if ((i != paramInt) && (j != paramInt) && (k != paramInt))
                                                  {
                                                    i = 17;
                                                    if (i != paramInt)
                                                    {
                                                      i = 22;
                                                      if (i != paramInt)
                                                      {
                                                        i = 33;
                                                        if (i != paramInt)
                                                        {
                                                          j = 34;
                                                          if (j != paramInt)
                                                          {
                                                            j = 35;
                                                            if (j != paramInt)
                                                            {
                                                              j = 37;
                                                              if (j != paramInt)
                                                              {
                                                                j = 40;
                                                                if (j != paramInt)
                                                                {
                                                                  j = 45;
                                                                  if (j != paramInt)
                                                                  {
                                                                    j = 46;
                                                                    if (j != paramInt)
                                                                    {
                                                                      j = 48;
                                                                      if (j != paramInt)
                                                                      {
                                                                        j = 150;
                                                                        if (j != paramInt)
                                                                        {
                                                                          j = 151;
                                                                          if (j != paramInt)
                                                                          {
                                                                            j = 152;
                                                                            if (j != paramInt)
                                                                            {
                                                                              j = 155;
                                                                              if (j != paramInt)
                                                                              {
                                                                                j = 78;
                                                                                if (j != paramInt)
                                                                                {
                                                                                  j = 7;
                                                                                  if (j != paramInt)
                                                                                  {
                                                                                    j = 50;
                                                                                    if (j != paramInt)
                                                                                    {
                                                                                      j = 51;
                                                                                      if (j != paramInt)
                                                                                      {
                                                                                        j = 52;
                                                                                        if (j != paramInt)
                                                                                        {
                                                                                          j = 53;
                                                                                          if (j != paramInt)
                                                                                          {
                                                                                            j = 54;
                                                                                            if (j != paramInt)
                                                                                            {
                                                                                              j = 60;
                                                                                              if (j != paramInt)
                                                                                              {
                                                                                                j = 74;
                                                                                                if (j != paramInt)
                                                                                                {
                                                                                                  j = 3;
                                                                                                  if (j != paramInt)
                                                                                                  {
                                                                                                    j = 55;
                                                                                                    if (j != paramInt)
                                                                                                    {
                                                                                                      j = 56;
                                                                                                      if (j != paramInt)
                                                                                                      {
                                                                                                        j = 57;
                                                                                                        if (j != paramInt)
                                                                                                        {
                                                                                                          j = 58;
                                                                                                          if (j != paramInt)
                                                                                                          {
                                                                                                            j = 59;
                                                                                                            if (j != paramInt)
                                                                                                            {
                                                                                                              j = 63;
                                                                                                              if (j != paramInt)
                                                                                                              {
                                                                                                                j = 79;
                                                                                                                if (j != paramInt)
                                                                                                                {
                                                                                                                  j = 70;
                                                                                                                  if (j != paramInt)
                                                                                                                  {
                                                                                                                    j = 39;
                                                                                                                    if (j != paramInt)
                                                                                                                    {
                                                                                                                      j = 111;
                                                                                                                      if (j != paramInt)
                                                                                                                      {
                                                                                                                        j = 114;
                                                                                                                        if (j != paramInt)
                                                                                                                        {
                                                                                                                          j = 8;
                                                                                                                          if (j != paramInt)
                                                                                                                          {
                                                                                                                            j = 11;
                                                                                                                            if (j != paramInt)
                                                                                                                            {
                                                                                                                              j = 14;
                                                                                                                              if (j != paramInt)
                                                                                                                              {
                                                                                                                                j = 18;
                                                                                                                                if (j != paramInt)
                                                                                                                                {
                                                                                                                                  j = 20;
                                                                                                                                  if (j != paramInt)
                                                                                                                                  {
                                                                                                                                    j = 42;
                                                                                                                                    if (j != paramInt)
                                                                                                                                    {
                                                                                                                                      j = 47;
                                                                                                                                      if (j != paramInt)
                                                                                                                                      {
                                                                                                                                        j = 61;
                                                                                                                                        if (j != paramInt)
                                                                                                                                        {
                                                                                                                                          j = 153;
                                                                                                                                          if (j != paramInt)
                                                                                                                                          {
                                                                                                                                            j = 73;
                                                                                                                                            if (j != paramInt)
                                                                                                                                            {
                                                                                                                                              j = 69;
                                                                                                                                              if ((j != paramInt) && (i != paramInt))
                                                                                                                                              {
                                                                                                                                                i = 112;
                                                                                                                                                if (i != paramInt)
                                                                                                                                                {
                                                                                                                                                  i = 115;
                                                                                                                                                  if (i != paramInt)
                                                                                                                                                  {
                                                                                                                                                    i = 2;
                                                                                                                                                    if (i != paramInt)
                                                                                                                                                    {
                                                                                                                                                      i = 12;
                                                                                                                                                      if ((i != paramInt) && (m != paramInt))
                                                                                                                                                      {
                                                                                                                                                        i = 19;
                                                                                                                                                        if (i != paramInt)
                                                                                                                                                        {
                                                                                                                                                          i = 21;
                                                                                                                                                          if (i != paramInt)
                                                                                                                                                          {
                                                                                                                                                            i = 38;
                                                                                                                                                            if (i != paramInt)
                                                                                                                                                            {
                                                                                                                                                              i = 41;
                                                                                                                                                              if (i != paramInt)
                                                                                                                                                              {
                                                                                                                                                                i = 44;
                                                                                                                                                                if (i != paramInt)
                                                                                                                                                                {
                                                                                                                                                                  i = 49;
                                                                                                                                                                  if (i != paramInt)
                                                                                                                                                                  {
                                                                                                                                                                    i = 62;
                                                                                                                                                                    if (i != paramInt)
                                                                                                                                                                    {
                                                                                                                                                                      i = 154;
                                                                                                                                                                      if (i != paramInt)
                                                                                                                                                                      {
                                                                                                                                                                        i = 77;
                                                                                                                                                                        if (i != paramInt)
                                                                                                                                                                        {
                                                                                                                                                                          i = 6;
                                                                                                                                                                          if (i != paramInt)
                                                                                                                                                                          {
                                                                                                                                                                            i = 75;
                                                                                                                                                                            if (i != paramInt)
                                                                                                                                                                            {
                                                                                                                                                                              i = 4;
                                                                                                                                                                              if (i != paramInt)
                                                                                                                                                                              {
                                                                                                                                                                                i = 113;
                                                                                                                                                                                if (i != paramInt)
                                                                                                                                                                                {
                                                                                                                                                                                  i = 31;
                                                                                                                                                                                  if (i != paramInt)
                                                                                                                                                                                  {
                                                                                                                                                                                    i = 25;
                                                                                                                                                                                    if (i != paramInt)
                                                                                                                                                                                    {
                                                                                                                                                                                      i = 26;
                                                                                                                                                                                      if (i != paramInt)
                                                                                                                                                                                      {
                                                                                                                                                                                        i = 27;
                                                                                                                                                                                        if (i != paramInt)
                                                                                                                                                                                        {
                                                                                                                                                                                          i = 28;
                                                                                                                                                                                          if (i != paramInt) {
                                                                                                                                                                                            return localTurnByTurnIconInfo;
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                    return TurnByTurnIconInfo.o00o00o;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                return TurnByTurnIconInfo.o00Ooo0;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            return TurnByTurnIconInfo.o00o00oO;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        return TurnByTurnIconInfo.o00o00O0;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            return TurnByTurnIconInfo.o00o00oo;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                return TurnByTurnIconInfo.o00o00Oo;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                return TurnByTurnIconInfo.o00o0OO0;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return TurnByTurnIconInfo.o00o0O0O;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    return TurnByTurnIconInfo.oo00oO;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      localTurnByTurnIconInfo = TurnByTurnIconInfo.o00o0O0;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return localTurnByTurnIconInfo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.Utils
 * JD-Core Version:    0.7.0.1
 */