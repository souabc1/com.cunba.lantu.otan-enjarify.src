package androidx.core.app;

import android.content.res.Configuration;

public final class MultiWindowModeChangedInfo
{
  public final boolean OooO00o;
  public final Configuration OooO0O0;
  
  public MultiWindowModeChangedInfo(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    this.OooO0O0 = null;
  }
  
  public MultiWindowModeChangedInfo(boolean paramBoolean, Configuration paramConfiguration)
  {
    this.OooO00o = paramBoolean;
    this.OooO0O0 = paramConfiguration;
  }
  
  public Configuration getNewConfig()
  {
    Object localObject = this.OooO0O0;
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    throw ((Throwable)localObject);
  }
  
  public boolean isInMultiWindowMode()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.MultiWindowModeChangedInfo
 * JD-Core Version:    0.7.0.1
 */