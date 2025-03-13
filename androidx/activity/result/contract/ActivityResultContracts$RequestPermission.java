package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResultContracts$RequestPermission
  extends ActivityResultContract
{
  public Intent OooO0Oo(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramString, "input");
    paramContext = ActivityResultContracts.RequestMultiplePermissions.OooO00o;
    paramString = new String[] { paramString };
    return paramContext.OooO00o(paramString);
  }
  
  public Boolean OooO0o(int paramInt, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      int i = -1;
      if (paramInt == i)
      {
        int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean bool = false;
        paramIntent = null;
        if (arrayOfInt != null)
        {
          i = arrayOfInt.length;
          int j = 0;
          int k;
          for (;;)
          {
            k = 1;
            if (j >= i) {
              break;
            }
            int m = arrayOfInt[j];
            if (m == 0) {
              m = k;
            } else {
              m = 0;
            }
            if (m != 0)
            {
              paramInt = k;
              break label95;
            }
            j += 1;
          }
          paramInt = 0;
          arrayOfInt = null;
          label95:
          if (paramInt == k) {
            bool = k;
          }
        }
        return Boolean.valueOf(bool);
      }
    }
    return Boolean.FALSE;
  }
  
  public ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, String paramString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    String str = "input";
    Intrinsics.OooO0o(paramString, str);
    int i = ContextCompat.OooO00o(paramContext, paramString);
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    if (i != 0)
    {
      paramContext = new androidx/activity/result/contract/ActivityResultContract$SynchronousResult;
      paramString = Boolean.TRUE;
      paramContext.<init>(paramString);
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestPermission
 * JD-Core Version:    0.7.0.1
 */