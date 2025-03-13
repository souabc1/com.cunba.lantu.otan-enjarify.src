package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

class RemoteInput$Api20Impl
{
  public static void OooO00o(Object paramObject, Intent paramIntent, Bundle paramBundle)
  {
    android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[])paramObject, paramIntent, paramBundle);
  }
  
  public static android.app.RemoteInput OooO0O0(RemoteInput paramRemoteInput)
  {
    RemoteInput.Builder localBuilder = new android/app/RemoteInput$Builder;
    Object localObject = paramRemoteInput.getResultKey();
    localBuilder.<init>((String)localObject);
    localObject = paramRemoteInput.getLabel();
    localBuilder = localBuilder.setLabel((CharSequence)localObject);
    localObject = paramRemoteInput.getChoices();
    localBuilder = localBuilder.setChoices((CharSequence[])localObject);
    boolean bool1 = paramRemoteInput.getAllowFreeFormInput();
    localBuilder = localBuilder.setAllowFreeFormInput(bool1);
    localObject = paramRemoteInput.getExtras();
    localBuilder = localBuilder.addExtras((Bundle)localObject);
    localObject = paramRemoteInput.getAllowedDataTypes();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        String str = (String)((Iterator)localObject).next();
        boolean bool3 = true;
        RemoteInput.Api26Impl.OooO0Oo(localBuilder, str, bool3);
      }
    }
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      int k = paramRemoteInput.getEditChoicesBeforeSending();
      RemoteInput.Api29Impl.OooO0O0(localBuilder, k);
    }
    return localBuilder.build();
  }
  
  public static Bundle OooO0OO(Intent paramIntent)
  {
    return android.app.RemoteInput.getResultsFromIntent(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteInput.Api20Impl
 * JD-Core Version:    0.7.0.1
 */