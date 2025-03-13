package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;

abstract class ViewCompat$AccessibilityViewProperty
{
  public final int OooO00o;
  public final Class OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  
  public ViewCompat$AccessibilityViewProperty(int paramInt1, Class paramClass, int paramInt2)
  {
    this(paramInt1, paramClass, 0, paramInt2);
  }
  
  public ViewCompat$AccessibilityViewProperty(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramClass;
    this.OooO0Oo = paramInt2;
    this.OooO0OO = paramInt3;
  }
  
  public boolean OooO00o(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    boolean bool1 = true;
    if (paramBoolean1 != null)
    {
      bool2 = paramBoolean1.booleanValue();
      if (bool2)
      {
        bool2 = bool1;
        break label28;
      }
    }
    boolean bool2 = false;
    paramBoolean1 = null;
    label28:
    if (paramBoolean2 != null)
    {
      bool3 = paramBoolean2.booleanValue();
      if (bool3)
      {
        bool3 = bool1;
        break label54;
      }
    }
    boolean bool3 = false;
    paramBoolean2 = null;
    label54:
    if (bool2 != bool3) {
      bool1 = false;
    }
    return bool1;
  }
  
  public final boolean OooO0O0()
  {
    return true;
  }
  
  public final boolean OooO0OO()
  {
    int i = Build.VERSION.SDK_INT;
    int j = this.OooO0OO;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public abstract Object OooO0Oo(View paramView);
  
  public Object OooO0o(View paramView)
  {
    boolean bool1 = OooO0OO();
    if (bool1) {
      return OooO0Oo(paramView);
    }
    bool1 = OooO0O0();
    if (bool1)
    {
      int i = this.OooO00o;
      paramView = paramView.getTag(i);
      Class localClass = this.OooO0O0;
      boolean bool2 = localClass.isInstance(paramView);
      if (bool2) {
        return paramView;
      }
    }
    return null;
  }
  
  public abstract void OooO0o0(View paramView, Object paramObject);
  
  public void OooO0oO(View paramView, Object paramObject)
  {
    boolean bool = OooO0OO();
    if (bool)
    {
      OooO0o0(paramView, paramObject);
    }
    else
    {
      bool = OooO0O0();
      if (bool)
      {
        Object localObject = OooO0o(paramView);
        bool = OooO0oo(localObject, paramObject);
        if (bool)
        {
          ViewCompat.OooO(paramView);
          int i = this.OooO00o;
          paramView.setTag(i, paramObject);
          int j = this.OooO0Oo;
          ViewCompat.Ooooo00(paramView, j);
        }
      }
    }
  }
  
  public boolean OooO0oo(Object paramObject1, Object paramObject2)
  {
    return paramObject2.equals(paramObject1) ^ true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.AccessibilityViewProperty
 * JD-Core Version:    0.7.0.1
 */