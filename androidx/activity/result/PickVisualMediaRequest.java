package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType;
import kotlin.jvm.internal.Intrinsics;

public final class PickVisualMediaRequest
{
  public ActivityResultContracts.PickVisualMedia.VisualMediaType OooO00o;
  
  public PickVisualMediaRequest()
  {
    ActivityResultContracts.PickVisualMedia.ImageAndVideo localImageAndVideo = ActivityResultContracts.PickVisualMedia.ImageAndVideo.OooO00o;
    this.OooO00o = localImageAndVideo;
  }
  
  public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType()
  {
    return this.OooO00o;
  }
  
  public final void setMediaType$activity_release(ActivityResultContracts.PickVisualMedia.VisualMediaType paramVisualMediaType)
  {
    Intrinsics.OooO0o(paramVisualMediaType, "<set-?>");
    this.OooO00o = paramVisualMediaType;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.PickVisualMediaRequest
 * JD-Core Version:    0.7.0.1
 */