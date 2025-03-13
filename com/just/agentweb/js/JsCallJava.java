package com.just.agentweb.js;

import android.os.SystemClock;
import android.webkit.WebView;
import com.just.agentweb.utils.LogUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import m54207b69;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsCallJava
{
  public static final String[] OooO0o0 = tmp65_58;
  public HashMap OooO00o;
  public Object OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  
  static
  {
    String str1 = m54207b69.F54207b69_11(":.494C5C7046546364");
    String str2 = m54207b69.F54207b69_11(":P3832253B17443A3C");
    String str3 = m54207b69.F54207b69_11(">S3D3D293D392F");
    String str4 = m54207b69.F54207b69_11("Zx16180E1422063F1B1C");
    String str5 = m54207b69.F54207b69_11("8X3D2A2F3C3830");
    String str6 = m54207b69.F54207b69_11("md100C39131A12100A");
    String str7 = m54207b69.F54207b69_11("ma16010A18");
    String[] tmp50_47 = new String[7];
    String[] tmp51_50 = tmp50_47;
    String[] tmp51_50 = tmp50_47;
    tmp51_50[0] = str1;
    tmp51_50[1] = str2;
    String[] tmp58_51 = tmp51_50;
    String[] tmp58_51 = tmp51_50;
    tmp58_51[2] = str3;
    tmp58_51[3] = str4;
    String[] tmp65_58 = tmp58_51;
    String[] tmp65_58 = tmp58_51;
    tmp65_58[4] = str5;
    tmp65_58[5] = str6;
    tmp65_58[6] = str7;
  }
  
  public static String OooO0O0(JSONObject paramJSONObject)
  {
    return paramJSONObject.optString("obj");
  }
  
  public static JSONObject OooO0OO(String paramString)
  {
    int i = 9;
    paramString = paramString.substring(i);
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
    }
    return localJSONObject;
  }
  
  public static boolean OooO0o0(String paramString)
  {
    String str = m54207b69.F54207b69_11("%Q10373642290B3A3A73");
    return paramString.startsWith(str);
  }
  
  public String OooO00o(WebView paramWebView, JSONObject paramJSONObject)
  {
    boolean bool1 = LogUtils.isDebug();
    long l1;
    if (bool1) {
      l1 = SystemClock.uptimeMillis();
    } else {
      l1 = 0L;
    }
    Object localObject1;
    Object localObject2;
    int n;
    if (paramJSONObject != null)
    {
      localObject1 = ",65B5444615D57";
      try
      {
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        localObject1 = paramJSONObject.getString((String)localObject1);
        localObject2 = "ab161C140A15";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        localObject2 = paramJSONObject.getJSONArray((String)localObject2);
        Object localObject3 = "3D2537253A";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        localObject3 = paramJSONObject.getJSONArray((String)localObject3);
        int i = ((JSONArray)localObject2).length();
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        Class localClass = null;
        int k = 0;
        while (j < i)
        {
          Object localObject4 = ((JSONArray)localObject2).optString(j);
          String str = "MR2127223E403A";
          str = m54207b69.F54207b69_11(str);
          boolean bool2 = str.equals(localObject4);
          int m = 0;
          Object localObject5 = null;
          boolean bool3;
          if (bool2)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append((String)localObject1);
            localObject1 = "_S";
            ((StringBuilder)localObject4).append((String)localObject1);
            localObject1 = ((StringBuilder)localObject4).toString();
            bool3 = ((JSONArray)localObject3).isNull(j);
            if (!bool3) {
              localObject5 = ((JSONArray)localObject3).getString(j);
            }
            arrayOfObject[j] = localObject5;
          }
          else
          {
            str = "0759435C58564A";
            str = m54207b69.F54207b69_11(str);
            bool2 = str.equals(localObject4);
            if (bool2)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append((String)localObject1);
              localObject1 = "_N";
              ((StringBuilder)localObject4).append((String)localObject1);
              localObject1 = ((StringBuilder)localObject4).toString();
              k = k * 10 + j + 1;
            }
            else
            {
              str = "`M2F2324242C3129";
              str = m54207b69.F54207b69_11(str);
              bool2 = str.equals(localObject4);
              if (bool2)
              {
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                ((StringBuilder)localObject4).append((String)localObject1);
                localObject1 = "_B";
                ((StringBuilder)localObject4).append((String)localObject1);
                localObject1 = ((StringBuilder)localObject4).toString();
                bool3 = ((JSONArray)localObject3).getBoolean(j);
                localObject4 = Boolean.valueOf(bool3);
                arrayOfObject[j] = localObject4;
              }
              else
              {
                str = "Dh070B04100F21";
                str = m54207b69.F54207b69_11(str);
                bool2 = str.equals(localObject4);
                if (bool2)
                {
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>();
                  ((StringBuilder)localObject4).append((String)localObject1);
                  localObject1 = "_O";
                  ((StringBuilder)localObject4).append((String)localObject1);
                  localObject1 = ((StringBuilder)localObject4).toString();
                  bool3 = ((JSONArray)localObject3).isNull(j);
                  if (!bool3) {
                    localObject5 = ((JSONArray)localObject3).getJSONObject(j);
                  }
                  arrayOfObject[j] = localObject5;
                }
                else
                {
                  str = "*Q37254135293D4446";
                  str = m54207b69.F54207b69_11(str);
                  bool3 = str.equals(localObject4);
                  if (bool3)
                  {
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>();
                    ((StringBuilder)localObject4).append((String)localObject1);
                    localObject1 = "_F";
                    ((StringBuilder)localObject4).append((String)localObject1);
                    localObject1 = ((StringBuilder)localObject4).toString();
                    localObject4 = new com/just/agentweb/js/JsCallback;
                    str = this.OooO0OO;
                    m = ((JSONArray)localObject3).getInt(j);
                    ((JsCallback)localObject4).<init>(paramWebView, str, m);
                    arrayOfObject[j] = localObject4;
                  }
                  else
                  {
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>();
                    ((StringBuilder)localObject4).append((String)localObject1);
                    localObject1 = "_P";
                    ((StringBuilder)localObject4).append((String)localObject1);
                    localObject1 = ((StringBuilder)localObject4).toString();
                  }
                }
              }
            }
          }
          j += 1;
        }
        paramWebView = this.OooO00o;
        paramWebView = paramWebView.get(localObject1);
        paramWebView = (Method)paramWebView;
        if (paramWebView == null)
        {
          n = 500;
          paramWebView = new java/lang/StringBuilder;
          paramWebView.<init>();
          localObject2 = "N$4A4C520746505751480D534C5C59594F1C";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          paramWebView.append((String)localObject2);
          paramWebView.append((String)localObject1);
          localObject1 = "Mf4F47131216134C170F13190D52231523171C152517292B";
          localObject1 = m54207b69.F54207b69_11((String)localObject1);
          paramWebView.append((String)localObject1);
          localObject6 = paramWebView.toString();
          localObject1 = this;
          localObject2 = paramJSONObject;
          return OooO0Oo(paramJSONObject, n, localObject6, l1);
        }
        if (k > 0)
        {
          localObject1 = paramWebView.getParameterTypes();
          while (k > 0)
          {
            int i1 = k / 10 * 10;
            i1 = k - i1 + -1;
            localObject6 = localObject1[i1];
            localClass = Integer.TYPE;
            if (localObject6 == localClass)
            {
              i = ((JSONArray)localObject3).getInt(i1);
              localObject6 = Integer.valueOf(i);
              arrayOfObject[i1] = localObject6;
            }
            else
            {
              localClass = Long.TYPE;
              if (localObject6 == localClass)
              {
                localObject6 = ((JSONArray)localObject3).getString(i1);
                long l2 = Long.parseLong((String)localObject6);
                localObject6 = Long.valueOf(l2);
                arrayOfObject[i1] = localObject6;
              }
              else
              {
                double d = ((JSONArray)localObject3).getDouble(i1);
                localObject6 = Double.valueOf(d);
                arrayOfObject[i1] = localObject6;
              }
            }
            k /= 10;
          }
        }
        n = 200;
        localObject1 = this.OooO0O0;
        localObject6 = paramWebView.invoke(localObject1, arrayOfObject);
        localObject1 = this;
        localObject2 = paramJSONObject;
        return OooO0Oo(paramJSONObject, n, localObject6, l1);
      }
      catch (Exception paramWebView)
      {
        localObject1 = m54207b69.F54207b69_11("637941725563647F594D5B");
        localObject2 = m54207b69.F54207b69_11("Fn0D100405");
        LogUtils.OooO0Oo((String)localObject1, (String)localObject2, paramWebView);
        localObject1 = paramWebView.getCause();
        localObject2 = m54207b69.F54207b69_11("WZ37403035394380462A48433A3A4C88374F3A41494275");
        n = 500;
        if (localObject1 == null) {
          break label1038;
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      paramWebView = paramWebView.getCause();
      paramWebView = paramWebView.getMessage();
      ((StringBuilder)localObject1).append(paramWebView);
    }
    for (Object localObject6 = ((StringBuilder)localObject1).toString();; localObject6 = m54207b69.F54207b69_11("Qu16151B1C59161A081C5E1A23110E1A"))
    {
      localObject1 = this;
      localObject2 = paramJSONObject;
      return OooO0Oo(paramJSONObject, n, localObject6, l1);
      label1038:
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      break;
      n = 500;
    }
  }
  
  public final String OooO0Oo(JSONObject paramJSONObject, int paramInt, Object paramObject, long paramLong)
  {
    String str1;
    if (paramObject == null)
    {
      paramObject = m54207b69.F54207b69_11("C?514B5556");
    }
    else
    {
      boolean bool1 = paramObject instanceof String;
      if (bool1)
      {
        paramObject = (String)paramObject;
        str1 = "\\\"";
        String str2 = "\"";
        paramObject = String.valueOf(paramObject.replace(str2, str1));
        paramObject = str2.concat(paramObject).concat(str2);
      }
      else
      {
        paramObject = String.valueOf(paramObject);
      }
    }
    Object localObject = Integer.valueOf(paramInt);
    localObject = new Object[] { localObject, paramObject };
    paramObject = m54207b69.F54207b69_11("'W2C76161B17177B747F7B3D868382334134334D3689828D893C43");
    localObject = String.format(paramObject, (Object[])localObject);
    boolean bool2 = LogUtils.isDebug();
    if (bool2)
    {
      paramObject = new java/lang/StringBuilder;
      paramObject.<init>();
      str1 = m54207b69.F54207b69_11("on0D100405521F0D0A135D58");
      paramObject.append(str1);
      long l = SystemClock.uptimeMillis() - paramLong;
      paramObject.append(l);
      String str3 = m54207b69.F54207b69_11(",S7F742339262B3C272F727D");
      paramObject.append(str3);
      paramObject.append(paramJSONObject);
      paramJSONObject = m54207b69.F54207b69_11("<$080558445B564E5726");
      paramObject.append(paramJSONObject);
      paramObject.append((String)localObject);
    }
    return localObject;
  }
  
  public String getPreloadInterfaceJs()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.js.JsCallJava
 * JD-Core Version:    0.7.0.1
 */