package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BuildCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.AutoScrollHelper;
import androidx.core.widget.ListViewAutoScrollHelper;

class DropDownListView
  extends ListView
{
  public final Rect o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public DropDownListView.GateKeeperDrawable o00OooO;
  public int o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public ViewPropertyAnimatorCompat o00OoooO;
  public ListViewAutoScrollHelper o00Ooooo;
  public DropDownListView.ResolveHoverRunnable o00o0000;
  public boolean o0O00o0;
  
  public DropDownListView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, i);
    paramContext = new android/graphics/Rect;
    paramContext.<init>();
    this.o00OoOoo = paramContext;
    this.o00Ooo00 = 0;
    this.o00Ooo0 = 0;
    this.o00Ooo0O = 0;
    this.o00Ooo0o = 0;
    this.o00OooOo = paramBoolean;
    setCacheColorHint(0);
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    DropDownListView.GateKeeperDrawable localGateKeeperDrawable = this.o00OooO;
    if (localGateKeeperDrawable != null) {
      localGateKeeperDrawable.setEnabled(paramBoolean);
    }
  }
  
  public final void OooO(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    this.o0O00o0 = bool1;
    DropDownListView.Api21Impl.OooO00o(this, paramFloat1, paramFloat2);
    boolean bool2 = isPressed();
    if (!bool2) {
      setPressed(bool1);
    }
    layoutChildren();
    int i = this.o00OooO0;
    int j = -1;
    float f1 = 0.0F / 0.0F;
    if (i != j)
    {
      j = getFirstVisiblePosition();
      i -= j;
      View localView = getChildAt(i);
      if ((localView != null) && (localView != paramView))
      {
        boolean bool4 = localView.isPressed();
        if (bool4) {
          localView.setPressed(false);
        }
      }
    }
    this.o00OooO0 = paramInt;
    float f2 = paramView.getLeft();
    f2 = paramFloat1 - f2;
    int k = paramView.getTop();
    f1 = k;
    f1 = paramFloat2 - f1;
    DropDownListView.Api21Impl.OooO00o(paramView, f2, f1);
    boolean bool3 = paramView.isPressed();
    if (!bool3) {
      paramView.setPressed(bool1);
    }
    OooO0oo(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  public final void OooO00o()
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = null;
    this.o0O00o0 = false;
    setPressed(false);
    drawableStateChanged();
    int i = this.o00OooO0;
    int j = getFirstVisiblePosition();
    i -= j;
    View localView = getChildAt(i);
    if (localView != null) {
      localView.setPressed(false);
    }
    localViewPropertyAnimatorCompat = this.o00OoooO;
    if (localViewPropertyAnimatorCompat != null)
    {
      localViewPropertyAnimatorCompat.OooO0OO();
      localViewPropertyAnimatorCompat = null;
      this.o00OoooO = null;
    }
  }
  
  public final void OooO0O0(View paramView, int paramInt)
  {
    long l = getItemIdAtPosition(paramInt);
    performItemClick(paramView, paramInt, l);
  }
  
  public final void OooO0OO(Canvas paramCanvas)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((Rect)localObject).isEmpty();
    if (!bool)
    {
      localObject = getSelector();
      if (localObject != null)
      {
        Rect localRect = this.o00OoOoo;
        ((Drawable)localObject).setBounds(localRect);
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
  }
  
  public int OooO0Oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt2 = getListPaddingTop();
    paramInt3 = getListPaddingBottom();
    int i = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    paramInt2 += paramInt3;
    if (localListAdapter == null) {
      return paramInt2;
    }
    paramInt3 = 0;
    if ((i <= 0) || (localDrawable == null)) {
      i = 0;
    }
    int j = localListAdapter.getCount();
    int k = 0;
    int m = 0;
    int n = 0;
    View localView = null;
    while (k < j)
    {
      int i1 = localListAdapter.getItemViewType(k);
      if (i1 != m)
      {
        localView = null;
        m = i1;
      }
      localView = localListAdapter.getView(k, localView, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (localLayoutParams == null)
      {
        localLayoutParams = generateDefaultLayoutParams();
        localView.setLayoutParams(localLayoutParams);
      }
      i1 = localLayoutParams.height;
      if (i1 > 0)
      {
        int i2 = 1073741824;
        i1 = View.MeasureSpec.makeMeasureSpec(i1, i2);
      }
      else
      {
        i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      }
      localView.measure(paramInt1, i1);
      localView.forceLayout();
      if (k > 0) {
        paramInt2 += i;
      }
      i1 = localView.getMeasuredHeight();
      paramInt2 += i1;
      if (paramInt2 >= paramInt4)
      {
        if ((paramInt5 >= 0) && (k > paramInt5) && (n > 0) && (paramInt2 != paramInt4)) {
          paramInt4 = n;
        }
        return paramInt4;
      }
      if ((paramInt5 >= 0) && (k >= paramInt5)) {
        n = paramInt2;
      }
      k += 1;
    }
    return paramInt2;
  }
  
  public final void OooO0o(int paramInt, View paramView)
  {
    Rect localRect = this.o00OoOoo;
    int i = paramView.getLeft();
    int j = paramView.getTop();
    int k = paramView.getRight();
    int m = paramView.getBottom();
    localRect.set(i, j, k, m);
    i = localRect.left;
    j = this.o00Ooo00;
    i -= j;
    localRect.left = i;
    i = localRect.top;
    j = this.o00Ooo0;
    i -= j;
    localRect.top = i;
    i = localRect.right;
    j = this.o00Ooo0O;
    i += j;
    localRect.right = i;
    i = localRect.bottom;
    j = this.o00Ooo0o;
    i += j;
    localRect.bottom = i;
    boolean bool1 = OooOO0();
    boolean bool2 = paramView.isEnabled();
    if (bool2 != bool1)
    {
      bool2 = bool1 ^ true;
      OooOO0O(bool2);
      int n = -1;
      if (paramInt != n) {
        refreshDrawableState();
      }
    }
  }
  
  public boolean OooO0o0(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = 1;
    float f1 = 1.4E-45F;
    int k;
    float f2;
    if (i != j)
    {
      k = 2;
      if (i != k)
      {
        paramInt = 3;
        f2 = 4.203895E-045F;
        if (i == paramInt) {}
      }
    }
    ListViewAutoScrollHelper localListViewAutoScrollHelper;
    for (;;)
    {
      k = j;
      paramInt = 0;
      localListViewAutoScrollHelper = null;
      f2 = 0.0F;
      break;
      label83:
      do
      {
        paramInt = 0;
        localListViewAutoScrollHelper = null;
        f2 = 0.0F;
        k = 0;
        localView = null;
        break;
        k = j;
        break label83;
        k = 0;
        localView = null;
        paramInt = paramMotionEvent.findPointerIndex(paramInt);
      } while (paramInt < 0);
      float f3 = paramMotionEvent.getX(paramInt);
      int m = (int)f3;
      f2 = paramMotionEvent.getY(paramInt);
      paramInt = (int)f2;
      int n = pointToPosition(m, paramInt);
      int i1 = -1;
      if (n == i1)
      {
        paramInt = j;
        f2 = f1;
        break;
      }
      k = getFirstVisiblePosition();
      k = n - k;
      View localView = getChildAt(k);
      f3 = m;
      f2 = paramInt;
      OooO(localView, n, f3, f2);
      if (i == j) {
        OooO0O0(localView, n);
      }
    }
    if ((k == 0) || (paramInt != 0)) {
      OooO00o();
    }
    if (k != 0)
    {
      localListViewAutoScrollHelper = this.o00Ooooo;
      if (localListViewAutoScrollHelper == null)
      {
        localListViewAutoScrollHelper = new androidx/core/widget/ListViewAutoScrollHelper;
        localListViewAutoScrollHelper.<init>(this);
        this.o00Ooooo = localListViewAutoScrollHelper;
      }
      this.o00Ooooo.OooOOO0(j);
      localListViewAutoScrollHelper = this.o00Ooooo;
      localListViewAutoScrollHelper.onTouch(this, paramMotionEvent);
    }
    else
    {
      paramMotionEvent = this.o00Ooooo;
      if (paramMotionEvent != null) {
        paramMotionEvent.OooOOO0(false);
      }
    }
    return k;
  }
  
  public final void OooO0oO(int paramInt, View paramView)
  {
    Drawable localDrawable = getSelector();
    int i = 1;
    if (localDrawable != null)
    {
      j = -1;
      if (paramInt != j)
      {
        j = i;
        break label31;
      }
    }
    int j = 0;
    label31:
    if (j != 0) {
      localDrawable.setVisible(false, false);
    }
    OooO0o(paramInt, paramView);
    if (j != 0)
    {
      Rect localRect = this.o00OoOoo;
      float f1 = localRect.exactCenterX();
      float f2 = localRect.exactCenterY();
      j = getVisibility();
      if (j != 0) {
        i = 0;
      }
      localDrawable.setVisible(i, false);
      DrawableCompat.OooOO0O(localDrawable, f1, f2);
    }
  }
  
  public final void OooO0oo(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    OooO0oO(paramInt, paramView);
    paramView = getSelector();
    if (paramView != null)
    {
      int i = -1;
      if (paramInt != i) {
        DrawableCompat.OooOO0O(paramView, paramFloat1, paramFloat2);
      }
    }
  }
  
  public final boolean OooOO0()
  {
    boolean bool = BuildCompat.isAtLeastT();
    if (bool) {
      return DropDownListView.Api33Impl.OooO00o(this);
    }
    return DropDownListView.PreApi33Impl.OooO00o(this);
  }
  
  public final void OooOO0O(boolean paramBoolean)
  {
    boolean bool = BuildCompat.isAtLeastT();
    if (bool) {
      DropDownListView.Api33Impl.OooO0O0(this, paramBoolean);
    } else {
      DropDownListView.PreApi33Impl.OooO0O0(this, paramBoolean);
    }
  }
  
  public final boolean OooOO0o()
  {
    return this.o0O00o0;
  }
  
  public final void OooOOO0()
  {
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
    {
      boolean bool = OooOO0o();
      if (bool)
      {
        bool = isPressed();
        if (bool)
        {
          int[] arrayOfInt = getDrawableState();
          localDrawable.setState(arrayOfInt);
        }
      }
    }
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    OooO0OO(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  public void drawableStateChanged()
  {
    DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.o00o0000;
    if (localResolveHoverRunnable != null) {
      return;
    }
    super.drawableStateChanged();
    setSelectorEnabled(true);
    OooOOO0();
  }
  
  public boolean hasFocus()
  {
    boolean bool = this.o00OooOo;
    if (!bool)
    {
      bool = super.hasFocus();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool = this.o00OooOo;
    if (!bool)
    {
      bool = super.hasWindowFocus();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isFocused()
  {
    boolean bool = this.o00OooOo;
    if (!bool)
    {
      bool = super.isFocused();
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isInTouchMode()
  {
    boolean bool = this.o00OooOo;
    if (bool)
    {
      bool = this.o00OooOO;
      if (bool) {}
    }
    else
    {
      bool = super.isInTouchMode();
      if (!bool) {
        break label32;
      }
    }
    return true;
    label32:
    bool = false;
    return bool;
  }
  
  public void onDetachedFromWindow()
  {
    this.o00o0000 = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int k = paramMotionEvent.getActionMasked();
    int m = 10;
    if (k == m)
    {
      DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.o00o0000;
      if (localResolveHoverRunnable == null)
      {
        localResolveHoverRunnable = new androidx/appcompat/widget/DropDownListView$ResolveHoverRunnable;
        localResolveHoverRunnable.<init>(this);
        this.o00o0000 = localResolveHoverRunnable;
        localResolveHoverRunnable.OooO0O0();
      }
    }
    boolean bool2 = super.onHoverEvent(paramMotionEvent);
    int n = 9;
    int i2 = -1;
    if (k != n)
    {
      n = 7;
      if (k != n)
      {
        setSelection(i2);
        break label231;
      }
    }
    float f1 = paramMotionEvent.getX();
    k = (int)f1;
    float f2 = paramMotionEvent.getY();
    int i3 = (int)f2;
    i3 = pointToPosition(k, i3);
    if (i3 != i2)
    {
      k = getSelectedItemPosition();
      if (i3 != k)
      {
        k = getFirstVisiblePosition();
        k = i3 - k;
        View localView = getChildAt(k);
        boolean bool3 = localView.isEnabled();
        if (bool3)
        {
          requestFocus();
          int i1 = 30;
          if (i >= i1)
          {
            boolean bool1 = DropDownListView.Api30Impl.OooO00o();
            if (bool1)
            {
              DropDownListView.Api30Impl.OooO0O0(this, i3, localView);
              break label227;
            }
          }
          int j = localView.getTop();
          k = getTop();
          j -= k;
          setSelectionFromTop(i3, j);
        }
        label227:
        OooOOO0();
      }
    }
    label231:
    return bool2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (i == 0)
    {
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      i = pointToPosition(i, j);
      this.o00OooO0 = i;
    }
    DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.o00o0000;
    if (localResolveHoverRunnable != null) {
      localResolveHoverRunnable.OooO00o();
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean)
  {
    this.o00OooOO = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      localObject = new androidx/appcompat/widget/DropDownListView$GateKeeperDrawable;
      ((DropDownListView.GateKeeperDrawable)localObject).<init>(paramDrawable);
    }
    else
    {
      localObject = null;
    }
    this.o00OooO = ((DropDownListView.GateKeeperDrawable)localObject);
    super.setSelector((Drawable)localObject);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    if (paramDrawable != null) {
      paramDrawable.getPadding((Rect)localObject);
    }
    int i = ((Rect)localObject).left;
    this.o00Ooo00 = i;
    i = ((Rect)localObject).top;
    this.o00Ooo0 = i;
    i = ((Rect)localObject).right;
    this.o00Ooo0O = i;
    i = ((Rect)localObject).bottom;
    this.o00Ooo0o = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DropDownListView
 * JD-Core Version:    0.7.0.1
 */