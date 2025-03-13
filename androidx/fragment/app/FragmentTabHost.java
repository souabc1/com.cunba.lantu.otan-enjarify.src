package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  public final ArrayList o00OoOoo;
  public FragmentManager o00Ooo0;
  public Context o00Ooo00;
  public int o00Ooo0O;
  public TabHost.OnTabChangeListener o00Ooo0o;
  public boolean o00OooO;
  public FragmentTabHost.TabInfo o00OooO0;
  
  public final FragmentTransaction OooO00o(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    paramString = OooO0O0(paramString);
    Object localObject1 = this.o00OooO0;
    if (localObject1 != paramString)
    {
      if (paramFragmentTransaction == null) {
        paramFragmentTransaction = this.o00Ooo0.OooOOo0();
      }
      localObject1 = this.o00OooO0;
      if (localObject1 != null)
      {
        localObject1 = ((FragmentTabHost.TabInfo)localObject1).OooO0Oo;
        if (localObject1 != null) {
          paramFragmentTransaction.OooOOO((Fragment)localObject1);
        }
      }
      if (paramString != null)
      {
        localObject1 = paramString.OooO0Oo;
        if (localObject1 == null)
        {
          localObject1 = this.o00Ooo0.getFragmentFactory();
          Object localObject2 = this.o00Ooo00.getClassLoader();
          String str = paramString.OooO0O0.getName();
          localObject1 = ((FragmentFactory)localObject1).OooO00o((ClassLoader)localObject2, str);
          paramString.OooO0Oo = ((Fragment)localObject1);
          localObject2 = paramString.OooO0OO;
          ((Fragment)localObject1).setArguments((Bundle)localObject2);
          int i = this.o00Ooo0O;
          localObject2 = paramString.OooO0Oo;
          str = paramString.OooO00o;
          paramFragmentTransaction.OooO0OO(i, (Fragment)localObject2, str);
        }
        else
        {
          paramFragmentTransaction.OooO((Fragment)localObject1);
        }
      }
      this.o00OooO0 = paramString;
    }
    return paramFragmentTransaction;
  }
  
  public final FragmentTabHost.TabInfo OooO0O0(String paramString)
  {
    ArrayList localArrayList = this.o00OoOoo;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      FragmentTabHost.TabInfo localTabInfo = (FragmentTabHost.TabInfo)this.o00OoOoo.get(j);
      String str = localTabInfo.OooO00o;
      boolean bool = str.equals(paramString);
      if (bool) {
        return localTabInfo;
      }
      j += 1;
    }
    return null;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject1 = getCurrentTabTag();
    ArrayList localArrayList = this.o00OoOoo;
    int i = localArrayList.size();
    FragmentTransaction localFragmentTransaction = null;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = (FragmentTabHost.TabInfo)this.o00OoOoo.get(j);
      Object localObject3 = this.o00Ooo0;
      String str = ((FragmentTabHost.TabInfo)localObject2).OooO00o;
      localObject3 = ((FragmentManager)localObject3).o00O0O(str);
      ((FragmentTabHost.TabInfo)localObject2).OooO0Oo = ((Fragment)localObject3);
      if (localObject3 != null)
      {
        boolean bool = ((Fragment)localObject3).isDetached();
        if (!bool)
        {
          localObject3 = ((FragmentTabHost.TabInfo)localObject2).OooO00o;
          bool = ((String)localObject3).equals(localObject1);
          if (bool)
          {
            this.o00OooO0 = ((FragmentTabHost.TabInfo)localObject2);
          }
          else
          {
            if (localFragmentTransaction == null) {
              localFragmentTransaction = this.o00Ooo0.OooOOo0();
            }
            localObject2 = ((FragmentTabHost.TabInfo)localObject2).OooO0Oo;
            localFragmentTransaction.OooOOO((Fragment)localObject2);
          }
        }
      }
      j += 1;
    }
    i = 1;
    this.o00OooO = i;
    localObject1 = OooO00o((String)localObject1, localFragmentTransaction);
    if (localObject1 != null)
    {
      ((FragmentTransaction)localObject1).OooOO0();
      localObject1 = this.o00Ooo0;
      ((FragmentManager)localObject1).OoooooO();
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.o00OooO = false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof FragmentTabHost.SavedState;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (FragmentTabHost.SavedState)paramParcelable;
    Parcelable localParcelable = paramParcelable.getSuperState();
    super.onRestoreInstanceState(localParcelable);
    paramParcelable = paramParcelable.o00OoOoo;
    setCurrentTabByTag(paramParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    FragmentTabHost.SavedState localSavedState = new androidx/fragment/app/FragmentTabHost$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    localObject = getCurrentTabTag();
    localSavedState.o00OoOoo = ((String)localObject);
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    boolean bool = this.o00OooO;
    if (bool)
    {
      bool = false;
      localObject = OooO00o(paramString, null);
      if (localObject != null) {
        ((FragmentTransaction)localObject).OooOO0();
      }
    }
    Object localObject = this.o00Ooo0o;
    if (localObject != null) {
      ((TabHost.OnTabChangeListener)localObject).onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.o00Ooo0o = paramOnTabChangeListener;
  }
  
  public void setup()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Must call setup() that takes a Context and FragmentManager");
    throw localIllegalStateException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTabHost
 * JD-Core Version:    0.7.0.1
 */