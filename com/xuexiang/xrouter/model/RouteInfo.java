package com.xuexiang.xrouter.model;

import com.xuexiang.xrouter.enums.RouteType;
import java.util.Map;
import javax.lang.model.element.Element;
import m54207b69;

public class RouteInfo
{
  public RouteType OooO00o;
  public Element OooO0O0;
  public Class OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public String OooO0o0;
  public int OooO0oO;
  public Map OooO0oo;
  
  public RouteInfo()
  {
    this.OooO0o = -1;
  }
  
  public RouteInfo(RouteType paramRouteType, Element paramElement, Class paramClass, String paramString1, String paramString2, Map paramMap, int paramInt1, int paramInt2)
  {
    this.OooO00o = paramRouteType;
    this.OooO0OO = paramClass;
    this.OooO0O0 = paramElement;
    this.OooO0Oo = paramString1;
    this.OooO0o0 = paramString2;
    this.OooO0oo = paramMap;
    this.OooO0o = paramInt1;
    this.OooO0oO = paramInt2;
  }
  
  public static RouteInfo OooO00o(RouteType paramRouteType, Class paramClass, String paramString1, String paramString2, Map paramMap, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramRouteType;
    arrayOfObject[1] = paramClass;
    arrayOfObject[2] = paramString1;
    arrayOfObject[3] = paramString2;
    arrayOfObject[4] = paramMap;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[5] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[6] = localInteger;
    return (RouteInfo)m54207b69.F54207b69_09(1830, arrayOfObject);
  }
  
  public RouteInfo OooO0O0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (RouteInfo)m54207b69.F54207b69_09(1831, arrayOfObject);
  }
  
  public RouteInfo OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (RouteInfo)m54207b69.F54207b69_09(1832, arrayOfObject);
  }
  
  public Class getDestination()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Class)m54207b69.F54207b69_09(1833, arrayOfObject);
  }
  
  public int getExtra()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1834, arrayOfObject);
  }
  
  public String getGroup()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1835, arrayOfObject);
  }
  
  public Map getParamsType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Map)m54207b69.F54207b69_09(1836, arrayOfObject);
  }
  
  public String getPath()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1837, arrayOfObject);
  }
  
  public int getPriority()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1838, arrayOfObject);
  }
  
  public Element getRawType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Element)m54207b69.F54207b69_09(1839, arrayOfObject);
  }
  
  public RouteType getType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RouteType)m54207b69.F54207b69_09(1840, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1841, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.model.RouteInfo
 * JD-Core Version:    0.7.0.1
 */