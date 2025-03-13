package androidx.window.layout;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarAdapter$Companion
{
  public final int OooO00o(SidecarDeviceState paramSidecarDeviceState)
  {
    String str = "sidecarDeviceState";
    Intrinsics.OooO0o(paramSidecarDeviceState, str);
    Object localObject1;
    Object localObject2;
    try
    {
      return paramSidecarDeviceState.posture;
    }
    catch (NoSuchFieldError localNoSuchFieldError)
    {
      str = null;
      localObject1 = SidecarDeviceState.class;
      localObject2 = "getPosture";
    }
    try
    {
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[0];
      paramSidecarDeviceState = ((Method)localObject1).invoke(paramSidecarDeviceState, (Object[])localObject2);
      if (paramSidecarDeviceState != null)
      {
        paramSidecarDeviceState = (Integer)paramSidecarDeviceState;
        return paramSidecarDeviceState.intValue();
      }
      paramSidecarDeviceState = new java/lang/NullPointerException;
      localObject1 = "null cannot be cast to non-null type kotlin.Int";
      paramSidecarDeviceState.<init>((String)localObject1);
      throw paramSidecarDeviceState;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
    {
      label80:
      break label80;
    }
    return 0;
  }
  
  public final int OooO0O0(SidecarDeviceState paramSidecarDeviceState)
  {
    String str = "sidecarDeviceState";
    Intrinsics.OooO0o(paramSidecarDeviceState, str);
    int i = OooO00o(paramSidecarDeviceState);
    if (i >= 0)
    {
      int j = 4;
      if (i <= j) {}
    }
    else
    {
      i = 0;
      paramSidecarDeviceState = null;
    }
    return i;
  }
  
  public final List OooO0OO(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    Object localObject1 = "info";
    Intrinsics.OooO0o(paramSidecarWindowLayoutInfo, (String)localObject1);
    Object localObject2;
    try
    {
      localObject1 = paramSidecarWindowLayoutInfo.displayFeatures;
      if (localObject1 == null) {
        localObject1 = CollectionsKt.OooO0oo();
      }
      return localObject1;
    }
    catch (NoSuchFieldError localNoSuchFieldError)
    {
      localObject1 = SidecarWindowLayoutInfo.class;
      localObject2 = "getDisplayFeatures";
    }
    try
    {
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[0];
      paramSidecarWindowLayoutInfo = ((Method)localObject1).invoke(paramSidecarWindowLayoutInfo, (Object[])localObject2);
      if (paramSidecarWindowLayoutInfo != null) {
        return (List)paramSidecarWindowLayoutInfo;
      }
      paramSidecarWindowLayoutInfo = new java/lang/NullPointerException;
      localObject1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>";
      paramSidecarWindowLayoutInfo.<init>((String)localObject1);
      throw paramSidecarWindowLayoutInfo;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
    {
      label79:
      break label79;
    }
    return CollectionsKt.OooO0oo();
  }
  
  public final void OooO0Oo(SidecarDeviceState paramSidecarDeviceState, int paramInt)
  {
    Object localObject1 = "sidecarDeviceState";
    Intrinsics.OooO0o(paramSidecarDeviceState, (String)localObject1);
    Object localObject2;
    int i;
    try
    {
      paramSidecarDeviceState.posture = paramInt;
    }
    catch (NoSuchFieldError localNoSuchFieldError)
    {
      localObject1 = SidecarDeviceState.class;
      localObject2 = "setPosture";
      i = 1;
    }
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      localObject2[0] = localInteger;
      ((Method)localObject1).invoke(paramSidecarDeviceState, (Object[])localObject2);
      label81:
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
    {
      break label81;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarAdapter.Companion
 * JD-Core Version:    0.7.0.1
 */