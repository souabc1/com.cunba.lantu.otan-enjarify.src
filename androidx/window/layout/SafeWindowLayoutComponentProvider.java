package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

public final class SafeWindowLayoutComponentProvider
{
  public static final SafeWindowLayoutComponentProvider OooO00o;
  public static final Lazy OooO0O0 = LazyKt.OooO0O0(SafeWindowLayoutComponentProvider.windowLayoutComponent.2.o00OoOoo);
  
  static
  {
    SafeWindowLayoutComponentProvider localSafeWindowLayoutComponentProvider = new androidx/window/layout/SafeWindowLayoutComponentProvider;
    localSafeWindowLayoutComponentProvider.<init>();
    OooO00o = localSafeWindowLayoutComponentProvider;
  }
  
  public final boolean OooO(ClassLoader paramClassLoader)
  {
    boolean bool1 = OooOOo0(paramClassLoader);
    if (bool1)
    {
      bool1 = OooOOOO(paramClassLoader);
      if (bool1)
      {
        bool1 = OooOOOo(paramClassLoader);
        if (bool1)
        {
          bool2 = OooOOO0(paramClassLoader);
          if (bool2) {
            return true;
          }
        }
      }
    }
    boolean bool2 = false;
    paramClassLoader = null;
    return bool2;
  }
  
  public final boolean OooOO0(Method paramMethod, Class paramClass)
  {
    return paramMethod.getReturnType().equals(paramClass);
  }
  
  public final boolean OooOO0O(Method paramMethod, KClass paramKClass)
  {
    paramKClass = JvmClassMappingKt.OooO00o(paramKClass);
    return OooOO0(paramMethod, paramKClass);
  }
  
  public final Class OooOO0o(ClassLoader paramClassLoader)
  {
    return paramClassLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
  }
  
  public final boolean OooOOO(Method paramMethod)
  {
    return Modifier.isPublic(paramMethod.getModifiers());
  }
  
  public final boolean OooOOO0(ClassLoader paramClassLoader)
  {
    SafeWindowLayoutComponentProvider.isFoldingFeatureValid.1 local1 = new androidx/window/layout/SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1;
    local1.<init>(paramClassLoader);
    return OooOOo(local1);
  }
  
  public final boolean OooOOOO(ClassLoader paramClassLoader)
  {
    SafeWindowLayoutComponentProvider.isWindowExtensionsValid.1 local1 = new androidx/window/layout/SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1;
    local1.<init>(paramClassLoader);
    return OooOOo(local1);
  }
  
  public final boolean OooOOOo(ClassLoader paramClassLoader)
  {
    SafeWindowLayoutComponentProvider.isWindowLayoutComponentValid.1 local1 = new androidx/window/layout/SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1;
    local1.<init>(paramClassLoader);
    return OooOOo(local1);
  }
  
  public final boolean OooOOo(Function0 paramFunction0)
  {
    boolean bool = false;
    try
    {
      paramFunction0 = paramFunction0.OooO00o();
      paramFunction0 = (Boolean)paramFunction0;
      bool = paramFunction0.booleanValue();
    }
    catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
    {
      label19:
      break label19;
    }
    return bool;
  }
  
  public final boolean OooOOo0(ClassLoader paramClassLoader)
  {
    SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid.1 local1 = new androidx/window/layout/SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1;
    local1.<init>(paramClassLoader);
    return OooOOo(local1);
  }
  
  public final Class OooOOoo(ClassLoader paramClassLoader)
  {
    return paramClassLoader.loadClass("androidx.window.extensions.WindowExtensions");
  }
  
  public final Class OooOo0(ClassLoader paramClassLoader)
  {
    return paramClassLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
  }
  
  public final Class OooOo00(ClassLoader paramClassLoader)
  {
    return paramClassLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
  }
  
  public final WindowLayoutComponent getWindowLayoutComponent()
  {
    return (WindowLayoutComponent)OooO0O0.getValue();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SafeWindowLayoutComponentProvider
 * JD-Core Version:    0.7.0.1
 */