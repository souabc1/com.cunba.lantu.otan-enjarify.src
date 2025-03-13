package com.xuexiang.xupdate.entity;

import android.content.Context;
import android.util.SparseArray;
import m54207b69;

public class UpdateError
  extends Throwable
{
  public static final SparseArray o00Ooo00;
  public final int o00OoOoo;
  
  static
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    o00Ooo00 = localSparseArray;
  }
  
  public UpdateError(int paramInt)
  {
    this(paramInt, null);
  }
  
  public UpdateError(int paramInt, String paramString)
  {
    super(paramString);
    this.o00OoOoo = paramInt;
  }
  
  public static void OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    m54207b69.F54207b69_00(6696, arrayOfObject);
  }
  
  public static String OooO0O0(int paramInt, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    arrayOfObject[1] = paramString;
    return (String)m54207b69.F54207b69_09(6697, arrayOfObject);
  }
  
  public int getCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6698, arrayOfObject);
  }
  
  public String getDetailMsg()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6699, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(6700, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xupdate.entity.UpdateError
 * JD-Core Version:    0.7.0.1
 */