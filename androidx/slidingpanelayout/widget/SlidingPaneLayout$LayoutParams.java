package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class SlidingPaneLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public static final int[] OooO0o0 = { 16843137 };
  public float OooO00o = 0.0F;
  public boolean OooO0O0;
  public boolean OooO0OO;
  public Paint OooO0Oo;
  
  public SlidingPaneLayout$LayoutParams()
  {
    super(i, i);
  }
  
  public SlidingPaneLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public SlidingPaneLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = OooO0o0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    float f = paramContext.getFloat(0, 0.0F);
    this.OooO00o = f;
    paramContext.recycle();
  }
  
  public SlidingPaneLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public SlidingPaneLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */