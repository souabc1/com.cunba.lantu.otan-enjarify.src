package androidx.core.view;

import android.view.View;

class ViewCompat$1
  extends ViewCompat.AccessibilityViewProperty
{
  public ViewCompat$1(int paramInt1, Class paramClass, int paramInt2)
  {
    super(paramInt1, paramClass, paramInt2);
  }
  
  public Boolean OooO(View paramView)
  {
    return Boolean.valueOf(ViewCompat.Api28Impl.OooO0Oo(paramView));
  }
  
  public void OooOO0(View paramView, Boolean paramBoolean)
  {
    boolean bool = paramBoolean.booleanValue();
    ViewCompat.Api28Impl.OooO(paramView, bool);
  }
  
  public boolean OooOO0O(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    return OooO00o(paramBoolean1, paramBoolean2) ^ true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.1
 * JD-Core Version:    0.7.0.1
 */