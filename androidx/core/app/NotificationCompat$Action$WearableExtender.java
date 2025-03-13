package androidx.core.app;

public final class NotificationCompat$Action$WearableExtender
  implements NotificationCompat.Action.Extender
{
  public int OooO00o = 1;
  public CharSequence OooO0O0;
  public CharSequence OooO0OO;
  public CharSequence OooO0Oo;
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramBoolean = this.OooO00o;
      paramInt |= paramBoolean;
    }
    else
    {
      paramBoolean = this.OooO00o;
      paramInt = (paramInt ^ 0xFFFFFFFF) & paramBoolean;
    }
    this.OooO00o = paramInt;
  }
  
  public WearableExtender OooO00o()
  {
    WearableExtender localWearableExtender = new androidx/core/app/NotificationCompat$Action$WearableExtender;
    localWearableExtender.<init>();
    int i = this.OooO00o;
    localWearableExtender.OooO00o = i;
    CharSequence localCharSequence = this.OooO0O0;
    localWearableExtender.OooO0O0 = localCharSequence;
    localCharSequence = this.OooO0OO;
    localWearableExtender.OooO0OO = localCharSequence;
    localCharSequence = this.OooO0Oo;
    localWearableExtender.OooO0Oo = localCharSequence;
    return localWearableExtender;
  }
  
  public CharSequence getCancelLabel()
  {
    return this.OooO0Oo;
  }
  
  public CharSequence getConfirmLabel()
  {
    return this.OooO0OO;
  }
  
  public boolean getHintDisplayActionInline()
  {
    int i = this.OooO00o & 0x4;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean getHintLaunchesActivity()
  {
    int i = this.OooO00o & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public CharSequence getInProgressLabel()
  {
    return this.OooO0O0;
  }
  
  public boolean isAvailableOffline()
  {
    int i = this.OooO00o;
    int j = 1;
    i &= j;
    if (i == 0) {
      j = 0;
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.Action.WearableExtender
 * JD-Core Version:    0.7.0.1
 */