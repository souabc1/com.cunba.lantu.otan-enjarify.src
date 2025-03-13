package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;

class PreferenceFragment$3
  implements Runnable
{
  public void run()
  {
    Object localObject1 = this.o00Ooo0.o00Ooo0.getAdapter();
    boolean bool = localObject1 instanceof PreferenceGroup.PreferencePositionCallback;
    if (!bool)
    {
      if (localObject1 == null) {
        return;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Adapter must implement PreferencePositionCallback");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = this.o00OoOoo;
    Object localObject3;
    int i;
    if (localObject2 != null)
    {
      localObject3 = localObject1;
      localObject3 = (PreferenceGroup.PreferencePositionCallback)localObject1;
      i = ((PreferenceGroup.PreferencePositionCallback)localObject3).OooO0o0((Preference)localObject2);
    }
    else
    {
      localObject2 = localObject1;
      localObject2 = (PreferenceGroup.PreferencePositionCallback)localObject1;
      localObject3 = this.o00Ooo00;
      i = ((PreferenceGroup.PreferencePositionCallback)localObject2).OooO0oO((String)localObject3);
    }
    int j = -1;
    if (i != j)
    {
      localObject1 = this.o00Ooo0.o00Ooo0;
      ((RecyclerView)localObject1).scrollToPosition(i);
    }
    else
    {
      localObject2 = new androidx/preference/PreferenceFragment$ScrollToPreferenceObserver;
      localObject3 = this.o00Ooo0.o00Ooo0;
      Preference localPreference = this.o00OoOoo;
      String str = this.o00Ooo00;
      ((PreferenceFragment.ScrollToPreferenceObserver)localObject2).<init>((RecyclerView.Adapter)localObject1, (RecyclerView)localObject3, localPreference, str);
      ((RecyclerView.Adapter)localObject1).registerAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceFragment.3
 * JD-Core Version:    0.7.0.1
 */