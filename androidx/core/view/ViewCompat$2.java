package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

class ViewCompat$2
  extends ViewCompat.AccessibilityViewProperty
{
  public ViewCompat$2(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramClass, paramInt2, paramInt3);
  }
  
  public CharSequence OooO(View paramView)
  {
    return ViewCompat.Api28Impl.OooO0O0(paramView);
  }
  
  public void OooOO0(View paramView, CharSequence paramCharSequence)
  {
    ViewCompat.Api28Impl.OooO0oo(paramView, paramCharSequence);
  }
  
  public boolean OooOO0O(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return TextUtils.equals(paramCharSequence1, paramCharSequence2) ^ true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.2
 * JD-Core Version:    0.7.0.1
 */