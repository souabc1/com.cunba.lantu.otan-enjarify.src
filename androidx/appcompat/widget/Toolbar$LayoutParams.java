package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.app.ActionBar.LayoutParams;

public class Toolbar$LayoutParams
  extends ActionBar.LayoutParams
{
  public int OooO0O0 = 0;
  
  public Toolbar$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.OooO00o = 8388627;
  }
  
  public Toolbar$LayoutParams(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2);
    this.OooO00o = paramInt3;
  }
  
  public Toolbar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Toolbar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public Toolbar$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    OooO00o(paramMarginLayoutParams);
  }
  
  public Toolbar$LayoutParams(ActionBar.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public Toolbar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    int i = paramLayoutParams.OooO0O0;
    this.OooO0O0 = i;
  }
  
  public void OooO00o(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    int i = paramMarginLayoutParams.leftMargin;
    this.leftMargin = i;
    i = paramMarginLayoutParams.topMargin;
    this.topMargin = i;
    i = paramMarginLayoutParams.rightMargin;
    this.rightMargin = i;
    int j = paramMarginLayoutParams.bottomMargin;
    this.bottomMargin = j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.LayoutParams
 * JD-Core Version:    0.7.0.1
 */