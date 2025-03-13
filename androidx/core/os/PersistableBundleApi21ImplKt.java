package androidx.core.os;

import android.os.BaseBundle;
import android.os.PersistableBundle;
import kotlin.jvm.internal.Intrinsics;

final class PersistableBundleApi21ImplKt
{
  public static final PersistableBundleApi21ImplKt OooO00o;
  
  static
  {
    PersistableBundleApi21ImplKt localPersistableBundleApi21ImplKt = new androidx/core/os/PersistableBundleApi21ImplKt;
    localPersistableBundleApi21ImplKt.<init>();
    OooO00o = localPersistableBundleApi21ImplKt;
  }
  
  public static final PersistableBundle OooO00o(int paramInt)
  {
    PersistableBundle localPersistableBundle = new android/os/PersistableBundle;
    localPersistableBundle.<init>(paramInt);
    return localPersistableBundle;
  }
  
  public static final void OooO0O0(PersistableBundle paramPersistableBundle, String paramString, Object paramObject)
  {
    Object localObject = "persistableBundle";
    Intrinsics.OooO0o(paramPersistableBundle, (String)localObject);
    boolean bool1;
    if (paramObject == null) {
      bool1 = false;
    }
    for (paramObject = null;; paramObject = (String)paramObject)
    {
      paramPersistableBundle.putString(paramString, paramObject);
      break label340;
      bool2 = paramObject instanceof Boolean;
      if (bool2)
      {
        paramObject = (Boolean)paramObject;
        bool1 = paramObject.booleanValue();
        PersistableBundleApi22ImplKt.OooO00o(paramPersistableBundle, paramString, bool1);
        break label340;
      }
      bool2 = paramObject instanceof Double;
      if (bool2)
      {
        paramObject = (Number)paramObject;
        double d = paramObject.doubleValue();
        paramPersistableBundle.putDouble(paramString, d);
        break label340;
      }
      bool2 = paramObject instanceof Integer;
      if (bool2)
      {
        paramObject = (Number)paramObject;
        int i = paramObject.intValue();
        paramPersistableBundle.putInt(paramString, i);
        break label340;
      }
      bool2 = paramObject instanceof Long;
      if (bool2)
      {
        paramObject = (Number)paramObject;
        long l = paramObject.longValue();
        paramPersistableBundle.putLong(paramString, l);
        break label340;
      }
      bool2 = paramObject instanceof String;
      if (!bool2) {
        break;
      }
    }
    boolean bool2 = paramObject instanceof boolean[];
    char c;
    String str1;
    if (bool2)
    {
      paramObject = (boolean[])paramObject;
      PersistableBundleApi22ImplKt.OooO0O0(paramPersistableBundle, paramString, paramObject);
    }
    else
    {
      bool2 = paramObject instanceof double[];
      if (bool2)
      {
        paramObject = (double[])paramObject;
        paramPersistableBundle.putDoubleArray(paramString, paramObject);
      }
      else
      {
        bool2 = paramObject instanceof int[];
        if (bool2)
        {
          paramObject = (int[])paramObject;
          paramPersistableBundle.putIntArray(paramString, paramObject);
        }
        else
        {
          bool2 = paramObject instanceof long[];
          if (bool2)
          {
            paramObject = (long[])paramObject;
            paramPersistableBundle.putLongArray(paramString, paramObject);
          }
          else
          {
            bool2 = paramObject instanceof Object[];
            c = '"';
            str1 = " for key \"";
            if (!bool2) {
              break label403;
            }
            localObject = paramObject.getClass().getComponentType();
            Intrinsics.OooO0OO(localObject);
            String str2 = String.class;
            boolean bool3 = str2.isAssignableFrom((Class)localObject);
            if (!bool3) {
              break label341;
            }
            localObject = "null cannot be cast to non-null type kotlin.Array<kotlin.String>";
            Intrinsics.OooO0Oo(paramObject, (String)localObject);
            paramObject = (String[])paramObject;
            paramPersistableBundle.putStringArray(paramString, paramObject);
          }
        }
      }
    }
    label340:
    return;
    label341:
    paramPersistableBundle = ((Class)localObject).getCanonicalName();
    paramObject = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Illegal value array type ");
    ((StringBuilder)localObject).append(paramPersistableBundle);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(c);
    paramPersistableBundle = ((StringBuilder)localObject).toString();
    paramObject.<init>(paramPersistableBundle);
    throw paramObject;
    label403:
    paramPersistableBundle = paramObject.getClass().getCanonicalName();
    paramObject = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Illegal value type ");
    ((StringBuilder)localObject).append(paramPersistableBundle);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(c);
    paramPersistableBundle = ((StringBuilder)localObject).toString();
    paramObject.<init>(paramPersistableBundle);
    throw paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.PersistableBundleApi21ImplKt
 * JD-Core Version:    0.7.0.1
 */