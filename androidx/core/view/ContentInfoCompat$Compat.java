package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

abstract interface ContentInfoCompat$Compat
{
  public abstract ClipData getClip();
  
  public abstract Bundle getExtras();
  
  public abstract int getFlags();
  
  public abstract Uri getLinkUri();
  
  public abstract int getSource();
  
  public abstract ContentInfo getWrapped();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Compat
 * JD-Core Version:    0.7.0.1
 */