package androidx.navigation;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class NavigatorProvider$Companion
{
  public final String OooO00o(Class paramClass)
  {
    Intrinsics.OooO0o(paramClass, "navigatorClass");
    Object localObject = (String)NavigatorProvider.OooO00o().get(paramClass);
    if (localObject == null)
    {
      localObject = (Navigator.Name)paramClass.getAnnotation(Navigator.Name.class);
      if (localObject != null) {
        localObject = ((Navigator.Name)localObject).value();
      } else {
        localObject = null;
      }
      boolean bool = OooO0O0((String)localObject);
      if (bool)
      {
        Map localMap = NavigatorProvider.OooO00o();
        localMap.put(paramClass, localObject);
      }
      else
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("No @Navigator.Name annotation found for ");
        paramClass = paramClass.getSimpleName();
        ((StringBuilder)localObject).append(paramClass);
        paramClass = ((StringBuilder)localObject).toString();
        localObject = new java/lang/IllegalArgumentException;
        paramClass = paramClass.toString();
        ((IllegalArgumentException)localObject).<init>(paramClass);
        throw ((Throwable)localObject);
      }
    }
    Intrinsics.OooO0OO(localObject);
    return localObject;
  }
  
  public final boolean OooO0O0(String paramString)
  {
    boolean bool = false;
    if (paramString != null)
    {
      int i = paramString.length();
      int j = 1;
      if (i > 0)
      {
        i = j;
      }
      else
      {
        i = 0;
        paramString = null;
      }
      if (i != 0) {
        bool = j;
      }
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavigatorProvider.Companion
 * JD-Core Version:    0.7.0.1
 */