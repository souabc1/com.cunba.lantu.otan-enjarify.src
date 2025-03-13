package com.sun.jna;

import java.lang.reflect.Field;

public class Structure$StructField
{
  public ToNativeConverter OooO;
  public String OooO00o;
  public Class OooO0O0;
  public Field OooO0OO;
  public int OooO0Oo;
  public boolean OooO0o;
  public int OooO0o0;
  public boolean OooO0oO;
  public FromNativeConverter OooO0oo;
  public FromNativeContext OooOO0;
  
  public Structure$StructField()
  {
    int i = -1;
    this.OooO0Oo = i;
    this.OooO0o0 = i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.OooO00o;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("@");
    int i = this.OooO0o0;
    localStringBuilder.append(i);
    localStringBuilder.append("[");
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    localStringBuilder.append("] (");
    localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Structure.StructField
 * JD-Core Version:    0.7.0.1
 */