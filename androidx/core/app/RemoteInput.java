package androidx.core.app;

import android.os.Bundle;
import java.util.Set;

public final class RemoteInput
{
  public final String OooO00o;
  public final CharSequence OooO0O0;
  public final CharSequence[] OooO0OO;
  public final boolean OooO0Oo;
  public final Bundle OooO0o;
  public final int OooO0o0;
  public final Set OooO0oO;
  
  public static android.app.RemoteInput OooO00o(RemoteInput paramRemoteInput)
  {
    return RemoteInput.Api20Impl.OooO0O0(paramRemoteInput);
  }
  
  public static android.app.RemoteInput[] OooO0O0(RemoteInput[] paramArrayOfRemoteInput)
  {
    if (paramArrayOfRemoteInput == null) {
      return null;
    }
    int i = paramArrayOfRemoteInput.length;
    android.app.RemoteInput[] arrayOfRemoteInput = new android.app.RemoteInput[i];
    int j = 0;
    for (;;)
    {
      int k = paramArrayOfRemoteInput.length;
      if (j >= k) {
        break;
      }
      android.app.RemoteInput localRemoteInput = OooO00o(paramArrayOfRemoteInput[j]);
      arrayOfRemoteInput[j] = localRemoteInput;
      j += 1;
    }
    return arrayOfRemoteInput;
  }
  
  public boolean getAllowFreeFormInput()
  {
    return this.OooO0Oo;
  }
  
  public Set getAllowedDataTypes()
  {
    return this.OooO0oO;
  }
  
  public CharSequence[] getChoices()
  {
    return this.OooO0OO;
  }
  
  public int getEditChoicesBeforeSending()
  {
    return this.OooO0o0;
  }
  
  public Bundle getExtras()
  {
    return this.OooO0o;
  }
  
  public CharSequence getLabel()
  {
    return this.OooO0O0;
  }
  
  public String getResultKey()
  {
    return this.OooO00o;
  }
  
  public boolean isDataOnly()
  {
    boolean bool1 = getAllowFreeFormInput();
    if (!bool1)
    {
      localObject = getChoices();
      if (localObject != null)
      {
        localObject = getChoices();
        int i = localObject.length;
        if (i != 0) {}
      }
      else
      {
        localObject = getAllowedDataTypes();
        if (localObject != null)
        {
          localObject = getAllowedDataTypes();
          bool2 = ((Set)localObject).isEmpty();
          if (!bool2) {
            return true;
          }
        }
      }
    }
    boolean bool2 = false;
    Object localObject = null;
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteInput
 * JD-Core Version:    0.7.0.1
 */