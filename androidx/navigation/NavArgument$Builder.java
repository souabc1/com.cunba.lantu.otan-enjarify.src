package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class NavArgument$Builder
{
  public NavType OooO00o;
  public boolean OooO0O0;
  public Object OooO0OO;
  public boolean OooO0Oo;
  
  public final NavArgument OooO00o()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 == null)
    {
      localObject1 = NavType.OooO0OO;
      localObject2 = this.OooO0OO;
      localObject1 = ((NavType.Companion)localObject1).OooO0OO(localObject2);
      localObject2 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>";
      Intrinsics.OooO0Oo(localObject1, (String)localObject2);
    }
    Object localObject2 = new androidx/navigation/NavArgument;
    boolean bool1 = this.OooO0O0;
    Object localObject3 = this.OooO0OO;
    boolean bool2 = this.OooO0Oo;
    ((NavArgument)localObject2).<init>((NavType)localObject1, bool1, localObject3, bool2);
    return localObject2;
  }
  
  public final Builder OooO0O0(Object paramObject)
  {
    this.OooO0OO = paramObject;
    this.OooO0Oo = true;
    return this;
  }
  
  public final Builder OooO0OO(boolean paramBoolean)
  {
    this.OooO0O0 = paramBoolean;
    return this;
  }
  
  public final Builder OooO0Oo(NavType paramNavType)
  {
    Intrinsics.OooO0o(paramNavType, "type");
    this.OooO00o = paramNavType;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavArgument.Builder
 * JD-Core Version:    0.7.0.1
 */