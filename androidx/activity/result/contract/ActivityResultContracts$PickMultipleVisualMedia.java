package androidx.activity.result.contract;

import OooO00o.OooO00o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.activity.result.PickVisualMediaRequest;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class ActivityResultContracts$PickMultipleVisualMedia
  extends ActivityResultContract
{
  public static final ActivityResultContracts.PickMultipleVisualMedia.Companion OooO0O0;
  public final int OooO00o;
  
  static
  {
    ActivityResultContracts.PickMultipleVisualMedia.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;
    localCompanion.<init>(null);
    OooO0O0 = localCompanion;
  }
  
  public ActivityResultContracts$PickMultipleVisualMedia()
  {
    this(0, 1, null);
  }
  
  public ActivityResultContracts$PickMultipleVisualMedia(int paramInt)
  {
    this.OooO00o = paramInt;
    int i = 1;
    if (paramInt <= i)
    {
      i = 0;
      str = null;
    }
    if (i != 0) {
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = "Max items must be higher than 1".toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public Intent OooO0Oo(Context paramContext, PickVisualMediaRequest paramPickVisualMediaRequest)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramPickVisualMediaRequest, "input");
    Object localObject1 = ActivityResultContracts.PickVisualMedia.OooO00o;
    boolean bool1 = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).isSystemPickerAvailable$activity_release();
    boolean bool2 = true;
    Object localObject2;
    String str1;
    if (bool1)
    {
      paramContext = new android/content/Intent;
      localObject2 = "android.provider.action.PICK_IMAGES";
      paramContext.<init>((String)localObject2);
      paramPickVisualMediaRequest = paramPickVisualMediaRequest.getMediaType();
      paramPickVisualMediaRequest = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramPickVisualMediaRequest);
      paramContext.setType(paramPickVisualMediaRequest);
      int i = this.OooO00o;
      int j = OooO00o.OooO00o();
      if (i > j)
      {
        bool2 = false;
        str1 = null;
      }
      if (bool2)
      {
        paramPickVisualMediaRequest = "android.provider.extra.PICK_IMAGES_MAX";
        j = this.OooO00o;
        paramContext.putExtra(paramPickVisualMediaRequest, j);
      }
      else
      {
        paramContext = new java/lang/IllegalArgumentException;
        paramPickVisualMediaRequest = "Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString();
        paramContext.<init>(paramPickVisualMediaRequest);
        throw paramContext;
      }
    }
    else
    {
      bool1 = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0o0(paramContext);
      String str2 = "Required value was null.";
      String str3 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";
      int k;
      if (bool1)
      {
        paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0O0(paramContext);
        if (paramContext != null)
        {
          paramContext = paramContext.activityInfo;
          localObject2 = new android/content/Intent;
          ((Intent)localObject2).<init>("androidx.activity.result.contract.action.PICK_IMAGES");
          str1 = paramContext.applicationInfo.packageName;
          paramContext = paramContext.name;
          ((Intent)localObject2).setClassName(str1, paramContext);
          paramContext = paramPickVisualMediaRequest.getMediaType();
          paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramContext);
          ((Intent)localObject2).setType(paramContext);
          k = this.OooO00o;
          ((Intent)localObject2).putExtra(str3, k);
          paramContext = (Context)localObject2;
        }
        else
        {
          paramContext = new java/lang/IllegalStateException;
          paramPickVisualMediaRequest = str2.toString();
          paramContext.<init>(paramPickVisualMediaRequest);
          throw paramContext;
        }
      }
      else
      {
        bool1 = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0Oo(paramContext);
        if (bool1)
        {
          paramContext = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO00o(paramContext);
          if (paramContext != null)
          {
            paramContext = paramContext.activityInfo;
            paramPickVisualMediaRequest = new android/content/Intent;
            paramPickVisualMediaRequest.<init>("com.google.android.gms.provider.action.PICK_IMAGES");
            localObject1 = paramContext.applicationInfo.packageName;
            paramContext = paramContext.name;
            paramPickVisualMediaRequest.setClassName((String)localObject1, paramContext);
            k = this.OooO00o;
            paramPickVisualMediaRequest.putExtra(str3, k);
            paramContext = paramPickVisualMediaRequest;
          }
          else
          {
            paramContext = new java/lang/IllegalStateException;
            paramPickVisualMediaRequest = str2.toString();
            paramContext.<init>(paramPickVisualMediaRequest);
            throw paramContext;
          }
        }
        else
        {
          paramContext = new android/content/Intent;
          localObject2 = "android.intent.action.OPEN_DOCUMENT";
          paramContext.<init>((String)localObject2);
          paramPickVisualMediaRequest = paramPickVisualMediaRequest.getMediaType();
          paramPickVisualMediaRequest = ((ActivityResultContracts.PickVisualMedia.Companion)localObject1).OooO0OO(paramPickVisualMediaRequest);
          paramContext.setType(paramPickVisualMediaRequest);
          paramContext.putExtra("android.intent.extra.ALLOW_MULTIPLE", bool2);
          paramPickVisualMediaRequest = paramContext.getType();
          if (paramPickVisualMediaRequest == null)
          {
            paramContext.setType("*/*");
            paramPickVisualMediaRequest = new String[] { "image/*", "video/*" };
            localObject1 = "android.intent.extra.MIME_TYPES";
            paramContext.putExtra((String)localObject1, paramPickVisualMediaRequest);
          }
        }
      }
    }
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
  
  public final ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, PickVisualMediaRequest paramPickVisualMediaRequest)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramPickVisualMediaRequest, "input");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia
 * JD-Core Version:    0.7.0.1
 */