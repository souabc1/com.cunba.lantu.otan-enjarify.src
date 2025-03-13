package androidx.navigation;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class NavArgument
{
  public final NavType OooO00o;
  public final boolean OooO0O0;
  public final boolean OooO0OO;
  public final Object OooO0Oo;
  
  public NavArgument(NavType paramNavType, boolean paramBoolean1, Object paramObject, boolean paramBoolean2)
  {
    boolean bool1 = paramNavType.isNullableAllowed();
    int i = 0;
    boolean bool2 = true;
    if ((!bool1) && (paramBoolean1))
    {
      bool1 = false;
      str = null;
    }
    else
    {
      bool1 = bool2;
    }
    if (bool1)
    {
      if ((paramBoolean1) || (!paramBoolean2) || (paramObject != null)) {
        i = bool2;
      }
      if (i != 0)
      {
        this.OooO00o = paramNavType;
        this.OooO0O0 = paramBoolean1;
        this.OooO0Oo = paramObject;
        this.OooO0OO = paramBoolean2;
        return;
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Argument with type ");
      paramNavType = paramNavType.getName();
      ((StringBuilder)localObject).append(paramNavType);
      ((StringBuilder)localObject).append(" has null value but is not nullable.");
      paramNavType = ((StringBuilder)localObject).toString();
      localObject = new java/lang/IllegalArgumentException;
      paramNavType = paramNavType.toString();
      ((IllegalArgumentException)localObject).<init>(paramNavType);
      throw ((Throwable)localObject);
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    paramNavType = paramNavType.getName();
    ((StringBuilder)localObject).append(paramNavType);
    ((StringBuilder)localObject).append(" does not allow nullable values");
    paramNavType = ((StringBuilder)localObject).toString();
    localObject = new java/lang/IllegalArgumentException;
    paramNavType = paramNavType.toString();
    ((IllegalArgumentException)localObject).<init>(paramNavType);
    throw ((Throwable)localObject);
  }
  
  public final void OooO00o(String paramString, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramString, "name");
    Object localObject1 = "bundle";
    Intrinsics.OooO0o(paramBundle, (String)localObject1);
    boolean bool = this.OooO0OO;
    if (bool)
    {
      localObject1 = this.OooO00o;
      Object localObject2 = this.OooO0Oo;
      ((NavType)localObject1).OooO0o(paramBundle, paramString, localObject2);
    }
  }
  
  public final boolean OooO0O0(String paramString, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramString, "name");
    Object localObject = "bundle";
    Intrinsics.OooO0o(paramBundle, (String)localObject);
    boolean bool = this.OooO0O0;
    if (!bool)
    {
      bool = paramBundle.containsKey(paramString);
      if (bool)
      {
        localObject = paramBundle.get(paramString);
        if (localObject == null) {
          return false;
        }
      }
    }
    try
    {
      localObject = this.OooO00o;
      ((NavType)localObject).OooO00o(paramBundle, paramString);
      return true;
    }
    catch (ClassCastException localClassCastException) {}
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      Object localObject1 = NavArgument.class;
      Object localObject2 = paramObject.getClass();
      boolean bool2 = Intrinsics.OooO00o(localObject1, localObject2);
      if (bool2)
      {
        paramObject = (NavArgument)paramObject;
        bool2 = this.OooO0O0;
        boolean bool3 = paramObject.OooO0O0;
        if (bool2 != bool3) {
          return false;
        }
        bool2 = this.OooO0OO;
        bool3 = paramObject.OooO0OO;
        if (bool2 != bool3) {
          return false;
        }
        localObject1 = this.OooO00o;
        localObject2 = paramObject.OooO00o;
        bool2 = Intrinsics.OooO00o(localObject1, localObject2);
        if (!bool2) {
          return false;
        }
        localObject1 = this.OooO0Oo;
        paramObject = paramObject.OooO0Oo;
        if (localObject1 != null) {
          bool1 = Intrinsics.OooO00o(localObject1, paramObject);
        } else if (paramObject != null) {
          bool1 = false;
        }
        return bool1;
      }
    }
    return false;
  }
  
  public final Object getDefaultValue()
  {
    return this.OooO0Oo;
  }
  
  public final NavType getType()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    NavType localNavType = this.OooO00o;
    int i = localNavType.hashCode() * 31;
    int j = this.OooO0O0;
    i = (i + j) * 31;
    int k = this.OooO0OO;
    i = (i + k) * 31;
    Object localObject = this.OooO0Oo;
    int m;
    if (localObject != null)
    {
      m = localObject.hashCode();
    }
    else
    {
      m = 0;
      localObject = null;
    }
    return i + m;
  }
  
  public final boolean isDefaultValuePresent()
  {
    return this.OooO0OO;
  }
  
  public final boolean isNullable()
  {
    return this.OooO0O0;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = NavArgument.class.getSimpleName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append(" Type: ");
    Object localObject3 = this.OooO00o;
    ((StringBuilder)localObject2).append(localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = " Nullable: ";
    ((StringBuilder)localObject2).append((String)localObject3);
    boolean bool1 = this.OooO0O0;
    ((StringBuilder)localObject2).append(bool1);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    boolean bool2 = this.OooO0OO;
    if (bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(" DefaultValue: ");
      localObject3 = this.OooO0Oo;
      ((StringBuilder)localObject2).append(localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject1, "sb.toString()");
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavArgument
 * JD-Core Version:    0.7.0.1
 */