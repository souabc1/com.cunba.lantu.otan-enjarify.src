package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$TakePicturePreview
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, Void paramVoid)
  {
    Intrinsics.OooO0o(paramContext, "context");
    paramContext = new android/content/Intent;
    paramContext.<init>("android.media.action.IMAGE_CAPTURE");
    return paramContext;
  }
  
  public final Bitmap OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    Parcelable localParcelable;
    if (paramInt == i)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localParcelable = null;
    }
    i = 0;
    Object localObject = null;
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null)
    {
      localParcelable = paramIntent.getParcelableExtra("data");
      localObject = localParcelable;
      localObject = (Bitmap)localParcelable;
    }
    return localObject;
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, Void paramVoid)
  {
    Intrinsics.OooO0o(paramContext, "context");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.TakePicturePreview
 * JD-Core Version:    0.7.0.1
 */