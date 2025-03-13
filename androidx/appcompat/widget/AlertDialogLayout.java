package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.R.id;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

public class AlertDialogLayout
  extends LinearLayoutCompat
{
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void OooO0o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 += paramInt1;
    paramInt4 += paramInt2;
    paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void OooO0o0(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int j = 0;
    while (j < paramInt1)
    {
      View localView = getChildAt(j);
      int k = localView.getVisibility();
      int m = 8;
      if (k != m)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        k = ((LinearLayout.LayoutParams)localObject2).width;
        m = -1;
        if (k == m)
        {
          int n = ((LinearLayout.LayoutParams)localObject2).height;
          k = localView.getMeasuredHeight();
          ((LinearLayout.LayoutParams)localObject2).height = k;
          localObject1 = this;
          m = i;
          measureChildWithMargins(localView, i, 0, paramInt2, 0);
          ((LinearLayout.LayoutParams)localObject2).height = n;
        }
      }
      j += 1;
    }
  }
  
  public static int OooO0oO(View paramView)
  {
    int i = ViewCompat.OooOoo0(paramView);
    if (i > 0) {
      return i;
    }
    boolean bool = paramView instanceof ViewGroup;
    if (bool)
    {
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      int k = 1;
      if (j == k) {
        return OooO0oO(paramView.getChildAt(0));
      }
    }
    return 0;
  }
  
  public final boolean OooO0oo(int paramInt1, int paramInt2)
  {
    AlertDialogLayout localAlertDialogLayout = this;
    int i = paramInt1;
    int j = paramInt2;
    int k = getChildCount();
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    int i1 = 0;
    Object localObject2 = null;
    int i2 = 0;
    Object localObject3 = null;
    int i3 = 0;
    View localView1 = null;
    int i4;
    for (;;)
    {
      i4 = 8;
      if (i3 >= k) {
        break;
      }
      View localView2 = localAlertDialogLayout.getChildAt(i3);
      i5 = localView2.getVisibility();
      if (i5 != i4)
      {
        i4 = localView2.getId();
        i5 = R.id.topPanel;
        if (i4 == i5)
        {
          localObject1 = localView2;
        }
        else
        {
          i5 = R.id.buttonPanel;
          if (i4 == i5)
          {
            localObject2 = localView2;
          }
          else
          {
            i5 = R.id.contentPanel;
            if (i4 != i5)
            {
              i5 = R.id.customPanel;
              if (i4 != i5) {
                return false;
              }
            }
            if (localObject3 != null) {
              return false;
            }
            localObject3 = localView2;
          }
        }
      }
      i3 += 1;
    }
    i3 = View.MeasureSpec.getMode(paramInt2);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    int i5 = View.MeasureSpec.getMode(paramInt1);
    int i7 = getPaddingTop();
    int i8 = getPaddingBottom();
    i7 += i8;
    if (localObject1 != null)
    {
      localObject1.measure(i, 0);
      i8 = localObject1.getMeasuredHeight();
      i7 += i8;
      m = localObject1.getMeasuredState();
      m = View.combineMeasuredStates(0, m);
    }
    else
    {
      m = 0;
      localObject1 = null;
    }
    int i9;
    int i10;
    if (localObject2 != null)
    {
      localObject2.measure(i, 0);
      i8 = OooO0oO(localObject2);
      i9 = localObject2.getMeasuredHeight() - i8;
      i7 += i8;
      i10 = localObject2.getMeasuredState();
      m = View.combineMeasuredStates(m, i10);
    }
    else
    {
      i8 = 0;
      i9 = 0;
    }
    if (localObject3 != null)
    {
      if (i3 == 0)
      {
        i10 = 0;
      }
      else
      {
        i10 = i6 - i7;
        i10 = View.MeasureSpec.makeMeasureSpec(Math.max(0, i10), i3);
      }
      localObject3.measure(i, i10);
      i10 = localObject3.getMeasuredHeight();
      i7 += i10;
      n = localObject3.getMeasuredState();
      m = View.combineMeasuredStates(m, n);
    }
    else
    {
      i10 = 0;
    }
    i6 -= i7;
    n = 1073741824;
    if (localObject2 != null)
    {
      i7 -= i8;
      i9 = Math.min(i6, i9);
      if (i9 > 0)
      {
        i6 -= i9;
        i8 += i9;
      }
      i8 = View.MeasureSpec.makeMeasureSpec(i8, n);
      localObject2.measure(i, i8);
      i8 = localObject2.getMeasuredHeight();
      i7 += i8;
      i1 = localObject2.getMeasuredState();
      m = View.combineMeasuredStates(m, i1);
    }
    if ((localObject3 != null) && (i6 > 0))
    {
      i7 -= i10;
      i10 += i6;
      i1 = View.MeasureSpec.makeMeasureSpec(i10, i3);
      localObject3.measure(i, i1);
      i1 = localObject3.getMeasuredHeight();
      i7 += i1;
      i1 = localObject3.getMeasuredState();
      m = View.combineMeasuredStates(m, i1);
    }
    i1 = 0;
    localObject2 = null;
    i2 = 0;
    localObject3 = null;
    while (i1 < k)
    {
      localView1 = localAlertDialogLayout.getChildAt(i1);
      i6 = localView1.getVisibility();
      if (i6 != i4)
      {
        i3 = localView1.getMeasuredWidth();
        i2 = Math.max(i2, i3);
      }
      i1 += 1;
    }
    i1 = getPaddingLeft();
    i3 = getPaddingRight();
    i1 += i3;
    i2 += i1;
    i = View.resolveSizeAndState(i2, i, m);
    localObject1 = null;
    m = View.resolveSizeAndState(i7, j, 0);
    localAlertDialogLayout.setMeasuredDimension(i, m);
    if (i5 != n) {
      localAlertDialogLayout.OooO0o0(k, j);
    }
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AlertDialogLayout localAlertDialogLayout = this;
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = j - k;
    j -= i;
    k = getPaddingRight();
    int n = j - k;
    j = getMeasuredHeight();
    int i1 = getChildCount();
    k = getGravity();
    int i2 = k & 0x70;
    int i3 = 8388615;
    int i5 = k & i3;
    k = 16;
    if (i2 != k)
    {
      k = 80;
      if (i2 != k)
      {
        j = getPaddingTop();
      }
      else
      {
        k = getPaddingTop() + paramInt4 - paramInt2;
        j = k - j;
      }
    }
    else
    {
      k = getPaddingTop();
      i2 = (paramInt4 - paramInt2 - j) / 2;
      j = k + i2;
    }
    Object localObject1 = getDividerDrawable();
    i2 = 0;
    ViewGroup.LayoutParams localLayoutParams = null;
    int i6;
    if (localObject1 == null)
    {
      i6 = 0;
    }
    else
    {
      k = ((Drawable)localObject1).getIntrinsicHeight();
      i6 = k;
    }
    int i7 = 0;
    while (i7 < i1)
    {
      localObject1 = localAlertDialogLayout.getChildAt(i7);
      if (localObject1 != null)
      {
        i2 = ((View)localObject1).getVisibility();
        i3 = 8;
        if (i2 != i3)
        {
          int i8 = ((View)localObject1).getMeasuredWidth();
          int i9 = ((View)localObject1).getMeasuredHeight();
          localLayoutParams = ((View)localObject1).getLayoutParams();
          Object localObject2 = localLayoutParams;
          localObject2 = (LinearLayoutCompat.LayoutParams)localLayoutParams;
          i2 = ((LinearLayout.LayoutParams)localObject2).gravity;
          if (i2 < 0) {
            i2 = i5;
          }
          i3 = ViewCompat.OooOoOO(this);
          i2 = GravityCompat.OooO0O0(i2, i3) & 0x7;
          i3 = 1;
          if (i2 != i3)
          {
            i3 = 5;
            if (i2 != i3)
            {
              i2 = ((LinearLayout.LayoutParams)localObject2).leftMargin + i;
              break label385;
            }
            i2 = m - i8;
          }
          else
          {
            i2 = (n - i8) / 2 + i;
            i3 = ((LinearLayout.LayoutParams)localObject2).leftMargin;
            i2 += i3;
          }
          i3 = ((LinearLayout.LayoutParams)localObject2).rightMargin;
          i2 -= i3;
          label385:
          boolean bool = localAlertDialogLayout.hasDividerBeforeChildAt(i7);
          if (bool) {
            j += i6;
          }
          int i4 = ((LinearLayout.LayoutParams)localObject2).topMargin;
          int i10 = j + i4;
          i4 = i10;
          OooO0o((View)localObject1, i2, i10, i8, i9);
          j = ((LinearLayout.LayoutParams)localObject2).bottomMargin;
          i9 += j;
          i10 += i9;
          j = i10;
        }
      }
      i7 += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = OooO0oo(paramInt1, paramInt2);
    if (!bool) {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AlertDialogLayout
 * JD-Core Version:    0.7.0.1
 */