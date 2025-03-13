package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$CreateDocument
  extends ActivityResultContract
{
  public final String OooO00o;
  
  public ActivityResultContracts$CreateDocument()
  {
    this("*/*");
  }
  
  public ActivityResultContracts$CreateDocument(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public Intent OooO0Oo(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramString, "input");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.intent.action.CREATE_DOCUMENT");
    String str = this.OooO00o;
    paramContext = paramContext.setType(str).putExtra("android.intent.extra.TITLE", paramString);
    Intrinsics.OooO0o0(paramContext, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
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
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramString, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.CreateDocument
 * JD-Core Version:    0.7.0.1
 */