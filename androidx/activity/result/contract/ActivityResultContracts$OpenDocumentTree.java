package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$OpenDocumentTree
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, Uri paramUri)
  {
    Intrinsics.OooO0o(paramContext, "context");
    paramContext = new android/content/Intent;
    String str = "android.intent.action.OPEN_DOCUMENT_TREE";
    paramContext.<init>(str);
    if (paramUri != null)
    {
      str = "android.provider.extra.INITIAL_URI";
      paramContext.putExtra(str, paramUri);
    }
    return paramContext;
  }
  
  public final Uri OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    i = 0;
    Uri localUri = null;
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null) {
      localUri = paramIntent.getData();
    }
    return localUri;
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, Uri paramUri)
  {
    Intrinsics.OooO0o(paramContext, "context");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.OpenDocumentTree
 * JD-Core Version:    0.7.0.1
 */