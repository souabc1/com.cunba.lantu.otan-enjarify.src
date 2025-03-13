package com.xuexiang.xpage.model;

import com.xuexiang.xpage.enums.CoreAnim;
import java.io.Serializable;
import java.util.Map;
import m54207b69;

public class PageInfo
  implements Serializable
{
  public String o00OoOoo;
  public String o00Ooo0 = "";
  public String o00Ooo00;
  public CoreAnim o00Ooo0O;
  public int o00Ooo0o;
  
  public PageInfo() {}
  
  public PageInfo(String paramString, Class paramClass)
  {
    this.o00OoOoo = paramString;
    paramString = paramClass.getName();
    this.o00Ooo00 = paramString;
  }
  
  public PageInfo OooO00o(CoreAnim paramCoreAnim)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCoreAnim;
    return (PageInfo)m54207b69.F54207b69_09(1690, arrayOfObject);
  }
  
  public PageInfo OooO0O0(Map paramMap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMap;
    return (PageInfo)m54207b69.F54207b69_09(1691, arrayOfObject);
  }
  
  public PageInfo OooO0OO(String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfString;
    return (PageInfo)m54207b69.F54207b69_09(1692, arrayOfObject);
  }
  
  public CoreAnim getAnim()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CoreAnim)m54207b69.F54207b69_09(1693, arrayOfObject);
  }
  
  public String getClassPath()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1694, arrayOfObject);
  }
  
  public int getExtra()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1695, arrayOfObject);
  }
  
  public String getName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1696, arrayOfObject);
  }
  
  public String getParams()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1697, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1698, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.model.PageInfo
 * JD-Core Version:    0.7.0.1
 */