package com.cunba.lantu.otan.model;

import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Set;
import m54207b69;

public class AppInfo
{
  private Drawable appIcon;
  private String appName;
  private Set bootComponents;
  private String packageName;
  private long versionCode;
  private String versionName;
  
  public AppInfo()
  {
    Object localObject = "";
    this.appName = ((String)localObject);
    this.packageName = ((String)localObject);
    this.versionName = ((String)localObject);
    this.versionCode = 0L;
    this.appIcon = null;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.bootComponents = ((Set)localObject);
  }
  
  public Drawable getAppIcon()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(377, arrayOfObject);
  }
  
  public String getAppName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(378, arrayOfObject);
  }
  
  public Set getBootComponents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Set)m54207b69.F54207b69_09(379, arrayOfObject);
  }
  
  public String getPackageName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(380, arrayOfObject);
  }
  
  public long getVersionCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(381, arrayOfObject);
  }
  
  public String getVersionName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(382, arrayOfObject);
  }
  
  public void print()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(383, arrayOfObject);
  }
  
  public void setAppIcon(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(384, arrayOfObject);
  }
  
  public void setAppName(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(385, arrayOfObject);
  }
  
  public void setBootComponents(Set paramSet)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSet;
    m54207b69.F54207b69_00(386, arrayOfObject);
  }
  
  public void setPackageName(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(387, arrayOfObject);
  }
  
  public void setVersionCode(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    m54207b69.F54207b69_00(388, arrayOfObject);
  }
  
  public void setVersionName(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(389, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.model.AppInfo
 * JD-Core Version:    0.7.0.1
 */