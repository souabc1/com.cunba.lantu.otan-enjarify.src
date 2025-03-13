package androidx.core.content;

import android.app.Application;
import android.content.ContentProvider;
import android.content.Context;
import com.xuexiang.xutil.XUtil;
import com.xuexiang.xutil.common.ObjectUtils;

public final class FileProvider4Utils
  extends FileProvider
{
  public boolean onCreate()
  {
    boolean bool = XUtil.isAutoInit();
    if (bool)
    {
      Object localObject = getContext();
      Application localApplication = Application.class;
      localObject = (Application)ObjectUtils.OooO00o(localObject, localApplication);
      if (localObject != null)
      {
        localObject = ((Context)localObject).getApplicationContext();
        XUtil.OooO0o((Context)localObject);
      }
    }
    return super.onCreate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.FileProvider4Utils
 * JD-Core Version:    0.7.0.1
 */