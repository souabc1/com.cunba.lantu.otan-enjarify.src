package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;

public abstract class FragmentPagerAdapter
  extends PagerAdapter
{
  public final FragmentManager OooO0OO;
  public final int OooO0Oo;
  public Fragment OooO0o = null;
  public FragmentTransaction OooO0o0 = null;
  public boolean OooO0oO;
  
  public FragmentPagerAdapter(FragmentManager paramFragmentManager)
  {
    this(paramFragmentManager, 0);
  }
  
  public FragmentPagerAdapter(FragmentManager paramFragmentManager, int paramInt)
  {
    this.OooO0OO = paramFragmentManager;
    this.OooO0Oo = paramInt;
  }
  
  public static String OooOOo(int paramInt, long paramLong)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("android:switcher:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(":");
    localStringBuilder.append(paramLong);
    return localStringBuilder.toString();
  }
  
  public void OooO0O0(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    paramViewGroup = this.OooO0o0;
    if (paramViewGroup == null)
    {
      paramViewGroup = this.OooO0OO.OooOOo0();
      this.OooO0o0 = paramViewGroup;
    }
    this.OooO0o0.OooOOO(paramObject);
    paramViewGroup = this.OooO0o;
    boolean bool = paramObject.equals(paramViewGroup);
    if (bool)
    {
      bool = false;
      paramViewGroup = null;
      this.OooO0o = null;
    }
  }
  
  public void OooO0Oo(ViewGroup paramViewGroup)
  {
    paramViewGroup = this.OooO0o0;
    if (paramViewGroup != null)
    {
      boolean bool = this.OooO0oO;
      if (!bool)
      {
        bool = true;
        try
        {
          this.OooO0oO = bool;
          paramViewGroup.OooOOO0();
        }
        finally
        {
          this.OooO0oO = false;
        }
      }
      paramViewGroup = null;
      this.OooO0o0 = null;
    }
  }
  
  public Object OooO0oO(ViewGroup paramViewGroup, int paramInt)
  {
    FragmentTransaction localFragmentTransaction = this.OooO0o0;
    if (localFragmentTransaction == null)
    {
      localFragmentTransaction = this.OooO0OO.OooOOo0();
      this.OooO0o0 = localFragmentTransaction;
    }
    long l = getItemId(paramInt);
    int i = paramViewGroup.getId();
    Object localObject1 = OooOOo(i, l);
    FragmentManager localFragmentManager = this.OooO0OO;
    localObject1 = localFragmentManager.o00O0O((String)localObject1);
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      paramViewGroup = this.OooO0o0;
      paramViewGroup.OooO((Fragment)localObject1);
    }
    else
    {
      localObject1 = getItem(paramInt);
      localObject2 = this.OooO0o0;
      int j = paramViewGroup.getId();
      k = paramViewGroup.getId();
      paramViewGroup = OooOOo(k, l);
      ((FragmentTransaction)localObject2).OooO0OO(j, (Fragment)localObject1, paramViewGroup);
    }
    paramViewGroup = this.OooO0o;
    if (localObject1 != paramViewGroup)
    {
      k = 0;
      paramViewGroup = null;
      ((Fragment)localObject1).setMenuVisibility(false);
      paramInt = this.OooO0Oo;
      int m = 1;
      if (paramInt == m)
      {
        paramViewGroup = this.OooO0o0;
        localObject2 = Lifecycle.State.o00Ooo0O;
        paramViewGroup.OooOo0O((Fragment)localObject1, (Lifecycle.State)localObject2);
      }
      else
      {
        ((Fragment)localObject1).setUserVisibleHint(false);
      }
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
  
  public void OooOO0O(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable OooOO0o()
  {
    return null;
  }
  
  public void OooOOO(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    paramViewGroup = this.OooO0o;
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
          localFragment = this.OooO0o;
          Lifecycle.State localState1 = Lifecycle.State.o00Ooo0O;
          paramViewGroup.OooOo0O(localFragment, localState1);
        }
        else
        {
          paramViewGroup = this.OooO0o;
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
      this.OooO0o = paramObject;
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
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentPagerAdapter
 * JD-Core Version:    0.7.0.1
 */