package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class ActivityResultContracts$RequestMultiplePermissions
  extends ActivityResultContract
{
  public static final ActivityResultContracts.RequestMultiplePermissions.Companion OooO00o;
  
  static
  {
    ActivityResultContracts.RequestMultiplePermissions.Companion localCompanion = new androidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;
    localCompanion.<init>(null);
    OooO00o = localCompanion;
  }
  
  public Intent OooO0Oo(Context paramContext, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramArrayOfString, "input");
    return OooO00o.OooO00o(paramArrayOfString);
  }
  
  public Map OooO0o(int paramInt, Intent paramIntent)
  {
    int i = -1;
    if (paramInt != i) {
      return MapsKt.OooO0o();
    }
    if (paramIntent == null) {
      return MapsKt.OooO0o();
    }
    String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
    Object localObject = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
    paramIntent = paramIntent.getIntArrayExtra((String)localObject);
    if ((paramIntent != null) && (arrayOfString != null))
    {
      localObject = new java/util/ArrayList;
      int j = paramIntent.length;
      ((ArrayList)localObject).<init>(j);
      j = paramIntent.length;
      int k = 0;
      while (k < j)
      {
        int m = paramIntent[k];
        if (m == 0)
        {
          m = 1;
        }
        else
        {
          m = 0;
          localBoolean = null;
        }
        Boolean localBoolean = Boolean.valueOf(m);
        ((Collection)localObject).add(localBoolean);
        k += 1;
      }
      return MapsKt.OooO(CollectionsKt.o00Oo0(ArraysKt.OooOoOO(arrayOfString), (Iterable)localObject));
    }
    return MapsKt.OooO0o();
  }
  
  public ActivityResultContract.SynchronousResult OooO0o0(Context paramContext, String[] paramArrayOfString)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject1 = "input";
    Intrinsics.OooO0o(paramArrayOfString, (String)localObject1);
    int i = paramArrayOfString.length;
    int j = 1;
    int k = 0;
    if (i == 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    if (i != 0)
    {
      paramContext = new androidx/activity/result/contract/ActivityResultContract$SynchronousResult;
      paramArrayOfString = MapsKt.OooO0o();
      paramContext.<init>(paramArrayOfString);
      return paramContext;
    }
    i = paramArrayOfString.length;
    int m = 0;
    Object localObject2 = null;
    Object localObject3;
    while (m < i)
    {
      String str = paramArrayOfString[m];
      int n = ContextCompat.OooO00o(paramContext, str);
      if (n == 0)
      {
        n = j;
      }
      else
      {
        n = 0;
        str = null;
      }
      if (n == 0)
      {
        j = 0;
        localObject3 = null;
        break;
      }
      m += 1;
    }
    int i1;
    if (j != 0)
    {
      i1 = MapsKt.OooO0OO(paramArrayOfString.length);
      i = 16;
      i1 = RangesKt.OooO00o(i1, i);
      localObject1 = new java/util/LinkedHashMap;
      ((LinkedHashMap)localObject1).<init>(i1);
      i1 = paramArrayOfString.length;
      while (k < i1)
      {
        localObject3 = paramArrayOfString[k];
        localObject2 = Boolean.TRUE;
        localObject3 = TuplesKt.OooO00o(localObject3, localObject2);
        localObject2 = ((Pair)localObject3).getFirst();
        localObject3 = ((Pair)localObject3).getSecond();
        ((Map)localObject1).put(localObject2, localObject3);
        k += 1;
      }
      paramContext = new androidx/activity/result/contract/ActivityResultContract$SynchronousResult;
      paramContext.<init>(localObject1);
    }
    else
    {
      i1 = 0;
      paramContext = null;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions
 * JD-Core Version:    0.7.0.1
 */