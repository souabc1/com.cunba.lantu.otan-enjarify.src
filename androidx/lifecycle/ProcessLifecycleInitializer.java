package androidx.lifecycle;

import android.content.Context;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessLifecycleInitializer
  implements Initializer
{
  public List OooO0O0()
  {
    return CollectionsKt.OooO0oo();
  }
  
  public LifecycleOwner OooO0OO(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject = AppInitializer.OooO0o0(paramContext);
    Intrinsics.OooO0o0(localObject, "getInstance(context)");
    ProcessLifecycleInitializer localProcessLifecycleInitializer = ProcessLifecycleInitializer.class;
    boolean bool = ((AppInitializer)localObject).OooO0oO(localProcessLifecycleInitializer);
    if (bool)
    {
      LifecycleDispatcher.OooO00o(paramContext);
      localObject = ProcessLifecycleOwner.o00OooOo;
      ((ProcessLifecycleOwner.Companion)localObject).OooO00o(paramContext);
      return ((ProcessLifecycleOwner.Companion)localObject).get();
    }
    paramContext = new java/lang/IllegalStateException;
    localObject = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString();
    paramContext.<init>((String)localObject);
    throw paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleInitializer
 * JD-Core Version:    0.7.0.1
 */