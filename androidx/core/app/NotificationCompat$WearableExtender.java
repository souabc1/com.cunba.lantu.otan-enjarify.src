package androidx.core.app;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

public final class NotificationCompat$WearableExtender
  implements NotificationCompat.Extender
{
  public int OooO;
  public ArrayList OooO00o;
  public int OooO0O0;
  public PendingIntent OooO0OO;
  public ArrayList OooO0Oo;
  public int OooO0o;
  public Bitmap OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public int OooOO0O;
  public int OooOO0o;
  public String OooOOO;
  public String OooOOO0;
  
  public NotificationCompat$WearableExtender()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO00o = localArrayList;
    this.OooO0O0 = 1;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0Oo = localArrayList;
    this.OooO0oO = 8388613;
    this.OooO0oo = -1;
    this.OooO = 0;
    this.OooOO0O = 80;
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramBoolean = this.OooO0O0;
      paramInt |= paramBoolean;
    }
    else
    {
      paramBoolean = this.OooO0O0;
      paramInt = (paramInt ^ 0xFFFFFFFF) & paramBoolean;
    }
    this.OooO0O0 = paramInt;
  }
  
  public WearableExtender OooO00o()
  {
    WearableExtender localWearableExtender = new androidx/core/app/NotificationCompat$WearableExtender;
    localWearableExtender.<init>();
    Object localObject = new java/util/ArrayList;
    ArrayList localArrayList = this.OooO00o;
    ((ArrayList)localObject).<init>(localArrayList);
    localWearableExtender.OooO00o = ((ArrayList)localObject);
    int i = this.OooO0O0;
    localWearableExtender.OooO0O0 = i;
    localObject = this.OooO0OO;
    localWearableExtender.OooO0OO = ((PendingIntent)localObject);
    localObject = new java/util/ArrayList;
    localArrayList = this.OooO0Oo;
    ((ArrayList)localObject).<init>(localArrayList);
    localWearableExtender.OooO0Oo = ((ArrayList)localObject);
    localObject = this.OooO0o0;
    localWearableExtender.OooO0o0 = ((Bitmap)localObject);
    i = this.OooO0o;
    localWearableExtender.OooO0o = i;
    i = this.OooO0oO;
    localWearableExtender.OooO0oO = i;
    i = this.OooO0oo;
    localWearableExtender.OooO0oo = i;
    i = this.OooO;
    localWearableExtender.OooO = i;
    i = this.OooOO0;
    localWearableExtender.OooOO0 = i;
    i = this.OooOO0O;
    localWearableExtender.OooOO0O = i;
    i = this.OooOO0o;
    localWearableExtender.OooOO0o = i;
    localObject = this.OooOOO0;
    localWearableExtender.OooOOO0 = ((String)localObject);
    localObject = this.OooOOO;
    localWearableExtender.OooOOO = ((String)localObject);
    return localWearableExtender;
  }
  
  public List getActions()
  {
    return this.OooO00o;
  }
  
  public Bitmap getBackground()
  {
    return this.OooO0o0;
  }
  
  public String getBridgeTag()
  {
    return this.OooOOO;
  }
  
  public int getContentAction()
  {
    return this.OooO0oo;
  }
  
  public int getContentIcon()
  {
    return this.OooO0o;
  }
  
  public int getContentIconGravity()
  {
    return this.OooO0oO;
  }
  
  public boolean getContentIntentAvailableOffline()
  {
    int i = this.OooO0O0;
    int j = 1;
    i &= j;
    if (i == 0) {
      j = 0;
    }
    return j;
  }
  
  public int getCustomContentHeight()
  {
    return this.OooOO0;
  }
  
  public int getCustomSizePreset()
  {
    return this.OooO;
  }
  
  public String getDismissalId()
  {
    return this.OooOOO0;
  }
  
  public PendingIntent getDisplayIntent()
  {
    return this.OooO0OO;
  }
  
  public int getGravity()
  {
    return this.OooOO0O;
  }
  
  public boolean getHintAmbientBigPicture()
  {
    int i = this.OooO0O0 & 0x20;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean getHintAvoidBackgroundClipping()
  {
    int i = this.OooO0O0 & 0x10;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean getHintContentIntentLaunchesActivity()
  {
    int i = this.OooO0O0 & 0x40;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean getHintHideIcon()
  {
    int i = this.OooO0O0 & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getHintScreenTimeout()
  {
    return this.OooOO0o;
  }
  
  public boolean getHintShowBackgroundOnly()
  {
    int i = this.OooO0O0 & 0x4;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public List getPages()
  {
    return this.OooO0Oo;
  }
  
  public boolean getStartScrollBottom()
  {
    int i = this.OooO0O0 & 0x8;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.WearableExtender
 * JD-Core Version:    0.7.0.1
 */