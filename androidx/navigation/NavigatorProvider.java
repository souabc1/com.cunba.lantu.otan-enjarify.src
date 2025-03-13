package androidx.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public class NavigatorProvider
{
  public static final NavigatorProvider.Companion OooO0O0;
  public static final Map OooO0OO;
  public final Map OooO00o;
  
  static
  {
    Object localObject = new androidx/navigation/NavigatorProvider$Companion;
    ((NavigatorProvider.Companion)localObject).<init>(null);
    OooO0O0 = (NavigatorProvider.Companion)localObject;
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    OooO0OO = (Map)localObject;
  }
  
  public NavigatorProvider()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    this.OooO00o = localLinkedHashMap;
  }
  
  public final Navigator OooO0O0(Navigator paramNavigator)
  {
    Intrinsics.OooO0o(paramNavigator, "navigator");
    Object localObject = OooO0O0;
    Class localClass = paramNavigator.getClass();
    localObject = ((NavigatorProvider.Companion)localObject).OooO00o(localClass);
    return OooO0OO((String)localObject, paramNavigator);
  }
  
  public Navigator OooO0OO(String paramString, Navigator paramNavigator)
  {
    Intrinsics.OooO0o(paramString, "name");
    Intrinsics.OooO0o(paramNavigator, "navigator");
    Object localObject = OooO0O0;
    boolean bool1 = ((NavigatorProvider.Companion)localObject).OooO0O0(paramString);
    if (bool1)
    {
      localObject = (Navigator)this.OooO00o.get(paramString);
      boolean bool2 = Intrinsics.OooO00o(localObject, paramNavigator);
      if (bool2) {
        return paramNavigator;
      }
      bool2 = false;
      boolean bool3 = true;
      if (localObject != null)
      {
        boolean bool4 = ((Navigator)localObject).isAttached();
        if (bool4 == bool3) {
          bool2 = bool3;
        }
      }
      bool2 ^= bool3;
      String str = "Navigator ";
      if (bool2)
      {
        bool1 = paramNavigator.isAttached() ^ bool3;
        if (bool1) {
          return (Navigator)this.OooO00o.put(paramString, paramNavigator);
        }
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append(str);
        paramString.append(paramNavigator);
        paramString.append(" is already attached to another NavController");
        paramString = paramString.toString();
        paramNavigator = new java/lang/IllegalStateException;
        paramString = paramString.toString();
        paramNavigator.<init>(paramString);
        throw paramNavigator;
      }
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramString.append(str);
      paramString.append(paramNavigator);
      paramString.append(" is replacing an already attached ");
      paramString.append(localObject);
      paramString = paramString.toString();
      paramNavigator = new java/lang/IllegalStateException;
      paramString = paramString.toString();
      paramNavigator.<init>(paramString);
      throw paramNavigator;
    }
    paramString = new java/lang/IllegalArgumentException;
    paramNavigator = "navigator name cannot be an empty string".toString();
    paramString.<init>(paramNavigator);
    throw paramString;
  }
  
  public Navigator OooO0Oo(String paramString)
  {
    Intrinsics.OooO0o(paramString, "name");
    Object localObject = OooO0O0;
    boolean bool = ((NavigatorProvider.Companion)localObject).OooO0O0(paramString);
    if (bool)
    {
      localObject = (Navigator)this.OooO00o.get(paramString);
      if (localObject != null) {
        return localObject;
      }
      localObject = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Could not find Navigator with name \"");
      localStringBuilder.append(paramString);
      localStringBuilder.append("\". You must call NavController.addNavigator() for each navigation type.");
      paramString = localStringBuilder.toString();
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
    paramString = new java/lang/IllegalArgumentException;
    localObject = "navigator name cannot be an empty string".toString();
    paramString.<init>((String)localObject);
    throw paramString;
  }
  
  public final Map getNavigators()
  {
    return MapsKt.OooOO0O(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavigatorProvider
 * JD-Core Version:    0.7.0.1
 */