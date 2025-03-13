package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class SavedStateHandle$Companion
{
  public final SavedStateHandle OooO00o(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1 == null)
    {
      if (paramBundle2 == null)
      {
        paramBundle1 = new androidx/lifecycle/SavedStateHandle;
        paramBundle1.<init>();
      }
      else
      {
        paramBundle1 = new java/util/HashMap;
        paramBundle1.<init>();
        localIterator = paramBundle2.keySet().iterator();
        for (;;)
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (String)localIterator.next();
          Intrinsics.OooO0o0(localObject1, "key");
          Object localObject2 = paramBundle2.get((String)localObject1);
          paramBundle1.put(localObject1, localObject2);
        }
        paramBundle2 = new androidx/lifecycle/SavedStateHandle;
        paramBundle2.<init>(paramBundle1);
        paramBundle1 = paramBundle2;
      }
      return paramBundle1;
    }
    paramBundle2 = paramBundle1.getParcelableArrayList("keys");
    paramBundle1 = paramBundle1.getParcelableArrayList("values");
    int j = 0;
    Iterator localIterator = null;
    int k;
    if ((paramBundle2 != null) && (paramBundle1 != null))
    {
      i = paramBundle2.size();
      k = paramBundle1.size();
      if (i == k)
      {
        i = 1;
        break label161;
      }
    }
    int i = 0;
    Object localObject1 = null;
    label161:
    if (i != 0)
    {
      localObject1 = new java/util/LinkedHashMap;
      ((LinkedHashMap)localObject1).<init>();
      k = paramBundle2.size();
      while (j < k)
      {
        Object localObject3 = paramBundle2.get(j);
        Intrinsics.OooO0Oo(localObject3, "null cannot be cast to non-null type kotlin.String");
        localObject3 = (String)localObject3;
        Object localObject4 = paramBundle1.get(j);
        ((Map)localObject1).put(localObject3, localObject4);
        j += 1;
      }
      paramBundle1 = new androidx/lifecycle/SavedStateHandle;
      paramBundle1.<init>((Map)localObject1);
      return paramBundle1;
    }
    paramBundle1 = new java/lang/IllegalStateException;
    paramBundle2 = "Invalid bundle passed as restored state".toString();
    paramBundle1.<init>(paramBundle2);
    throw paramBundle1;
  }
  
  public final boolean OooO0O0(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == null) {
      return bool1;
    }
    Class[] arrayOfClass = SavedStateHandle.OooO0O0();
    int i = arrayOfClass.length;
    int j = 0;
    while (j < i)
    {
      Class localClass = arrayOfClass[j];
      Intrinsics.OooO0OO(localClass);
      boolean bool2 = localClass.isInstance(paramObject);
      if (bool2) {
        return bool1;
      }
      j += 1;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.SavedStateHandle.Companion
 * JD-Core Version:    0.7.0.1
 */