package com.cunba.lantu.otan.ui.loader;

import android.content.Context;
import com.xuexiang.xhttp2.subsciber.impl.IProgressLoader;
import m54207b69;

public final class ProgressLoader
{
  public static IProgressLoaderFactory OooO00o;
  
  static
  {
    MiniProgressLoaderFactory localMiniProgressLoaderFactory = new com/cunba/lantu/otan/ui/loader/MiniProgressLoaderFactory;
    localMiniProgressLoaderFactory.<init>();
    OooO00o = localMiniProgressLoaderFactory;
  }
  
  private ProgressLoader()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static IProgressLoader OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (IProgressLoader)m54207b69.F54207b69_09(666, arrayOfObject);
  }
  
  public static void setIProgressLoaderFactory(IProgressLoaderFactory paramIProgressLoaderFactory)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramIProgressLoaderFactory;
    m54207b69.F54207b69_00(667, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.ui.loader.ProgressLoader
 * JD-Core Version:    0.7.0.1
 */