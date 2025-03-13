package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

public class ButtonBarLayout
  extends LinearLayout
{
  public boolean o00OoOoo;
  public int o00Ooo0;
  public boolean o00Ooo00;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = -1;
    this.o00Ooo0 = i;
    Object localObject = R.styleable.ButtonBarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int[] arrayOfInt = R.styleable.ButtonBarLayout;
    ViewCompat.o00ooo(this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)localObject, 0, 0);
    int j = R.styleable.ButtonBarLayout_allowStacking;
    int m = 1;
    boolean bool1 = ((TypedArray)localObject).getBoolean(j, m);
    this.o00OoOoo = bool1;
    ((TypedArray)localObject).recycle();
    int k = getOrientation();
    if (k == m)
    {
      boolean bool2 = this.o00OoOoo;
      setStacked(bool2);
    }
  }
  
  private int getNextVisibleChildIndex(int paramInt)
  {
    int i = getChildCount();
    while (paramInt < i)
    {
      View localView = getChildAt(paramInt);
      int j = localView.getVisibility();
      if (j == 0) {
        return paramInt;
      }
      paramInt += 1;
    }
    return -1;
  }
  
  private boolean isStacked()
  {
    return this.o00Ooo00;
  }
  
  private void setStacked(boolean paramBoolean)
  {
    boolean bool = this.o00Ooo00;
    if (bool != paramBoolean) {
      if (paramBoolean)
      {
        bool = this.o00OoOoo;
        if (!bool) {}
      }
      else
      {
        this.o00Ooo00 = paramBoolean;
        setOrientation(paramBoolean);
        if (paramBoolean) {
          i = 8388613;
        } else {
          i = 80;
        }
        setGravity(i);
        int i = R.id.spacer;
        View localView = findViewById(i);
        if (localView != null)
        {
          if (paramBoolean) {
            paramBoolean = true;
          } else {
            paramBoolean = true;
          }
          localView.setVisibility(paramBoolean);
        }
        paramBoolean = getChildCount() + -2;
        while (!paramBoolean)
        {
          localView = getChildAt(paramBoolean);
          bringChildToFront(localView);
          paramBoolean += true;
        }
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool2 = this.o00OoOoo;
    int i1 = 0;
    float f1 = 0.0F;
    if (bool2)
    {
      int k = this.o00Ooo0;
      if (i > k)
      {
        bool3 = isStacked();
        if (bool3) {
          setStacked(false);
        }
      }
      this.o00Ooo0 = i;
    }
    boolean bool3 = isStacked();
    int i2 = 1;
    float f2 = 1.4E-45F;
    int i3;
    if (!bool3)
    {
      m = View.MeasureSpec.getMode(paramInt1);
      i3 = 1073741824;
      if (m == i3)
      {
        i = View.MeasureSpec.makeMeasureSpec(i, -1 << -1);
        m = i2;
        f3 = f2;
        break label120;
      }
    }
    i = paramInt1;
    int m = 0;
    Object localObject = null;
    float f3 = 0.0F;
    label120:
    super.onMeasure(i, paramInt2);
    boolean bool1 = this.o00OoOoo;
    View localView;
    if (bool1)
    {
      bool1 = isStacked();
      if (!bool1)
      {
        j = getMeasuredWidthAndState() & 0xFF000000;
        i3 = 16777216;
        if (j == i3)
        {
          j = i2;
        }
        else
        {
          j = 0;
          localView = null;
        }
        if (j != 0)
        {
          setStacked(i2);
          m = i2;
          f3 = f2;
        }
      }
    }
    if (m != 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
    int j = getNextVisibleChildIndex(0);
    if (j >= 0)
    {
      localObject = getChildAt(j);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
      int i4 = getPaddingTop();
      m = ((View)localObject).getMeasuredHeight();
      i4 += m;
      m = localLayoutParams.topMargin;
      i4 += m;
      m = localLayoutParams.bottomMargin;
      i4 = i4 + m + 0;
      boolean bool4 = isStacked();
      int i5;
      if (bool4)
      {
        j += i2;
        j = getNextVisibleChildIndex(j);
        if (j >= 0)
        {
          localView = getChildAt(j);
          j = localView.getPaddingTop();
          localObject = getResources().getDisplayMetrics();
          f3 = ((DisplayMetrics)localObject).density;
          i1 = 1098907648;
          f1 = 16.0F;
          f3 *= f1;
          int n = (int)f3;
          j += n;
          i4 += j;
        }
        i1 = i5;
      }
      else
      {
        j = getPaddingBottom();
        i1 = i5 + j;
      }
    }
    j = ViewCompat.OooOoo0(this);
    if (j != i1)
    {
      setMinimumHeight(i1);
      if (paramInt2 == 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    boolean bool = this.o00OoOoo;
    if (bool != paramBoolean)
    {
      this.o00OoOoo = paramBoolean;
      if (!paramBoolean)
      {
        paramBoolean = isStacked();
        if (paramBoolean)
        {
          paramBoolean = false;
          setStacked(false);
        }
      }
      requestLayout();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ButtonBarLayout
 * JD-Core Version:    0.7.0.1
 */