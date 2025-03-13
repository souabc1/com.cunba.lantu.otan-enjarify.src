package com.lzf.easyfloat.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import com.lzf.easyfloat.interfaces.OnPermissionResult;
import com.lzf.easyfloat.permission.rom.MeizuUtils;
import com.lzf.easyfloat.permission.rom.RomUtils;
import com.lzf.easyfloat.utils.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class PermissionUtils
{
  public static final PermissionUtils OooO00o;
  
  static
  {
    PermissionUtils localPermissionUtils = new com/lzf/easyfloat/permission/PermissionUtils;
    localPermissionUtils.<init>();
    OooO00o = localPermissionUtils;
  }
  
  public static final boolean OooO00o(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("4J29262641333744");
    Intrinsics.OooO0o(paramContext, str);
    return OooO00o.OooO0Oo(paramContext);
  }
  
  public static final void OooO0OO(Fragment paramFragment)
  {
    Object localObject1 = m54207b69.F54207b69_11("dt120717161D162007");
    Intrinsics.OooO0o(paramFragment, (String)localObject1);
    localObject1 = Settings.class;
    Object localObject2 = "g|3D402A3837372938453B474645304139493F425039384250464A4F4A4B525151";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      localObject2 = "clazz.getDeclaredField(\"…NAGE_OVERLAY_PERMISSION\")";
      Intrinsics.OooO0o0(localObject1, (String)localObject2);
      localObject2 = new android/content/Intent;
      Object localObject3 = null;
      localObject1 = ((Field)localObject1).get(null);
      localObject1 = localObject1.toString();
      ((Intent)localObject2).<init>((String)localObject1);
      localObject1 = "ni19090C050C13125A";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject3 = paramFragment.getActivity();
      localObject3 = ((Context)localObject3).getPackageName();
      localObject1 = Intrinsics.OooOOOO((String)localObject1, localObject3);
      localObject1 = Uri.parse((String)localObject1);
      ((Intent)localObject2).setData((Uri)localObject1);
      int i = 199;
      paramFragment.startActivityForResult((Intent)localObject2, i);
    }
    catch (Exception paramFragment)
    {
      localObject1 = Logger.OooO00o;
      paramFragment = String.valueOf(paramFragment);
      localObject2 = m54207b69.F54207b69_11("r>6E5C4E565B52535E59597555635F5B22232412");
      ((Logger)localObject1).OooO0O0((String)localObject2, paramFragment);
    }
  }
  
  public static final void OooO0o(Activity paramActivity, OnPermissionResult paramOnPermissionResult)
  {
    String str = m54207b69.F54207b69_11(":'4645555155535965");
    Intrinsics.OooO0o(paramActivity, str);
    str = m54207b69.F54207b69_11("P35C5E655945636047486366686D634E556F58");
    Intrinsics.OooO0o(paramOnPermissionResult, str);
    PermissionFragment.o00OoOoo.OooO00o(paramActivity, paramOnPermissionResult);
  }
  
  public final void OooO0O0(Fragment paramFragment)
  {
    Object localObject = RomUtils.OooO00o;
    boolean bool = ((RomUtils)localObject).OooO0O0();
    if (bool) {
      MeizuUtils.OooO00o(paramFragment);
    } else {
      try
      {
        OooO0OO(paramFragment);
      }
      catch (Exception paramFragment)
      {
        localObject = Logger.OooO00o;
        paramFragment = Log.getStackTraceString(paramFragment);
        String str = m54207b69.F54207b69_11("9@27263616382629321C3B2B2E31204241393F397B397E");
        Intrinsics.OooO0o0(paramFragment, str);
        str = m54207b69.F54207b69_11("r>6E5C4E565B52535E59597555635F5B22232412");
        ((Logger)localObject).OooO0O0(str, paramFragment);
      }
    }
  }
  
  public final boolean OooO0Oo(Context paramContext)
  {
    RomUtils localRomUtils = RomUtils.OooO00o;
    boolean bool1 = localRomUtils.OooO0O0();
    boolean bool2;
    if (bool1)
    {
      bool2 = OooO0o0(paramContext);
    }
    else
    {
      bool1 = true;
      Object localObject = Settings.class;
      String str = "=o0C0F032E21131E272113270E1A232A";
      try
      {
        str = m54207b69.F54207b69_11(str);
        Class[] arrayOfClass = new Class[bool1];
        Context localContext = Context.class;
        arrayOfClass[0] = localContext;
        localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
        str = "clazz.getDeclaredMethod(…ys\", Context::class.java)";
        Intrinsics.OooO0o0(localObject, str);
        paramContext = new Object[] { paramContext };
        str = null;
        paramContext = ((Method)localObject).invoke(null, paramContext);
        if (paramContext != null)
        {
          paramContext = (Boolean)paramContext;
          bool2 = paramContext.booleanValue();
        }
        else
        {
          paramContext = new java/lang/NullPointerException;
          localObject = "v`0E160E0F4408071516181E4B0E124E1211242653282456252727672931292A5F343A32286430353B343238794E3C3D3B353240";
          localObject = m54207b69.F54207b69_11((String)localObject);
          paramContext.<init>((String)localObject);
          throw paramContext;
        }
      }
      catch (Exception paramContext)
      {
        Log.getStackTraceString(paramContext);
        bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public final boolean OooO0o0(Context paramContext)
  {
    return MeizuUtils.OooO0O0(paramContext);
  }
  
  public final void OooO0oO(Fragment paramFragment)
  {
    String str = m54207b69.F54207b69_11("dt120717161D162007");
    Intrinsics.OooO0o(paramFragment, str);
    OooO0O0(paramFragment);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.permission.PermissionUtils
 * JD-Core Version:    0.7.0.1
 */