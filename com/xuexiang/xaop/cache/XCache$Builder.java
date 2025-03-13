package com.xuexiang.xaop.cache;

import android.content.Context;
import com.xuexiang.xaop.XAOP;
import com.xuexiang.xaop.cache.converter.IDiskConverter;
import com.xuexiang.xaop.util.Utils;
import java.io.File;
import m54207b69;

public final class XCache$Builder
{
  public boolean OooO00o = false;
  public int OooO0O0;
  public Context OooO0OO;
  public long OooO0Oo;
  public File OooO0o;
  public IDiskConverter OooO0o0;
  public int OooO0oO;
  public long OooO0oo;
  
  public XCache$Builder()
  {
    this(localContext);
  }
  
  public XCache$Builder(Context paramContext)
  {
    this.OooO0OO = paramContext;
    IDiskConverter localIDiskConverter = XAOP.getIDiskConverter();
    this.OooO0o0 = localIDiskConverter;
    this.OooO0Oo = -1;
    int i = Utils.OooO0O0(paramContext);
    this.OooO0oO = i;
  }
  
  public static long OooOO0(File paramFile)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramFile;
    return m54207b69.F54207b69_06(951, arrayOfObject);
  }
  
  public Builder OooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Builder)m54207b69.F54207b69_09(942, arrayOfObject);
  }
  
  public XCache OooO0oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (XCache)m54207b69.F54207b69_09(950, arrayOfObject);
  }
  
  public Builder OooOO0O(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (Builder)m54207b69.F54207b69_09(952, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.cache.XCache.Builder
 * JD-Core Version:    0.7.0.1
 */