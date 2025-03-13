package androidx.activity.result.contract;

import OooO00o.OooO0O0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$PickVisualMedia$Companion
{
  public final ResolveInfo OooO00o(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    paramContext = paramContext.getPackageManager();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.provider.action.PICK_IMAGES");
    return paramContext.resolveActivity(localIntent, 1114112);
  }
  
  public final ResolveInfo OooO0O0(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    paramContext = paramContext.getPackageManager();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("androidx.activity.result.contract.action.PICK_IMAGES");
    return paramContext.resolveActivity(localIntent, 1114112);
  }
  
  public final String OooO0OO(ActivityResultContracts.PickVisualMedia.VisualMediaType paramVisualMediaType)
  {
    String str = "input";
    Intrinsics.OooO0o(paramVisualMediaType, str);
    boolean bool1 = paramVisualMediaType instanceof ActivityResultContracts.PickVisualMedia.ImageOnly;
    if (bool1)
    {
      paramVisualMediaType = "image/*";
    }
    else
    {
      bool1 = paramVisualMediaType instanceof ActivityResultContracts.PickVisualMedia.VideoOnly;
      if (bool1)
      {
        paramVisualMediaType = "video/*";
      }
      else
      {
        bool1 = paramVisualMediaType instanceof ActivityResultContracts.PickVisualMedia.SingleMimeType;
        if (bool1)
        {
          paramVisualMediaType = ((ActivityResultContracts.PickVisualMedia.SingleMimeType)paramVisualMediaType).getMimeType();
        }
        else
        {
          boolean bool2 = paramVisualMediaType instanceof ActivityResultContracts.PickVisualMedia.ImageAndVideo;
          if (!bool2) {
            break label76;
          }
          bool2 = false;
          paramVisualMediaType = null;
        }
      }
    }
    return paramVisualMediaType;
    label76:
    paramVisualMediaType = new kotlin/NoWhenBranchMatchedException;
    paramVisualMediaType.<init>();
    throw paramVisualMediaType;
  }
  
  public final boolean OooO0Oo(Context paramContext)
  {
    String str = "context";
    Intrinsics.OooO0o(paramContext, str);
    paramContext = OooO00o(paramContext);
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramContext = null;
    }
    return bool;
  }
  
  public final boolean OooO0o0(Context paramContext)
  {
    String str = "context";
    Intrinsics.OooO0o(paramContext, str);
    paramContext = OooO0O0(paramContext);
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramContext = null;
    }
    return bool;
  }
  
  public final boolean isPhotoPickerAvailable()
  {
    return isSystemPickerAvailable$activity_release();
  }
  
  public final boolean isSystemPickerAvailable$activity_release()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    boolean bool = true;
    if (i < j)
    {
      j = 0;
      int k = 30;
      if (i >= k)
      {
        i = OooO0O0.OooO00o(k);
        k = 2;
        if (i >= k) {}
      }
      else
      {
        bool = false;
      }
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
 * JD-Core Version:    0.7.0.1
 */