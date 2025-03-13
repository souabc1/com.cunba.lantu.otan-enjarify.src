package com.xuexiang.xpage.core;

import java.io.Serializable;
import m54207b69;

public class CorePage
  implements Serializable
{
  public static final String KEY_PAGE_CLAZZ = "classPath";
  public static final String KEY_PAGE_NAME = "name";
  public static final String KEY_PAGE_PARAMS = "params";
  private static final long serialVersionUID = 3736359137726536495L;
  private String mClazz;
  private String mName;
  private String mParams;
  
  public CorePage() {}
  
  public CorePage(String paramString1, String paramString2, String paramString3)
  {
    this.mName = paramString1;
    this.mClazz = paramString2;
    this.mParams = paramString3;
  }
  
  public String getClazz()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1630, arrayOfObject);
  }
  
  public String getName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1631, arrayOfObject);
  }
  
  public String getParams()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1632, arrayOfObject);
  }
  
  public CorePage setClazz(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (CorePage)m54207b69.F54207b69_09(1633, arrayOfObject);
  }
  
  public CorePage setName(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (CorePage)m54207b69.F54207b69_09(1634, arrayOfObject);
  }
  
  public CorePage setParams(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (CorePage)m54207b69.F54207b69_09(1635, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1636, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.core.CorePage
 * JD-Core Version:    0.7.0.1
 */