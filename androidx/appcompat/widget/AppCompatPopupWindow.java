package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R.styleable;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow
  extends PopupWindow
{
  public static final boolean OooO0O0 = false;
  public boolean OooO00o;
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    OooO00o(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void setSupportOverlapAnchor(boolean paramBoolean)
  {
    boolean bool = OooO0O0;
    if (bool) {
      this.OooO00o = paramBoolean;
    } else {
      PopupWindowCompat.OooO00o(this, paramBoolean);
    }
  }
  
  public final void OooO00o(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = R.styleable.PopupWindow;
    paramContext = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    int i = R.styleable.PopupWindow_overlapAnchor;
    boolean bool1 = paramContext.OooOO0o(i);
    if (bool1)
    {
      int j = R.styleable.PopupWindow_overlapAnchor;
      paramInt1 = 0;
      boolean bool2 = paramContext.OooO00o(j, false);
      setSupportOverlapAnchor(bool2);
    }
    int k = R.styleable.PopupWindow_android_popupBackground;
    paramAttributeSet = paramContext.getDrawable(k);
    setBackgroundDrawable(paramAttributeSet);
    paramContext.OooOOOo();
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = OooO0O0;
    if (bool)
    {
      bool = this.OooO00o;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = OooO0O0;
    if (bool)
    {
      bool = this.OooO00o;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = OooO0O0;
    if (bool)
    {
      bool = this.OooO00o;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatPopupWindow
 * JD-Core Version:    0.7.0.1
 */