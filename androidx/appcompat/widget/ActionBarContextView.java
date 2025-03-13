package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewCompat;

public class ActionBarContextView
  extends AbsActionBarView
{
  public CharSequence o00OooOo;
  public View o00OoooO;
  public View o00Ooooo;
  public int o00o00;
  public LinearLayout o00o000;
  public View o00o0000;
  public TextView o00o000O;
  public TextView o00o000o;
  public boolean o00o00O0;
  public int o00o00Oo;
  public CharSequence o0O00o0;
  public int oo00oO;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = R.styleable.ActionMode;
    paramContext = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    int i = R.styleable.ActionMode_background;
    paramAttributeSet = paramContext.getDrawable(i);
    ViewCompat.o0ooOoO(this, paramAttributeSet);
    i = R.styleable.ActionMode_titleTextStyle;
    i = paramContext.OooOO0O(i, 0);
    this.oo00oO = i;
    i = R.styleable.ActionMode_subtitleTextStyle;
    i = paramContext.OooOO0O(i, 0);
    this.o00o00 = i;
    i = R.styleable.ActionMode_height;
    i = paramContext.OooOO0(i, 0);
    this.o00Ooo0o = i;
    i = R.styleable.ActionMode_closeItemLayout;
    paramInt = R.layout.abc_action_mode_close_item_material;
    i = paramContext.OooOO0O(i, paramInt);
    this.o00o00Oo = i;
    paramContext.OooOOOo();
  }
  
  public void OooO(ActionMode paramActionMode)
  {
    Object localObject1 = this.o00OoooO;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      i = this.o00o00Oo;
      localContext = null;
      localObject1 = ((LayoutInflater)localObject1).inflate(i, this, false);
      this.o00OoooO = ((View)localObject1);
    }
    for (;;)
    {
      addView((View)localObject1);
      break;
      localObject1 = ((View)localObject1).getParent();
      if (localObject1 != null) {
        break;
      }
      localObject1 = this.o00OoooO;
    }
    localObject1 = this.o00OoooO;
    int i = R.id.action_mode_close_button;
    localObject1 = ((View)localObject1).findViewById(i);
    this.o00Ooooo = ((View)localObject1);
    Object localObject2 = new androidx/appcompat/widget/ActionBarContextView$1;
    ((ActionBarContextView.1)localObject2).<init>(this, paramActionMode);
    ((View)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    paramActionMode = (MenuBuilder)paramActionMode.getMenu();
    localObject1 = this.o00Ooo0O;
    if (localObject1 != null) {
      ((ActionMenuPresenter)localObject1).OooOOOo();
    }
    localObject1 = new androidx/appcompat/widget/ActionMenuPresenter;
    localObject2 = getContext();
    ((ActionMenuPresenter)localObject1).<init>((Context)localObject2);
    this.o00Ooo0O = ((ActionMenuPresenter)localObject1);
    ((ActionMenuPresenter)localObject1).setReserveOverflow(true);
    localObject1 = new android/view/ViewGroup$LayoutParams;
    ((ViewGroup.LayoutParams)localObject1).<init>(-2, -1);
    localObject2 = this.o00Ooo0O;
    Context localContext = this.o00Ooo00;
    paramActionMode.addMenuPresenter((MenuPresenter)localObject2, localContext);
    paramActionMode = (ActionMenuView)this.o00Ooo0O.OooO0oO(this);
    this.o00Ooo0 = paramActionMode;
    ViewCompat.o0ooOoO(paramActionMode, null);
    paramActionMode = this.o00Ooo0;
    addView(paramActionMode, (ViewGroup.LayoutParams)localObject1);
  }
  
  public boolean OooO0oO()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.OooOo0();
    }
    return false;
  }
  
  public void OooO0oo()
  {
    View localView = this.o00OoooO;
    if (localView == null) {
      OooOO0O();
    }
  }
  
  public final void OooOO0()
  {
    Object localObject1 = this.o00o000;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      int i = R.layout.abc_action_bar_title_item;
      ((LayoutInflater)localObject1).inflate(i, this);
      int j = getChildCount() + -1;
      localObject1 = (LinearLayout)getChildAt(j);
      this.o00o000 = ((LinearLayout)localObject1);
      i = R.id.action_bar_title;
      localObject1 = (TextView)((View)localObject1).findViewById(i);
      this.o00o000O = ((TextView)localObject1);
      localObject1 = this.o00o000;
      i = R.id.action_bar_subtitle;
      localObject1 = (TextView)((View)localObject1).findViewById(i);
      this.o00o000o = ((TextView)localObject1);
      j = this.oo00oO;
      int k;
      if (j != 0)
      {
        localObject1 = this.o00o000O;
        localObject2 = getContext();
        k = this.oo00oO;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, k);
      }
      j = this.o00o00;
      if (j != 0)
      {
        localObject1 = this.o00o000o;
        localObject2 = getContext();
        k = this.o00o00;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, k);
      }
    }
    localObject1 = this.o00o000O;
    Object localObject2 = this.o00OooOo;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.o00o000o;
    localObject2 = this.o0O00o0;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.o00OooOo;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1) ^ true;
    localObject2 = this.o0O00o0;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2) ^ true;
    Object localObject3 = this.o00o000o;
    int m = 0;
    int n = 8;
    int i1;
    if (bool1) {
      i1 = 0;
    } else {
      i1 = n;
    }
    ((View)localObject3).setVisibility(i1);
    localObject3 = this.o00o000;
    if ((!bool2) && (!bool1)) {
      m = n;
    }
    ((View)localObject3).setVisibility(m);
    localObject1 = this.o00o000.getParent();
    if (localObject1 == null)
    {
      localObject1 = this.o00o000;
      addView((View)localObject1);
    }
  }
  
  public void OooOO0O()
  {
    removeAllViews();
    this.o00o0000 = null;
    this.o00Ooo0 = null;
    this.o00Ooo0O = null;
    View localView = this.o00Ooooo;
    if (localView != null) {
      localView.setOnClickListener(null);
    }
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    localMarginLayoutParams.<init>(-1, -2);
    return localMarginLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    Context localContext = getContext();
    localMarginLayoutParams.<init>(localContext, paramAttributeSet);
    return localMarginLayoutParams;
  }
  
  public CharSequence getSubtitle()
  {
    return this.o0O00o0;
  }
  
  public CharSequence getTitle()
  {
    return this.o00OooOo;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.isOverflowMenuShowing();
    }
    return false;
  }
  
  public boolean isTitleOptional()
  {
    return this.o00o00O0;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ActionMenuPresenter localActionMenuPresenter = this.o00Ooo0O;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter.OooOOo();
      localActionMenuPresenter = this.o00Ooo0O;
      localActionMenuPresenter.OooOOoo();
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = ViewUtils.OooO0O0(this);
    int i;
    int j;
    if (paramBoolean)
    {
      i = paramInt3 - paramInt1;
      j = getPaddingRight();
      i -= j;
    }
    else
    {
      i = getPaddingLeft();
    }
    int k = getPaddingTop();
    paramInt4 -= paramInt2;
    paramInt2 = getPaddingTop();
    paramInt4 -= paramInt2;
    paramInt2 = getPaddingBottom();
    paramInt2 = paramInt4 - paramInt2;
    Object localObject1 = this.o00OoooO;
    int m = 8;
    int i1;
    int i2;
    if (localObject1 != null)
    {
      paramInt4 = ((View)localObject1).getVisibility();
      if (paramInt4 != m)
      {
        localObject1 = (ViewGroup.MarginLayoutParams)this.o00OoooO.getLayoutParams();
        if (paramBoolean) {
          j = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
        } else {
          j = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
        }
        if (paramBoolean) {
          paramInt4 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
        } else {
          paramInt4 = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
        }
        int n = AbsActionBarView.OooO0Oo(i, j, paramBoolean);
        localObject2 = this.o00OoooO;
        localObject3 = this;
        i1 = k;
        i2 = paramInt2;
        i = OooO0o0((View)localObject2, n, k, paramInt2, paramBoolean);
        n += i;
        i = AbsActionBarView.OooO0Oo(n, paramInt4, paramBoolean);
      }
    }
    paramInt4 = i;
    Object localObject3 = this.o00o000;
    if (localObject3 != null)
    {
      localObject2 = this.o00o0000;
      if (localObject2 == null)
      {
        i = ((View)localObject3).getVisibility();
        if (i != m)
        {
          localObject2 = this.o00o000;
          localObject3 = this;
          i1 = k;
          i2 = paramInt2;
          i = OooO0o0((View)localObject2, paramInt4, k, paramInt2, paramBoolean);
          paramInt4 += i;
        }
      }
    }
    Object localObject2 = this.o00o0000;
    if (localObject2 != null)
    {
      localObject3 = this;
      i1 = k;
      i2 = paramInt2;
      OooO0o0((View)localObject2, paramInt4, k, paramInt2, paramBoolean);
    }
    if (paramBoolean)
    {
      paramInt1 = getPaddingLeft();
      i1 = paramInt1;
    }
    else
    {
      paramInt3 -= paramInt1;
      paramInt1 = getPaddingRight();
      paramInt3 -= paramInt1;
      i1 = paramInt3;
    }
    ActionMenuView localActionMenuView = this.o00Ooo0;
    if (localActionMenuView != null)
    {
      paramBoolean ^= true;
      localObject2 = this;
      i2 = k;
      boolean bool = paramBoolean;
      OooO0o0(localActionMenuView, i1, i2, paramInt2, paramBoolean);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == j)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      if (i != 0)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        i = this.o00Ooo0o;
        if (i <= 0) {
          i = View.MeasureSpec.getSize(paramInt2);
        }
        paramInt2 = getPaddingTop();
        int k = getPaddingBottom();
        paramInt2 += k;
        k = getPaddingLeft();
        k = paramInt1 - k;
        int m = getPaddingRight();
        k -= m;
        m = i - paramInt2;
        int n = -1 << -1;
        float f = -0.0F;
        int i1 = View.MeasureSpec.makeMeasureSpec(m, n);
        Object localObject1 = this.o00OoooO;
        int i2 = 0;
        int i5;
        if (localObject1 != null)
        {
          k = OooO0OO((View)localObject1, k, i1, 0);
          localObject1 = (ViewGroup.MarginLayoutParams)this.o00OoooO.getLayoutParams();
          int i3 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
          i5 = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
          i3 += i5;
          k -= i3;
        }
        localObject1 = this.o00Ooo0;
        if (localObject1 != null)
        {
          localObject1 = ((View)localObject1).getParent();
          if (localObject1 == this)
          {
            localObject1 = this.o00Ooo0;
            k = OooO0OO((View)localObject1, k, i1, 0);
          }
        }
        localObject1 = this.o00o000;
        if (localObject1 != null)
        {
          Object localObject2 = this.o00o0000;
          if (localObject2 == null)
          {
            boolean bool = this.o00o00O0;
            if (bool)
            {
              i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
              localObject2 = this.o00o000;
              ((View)localObject2).measure(i5, i1);
              localObject3 = this.o00o000;
              i1 = ((View)localObject3).getMeasuredWidth();
              if (i1 <= k)
              {
                i5 = 1;
              }
              else
              {
                i5 = 0;
                localObject1 = null;
              }
              if (i5 != 0) {
                k -= i1;
              }
              localObject3 = this.o00o000;
              if (i5 != 0)
              {
                i5 = 0;
                localObject1 = null;
              }
              else
              {
                i5 = 8;
              }
              ((View)localObject3).setVisibility(i5);
            }
            else
            {
              k = OooO0OO((View)localObject1, k, i1, 0);
            }
          }
        }
        Object localObject3 = this.o00o0000;
        if (localObject3 != null)
        {
          localObject3 = ((View)localObject3).getLayoutParams();
          i5 = ((ViewGroup.LayoutParams)localObject3).width;
          int i4 = -2;
          int i6;
          if (i5 != i4) {
            i6 = j;
          } else {
            i6 = n;
          }
          if (i5 >= 0) {
            k = Math.min(i5, k);
          }
          i1 = ((ViewGroup.LayoutParams)localObject3).height;
          if (i1 == i4) {
            j = n;
          }
          if (i1 >= 0) {
            m = Math.min(i1, m);
          }
          View localView1 = this.o00o0000;
          k = View.MeasureSpec.makeMeasureSpec(k, i6);
          j = View.MeasureSpec.makeMeasureSpec(m, j);
          localView1.measure(k, j);
        }
        j = this.o00Ooo0o;
        if (j <= 0)
        {
          i = getChildCount();
          j = 0;
          while (i2 < i)
          {
            View localView2 = getChildAt(i2);
            k = localView2.getMeasuredHeight() + paramInt2;
            if (k > j) {
              j = k;
            }
            i2 += 1;
          }
          setMeasuredDimension(paramInt1, j);
        }
        else
        {
          setMeasuredDimension(paramInt1, i);
        }
        return;
      }
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str = getClass().getSimpleName();
      ((StringBuilder)localObject4).append(str);
      ((StringBuilder)localObject4).append(" can only be used with android:layout_height=\"wrap_content\"");
      localObject4 = ((StringBuilder)localObject4).toString();
      localIllegalStateException.<init>((String)localObject4);
      throw localIllegalStateException;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    String str = getClass().getSimpleName();
    ((StringBuilder)localObject4).append(str);
    ((StringBuilder)localObject4).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    localObject4 = ((StringBuilder)localObject4).toString();
    localIllegalStateException.<init>((String)localObject4);
    throw localIllegalStateException;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.o00o0000;
    if (localObject != null) {
      removeView((View)localObject);
    }
    this.o00o0000 = paramView;
    if (paramView != null)
    {
      localObject = this.o00o000;
      if (localObject != null)
      {
        removeView((View)localObject);
        localObject = null;
        this.o00o000 = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.o0O00o0 = paramCharSequence;
    OooOO0();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.o00OooOo = paramCharSequence;
    OooOO0();
    ViewCompat.o0ooOOo(this, paramCharSequence);
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    boolean bool = this.o00o00O0;
    if (paramBoolean != bool) {
      requestLayout();
    }
    this.o00o00O0 = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionBarContextView
 * JD-Core Version:    0.7.0.1
 */