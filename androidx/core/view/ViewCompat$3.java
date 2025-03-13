package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

class ViewCompat$3
  extends ViewCompat.AccessibilityViewProperty
{
  public ViewCompat$3(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramClass, paramInt2, paramInt3);
  }
  
  public CharSequence OooO(View paramView)
  {
    return ViewCompat.Api30Impl.OooO00o(paramView);
  }
  
  public void OooOO0(View paramView, CharSequence paramCharSequence)
  {
    ViewCompat.Api30Impl.OooO0OO(paramView, paramCharSequence);
  }
  
  public boolean OooOO0O(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return TextUtils.equals(paramCharSequence1, paramCharSequence2) ^ true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.3
 * JD-Core Version:    0.7.0.1
 */