package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.activity.result.PickVisualMediaRequest;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$PickVisualMedia
  extends ActivityResultContract
{
  public static final ActivityResultContracts.PickVisualMedia.Companion OooO00o;
  
  static
  {
    ActivityResultContracts.PickVisualMedia.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public static final boolean isPhotoPickerAvailable()
  {
    return OooO00o.isPhotoPickerAvailable();
  }
  
  public static final boolean isSystemPickerAvailable$activity_release()
  {
    return OooO00o.isSystemPickerAvailable$activity_release();
  }
  
  public Intent OooO0Oo(Context paramContext, PickVisualMediaRequest paramPickVisualMediaRequest)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramPickVisualMediaRequest, "input");
    Object localObject1 = OooO00o;
    boolean bool = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).isSystemPickerAvailable$activity_release();
    Object localObject2;
    if (bool)
    {
      paramContext = new android/content/Intent;
      localObject2 = "android.provider.action.PICK_IMAGES";
      paramContext.<init>((String)localObject2);
      paramPickVisualMediaRequest = paramPickVisualMediaRequest.getMediaType();
      paramPickVisualMediaRequest = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramPickVisualMediaRequest);
      paramContext.setType(paramPickVisualMediaRequest);
    }
    else
    {
      bool = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0o0(paramContext);
      String str = "Required value was null.";
      if (bool)
      {
        paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0O0(paramContext);
        if (paramContext != null)
        {
          paramContext = paramContext.activityInfo;
          localObject2 = new android/content/Intent;
          str = "androidx.activity.result.contract.action.PICK_IMAGES";
          ((Intent)localObject2).<init>(str);
        }
      }
      for (;;)
      {
        str = paramContext.applicationInfo.packageName;
        paramContext = paramContext.name;
        ((Intent)localObject2).setClassName(str, paramContext);
        paramContext = paramPickVisualMediaRequest.getMediaType();
        paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramContext);
        ((Intent)localObject2).setType(paramContext);
        return (Context)localObject2;
        paramContext = new java/lang/IllegalStateException;
        paramPickVisualMediaRequest = str.toString();
        paramContext.<init>(paramPickVisualMediaRequest);
        throw paramContext;
        bool = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0Oo(paramContext);
        if (!bool) {
          break label235;
        }
        paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO00o(paramContext);
        if (paramContext == null) {
          break;
        }
        paramContext = paramContext.activityInfo;
        localObject2 = new android/content/Intent;
        str = "com.google.android.gms.provider.action.PICK_IMAGES";
        ((Intent)localObject2).<init>(str);
      }
      paramContext = new java/lang/IllegalStateException;
      paramPickVisualMediaRequest = str.toString();
      paramContext.<init>(paramPickVisualMediaRequest);
      throw paramContext;
      label235:
      paramContext = new android/content/Intent;
      localObject2 = "android.intent.action.OPEN_DOCUMENT";
      paramContext.<init>((String)localObject2);
      paramPickVisualMediaRequest = paramPickVisualMediaRequest.getMediaType();
      paramPickVisualMediaRequest = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramPickVisualMediaRequest);
      paramContext.setType(paramPickVisualMediaRequest);
      paramPickVisualMediaRequest = paramContext.getType();
      if (paramPickVisualMediaRequest == null)
      {
        paramContext.setType("*/*");
        paramPickVisualMediaRequest = new String[] { "image/*", "video/*" };
        localObject1 = "android.intent.extra.MIME_TYPES";
        paramContext.putExtra((String)localObject1, paramPickVisualMediaRequest);
      }
    }
    return paramContext;
  }
  
  public final Uri OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    Uri localUri1;
    if (paramInt == i)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localUri1 = null;
    }
    i = 0;
    Uri localUri2 = null;
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null)
    {
      localUri1 = paramIntent.getData();
      if (localUri1 == null) {
        localUri1 = (Uri)CollectionsKt.Oooo0oO(ActivityResultContracts.GetMultipleContents.OooO00o.OooO00o(paramIntent));
      }
      localUri2 = localUri1;
    }
    return localUri2;
  }
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, PickVisualMediaRequest paramPickVisualMediaRequest)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramPickVisualMediaRequest, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia
 * JD-Core Version:    0.7.0.1
 */