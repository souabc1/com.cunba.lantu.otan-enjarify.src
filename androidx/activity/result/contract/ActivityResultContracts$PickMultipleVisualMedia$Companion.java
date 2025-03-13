package androidx.activity.result.contract;

import OooO00o.OooO00o;

public final class ActivityResultContracts$PickMultipleVisualMedia$Companion
{
  public final int getMaxItems$activity_release()
  {
    ActivityResultContracts.PickVisualMedia.Companion localCompanion = ActivityResultContracts.PickVisualMedia.OooO00o;
    boolean bool = localCompanion.isSystemPickerAvailable$activity_release();
    int i;
    if (bool) {
      i = OooO00o.OooO00o();
    } else {
      i = -1 >>> 1;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
 * JD-Core Version:    0.7.0.1
 */