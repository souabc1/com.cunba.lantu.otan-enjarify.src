package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$OpenMultipleDocuments
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramArrayOfString, "input");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.intent.action.OPEN_DOCUMENT");
    paramContext = paramContext.putExtra("android.intent.extra.MIME_TYPES", paramArrayOfString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
    Intrinsics.OooO0o0(paramContext, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
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
      localList = ActivityResultContracts.GetMultipleContents.OooO00o.OooO00o(paramIntent);
      if (localList != null) {}
    }
    else
    {
      localList = CollectionsKt.OooO0oo();
    }
    return localList;
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramArrayOfString, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.OpenMultipleDocuments
 * JD-Core Version:    0.7.0.1
 */