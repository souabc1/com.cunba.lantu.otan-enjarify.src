package com.qinggan.now;

import com.qinggan.now.common.City;
import com.qinggan.now.common.GeoPoint;
import com.qinggan.now.common.GuideState;
import com.qinggan.now.common.NaviInfo;
import com.qinggan.now.common.Poi;
import com.qinggan.now.common.PoiCategory;
import com.qinggan.now.common.RoadLevel;
import com.qinggan.now.common.RoadTraffic;
import com.qinggan.now.common.ServiceDistrict;
import com.qinggan.now.common.TrafficType;
import java.util.ArrayList;
import m54207b69;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NaviDataParser
{
  public static ArrayList OooO00o(String paramString)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      paramString = new org/json/JSONArray;
      String str1 = ";~1D180C0A11262513142811";
      str1 = m54207b69.F54207b69_11(str1);
      localObject2 = ((JSONObject)localObject2).getString(str1);
      paramString.<init>((String)localObject2);
      localObject2 = null;
      int i = 0;
      str1 = null;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break;
        }
        Object localObject3 = paramString.getString(i);
        String str2 = "\\|";
        localObject3 = ((String)localObject3).split(str2);
        str2 = localObject3[0];
        int k = 1;
        localObject3 = localObject3[k];
        City localCity = new com/qinggan/now/common/City;
        localCity.<init>((String)localObject3, str2);
        ((ArrayList)localObject1).add(localCity);
        i += 1;
      }
      return localObject1;
    }
    catch (JSONException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11(">>4E604E505F825D514F56287F797E7E8A566E6D615E6C67671C");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
    }
    return null;
  }
  
  public static GeoPoint OooO0O0(String paramString)
  {
    Object localObject1 = new com/qinggan/now/common/GeoPoint;
    ((GeoPoint)localObject1).<init>();
    Object localObject2 = ",";
    try
    {
      paramString = paramString.split((String)localObject2);
      localObject2 = null;
      localObject2 = paramString[0];
      localObject2 = Double.valueOf((String)localObject2);
      double d1 = ((Double)localObject2).doubleValue();
      int i = 1;
      paramString = paramString[i];
      paramString = Double.valueOf(paramString);
      double d2 = paramString.doubleValue();
      ((GeoPoint)localObject1).OooO0o0(d1, d2);
      return localObject1;
    }
    catch (NumberFormatException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11(".b120412140B2A0D143A161517224F3A261F111923382226261B2F41351D2430352B2E2E7B");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
    }
    return null;
  }
  
  public static NaviInfo OooO0OO(String paramString)
  {
    Object localObject1 = new com/qinggan/now/common/NaviInfo;
    ((NaviInfo)localObject1).<init>();
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      String str1 = "X:5D505561636A4F55635769";
      paramString = m54207b69.F54207b69_11(str1);
      paramString = ((JSONObject)localObject2).getString(paramString);
      paramString = GuideState.OooO0O0(paramString);
      ((NaviInfo)localObject1).setGuideState(paramString);
      str1 = "245742486E59555F6462";
      try
      {
        paramString = m54207b69.F54207b69_11(str1);
        paramString = ((JSONObject)localObject2).getString(paramString);
        localObject3 = "\\|";
        paramString = paramString.split((String)localObject3);
        localObject3 = new com/qinggan/now/common/City;
        int i = 1;
        String str2 = paramString[i];
        paramString = paramString[0];
        ((City)localObject3).<init>(str2, paramString);
        ((NaviInfo)localObject1).setCurCity((City)localObject3);
      }
      catch (JSONException localJSONException1)
      {
        ((NaviInfo)localObject1).setCurRoadName(null);
      }
      str1 = "[^3D2C2E04363C363C0939493E47";
      try
      {
        paramString = m54207b69.F54207b69_11(str1);
        paramString = ((JSONObject)localObject2).getString(paramString);
        ((NaviInfo)localObject1).setCurRoadName(paramString);
      }
      catch (JSONException localJSONException2)
      {
        ((NaviInfo)localObject1).setCurRoadName(null);
      }
      str1 = "LU3621290D3D414145123C2A46422E4A494B";
      try
      {
        paramString = m54207b69.F54207b69_11(str1);
        j = ((JSONObject)localObject2).getInt(paramString);
        paramString = RoadLevel.OooO0O0(j);
      }
      catch (JSONException localJSONException3)
      {
        paramString = RoadLevel.o00OooOO;
      }
      ((NaviInfo)localObject1).setCurRoadLevel(paramString);
      int j = -1;
      Object localObject3 = "<^2C3C35423B3507413F3634";
      try
      {
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        int k = ((JSONObject)localObject2).getInt((String)localObject3);
        ((NaviInfo)localObject1).setRemainDistance(k);
        localObject3 = "w[2F35313D3B0945393038";
        try
        {
          localObject3 = m54207b69.F54207b69_11((String)localObject3);
          k = ((JSONObject)localObject2).getInt((String)localObject3);
          ((NaviInfo)localObject1).setTotalDist(k);
        }
        catch (JSONException localJSONException4)
        {
          ((NaviInfo)localObject1).setTotalDist(j);
        }
        localObject3 = "Wy0B1D161B141C2C14181D26";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        l = ((JSONObject)localObject2).getLong((String)localObject3);
        ((NaviInfo)localObject1).setRemainTime(l);
        localObject3 = "IZ344024310943393036";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        k = ((JSONObject)localObject2).getInt((String)localObject3);
        ((NaviInfo)localObject1).setNextDistance(k);
        localObject3 = "0X363E222F0B31373C45";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        l = ((JSONObject)localObject2).getLong((String)localObject3);
        ((NaviInfo)localObject1).setNextTime(l);
      }
      catch (JSONException localJSONException5)
      {
        ((NaviInfo)localObject1).setRemainDistance(j);
        long l = -1;
        ((NaviInfo)localObject1).setRemainTime(l);
        ((NaviInfo)localObject1).setTotalDist(j);
        ((NaviInfo)localObject1).setNextDistance(j);
        ((NaviInfo)localObject1).setNextTime(l);
      }
      paramString = "loc";
      paramString = ((JSONObject)localObject2).getString(paramString);
      paramString = OooO0O0(paramString);
      ((NaviInfo)localObject1).setCurrentLocation(paramString);
      str1 = "2\\332F373E3937";
      try
      {
        paramString = m54207b69.F54207b69_11(str1);
        paramString = ((JSONObject)localObject2).getString(paramString);
        localObject3 = "j~1A1C0F0D1B1525111F1A1A";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        localObject2 = ((JSONObject)localObject2).getString((String)localObject3);
        paramString = OooO0o0(paramString);
        ((NaviInfo)localObject1).setStartLocation(paramString);
        paramString = OooO0o0((String)localObject2);
        ((NaviInfo)localObject1).setEndLocation(paramString);
      }
      catch (JSONException localJSONException6)
      {
        ((NaviInfo)localObject1).setStartLocation(null);
        ((NaviInfo)localObject1).setEndLocation(null);
      }
      return localObject1;
    }
    catch (JSONException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("fN3E303E402F05353F2F102A332D7B122C11111D49414054513F3A3A8F");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
    }
    return null;
  }
  
  public static ArrayList OooO0Oo(String paramString)
  {
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      paramString = new org/json/JSONArray;
      localObject2 = "q,5C444776516364545D";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((JSONObject)localObject1).getString((String)localObject2);
      paramString.<init>((String)localObject1);
      int i = paramString.length();
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      int j = 0;
      while (j < i)
      {
        Poi localPoi = new com/qinggan/now/common/Poi;
        localPoi.<init>();
        Object localObject3 = paramString.getJSONObject(j);
        Object localObject4 = "NI2729262F";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        localObject4 = ((JSONObject)localObject3).getString((String)localObject4);
        localPoi.setName((String)localObject4);
        localObject4 = "Sh090D0E1D112021";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        localObject4 = ((JSONObject)localObject3).getString((String)localObject4);
        localPoi.setAddress((String)localObject4);
        localObject4 = "tel";
        localObject4 = ((JSONObject)localObject3).getString((String)localObject4);
        localPoi.setTel((String)localObject4);
        localObject4 = "E?5351535B5A50506262";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        double d = ((JSONObject)localObject3).getDouble((String)localObject4);
        localPoi.setLon(d);
        localObject4 = ".D2826323034362628";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        d = ((JSONObject)localObject3).getDouble((String)localObject4);
        localPoi.setLat(d);
        localObject4 = "TW30234036360D413F4139482E2E4040";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        d = ((JSONObject)localObject3).getDouble((String)localObject4);
        localPoi.setGuideLon(d);
        localObject4 = "dI2E3D2230301B2B2F452947473939";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        d = ((JSONObject)localObject3).getDouble((String)localObject4);
        localPoi.setGuideLat(d);
        localObject4 = new com/qinggan/now/common/City;
        Object localObject5 = "KO2C273D39";
        localObject5 = m54207b69.F54207b69_11((String)localObject5);
        localObject5 = ((JSONObject)localObject3).getString((String)localObject5);
        ((City)localObject4).<init>(null, (String)localObject5);
        localPoi.setCity((City)localObject4);
        localObject4 = "A/4C4F5D4D4C45635D784A584D56";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        localObject4 = ((JSONObject)localObject3).getString((String)localObject4);
        localObject5 = "c25154485A59624652755A676163";
        localObject5 = m54207b69.F54207b69_11((String)localObject5);
        localObject3 = ((JSONObject)localObject3).getString((String)localObject5);
        localObject5 = new com/qinggan/now/common/PoiCategory;
        ((PoiCategory)localObject5).<init>((String)localObject4, (String)localObject3);
        localPoi.setCategory((PoiCategory)localObject5);
        ((ArrayList)localObject2).add(localPoi);
        j += 1;
      }
      return localObject2;
    }
    catch (JSONException paramString)
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("i)59495D5D506C52586582504B66165A605A5D6B70545B5D2A");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
    }
    return null;
  }
  
  public static ArrayList OooO0o(String paramString)
  {
    Object localObject1 = ",";
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str1 = m54207b69.F54207b69_11("k$5446585A457951547056615B2A");
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append(paramString);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    str1 = null;
    try
    {
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>(paramString);
      paramString = new org/json/JSONArray;
      String str2 = "q,5C444776516364545D";
      str2 = m54207b69.F54207b69_11(str2);
      localObject3 = ((JSONObject)localObject3).getString(str2);
      paramString.<init>((String)localObject3);
      localObject3 = null;
      int i = 0;
      str2 = null;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break;
        }
        Poi localPoi = new com/qinggan/now/common/Poi;
        localPoi.<init>();
        Object localObject4 = paramString.getString(i);
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        String str3 = "%Q213125253806443F25412C307D2F33327B";
        str3 = m54207b69.F54207b69_11(str3);
        ((StringBuilder)localObject5).append(str3);
        ((StringBuilder)localObject5).append((String)localObject4);
        localObject5 = "\\|";
        localObject4 = ((String)localObject4).split((String)localObject5);
        localObject5 = localObject4[0];
        int k = 1;
        String str4 = localObject4[k];
        int m = 2;
        String str5 = localObject4[m];
        int n = 3;
        String[] arrayOfString1 = localObject4[n];
        arrayOfString1 = arrayOfString1.split((String)localObject1);
        int i1 = 4;
        String[] arrayOfString2 = localObject4[i1];
        arrayOfString2 = arrayOfString2.split((String)localObject1);
        int i2 = localObject4.length;
        int i3 = 7;
        String str6;
        if (i2 >= i3)
        {
          i2 = 5;
          str6 = localObject4[i2];
          i3 = 6;
          localObject4 = localObject4[i3];
        }
        else
        {
          localObject4 = null;
          i2 = 0;
          str6 = null;
        }
        localPoi.setName((String)localObject5);
        localPoi.setAddress(str4);
        localPoi.setTel(str5);
        localObject5 = arrayOfString1[0];
        localObject5 = Double.valueOf((String)localObject5);
        double d1 = ((Double)localObject5).doubleValue();
        localPoi.setLon(d1);
        localObject5 = arrayOfString1[k];
        localObject5 = Double.valueOf((String)localObject5);
        d1 = ((Double)localObject5).doubleValue();
        localPoi.setLat(d1);
        localObject5 = arrayOfString2[0];
        localObject5 = Double.valueOf((String)localObject5);
        d1 = ((Double)localObject5).doubleValue();
        localPoi.setGuideLon(d1);
        localObject5 = arrayOfString2[k];
        localObject5 = Double.valueOf((String)localObject5);
        double d2 = ((Double)localObject5).doubleValue();
        localPoi.setGuideLat(d2);
        if ((localObject4 != null) && (str6 != null))
        {
          localObject5 = new com/qinggan/now/common/City;
          ((City)localObject5).<init>((String)localObject4, str6);
          localPoi.setCity((City)localObject5);
        }
        ((ArrayList)localObject2).add(localPoi);
        i += 1;
      }
      return localObject2;
    }
    catch (NumberFormatException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("\\V26382628370B3F4622482F2D8225314A444436234D39514E3A2C48504F43405E59598E");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
      return null;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = m54207b69.F54207b69_11("(l1C0E20220D41090C542F492E2E36221E192D2A1817176C");
      }
    }
  }
  
  public static Poi OooO0o0(String paramString)
  {
    Object localObject1 = ",";
    Object localObject2 = new com/qinggan/now/common/Poi;
    ((Poi)localObject2).<init>();
    Object localObject3 = "\\|";
    try
    {
      paramString = paramString.split((String)localObject3);
      localObject3 = null;
      Object localObject4 = paramString[0];
      int i = 1;
      String str1 = paramString[i];
      int j = 2;
      String str2 = paramString[j];
      int k = 3;
      String[] arrayOfString = paramString[k];
      arrayOfString = arrayOfString.split((String)localObject1);
      int m = 4;
      String str3 = paramString[m];
      localObject1 = str3.split((String)localObject1);
      m = 5;
      str3 = paramString[m];
      int n = 6;
      paramString = paramString[n];
      ((Poi)localObject2).setName((String)localObject4);
      ((Poi)localObject2).setAddress(str1);
      ((Poi)localObject2).setTel(str2);
      localObject4 = arrayOfString[0];
      localObject4 = Double.valueOf((String)localObject4);
      double d1 = ((Double)localObject4).doubleValue();
      ((Poi)localObject2).setLon(d1);
      localObject4 = arrayOfString[i];
      localObject4 = Double.valueOf((String)localObject4);
      d1 = ((Double)localObject4).doubleValue();
      ((Poi)localObject2).setLat(d1);
      localObject3 = localObject1[0];
      localObject3 = Double.valueOf((String)localObject3);
      double d2 = ((Double)localObject3).doubleValue();
      ((Poi)localObject2).setGuideLon(d2);
      localObject1 = localObject1[i];
      localObject1 = Double.valueOf((String)localObject1);
      d2 = ((Double)localObject1).doubleValue();
      ((Poi)localObject2).setGuideLat(d2);
      localObject1 = new com/qinggan/now/common/City;
      ((City)localObject1).<init>(paramString, str3);
      ((Poi)localObject2).setCity((City)localObject1);
      return localObject2;
    }
    catch (NumberFormatException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("f\\2C3E30323D11393C841B333C4A463C29433F43503C2E3A56514542504F4F84");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
    }
    return null;
  }
  
  public static ArrayList OooO0oO(String paramString)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      paramString = new org/json/JSONArray;
      Object localObject3 = "Jd160C07031B150B17192045102223132C";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      localObject2 = ((JSONObject)localObject2).getString((String)localObject3);
      paramString.<init>((String)localObject2);
      int i = 0;
      localObject2 = null;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break;
        }
        localObject3 = paramString.getJSONObject(i);
        RoadTraffic localRoadTraffic = new com/qinggan/now/common/RoadTraffic;
        localRoadTraffic.<init>();
        String str1 = "=[3F3F2A3B";
        str1 = m54207b69.F54207b69_11(str1);
        str1 = ((JSONObject)localObject3).getString(str1);
        String str2 = "NI2729262F";
        str2 = m54207b69.F54207b69_11(str2);
        str2 = ((JSONObject)localObject3).getString(str2);
        String str3 = "G.5A444F74615F556153";
        str3 = m54207b69.F54207b69_11(str3);
        int k = ((JSONObject)localObject3).getInt(str3);
        String str4 = "ky0D151C290E0E222325";
        str4 = m54207b69.F54207b69_11(str4);
        int m = ((JSONObject)localObject3).getInt(str4);
        String str5 = "len";
        int n = ((JSONObject)localObject3).getInt(str5);
        String str6 = "Ad100A093E14120F08";
        str6 = m54207b69.F54207b69_11(str6);
        long l = ((JSONObject)localObject3).getLong(str6);
        localRoadTraffic.setDescription(str1);
        localRoadTraffic.setName(str2);
        localObject3 = TrafficType.OooO0OO(k);
        localRoadTraffic.setType((TrafficType)localObject3);
        localRoadTraffic.setSpeed(m);
        localRoadTraffic.setDistance(n);
        localRoadTraffic.setThroughTime(l);
        ((ArrayList)localObject1).add(localRoadTraffic);
        i += 1;
      }
      return localObject1;
    }
    catch (NumberFormatException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("%y09190D0D203F1C1E262514181C232568471D262E3020552D232D3228581E383B292E32393B68");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
      return null;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = m54207b69.F54207b69_11("ph180A1C1E11401321260A1518380E292B2A121D2F2F5D38523F3F472B272A363B21282875");
      }
    }
  }
  
  public static ArrayList OooO0oo(String paramString)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      paramString = new org/json/JSONArray;
      String str1 = "W+584F5B60464D545F";
      str1 = m54207b69.F54207b69_11(str1);
      localObject2 = ((JSONObject)localObject2).getString(str1);
      paramString.<init>((String)localObject2);
      localObject2 = null;
      int i = 0;
      str1 = null;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break;
        }
        ServiceDistrict localServiceDistrict = new com/qinggan/now/common/ServiceDistrict;
        localServiceDistrict.<init>();
        Object localObject3 = paramString.getString(i);
        String str2 = "\\|";
        localObject3 = ((String)localObject3).split(str2);
        str2 = localObject3[0];
        int k = 1;
        localObject3 = localObject3[k];
        localObject3 = Integer.valueOf((String)localObject3);
        int m = ((Integer)localObject3).intValue();
        localServiceDistrict.setName(str2);
        localServiceDistrict.setDistance(m);
        ((ArrayList)localObject1).add(localServiceDistrict);
        i += 1;
      }
      return localObject1;
    }
    catch (NumberFormatException paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("3}0D1D11111C331E16131D282345211C181F25301C2272491F2838322A572F2D2F3C2A5A28423D33303C3B3D72");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.getMessage();
      ((StringBuilder)localObject1).append(paramString);
      return null;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = m54207b69.F54207b69_11("ph180A1C1E11401321260A1518380E292B2A121D2F2F5D38523F3F472B272A363B21282875");
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NaviDataParser
 * JD-Core Version:    0.7.0.1
 */