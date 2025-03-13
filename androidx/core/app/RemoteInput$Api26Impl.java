package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.Intent;
import java.util.Map;
import java.util.Set;

class RemoteInput$Api26Impl
{
  public static void OooO00o(RemoteInput paramRemoteInput, Intent paramIntent, Map paramMap)
  {
    android.app.RemoteInput.addDataResultToIntent(RemoteInput.OooO00o(paramRemoteInput), paramIntent, paramMap);
  }
  
  public static Set OooO0O0(Object paramObject)
  {
    return ((android.app.RemoteInput)paramObject).getAllowedDataTypes();
  }
  
  public static Map OooO0OO(Intent paramIntent, String paramString)
  {
    return android.app.RemoteInput.getDataResultsFromIntent(paramIntent, paramString);
  }
  
  public static RemoteInput.Builder OooO0Oo(RemoteInput.Builder paramBuilder, String paramString, boolean paramBoolean)
  {
    return paramBuilder.setAllowDataType(paramString, paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteInput.Api26Impl
 * JD-Core Version:    0.7.0.1
 */