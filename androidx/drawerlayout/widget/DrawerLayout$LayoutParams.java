package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int OooO00o = 0;
  public float OooO0O0;
  public boolean OooO0OO;
  public int OooO0Oo;
  
  public DrawerLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public DrawerLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = DrawerLayout.o00o0o0o;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = paramContext.getInt(0, 0);
    this.OooO00o = i;
    paramContext.recycle();
  }
  
  public DrawerLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public DrawerLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public DrawerLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    int i = paramLayoutParams.OooO00o;
    this.OooO00o = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */