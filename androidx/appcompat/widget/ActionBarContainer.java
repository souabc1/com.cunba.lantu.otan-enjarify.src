package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

public class ActionBarContainer
  extends FrameLayout
{
  public boolean o00OoOoo;
  public View o00Ooo0;
  public View o00Ooo00;
  public View o00Ooo0O;
  public Drawable o00Ooo0o;
  public Drawable o00OooO;
  public Drawable o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public int o0O00o0;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = new androidx/appcompat/widget/ActionBarBackgroundDrawable;
    ((ActionBarBackgroundDrawable)localObject).<init>(this);
    ViewCompat.o0ooOoO(this, (Drawable)localObject);
    localObject = R.styleable.ActionBar;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = R.styleable.ActionBar_background;
    paramAttributeSet = paramContext.getDrawable(i);
    this.o00Ooo0o = paramAttributeSet;
    i = R.styleable.ActionBar_backgroundStacked;
    paramAttributeSet = paramContext.getDrawable(i);
    this.o00OooO0 = paramAttributeSet;
    i = R.styleable.ActionBar_height;
    i = paramContext.getDimensionPixelSize(i, -1);
    this.o0O00o0 = i;
    i = getId();
    int j = R.id.split_action_bar;
    boolean bool1 = true;
    if (i == j)
    {
      this.o00OooOO = bool1;
      i = R.styleable.ActionBar_backgroundSplit;
      paramAttributeSet = paramContext.getDrawable(i);
      this.o00OooO = paramAttributeSet;
    }
    paramContext.recycle();
    boolean bool2 = this.o00OooOO;
    i = 0;
    paramAttributeSet = null;
    if (bool2)
    {
      paramContext = this.o00OooO;
      if (paramContext == null) {
        break label185;
      }
    }
    else
    {
      paramContext = this.o00Ooo0o;
      if (paramContext == null)
      {
        paramContext = this.o00OooO0;
        if (paramContext == null) {
          break label185;
        }
      }
    }
    bool1 = false;
    label185:
    setWillNotDraw(bool1);
  }
  
  public final int OooO00o(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = localLayoutParams.topMargin;
    i += j;
    int k = localLayoutParams.bottomMargin;
    return i + k;
  }
  
  public final boolean OooO0O0(View paramView)
  {
    if (paramView != null)
    {
      int i = paramView.getVisibility();
      int j = 8;
      if (i != j)
      {
        k = paramView.getMeasuredHeight();
        if (k != 0)
        {
          k = 0;
          paramView = null;
          break label42;
        }
      }
    }
    int k = 1;
    label42:
    return k;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.o00Ooo0o;
    boolean bool;
    int[] arrayOfInt;
    if (localDrawable != null)
    {
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.o00Ooo0o;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = this.o00OooO0;
    if (localDrawable != null)
    {
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.o00OooO0;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = this.o00OooO;
    if (localDrawable != null)
    {
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.o00OooO;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public View getTabContainer()
  {
    return this.o00Ooo00;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = this.o00Ooo0o;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.o00OooO0;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.o00OooO;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    int i = R.id.action_bar;
    View localView = findViewById(i);
    this.o00Ooo0 = localView;
    i = R.id.action_context_bar;
    localView = findViewById(i);
    this.o00Ooo0O = localView;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.o00OoOoo;
    if (!bool1)
    {
      bool2 = super.onInterceptTouchEvent(paramMotionEvent);
      if (!bool2)
      {
        bool2 = false;
        paramMotionEvent = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = this.o00Ooo00;
    paramInt2 = 8;
    paramInt4 = 1;
    float f1 = 1.4E-45F;
    int i = 0;
    float f2 = 0.0F;
    View localView1 = null;
    if (localObject1 != null)
    {
      j = ((View)localObject1).getVisibility();
      if (j != paramInt2)
      {
        j = paramInt4;
        break label64;
      }
    }
    int j = 0;
    label64:
    int k;
    Object localObject2;
    if (localObject1 != null)
    {
      k = ((View)localObject1).getVisibility();
      if (k != paramInt2)
      {
        paramInt2 = getMeasuredHeight();
        localObject2 = (FrameLayout.LayoutParams)((View)localObject1).getLayoutParams();
        int m = ((View)localObject1).getMeasuredHeight();
        m = paramInt2 - m;
        k = ((FrameLayout.LayoutParams)localObject2).bottomMargin;
        m -= k;
        paramInt2 -= k;
        ((View)localObject1).layout(paramInt1, m, paramInt3, paramInt2);
      }
    }
    paramInt1 = this.o00OooOO;
    if (paramInt1 != 0)
    {
      localObject1 = this.o00OooO;
      if (localObject1 != null)
      {
        paramInt1 = getMeasuredWidth();
        paramInt2 = getMeasuredHeight();
        ((Drawable)localObject1).setBounds(0, 0, paramInt1, paramInt2);
        break label448;
      }
    }
    Object localObject3;
    label381:
    do
    {
      do
      {
        paramInt4 = i;
        f1 = f2;
        break;
        localObject3 = this.o00Ooo0o;
        if (localObject3 != null)
        {
          localObject3 = this.o00Ooo0;
          paramInt1 = ((View)localObject3).getVisibility();
          View localView2;
          View localView3;
          if (paramInt1 == 0)
          {
            localObject3 = this.o00Ooo0o;
            localView2 = this.o00Ooo0;
            paramInt2 = localView2.getLeft();
            localView3 = this.o00Ooo0;
            paramInt3 = localView3.getTop();
            localView1 = this.o00Ooo0;
            i = localView1.getRight();
          }
          for (localObject2 = this.o00Ooo0;; localObject2 = this.o00Ooo0O)
          {
            k = ((View)localObject2).getBottom();
            ((Drawable)localObject3).setBounds(paramInt2, paramInt3, i, k);
            break label381;
            localObject3 = this.o00Ooo0O;
            if (localObject3 == null) {
              break;
            }
            paramInt1 = ((View)localObject3).getVisibility();
            if (paramInt1 != 0) {
              break;
            }
            localObject3 = this.o00Ooo0o;
            localView2 = this.o00Ooo0O;
            paramInt2 = localView2.getLeft();
            localView3 = this.o00Ooo0O;
            paramInt3 = localView3.getTop();
            localView1 = this.o00Ooo0O;
            i = localView1.getRight();
          }
          localObject3 = this.o00Ooo0o;
          ((Drawable)localObject3).setBounds(0, 0, 0, 0);
          i = paramInt4;
          f2 = f1;
        }
        this.o00OooOo = j;
      } while (j == 0);
      localObject3 = this.o00OooO0;
    } while (localObject3 == null);
    paramInt2 = ((View)localObject1).getLeft();
    paramInt3 = ((View)localObject1).getTop();
    i = ((View)localObject1).getRight();
    paramBoolean = ((View)localObject1).getBottom();
    ((Drawable)localObject3).setBounds(paramInt2, paramInt3, i, paramBoolean);
    label448:
    if (paramInt4 != 0) {
      invalidate();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    View localView1 = this.o00Ooo0;
    int i = -1 << -1;
    int j;
    if (localView1 == null)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      if (j == i)
      {
        j = this.o0O00o0;
        if (j >= 0)
        {
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(j, paramInt2), i);
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    View localView2 = this.o00Ooo0;
    if (localView2 == null) {
      return;
    }
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    localView1 = this.o00Ooo00;
    if (localView1 != null)
    {
      j = localView1.getVisibility();
      int n = 8;
      if (j != n)
      {
        j = 1073741824;
        if (paramInt1 != j)
        {
          localView1 = this.o00Ooo0;
          boolean bool = OooO0O0(localView1);
          if (!bool) {}
          for (localView1 = this.o00Ooo0;; localView1 = this.o00Ooo0O)
          {
            int k = OooO00o(localView1);
            break label176;
            localView1 = this.o00Ooo0O;
            m = OooO0O0(localView1);
            if (m != 0) {
              break;
            }
          }
          int m = 0;
          localView1 = null;
          label176:
          if (paramInt1 == i) {
            paramInt1 = View.MeasureSpec.getSize(paramInt2);
          } else {
            paramInt1 = -1 >>> 1;
          }
          paramInt2 = getMeasuredWidth();
          View localView3 = this.o00Ooo00;
          i = OooO00o(localView3);
          m += i;
          paramInt1 = Math.min(m, paramInt1);
          setMeasuredDimension(paramInt2, paramInt1);
        }
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = this.o00Ooo0o;
    if (localDrawable != null)
    {
      i = 0;
      localView1 = null;
      localDrawable.setCallback(null);
      localDrawable = this.o00Ooo0o;
      unscheduleDrawable(localDrawable);
    }
    this.o00Ooo0o = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable = this.o00Ooo0;
      if (paramDrawable != null)
      {
        localDrawable = this.o00Ooo0o;
        int j = paramDrawable.getLeft();
        localView1 = this.o00Ooo0;
        i = localView1.getTop();
        View localView2 = this.o00Ooo0;
        int k = localView2.getRight();
        View localView3 = this.o00Ooo0;
        int m = localView3.getBottom();
        localDrawable.setBounds(j, i, k, m);
      }
    }
    boolean bool1 = this.o00OooOO;
    boolean bool2 = true;
    int i = 0;
    View localView1 = null;
    if (bool1)
    {
      paramDrawable = this.o00OooO;
      if (paramDrawable == null) {
        break label169;
      }
    }
    else
    {
      paramDrawable = this.o00Ooo0o;
      if (paramDrawable == null)
      {
        paramDrawable = this.o00OooO0;
        if (paramDrawable == null) {
          break label169;
        }
      }
    }
    bool2 = false;
    localDrawable = null;
    label169:
    setWillNotDraw(bool2);
    invalidate();
    ActionBarContainer.Api21Impl.OooO00o(this);
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = this.o00OooO;
    if (localDrawable != null)
    {
      i = 0;
      localDrawable.setCallback(null);
      localDrawable = this.o00OooO;
      unscheduleDrawable(localDrawable);
    }
    this.o00OooO = paramDrawable;
    boolean bool1 = false;
    localDrawable = null;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool2 = this.o00OooOO;
      if (bool2)
      {
        paramDrawable = this.o00OooO;
        if (paramDrawable != null)
        {
          i = getMeasuredWidth();
          int j = getMeasuredHeight();
          paramDrawable.setBounds(0, 0, i, j);
        }
      }
    }
    boolean bool2 = this.o00OooOO;
    int i = 1;
    if (bool2)
    {
      paramDrawable = this.o00OooO;
      if (paramDrawable != null) {}
    }
    else
    {
      do
      {
        bool1 = i;
        break;
        paramDrawable = this.o00Ooo0o;
        if (paramDrawable != null) {
          break;
        }
        paramDrawable = this.o00OooO0;
      } while (paramDrawable == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    ActionBarContainer.Api21Impl.OooO00o(this);
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    Object localObject = this.o00OooO0;
    if (localObject != null)
    {
      i = 0;
      localView1 = null;
      ((Drawable)localObject).setCallback(null);
      localObject = this.o00OooO0;
      unscheduleDrawable((Drawable)localObject);
    }
    this.o00OooO0 = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool = this.o00OooOo;
      if (bool)
      {
        paramDrawable = this.o00OooO0;
        if (paramDrawable != null)
        {
          localObject = this.o00Ooo00;
          j = ((View)localObject).getLeft();
          localView1 = this.o00Ooo00;
          i = localView1.getTop();
          View localView2 = this.o00Ooo00;
          int k = localView2.getRight();
          View localView3 = this.o00Ooo00;
          int m = localView3.getBottom();
          paramDrawable.setBounds(j, i, k, m);
        }
      }
    }
    boolean bool = this.o00OooOO;
    int j = 1;
    int i = 0;
    View localView1 = null;
    if (bool)
    {
      paramDrawable = this.o00OooO;
      if (paramDrawable == null) {
        break label180;
      }
    }
    else
    {
      paramDrawable = this.o00Ooo0o;
      if (paramDrawable == null)
      {
        paramDrawable = this.o00OooO0;
        if (paramDrawable == null) {
          break label180;
        }
      }
    }
    j = 0;
    localObject = null;
    label180:
    setWillNotDraw(j);
    invalidate();
    ActionBarContainer.Api21Impl.OooO00o(this);
  }
  
  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null) {
      removeView((View)localObject);
    }
    this.o00Ooo00 = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      localObject = paramScrollingTabContainerView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = -1;
      int i = -2;
      ((ViewGroup.LayoutParams)localObject).height = i;
      localObject = null;
      paramScrollingTabContainerView.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
    if (paramBoolean) {
      paramBoolean = 393216;
    } else {
      paramBoolean = 262144;
    }
    setDescendantFocusability(paramBoolean);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    Drawable localDrawable = this.o00Ooo0o;
    if (localDrawable != null) {
      localDrawable.setVisible(paramInt, false);
    }
    localDrawable = this.o00OooO0;
    if (localDrawable != null) {
      localDrawable.setVisible(paramInt, false);
    }
    localDrawable = this.o00OooO;
    if (localDrawable != null) {
      localDrawable.setVisible(paramInt, false);
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {
      return super.startActionModeForChild(paramView, paramCallback, paramInt);
    }
    return null;
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.o00Ooo0o;
    boolean bool1;
    if (paramDrawable == localDrawable)
    {
      bool1 = this.o00OooOO;
      if (!bool1) {}
    }
    else
    {
      localDrawable = this.o00OooO0;
      if (paramDrawable == localDrawable)
      {
        bool1 = this.o00OooOo;
        if (bool1) {}
      }
      else
      {
        localDrawable = this.o00OooO;
        if (paramDrawable == localDrawable)
        {
          bool1 = this.o00OooOO;
          if (bool1) {}
        }
        else
        {
          bool2 = super.verifyDrawable(paramDrawable);
          if (!bool2) {
            break label75;
          }
        }
      }
    }
    boolean bool2 = true;
    break label80;
    label75:
    bool2 = false;
    paramDrawable = null;
    label80:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionBarContainer
 * JD-Core Version:    0.7.0.1
 */