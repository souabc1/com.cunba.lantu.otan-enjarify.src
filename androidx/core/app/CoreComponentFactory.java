package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory
  extends AppComponentFactory
{
  public static Object OooO00o(Object paramObject)
  {
    boolean bool = paramObject instanceof CoreComponentFactory.CompatWrapped;
    if (bool)
    {
      Object localObject = paramObject;
      localObject = ((CoreComponentFactory.CompatWrapped)paramObject).getWrapper();
      if (localObject != null) {
        return localObject;
      }
    }
    return paramObject;
  }
  
  public Activity instantiateActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (Activity)OooO00o(super.instantiateActivity(paramClassLoader, paramString, paramIntent));
  }
  
  public Application instantiateApplication(ClassLoader paramClassLoader, String paramString)
  {
    return (Application)OooO00o(super.instantiateApplication(paramClassLoader, paramString));
  }
  
  public ContentProvider instantiateProvider(ClassLoader paramClassLoader, String paramString)
  {
    return (ContentProvider)OooO00o(super.instantiateProvider(paramClassLoader, paramString));
  }
  
  public BroadcastReceiver instantiateReceiver(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (BroadcastReceiver)OooO00o(super.instantiateReceiver(paramClassLoader, paramString, paramIntent));
  }
  
  public Service instantiateService(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (Service)OooO00o(super.instantiateService(paramClassLoader, paramString, paramIntent));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.CoreComponentFactory
 * JD-Core Version:    0.7.0.1
 */