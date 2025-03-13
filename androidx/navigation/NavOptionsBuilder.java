package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class NavOptionsBuilder
{
  public final NavOptions.Builder OooO00o;
  public boolean OooO0O0;
  public boolean OooO0OO;
  public int OooO0Oo;
  public boolean OooO0o;
  public String OooO0o0;
  public boolean OooO0oO;
  
  public NavOptionsBuilder()
  {
    NavOptions.Builder localBuilder = new androidx/navigation/NavOptions$Builder;
    localBuilder.<init>();
    this.OooO00o = localBuilder;
    this.OooO0Oo = -1;
  }
  
  private final void setPopUpToRoute(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = StringsKt.OooOO0O(paramString) ^ true;
      if (bool)
      {
        this.OooO0o0 = paramString;
        paramString = null;
        this.OooO0o = false;
      }
      else
      {
        paramString = new java/lang/IllegalArgumentException;
        String str = "Cannot pop up to an empty route".toString();
        paramString.<init>(str);
        throw paramString;
      }
    }
  }
  
  public final void OooO00o(Function1 paramFunction1)
  {
    Intrinsics.OooO0o(paramFunction1, "animBuilder");
    AnimBuilder localAnimBuilder = new androidx/navigation/AnimBuilder;
    localAnimBuilder.<init>();
    paramFunction1.invoke(localAnimBuilder);
    paramFunction1 = this.OooO00o;
    int i = localAnimBuilder.getEnter();
    paramFunction1 = paramFunction1.OooO0O0(i);
    i = localAnimBuilder.getExit();
    paramFunction1 = paramFunction1.OooO0OO(i);
    i = localAnimBuilder.getPopEnter();
    paramFunction1 = paramFunction1.OooO0o0(i);
    int j = localAnimBuilder.getPopExit();
    paramFunction1.OooO0o(j);
  }
  
  public final NavOptions OooO0O0()
  {
    NavOptions.Builder localBuilder = this.OooO00o;
    boolean bool1 = this.OooO0O0;
    localBuilder.OooO0Oo(bool1);
    bool1 = this.OooO0OO;
    localBuilder.OooOO0(bool1);
    String str = this.OooO0o0;
    boolean bool2;
    boolean bool3;
    if (str != null)
    {
      bool2 = this.OooO0o;
      bool3 = this.OooO0oO;
      localBuilder.OooO0oo(str, bool2, bool3);
    }
    else
    {
      int i = this.OooO0Oo;
      bool2 = this.OooO0o;
      bool3 = this.OooO0oO;
      localBuilder.OooO0oO(i, bool2, bool3);
    }
    return localBuilder.OooO00o();
  }
  
  public final void OooO0OO(int paramInt, Function1 paramFunction1)
  {
    Intrinsics.OooO0o(paramFunction1, "popUpToBuilder");
    setPopUpToId$navigation_common_release(paramInt);
    setPopUpToRoute(null);
    PopUpToBuilder localPopUpToBuilder = new androidx/navigation/PopUpToBuilder;
    localPopUpToBuilder.<init>();
    paramFunction1.invoke(localPopUpToBuilder);
    boolean bool = localPopUpToBuilder.getInclusive();
    this.OooO0o = bool;
    paramInt = localPopUpToBuilder.getSaveState();
    this.OooO0oO = paramInt;
  }
  
  public final boolean getLaunchSingleTop()
  {
    return this.OooO0O0;
  }
  
  public final int getPopUpTo()
  {
    return this.OooO0Oo;
  }
  
  public final int getPopUpToId()
  {
    return this.OooO0Oo;
  }
  
  public final String getPopUpToRoute()
  {
    return this.OooO0o0;
  }
  
  public final boolean getRestoreState()
  {
    return this.OooO0OO;
  }
  
  public final void setLaunchSingleTop(boolean paramBoolean)
  {
    this.OooO0O0 = paramBoolean;
  }
  
  public final void setPopUpTo(int paramInt)
  {
    OooO0Oo(this, paramInt, null, 2, null);
  }
  
  public final void setPopUpToId$navigation_common_release(int paramInt)
  {
    this.OooO0Oo = paramInt;
    this.OooO0o = false;
  }
  
  public final void setRestoreState(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavOptionsBuilder
 * JD-Core Version:    0.7.0.1
 */