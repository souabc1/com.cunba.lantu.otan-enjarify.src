package com.qinggan.provider;

import android.database.ContentObserver;
import android.net.Uri;

class QGSettings$Secure$1
  extends ContentObserver
{
  public void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    QGSettingsListener localQGSettingsListener = this.OooO0OO;
    paramUri = this.OooO0O0;
    String str = QGSettings.Secure.OooO00o(this.OooO00o, paramUri);
    localQGSettingsListener.OooO0O0(paramUri, str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.provider.QGSettings.Secure.1
 * JD-Core Version:    0.7.0.1
 */