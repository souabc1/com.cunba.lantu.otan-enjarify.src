package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$PickContact
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, Void paramVoid)
  {
    Intrinsics.OooO0o(paramContext, "context");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.intent.action.PICK");
    paramContext = paramContext.setType("vnd.android.cursor.dir/contact");
    Intrinsics.OooO0o0(paramContext, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
    return paramContext;
  }
  
  public Uri OooO0o0(int paramInt, Intent paramIntent)
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickContact
 * JD-Core Version:    0.7.0.1
 */