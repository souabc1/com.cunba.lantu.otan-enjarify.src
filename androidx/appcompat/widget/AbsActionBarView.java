package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

abstract class AbsActionBarView
  extends ViewGroup
{
  public final AbsActionBarView.VisibilityAnimListener o00OoOoo;
  public ActionMenuView o00Ooo0;
  public final Context o00Ooo00;
  public ActionMenuPresenter o00Ooo0O;
  public int o00Ooo0o;
  public boolean o00OooO;
  public ViewPropertyAnimatorCompat o00OooO0;
  public boolean o00OooOO;
  
  public AbsActionBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new androidx/appcompat/widget/AbsActionBarView$VisibilityAnimListener;
    paramAttributeSet.<init>(this);
    this.o00OoOoo = paramAttributeSet;
    paramAttributeSet = new android/util/TypedValue;
    paramAttributeSet.<init>();
    Object localObject = paramContext.getTheme();
    int i = R.attr.actionBarPopupTheme;
    boolean bool = true;
    paramInt = ((Resources.Theme)localObject).resolveAttribute(i, paramAttributeSet, bool);
    if (paramInt != 0)
    {
      paramInt = paramAttributeSet.resourceId;
      if (paramInt != 0)
      {
        localObject = new android/view/ContextThemeWrapper;
        int j = paramAttributeSet.resourceId;
        ((ContextThemeWrapper)localObject).<init>(paramContext, j);
        this.o00Ooo00 = ((Context)localObject);
        return;
      }
    }
    this.o00Ooo00 = paramContext;
  }
  
  public static int OooO0Oo(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt1 -= paramInt2;
    } else {
      paramInt1 += paramInt2;
    }
    return paramInt1;
  }
  
  public int OooO0OO(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.makeMeasureSpec(paramInt1, -1 << -1);
    paramView.measure(i, paramInt2);
    int j = paramView.getMeasuredWidth();
    paramInt1 = paramInt1 - j - paramInt3;
    return Math.max(0, paramInt1);
  }
  
  public ViewPropertyAnimatorCompat OooO0o(int paramInt, long paramLong)
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1 = this.o00OooO0;
    if (localViewPropertyAnimatorCompat1 != null) {
      localViewPropertyAnimatorCompat1.OooO0OO();
    }
    localViewPropertyAnimatorCompat1 = null;
    float f;
    if (paramInt == 0)
    {
      int i = getVisibility();
      if (i != 0) {
        setAlpha(0.0F);
      }
      localViewPropertyAnimatorCompat1 = ViewCompat.OooO0o0(this);
      i = 1065353216;
      f = 1.0F;
    }
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2;
    for (localViewPropertyAnimatorCompat1 = localViewPropertyAnimatorCompat1.OooO0O0(f);; localViewPropertyAnimatorCompat1 = localViewPropertyAnimatorCompat2.OooO0O0(0.0F))
    {
      localViewPropertyAnimatorCompat1.OooO0o0(paramLong);
      AbsActionBarView.VisibilityAnimListener localVisibilityAnimListener = this.o00OoOoo.OooO0Oo(localViewPropertyAnimatorCompat1, paramInt);
      localViewPropertyAnimatorCompat1.OooO0oO(localVisibilityAnimListener);
      return localViewPropertyAnimatorCompat1;
      localViewPropertyAnimatorCompat2 = ViewCompat.OooO0o0(this);
    }
  }
  
  public int OooO0o0(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt3 = (paramInt3 - j) / 2;
    paramInt2 += paramInt3;
    if (paramBoolean)
    {
      paramInt3 = paramInt1 - i;
      j += paramInt2;
      paramView.layout(paramInt3, paramInt2, paramInt1, j);
    }
    else
    {
      paramInt3 = paramInt1 + i;
      j += paramInt2;
      paramView.layout(paramInt1, paramInt2, paramInt3, j);
    }
    if (paramBoolean) {
      i = -i;
    }
    return i;
  }
  
  public boolean OooO0oO()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.OooOo0();
    }
    return false;
  }
  
  public int getAnimatedVisibility()
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = this.o00OooO0;
    if (localViewPropertyAnimatorCompat != null) {
      return this.o00OoOoo.OooO0O0;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return this.o00Ooo0o;
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.isOverflowMenuShowPending();
    }
    return false;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.isOverflowMenuShowing();
    }
    return false;
  }
  
  public boolean isOverflowReserved()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null)
    {
      bool = localActionMenuPresenter.isOverflowReserved();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localActionMenuPresenter = null;
    return bool;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Object localObject = getContext();
    int[] arrayOfInt = R.styleable.ActionBar;
    int i = R.attr.actionBarStyle;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, i, 0);
    int j = R.styleable.ActionBar_height;
    j = ((TypedArray)localObject).getLayoutDimension(j, 0);
    setContentHeight(j);
    ((TypedArray)localObject).recycle();
    localObject = this.o00Ooo0O;
    if (localObject != null) {
      ((ActionMenuPresenter)localObject).OooOo00(paramConfiguration);
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = 9;
    if (i == j) {
      this.o00OooOO = false;
    }
    boolean bool1 = this.o00OooOO;
    boolean bool2 = true;
    if (!bool1)
    {
      boolean bool3 = super.onHoverEvent(paramMotionEvent);
      if ((i == j) && (!bool3)) {
        this.o00OooOO = bool2;
      }
    }
    int k = 10;
    if (i != k)
    {
      k = 3;
      if (i != k) {}
    }
    else
    {
      this.o00OooOO = false;
    }
    return bool2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      this.o00OooO = false;
    }
    boolean bool1 = this.o00OooO;
    int j = 1;
    if (!bool1)
    {
      boolean bool2 = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool2)) {
        this.o00OooO = j;
      }
    }
    if (i != j)
    {
      int k = 3;
      if (i != k) {}
    }
    else
    {
      this.o00OooO = false;
    }
    return j;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.o00Ooo0o = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    int i = getVisibility();
    if (paramInt != i)
    {
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = this.o00OooO0;
      if (localViewPropertyAnimatorCompat != null) {
        localViewPropertyAnimatorCompat.OooO0OO();
      }
      super.setVisibility(paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AbsActionBarView
 * JD-Core Version:    0.7.0.1
 */