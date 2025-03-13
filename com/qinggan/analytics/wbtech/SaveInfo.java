package com.qinggan.analytics.wbtech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import m54207b69;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class SaveInfo
  extends Thread
{
  public JSONObject o00OoOoo;
  public String o00Ooo00;
  
  public SaveInfo(JSONObject paramJSONObject, String paramString)
  {
    this.o00OoOoo = paramJSONObject;
    this.o00Ooo00 = paramString;
  }
  
  public static void OooO00o(JSONObject paramJSONObject, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = m54207b69.F54207b69_11("Jz291C0E225E1E21201A2864271F232D69");
    ((StringBuilder)localObject1).append(str1);
    ((StringBuilder)localObject1).append(paramString);
    localObject1 = ((StringBuilder)localObject1).toString();
    str1 = m54207b69.F54207b69_11("k@132238280D332C36");
    CobubLog.OooO00o(str1, (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("C=574F5456215E62506426");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = paramJSONObject.toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    CobubLog.OooO00o(str1, (String)localObject1);
    try
    {
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramString);
      boolean bool1 = ((File)localObject1).exists();
      if (bool1)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Ee030D0B03490523131E1A4F";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = ((File)localObject1).getAbsolutePath();
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        CobubLog.OooO0Oo(str1, (String)localObject2);
      }
      else
      {
        ((File)localObject1).createNewFile();
      }
      long l1 = ((File)localObject1).length();
      long l2 = 1048576L;
      bool1 = l1 < l2;
      if (bool1)
      {
        ((File)localObject1).delete();
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString);
        ((File)localObject1).createNewFile();
      }
      localObject1 = new java/io/FileInputStream;
      ((FileInputStream)localObject1).<init>(paramString);
      localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      int i = 4096;
      Object localObject3 = new byte[i];
      for (;;)
      {
        int j = ((FileInputStream)localObject1).read((byte[])localObject3);
        int k = -1;
        if (j == k) {
          break;
        }
        String str2 = new java/lang/String;
        str2.<init>((byte[])localObject3, 0, j);
        ((StringBuffer)localObject2).append(str2);
      }
      ((FileInputStream)localObject1).close();
      int m = ((StringBuffer)localObject2).length();
      boolean bool2;
      Object localObject4;
      String str3;
      if (m != 0)
      {
        localObject1 = new org/json/JSONObject;
        localObject2 = ((StringBuffer)localObject2).toString();
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = paramJSONObject.keys();
        for (;;)
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = ((Iterator)localObject2).next();
          localObject3 = (String)localObject3;
          localObject4 = paramJSONObject.getJSONArray((String)localObject3);
          boolean bool3 = ((JSONObject)localObject1).has((String)localObject3);
          if (bool3)
          {
            localObject3 = ((JSONObject)localObject1).getJSONArray((String)localObject3);
            localObject4 = ((JSONArray)localObject4).get(0);
            ((JSONArray)localObject3).put(localObject4);
          }
          else
          {
            localObject4 = paramJSONObject.getJSONArray((String)localObject3);
            ((JSONObject)localObject1).put((String)localObject3, localObject4);
          }
        }
        paramJSONObject = new java/io/FileOutputStream;
        paramJSONObject.<init>(paramString, false);
        paramString = ((JSONObject)localObject1).toString();
        paramString = paramString.getBytes();
        paramJSONObject.write(paramString);
        paramJSONObject.flush();
        paramJSONObject.close();
        str3 = ">Z29402E427E383A433D83463E4036404E4E8349523C52558A";
      }
      for (paramJSONObject = m54207b69.F54207b69_11(str3);; paramJSONObject = m54207b69.F54207b69_11(str3))
      {
        CobubLog.OooO0Oo(str1, paramJSONObject);
        break;
        localObject1 = paramJSONObject.keys();
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        for (;;)
        {
          bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = ((Iterator)localObject1).next();
          localObject3 = (String)localObject3;
          localObject4 = paramJSONObject.getJSONArray((String)localObject3);
          ((JSONObject)localObject2).put((String)localObject3, localObject4);
        }
        str3 = "UV372728403734";
        paramJSONObject = m54207b69.F54207b69_11(str3);
        localObject1 = AppInfo.getAppKey();
        ((JSONObject)localObject2).put(paramJSONObject, localObject1);
        paramJSONObject = new java/io/FileOutputStream;
        paramJSONObject.<init>(paramString, false);
        paramString = ((JSONObject)localObject2).toString();
        paramString = paramString.getBytes();
        paramJSONObject.write(paramString);
        paramJSONObject.flush();
        paramJSONObject.close();
        str3 = "9O3C2B3B2D732B2730287833312D4935393B";
      }
      CobubLog.OooO0O0(str1, paramJSONObject);
    }
    catch (Exception paramJSONObject) {}catch (JSONException paramJSONObject) {}catch (IOException paramJSONObject) {}
  }
  
  public void run()
  {
    super.run();
    JSONObject localJSONObject = this.o00OoOoo;
    String str = this.o00Ooo00;
    OooO00o(localJSONObject, str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.SaveInfo
 * JD-Core Version:    0.7.0.1
 */