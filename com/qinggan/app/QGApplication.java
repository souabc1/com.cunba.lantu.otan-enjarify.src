package com.qinggan.app;

import android.app.Application;
import com.qinggan.os.SystemProperties;
import m54207b69;

public class QGApplication
  extends Application
{
  public ActivityWatcher o00OoOoo;
  
  public void onCreate()
  {
    super.onCreate();
    Object localObject1 = m54207b69.F54207b69_11("Hr001E5E130B20241D640F150D23");
    Object localObject2 = m54207b69.F54207b69_11("Y*5F45434749624A");
    localObject1 = SystemProperties.OooO0O0((String)localObject1, (String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("M(5A48084D61464A530E655B6359154F6A22");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject1 = ActivityWatcher.OooO0O0(this);
    this.o00OoOoo = ((ActivityWatcher)localObject1);
    ((ActivityWatcher)localObject1).OooO0OO();
  }
  
  public void onTerminate()
  {
    this.o00OoOoo.OooO00o();
    super.onTerminate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.QGApplication
 * JD-Core Version:    0.7.0.1
 */