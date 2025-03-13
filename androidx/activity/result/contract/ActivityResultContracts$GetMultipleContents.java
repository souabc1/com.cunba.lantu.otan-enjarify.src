package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$GetMultipleContents
  extends ActivityResultContract
{
  public static final ActivityResultContracts.GetMultipleContents.Companion OooO00o;
  
  static
  {
    ActivityResultContracts.GetMultipleContents.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public Intent OooO0Oo(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramString, "input");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.intent.action.GET_CONTENT");
    paramContext = paramContext.addCategory("android.intent.category.OPENABLE").setType(paramString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
    Intrinsics.OooO0o0(paramContext, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
    return paramContext;
  }
  
  public final List OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    List localList;
    if (paramInt == i)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localList = null;
    }
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null)
    {
      localList = OooO00o.OooO00o(paramIntent);
      if (localList != null) {}
    }
    else
    {
      localList = CollectionsKt.OooO0oo();
    }
    return localList;
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramString, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents
 * JD-Core Version:    0.7.0.1
 */