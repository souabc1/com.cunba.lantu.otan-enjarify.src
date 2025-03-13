package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ViewPager$LayoutParams
  extends ViewGroup.LayoutParams
{
  public boolean OooO00o;
  public int OooO0O0;
  public float OooO0OO = 0.0F;
  public boolean OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  
  public ViewPager$LayoutParams()
  {
    super(i, i);
  }
  
  public ViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = ViewPager.o0ooOO;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = paramContext.getInteger(0, 48);
    this.OooO0O0 = i;
    paramContext.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.ViewPager.LayoutParams
 * JD-Core Version:    0.7.0.1
 */