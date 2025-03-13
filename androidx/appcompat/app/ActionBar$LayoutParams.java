package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.R.styleable;

public class ActionBar$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int OooO00o;
  
  public ActionBar$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.OooO00o = 8388627;
  }
  
  public ActionBar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.OooO00o = 0;
    int[] arrayOfInt = R.styleable.ActionBarLayout;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.ActionBarLayout_android_layout_gravity;
    i = paramContext.getInt(i, 0);
    this.OooO00o = i;
    paramContext.recycle();
  }
  
  public ActionBar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.OooO00o = 0;
  }
  
  public ActionBar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.OooO00o = 0;
    int i = paramLayoutParams.OooO00o;
    this.OooO00o = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBar.LayoutParams
 * JD-Core Version:    0.7.0.1
 */