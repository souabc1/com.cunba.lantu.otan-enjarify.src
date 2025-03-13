package androidx.fragment.app;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class FragmentStatePagerAdapter
  extends PagerAdapter
{
  public boolean OooO;
  public final FragmentManager OooO0OO;
  public final int OooO0Oo;
  public ArrayList OooO0o;
  public FragmentTransaction OooO0o0;
  public ArrayList OooO0oO;
  public Fragment OooO0oo;
  
  public void OooO0O0(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    paramViewGroup = this.OooO0o0;
    if (paramViewGroup == null)
    {
      paramViewGroup = this.OooO0OO.OooOOo0();
      this.OooO0o0 = paramViewGroup;
    }
    for (;;)
    {
      paramViewGroup = this.OooO0o;
      int i = paramViewGroup.size();
      if (i > paramInt) {
        break;
      }
      paramViewGroup = this.OooO0o;
      paramViewGroup.add(null);
    }
    paramViewGroup = this.OooO0o;
    boolean bool2 = paramObject.isAdded();
    Fragment.SavedState localSavedState;
    if (bool2)
    {
      localSavedState = this.OooO0OO.o0000oo0(paramObject);
    }
    else
    {
      bool2 = false;
      localSavedState = null;
    }
    paramViewGroup.set(paramInt, localSavedState);
    this.OooO0oO.set(paramInt, null);
    this.OooO0o0.OooOOo(paramObject);
    paramViewGroup = this.OooO0oo;
    boolean bool1 = paramObject.equals(paramViewGroup);
    if (bool1) {
      this.OooO0oo = null;
    }
  }
  
  public void OooO0Oo(ViewGroup paramViewGroup)
  {
    paramViewGroup = this.OooO0o0;
    if (paramViewGroup != null)
    {
      boolean bool = this.OooO;
      if (!bool)
      {
        bool = true;
        try
        {
          this.OooO = bool;
          paramViewGroup.OooOOO0();
        }
        finally
        {
          this.OooO = false;
        }
      }
      paramViewGroup = null;
      this.OooO0o0 = null;
    }
  }
  
  public Object OooO0oO(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject1 = this.OooO0oO;
    int i = ((ArrayList)localObject1).size();
    if (i > paramInt)
    {
      localObject1 = (Fragment)this.OooO0oO.get(paramInt);
      if (localObject1 != null) {
        return localObject1;
      }
    }
    localObject1 = this.OooO0o0;
    if (localObject1 == null)
    {
      localObject1 = this.OooO0OO.OooOOo0();
      this.OooO0o0 = ((FragmentTransaction)localObject1);
    }
    localObject1 = getItem(paramInt);
    Object localObject2 = this.OooO0o;
    int j = ((ArrayList)localObject2).size();
    if (j > paramInt)
    {
      localObject2 = (Fragment.SavedState)this.OooO0o.get(paramInt);
      if (localObject2 != null) {
        ((Fragment)localObject1).setInitialSavedState((Fragment.SavedState)localObject2);
      }
    }
    for (;;)
    {
      localObject2 = this.OooO0oO;
      j = ((ArrayList)localObject2).size();
      if (j > paramInt) {
        break;
      }
      localObject2 = this.OooO0oO;
      k = 0;
      ((ArrayList)localObject2).add(null);
    }
    j = 0;
    localObject2 = null;
    ((Fragment)localObject1).setMenuVisibility(false);
    int k = this.OooO0Oo;
    if (k == 0) {
      ((Fragment)localObject1).setUserVisibleHint(false);
    }
    localObject2 = this.OooO0oO;
    ((ArrayList)localObject2).set(paramInt, localObject1);
    Object localObject3 = this.OooO0o0;
    int m = paramViewGroup.getId();
    ((FragmentTransaction)localObject3).OooO0O0(m, (Fragment)localObject1);
    m = this.OooO0Oo;
    paramInt = 1;
    if (m == paramInt)
    {
      paramViewGroup = this.OooO0o0;
      localObject3 = Lifecycle.State.o00Ooo0O;
      paramViewGroup.OooOo0O((Fragment)localObject1, (Lifecycle.State)localObject3);
    }
    return localObject1;
  }
  
  public boolean OooO0oo(View paramView, Object paramObject)
  {
    paramObject = ((Fragment)paramObject).getView();
    boolean bool;
    if (paramObject == paramView)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramView = null;
    }
    return bool;
  }
  
  public void OooOO0O(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      paramParcelable = (Bundle)paramParcelable;
      paramParcelable.setClassLoader(paramClassLoader);
      paramClassLoader = paramParcelable.getParcelableArray("states");
      this.OooO0o.clear();
      this.OooO0oO.clear();
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (paramClassLoader != null)
      {
        int i = 0;
        localObject1 = null;
        for (;;)
        {
          int k = paramClassLoader.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.OooO0o;
          localObject3 = (Fragment.SavedState)paramClassLoader[i];
          ((ArrayList)localObject2).add(localObject3);
          i += 1;
        }
      }
      paramClassLoader = paramParcelable.keySet().iterator();
      for (;;)
      {
        boolean bool1 = paramClassLoader.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)paramClassLoader.next();
        localObject2 = "f";
        boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
        if (bool2)
        {
          localObject2 = ((String)localObject1).substring(1);
          int m = Integer.parseInt((String)localObject2);
          localObject3 = this.OooO0OO.o0ooOO0(paramParcelable, (String)localObject1);
          if (localObject3 != null)
          {
            for (;;)
            {
              localObject1 = this.OooO0oO;
              int j = ((ArrayList)localObject1).size();
              if (j > m) {
                break;
              }
              localObject1 = this.OooO0oO;
              ((ArrayList)localObject1).add(null);
            }
            ((Fragment)localObject3).setMenuVisibility(false);
            localObject1 = this.OooO0oO;
            ((ArrayList)localObject1).set(m, localObject3);
          }
          else
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = "Bad fragment at key ";
            ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject2).append((String)localObject1);
          }
        }
      }
    }
  }
  
  public Parcelable OooOO0o()
  {
    Object localObject1 = this.OooO0o;
    int i = ((ArrayList)localObject1).size();
    Object localObject2;
    if (i > 0)
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      j = this.OooO0o.size();
      arrayOfSavedState = new Fragment.SavedState[j];
      this.OooO0o.toArray(arrayOfSavedState);
      localObject2 = "states";
      ((Bundle)localObject1).putParcelableArray((String)localObject2, arrayOfSavedState);
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    int j = 0;
    Fragment.SavedState[] arrayOfSavedState = null;
    for (;;)
    {
      localObject2 = this.OooO0oO;
      int k = ((ArrayList)localObject2).size();
      if (j >= k) {
        break;
      }
      localObject2 = (Fragment)this.OooO0oO.get(j);
      if (localObject2 != null)
      {
        boolean bool = ((Fragment)localObject2).isAdded();
        if (bool)
        {
          if (localObject1 == null)
          {
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
          }
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("f");
          ((StringBuilder)localObject3).append(j);
          localObject3 = ((StringBuilder)localObject3).toString();
          FragmentManager localFragmentManager = this.OooO0OO;
          localFragmentManager.o0000OO((Bundle)localObject1, (String)localObject3, (Fragment)localObject2);
        }
      }
      j += 1;
    }
    return localObject1;
  }
  
  public void OooOOO(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    paramViewGroup = this.OooO0oo;
    if (paramObject != paramViewGroup)
    {
      paramInt = 1;
      if (paramViewGroup != null)
      {
        Fragment localFragment = null;
        paramViewGroup.setMenuVisibility(false);
        i = this.OooO0Oo;
        if (i == paramInt)
        {
          paramViewGroup = this.OooO0o0;
          if (paramViewGroup == null)
          {
            paramViewGroup = this.OooO0OO.OooOOo0();
            this.OooO0o0 = paramViewGroup;
          }
          paramViewGroup = this.OooO0o0;
          localFragment = this.OooO0oo;
          Lifecycle.State localState1 = Lifecycle.State.o00Ooo0O;
          paramViewGroup.OooOo0O(localFragment, localState1);
        }
        else
        {
          paramViewGroup = this.OooO0oo;
          paramViewGroup.setUserVisibleHint(false);
        }
      }
      paramObject.setMenuVisibility(paramInt);
      int i = this.OooO0Oo;
      if (i == paramInt)
      {
        paramViewGroup = this.OooO0o0;
        if (paramViewGroup == null)
        {
          paramViewGroup = this.OooO0OO.OooOOo0();
          this.OooO0o0 = paramViewGroup;
        }
        paramViewGroup = this.OooO0o0;
        Lifecycle.State localState2 = Lifecycle.State.o00Ooo0o;
        paramViewGroup.OooOo0O(paramObject, localState2);
      }
      else
      {
        paramObject.setUserVisibleHint(paramInt);
      }
      this.OooO0oo = paramObject;
    }
  }
  
  public void OooOOOo(ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getId();
    int j = -1;
    if (i != j) {
      return;
    }
    paramViewGroup = new java/lang/IllegalStateException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("ViewPager with adapter ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" requires a view id");
    localObject = ((StringBuilder)localObject).toString();
    paramViewGroup.<init>((String)localObject);
    throw paramViewGroup;
  }
  
  public abstract Fragment getItem(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentStatePagerAdapter
 * JD-Core Version:    0.7.0.1
 */