package com.cunba.lantu.otan.filepicker.config;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class FilePickerManager
{
  public static final FilePickerManager OooO00o;
  public static WeakReference OooO0O0;
  public static FilePickerConfig OooO0OO;
  public static List OooO0Oo;
  
  static
  {
    Object localObject = new com/cunba/lantu/otan/filepicker/config/FilePickerManager;
    ((FilePickerManager)localObject).<init>();
    OooO00o = (FilePickerManager)localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    OooO0Oo = (List)localObject;
  }
  
  public static final FilePickerConfig OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (FilePickerConfig)m54207b69.F54207b69_09(289, arrayOfObject);
  }
  
  public static final String getInternalStoragePath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(291, arrayOfObject);
  }
  
  public static final String getSDCardPath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(292, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(290, arrayOfObject);
  }
  
  public final FilePickerConfig getConfig$app_ZHRelease()
  {
    FilePickerConfig localFilePickerConfig = OooO0OO;
    if (localFilePickerConfig != null) {
      return localFilePickerConfig;
    }
    Intrinsics.OooOo(m54207b69.F54207b69_11("'p132020191D1C"));
    return null;
  }
  
  public final WeakReference getContextRef$app_ZHRelease()
  {
    return OooO0O0;
  }
  
  public final void setConfig$app_ZHRelease(FilePickerConfig paramFilePickerConfig)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramFilePickerConfig, str);
    OooO0OO = paramFilePickerConfig;
  }
  
  public final void setContextRef$app_ZHRelease(WeakReference paramWeakReference)
  {
    OooO0O0 = paramWeakReference;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.filepicker.config.FilePickerManager
 * JD-Core Version:    0.7.0.1
 */