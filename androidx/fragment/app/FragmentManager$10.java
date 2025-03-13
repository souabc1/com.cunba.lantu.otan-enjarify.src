package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

class FragmentManager$10
  implements ActivityResultCallback
{
  public FragmentManager$10(FragmentManager paramFragmentManager) {}
  
  public void OooO0O0(Map paramMap)
  {
    Object localObject1 = paramMap.keySet();
    int i = 0;
    FragmentManager.LaunchedFragmentInfo localLaunchedFragmentInfo = null;
    Object localObject2 = new String[0];
    localObject1 = (String[])((Set)localObject1).toArray((Object[])localObject2);
    localObject2 = new java/util/ArrayList;
    paramMap = paramMap.values();
    ((ArrayList)localObject2).<init>(paramMap);
    int j = ((ArrayList)localObject2).size();
    paramMap = new int[j];
    int k = 0;
    Fragment localFragment = null;
    for (;;)
    {
      int m = ((ArrayList)localObject2).size();
      if (k >= m) {
        break;
      }
      Boolean localBoolean = (Boolean)((ArrayList)localObject2).get(k);
      boolean bool = localBoolean.booleanValue();
      int n;
      if (bool)
      {
        bool = false;
        localBoolean = null;
      }
      else
      {
        n = -1;
      }
      paramMap[k] = n;
      k += 1;
    }
    localLaunchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo)this.OooO00o.Oooo00O.pollFirst();
    if (localLaunchedFragmentInfo == null)
    {
      paramMap = new java/lang/StringBuilder;
      paramMap.<init>();
      paramMap.append("No permissions were requested for ");
      paramMap.append(this);
      return;
    }
    localObject2 = localLaunchedFragmentInfo.o00OoOoo;
    i = localLaunchedFragmentInfo.o00Ooo00;
    localFragment = FragmentManager.OooO0oo(this.OooO00o).OooO((String)localObject2);
    if (localFragment == null)
    {
      paramMap = new java/lang/StringBuilder;
      paramMap.<init>();
      paramMap.append("Permission request result delivered for unknown Fragment ");
      paramMap.append((String)localObject2);
      return;
    }
    localFragment.onRequestPermissionsResult(i, (String[])localObject1, paramMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManager.10
 * JD-Core Version:    0.7.0.1
 */