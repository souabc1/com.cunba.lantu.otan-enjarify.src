package com.qinggan.navi;

import com.qinggan.util.Log;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

public class NaviDataParser
{
  public static final String OooO00o = "NaviDataParser";
  
  public static GuideState OooO00o(String paramString)
  {
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str1 = "%l0B1A070B0D380F21110B22";
      paramString = m54207b69.F54207b69_11(str1);
      paramString = ((JSONObject)localObject).getString(paramString);
      return GuideState.OooO0OO(paramString);
    }
    catch (JSONException paramString)
    {
      Object localObject = OooO00o;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("ph180A1C1E11401321260A1518380E292B2A121D2F2F5D38523F3F472B272A363B21282875");
      localStringBuilder.append(str2);
      paramString = paramString.getMessage();
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      Log.OooO0O0((String)localObject, paramString);
    }
    return null;
  }
  
  public static GuideState OooO0O0(String paramString)
  {
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str1 = "X:5D505561636A4F55635769";
      paramString = m54207b69.F54207b69_11(str1);
      paramString = ((JSONObject)localObject).getString(paramString);
      return GuideState.OooO0OO(paramString);
    }
    catch (JSONException paramString)
    {
      Object localObject = OooO00o;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("fN3E303E402F05353F2F102A332D7B122C11111D49414054513F3A3A8F");
      localStringBuilder.append(str2);
      paramString = paramString.getMessage();
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      Log.OooO0O0((String)localObject, paramString);
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviDataParser
 * JD-Core Version:    0.7.0.1
 */