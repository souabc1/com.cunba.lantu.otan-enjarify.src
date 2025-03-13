package com.lzf.easyfloat.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.lzf.easyfloat.permission.rom.RomUtils;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class DisplayUtils
{
  public static final DisplayUtils OooO00o;
  
  static
  {
    DisplayUtils localDisplayUtils = new com/lzf/easyfloat/utils/DisplayUtils;
    localDisplayUtils.<init>();
    OooO00o = localDisplayUtils;
  }
  
  public final boolean OooO(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("LM3A25252C263F");
    localObject = paramContext.getSystemService((String)localObject);
    if (localObject != null)
    {
      localObject = ((WindowManager)localObject).getDefaultDisplay();
      DisplayMetrics localDisplayMetrics1 = new android/util/DisplayMetrics;
      localDisplayMetrics1.<init>();
      ((Display)localObject).getRealMetrics(localDisplayMetrics1);
      int i = localDisplayMetrics1.heightPixels;
      int j = localDisplayMetrics1.widthPixels;
      DisplayMetrics localDisplayMetrics2 = new android/util/DisplayMetrics;
      localDisplayMetrics2.<init>();
      ((Display)localObject).getMetrics(localDisplayMetrics2);
      int k = localDisplayMetrics2.heightPixels;
      int m = localDisplayMetrics2.widthPixels;
      int n = OooO0OO(paramContext) + k;
      boolean bool = false;
      if (n > i) {
        return false;
      }
      j -= m;
      if (j <= 0)
      {
        i -= k;
        if (i <= 0) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    paramContext = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("*Z343038397E3E413B3C3E3885444C88484B3A408D424A904B4D4D914F4B5354994E444C629E605A65505E5D69A059616E5DA53F6668736B644F746E76797C66");
    paramContext.<init>((String)localObject);
    throw paramContext;
  }
  
  public final int OooO00o(Context paramContext, float paramFloat)
  {
    String str = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str);
    float f = paramContext.getResources().getDisplayMetrics().density;
    return (int)(paramFloat * f + 0.5F);
  }
  
  public final int OooO0O0(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str);
    boolean bool = OooO0oo(paramContext);
    int i;
    if (bool)
    {
      i = OooO0OO(paramContext);
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  public final int OooO0OO(Context paramContext)
  {
    String str1 = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str1);
    paramContext = paramContext.getResources();
    str1 = m54207b69.F54207b69_11("xO2B27242D25");
    String str2 = m54207b69.F54207b69_11(")l0D030A21070A0E");
    String str3 = m54207b69.F54207b69_11("f}131D0D171E210F1B1A1C2C2A281C302428252C281D");
    int i = paramContext.getIdentifier(str3, str1, str2);
    int j;
    if (i > 0)
    {
      j = paramContext.getDimensionPixelSize(i);
    }
    else
    {
      j = 0;
      paramContext = null;
    }
    return j;
  }
  
  public final int OooO0Oo(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str);
    return OooO0o0(paramContext).y;
  }
  
  public final int OooO0o(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    localObject = m54207b69.F54207b69_11("LM3A25252C263F");
    localObject = paramContext.getSystemService((String)localObject);
    if (localObject != null)
    {
      localObject = (WindowManager)localObject;
      DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
      localDisplayMetrics.<init>();
      ((WindowManager)localObject).getDefaultDisplay().getRealMetrics(localDisplayMetrics);
      localObject = paramContext.getResources().getConfiguration();
      int i = ((Configuration)localObject).orientation;
      int j = 1;
      int k;
      if (i == j)
      {
        k = localDisplayMetrics.widthPixels;
      }
      else
      {
        i = localDisplayMetrics.widthPixels;
        k = OooO0O0(paramContext);
        k = i - k;
      }
      return k;
    }
    paramContext = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("*Z343038397E3E413B3C3E3885444C88484B3A408D424A904B4D4D914F4B5354994E444C629E605A65505E5D69A059616E5DA53F6668736B644F746E76797C66");
    paramContext.<init>((String)localObject);
    throw paramContext;
  }
  
  public final Point OooO0o0(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    localObject = new android/graphics/Point;
    ((Point)localObject).<init>();
    String str = m54207b69.F54207b69_11("LM3A25252C263F");
    paramContext = paramContext.getSystemService(str);
    if (paramContext != null)
    {
      ((WindowManager)paramContext).getDefaultDisplay().getRealSize((Point)localObject);
      return localObject;
    }
    paramContext = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("*Z343038397E3E413B3C3E3885444C88484B3A408D424A904B4D4D914F4B5354994E444C629E605A65505E5D69A059616E5DA53F6668736B644F746E76797C66");
    paramContext.<init>((String)localObject);
    throw paramContext;
  }
  
  public final int OooO0oO(Context paramContext)
  {
    String str1 = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str1);
    paramContext = paramContext.getResources();
    str1 = m54207b69.F54207b69_11("xO2B27242D25");
    String str2 = m54207b69.F54207b69_11(")l0D030A21070A0E");
    String str3 = m54207b69.F54207b69_11("Mb111705191B1643070B1947151318131926");
    int i = paramContext.getIdentifier(str3, str1, str2);
    int j;
    if (i > 0)
    {
      j = paramContext.getDimensionPixelSize(i);
    }
    else
    {
      j = 0;
      paramContext = null;
    }
    return j;
  }
  
  public final boolean OooO0oo(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    int i = OooO0OO(paramContext);
    boolean bool2 = false;
    if (i != 0)
    {
      localObject = RomUtils.OooO00o;
      boolean bool3 = ((RomUtils)localObject).OooO00o();
      if (bool3)
      {
        bool3 = OooOO0(paramContext);
        if (bool3) {}
      }
      else
      {
        bool3 = ((RomUtils)localObject).OooO0OO();
        if (bool3)
        {
          bool3 = OooOO0O(paramContext);
          if (bool3) {}
        }
        else
        {
          boolean bool1 = ((RomUtils)localObject).OooO0Oo();
          if (bool1)
          {
            bool1 = OooOO0o(paramContext);
            if (bool1) {}
          }
          else
          {
            bool2 = OooO(paramContext);
          }
        }
      }
    }
    return bool2;
  }
  
  public final boolean OooOO0(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    String str = m54207b69.F54207b69_11(":15F51495B5A554B5F66685D5B4F7B66517E6D6A72");
    boolean bool = false;
    int i = Settings.Global.getInt(paramContext, str, 0);
    if (i != 0) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean OooOO0O(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    String str = m54207b69.F54207b69_11("**4C465A4C537A5260557E4E566882565A68");
    boolean bool = false;
    int i = Settings.Global.getInt(paramContext, str, 0);
    if (i != 0) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean OooOO0o(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    String str = m54207b69.F54207b69_11("a;555B4F55605F55595C5E6E676A555D5D596F766769");
    boolean bool = false;
    int i = Settings.Secure.getInt(paramContext, str, 0);
    if (i != 0) {
      bool = true;
    }
    return bool;
  }
  
  public final int OooOOO(View paramView)
  {
    String str = m54207b69.F54207b69_11(">+5D43505F");
    Intrinsics.OooO0o(paramView, str);
    paramView = paramView.getContext().getApplicationContext();
    str = m54207b69.F54207b69_11("Fr041C1908601623230E201411682010112E2C23261A30333349363621332724");
    Intrinsics.OooO0o0(paramView, str);
    return OooO0oO(paramView);
  }
  
  public final int OooOOO0(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    localObject = OooO0o0(paramContext);
    int i = ((Point)localObject).x;
    int j = ((Point)localObject).y;
    if (i > j) {
      return j;
    }
    int k = OooO0O0(paramContext);
    return j - k;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.utils.DisplayUtils
 * JD-Core Version:    0.7.0.1
 */