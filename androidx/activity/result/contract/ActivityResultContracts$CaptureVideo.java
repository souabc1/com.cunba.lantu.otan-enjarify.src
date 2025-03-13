package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$CaptureVideo
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, Uri paramUri)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramUri, "input");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.media.action.VIDEO_CAPTURE");
    paramContext = paramContext.putExtra("output", paramUri);
    Intrinsics.OooO0o0(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
    return paramContext;
  }
  
  public final Boolean OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return Boolean.valueOf(paramInt);
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, Uri paramUri)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramUri, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.CaptureVideo
 * JD-Core Version:    0.7.0.1
 */