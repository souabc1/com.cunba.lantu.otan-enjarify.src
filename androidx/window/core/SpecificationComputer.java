package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class SpecificationComputer
{
  public static final SpecificationComputer.Companion OooO00o;
  
  static
  {
    SpecificationComputer.Companion localCompanion = new androidx/window/core/SpecificationComputer$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public abstract Object OooO00o();
  
  public final String OooO0O0(Object paramObject, String paramString)
  {
    Intrinsics.OooO0o(paramObject, "value");
    Intrinsics.OooO0o(paramString, "message");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" value: ");
    localStringBuilder.append(paramObject);
    return localStringBuilder.toString();
  }
  
  public abstract SpecificationComputer OooO0OO(String paramString, Function1 paramFunction1);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.core.SpecificationComputer
 * JD-Core Version:    0.7.0.1
 */