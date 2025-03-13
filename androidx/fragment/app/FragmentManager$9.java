package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayDeque;

class FragmentManager$9
  implements ActivityResultCallback
{
  public FragmentManager$9(FragmentManager paramFragmentManager) {}
  
  public void OooO0O0(ActivityResult paramActivityResult)
  {
    FragmentManager.LaunchedFragmentInfo localLaunchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo)this.OooO00o.Oooo00O.pollFirst();
    if (localLaunchedFragmentInfo == null)
    {
      paramActivityResult = new java/lang/StringBuilder;
      paramActivityResult.<init>();
      paramActivityResult.append("No IntentSenders were started for ");
      paramActivityResult.append(this);
      return;
    }
    String str = localLaunchedFragmentInfo.o00OoOoo;
    int i = localLaunchedFragmentInfo.o00Ooo00;
    Fragment localFragment = FragmentManager.OooO0oo(this.OooO00o).OooO(str);
    if (localFragment == null)
    {
      paramActivityResult = new java/lang/StringBuilder;
      paramActivityResult.<init>();
      paramActivityResult.append("Intent Sender result delivered for unknown Fragment ");
      paramActivityResult.append(str);
      return;
    }
    int j = paramActivityResult.getResultCode();
    paramActivityResult = paramActivityResult.getData();
    localFragment.onActivityResult(i, j, paramActivityResult);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManager.9
 * JD-Core Version:    0.7.0.1
 */