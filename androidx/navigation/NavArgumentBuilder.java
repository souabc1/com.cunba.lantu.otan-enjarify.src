package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class NavArgumentBuilder
{
  public final NavArgument.Builder OooO00o;
  public NavType OooO0O0;
  public boolean OooO0OO;
  public Object OooO0Oo;
  
  public NavArgumentBuilder()
  {
    NavArgument.Builder localBuilder = new androidx/navigation/NavArgument$Builder;
    localBuilder.<init>();
    this.OooO00o = localBuilder;
  }
  
  public final Object getDefaultValue()
  {
    return this.OooO0Oo;
  }
  
  public final boolean getNullable()
  {
    return this.OooO0OO;
  }
  
  public final NavType getType()
  {
    Object localObject = this.OooO0O0;
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("NavType has not been set on this builder.");
    throw ((Throwable)localObject);
  }
  
  public final void setDefaultValue(Object paramObject)
  {
    this.OooO0Oo = paramObject;
    this.OooO00o.OooO0O0(paramObject);
  }
  
  public final void setNullable(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
    this.OooO00o.OooO0OO(paramBoolean);
  }
  
  public final void setType(NavType paramNavType)
  {
    Intrinsics.OooO0o(paramNavType, "value");
    this.OooO0O0 = paramNavType;
    this.OooO00o.OooO0Oo(paramNavType);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavArgumentBuilder
 * JD-Core Version:    0.7.0.1
 */