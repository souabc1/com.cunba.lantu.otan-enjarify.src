package com.qinggan.now.common;

import m54207b69;

public class AdminRegion
{
  public City OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public AdminRegionType OooO0Oo;
  
  public City getBelongCity()
  {
    return this.OooO00o;
  }
  
  public String getCode()
  {
    return this.OooO0O0;
  }
  
  public String getName()
  {
    return this.OooO0OO;
  }
  
  public AdminRegionType getType()
  {
    return this.OooO0Oo;
  }
  
  public void setBelongCity(City paramCity)
  {
    this.OooO00o = paramCity;
  }
  
  public void setCode(String paramString)
  {
    this.OooO0O0 = paramString;
  }
  
  public void setName(String paramString)
  {
    this.OooO0OO = paramString;
  }
  
  public void setType(AdminRegionType paramAdminRegionType)
  {
    this.OooO0Oo = paramAdminRegionType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("8s3218201D21261C1B22252754342A202D265A");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0OO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("~31F515E5A5A0E");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0O0;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("u%09525E584424");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0Oo;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AdminRegion
 * JD-Core Version:    0.7.0.1
 */