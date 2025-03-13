package androidx.fragment.app;

import java.util.ArrayList;

class FragmentManager$PopBackStackState
  implements FragmentManager.OpGenerator
{
  public final String OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  
  public FragmentManager$PopBackStackState(FragmentManager paramFragmentManager, String paramString, int paramInt1, int paramInt2)
  {
    this.OooO00o = paramString;
    this.OooO0O0 = paramInt1;
    this.OooO0OO = paramInt2;
  }
  
  public boolean OooO00o(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Object localObject1 = this.OooO0Oo.OooOoO0;
    if (localObject1 != null)
    {
      int i = this.OooO0O0;
      if (i < 0)
      {
        localObject2 = this.OooO00o;
        if (localObject2 == null)
        {
          localObject1 = ((Fragment)localObject1).getChildFragmentManager();
          boolean bool = ((FragmentManager)localObject1).o0000O0O();
          if (bool) {
            return false;
          }
        }
      }
    }
    localObject1 = this.OooO0Oo;
    String str = this.OooO00o;
    int j = this.OooO0O0;
    int k = this.OooO0OO;
    Object localObject2 = paramArrayList1;
    return ((FragmentManager)localObject1).o0000OO0(paramArrayList1, paramArrayList2, str, j, k);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManager.PopBackStackState
 * JD-Core Version:    0.7.0.1
 */