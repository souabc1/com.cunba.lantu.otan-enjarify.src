package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

public class CoordinatorLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int OooO;
  public CoordinatorLayout.Behavior OooO00o;
  public boolean OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public View OooOO0O;
  public View OooOO0o;
  public boolean OooOOO;
  public boolean OooOOO0;
  public boolean OooOOOO;
  public boolean OooOOOo;
  public Object OooOOo;
  public final Rect OooOOo0;
  
  public CoordinatorLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.OooO0O0 = false;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    paramInt2 = -1;
    this.OooO0o0 = paramInt2;
    this.OooO0o = paramInt2;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooOOo0 = localRect;
  }
  
  public CoordinatorLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    String str = null;
    this.OooO0O0 = false;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    int i = -1;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.OooOOo0 = ((Rect)localObject);
    localObject = R.styleable.CoordinatorLayout_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = R.styleable.CoordinatorLayout_Layout_android_layout_gravity;
    j = ((TypedArray)localObject).getInteger(j, 0);
    this.OooO0OO = j;
    j = R.styleable.CoordinatorLayout_Layout_layout_anchor;
    j = ((TypedArray)localObject).getResourceId(j, i);
    this.OooO0o = j;
    j = R.styleable.CoordinatorLayout_Layout_layout_anchorGravity;
    j = ((TypedArray)localObject).getInteger(j, 0);
    this.OooO0Oo = j;
    j = R.styleable.CoordinatorLayout_Layout_layout_keyline;
    i = ((TypedArray)localObject).getInteger(j, i);
    this.OooO0o0 = i;
    i = R.styleable.CoordinatorLayout_Layout_layout_insetEdge;
    i = ((TypedArray)localObject).getInt(i, 0);
    this.OooO0oO = i;
    i = R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges;
    int k = ((TypedArray)localObject).getInt(i, 0);
    this.OooO0oo = k;
    k = R.styleable.CoordinatorLayout_Layout_layout_behavior;
    boolean bool = ((TypedArray)localObject).hasValue(k);
    this.OooO0O0 = bool;
    if (bool)
    {
      int m = R.styleable.CoordinatorLayout_Layout_layout_behavior;
      str = ((TypedArray)localObject).getString(m);
      paramContext = CoordinatorLayout.parseBehavior(paramContext, paramAttributeSet, str);
      this.OooO00o = paramContext;
    }
    ((TypedArray)localObject).recycle();
    paramContext = this.OooO00o;
    if (paramContext != null) {
      paramContext.onAttachedToLayoutParams(this);
    }
  }
  
  public CoordinatorLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.OooO0O0 = false;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    int i = -1;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
    paramLayoutParams = new android/graphics/Rect;
    paramLayoutParams.<init>();
    this.OooOOo0 = paramLayoutParams;
  }
  
  public CoordinatorLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.OooO0O0 = false;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    int i = -1;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
    paramMarginLayoutParams = new android/graphics/Rect;
    paramMarginLayoutParams.<init>();
    this.OooOOo0 = paramMarginLayoutParams;
  }
  
  public CoordinatorLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.OooO0O0 = false;
    this.OooO0OO = 0;
    this.OooO0Oo = 0;
    int i = -1;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO0oO = 0;
    this.OooO0oo = 0;
    paramLayoutParams = new android/graphics/Rect;
    paramLayoutParams.<init>();
    this.OooOOo0 = paramLayoutParams;
  }
  
  public void OooO()
  {
    this.OooOOO0 = false;
  }
  
  public boolean OooO00o()
  {
    View localView = this.OooOO0O;
    if (localView == null)
    {
      i = this.OooO0o;
      int j = -1;
      if (i != j) {
        return 1;
      }
    }
    int i = 0;
    localView = null;
    return i;
  }
  
  public boolean OooO0O0(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    Object localObject = this.OooOO0o;
    if (paramView2 != localObject)
    {
      int i = ViewCompat.OooOoOO(paramCoordinatorLayout);
      boolean bool1 = OooOO0O(paramView2, i);
      if (!bool1)
      {
        localObject = this.OooO00o;
        if (localObject != null)
        {
          bool2 = ((CoordinatorLayout.Behavior)localObject).layoutDependsOn(paramCoordinatorLayout, paramView1, paramView2);
          if (bool2) {}
        }
        else
        {
          bool2 = false;
          paramCoordinatorLayout = null;
          break label72;
        }
      }
    }
    boolean bool2 = true;
    label72:
    return bool2;
  }
  
  public boolean OooO0OO()
  {
    CoordinatorLayout.Behavior localBehavior = this.OooO00o;
    if (localBehavior == null)
    {
      localBehavior = null;
      this.OooOOO0 = false;
    }
    return this.OooOOO0;
  }
  
  public View OooO0Oo(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    int i = this.OooO0o;
    int j = -1;
    if (i == j)
    {
      this.OooOO0o = null;
      this.OooOO0O = null;
      return null;
    }
    View localView = this.OooOO0O;
    if (localView != null)
    {
      boolean bool = OooOO0o(paramView, paramCoordinatorLayout);
      if (bool) {}
    }
    else
    {
      OooOO0(paramView, paramCoordinatorLayout);
    }
    return this.OooOO0O;
  }
  
  public boolean OooO0o(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    boolean bool1 = this.OooOOO0;
    if (bool1) {
      return true;
    }
    CoordinatorLayout.Behavior localBehavior = this.OooO00o;
    boolean bool2;
    if (localBehavior != null)
    {
      bool2 = localBehavior.blocksInteractionBelow(paramCoordinatorLayout, paramView);
    }
    else
    {
      bool2 = false;
      paramCoordinatorLayout = null;
    }
    bool2 |= bool1;
    this.OooOOO0 = bool2;
    return bool2;
  }
  
  public void OooO0o0()
  {
    this.OooOO0o = null;
    this.OooOO0O = null;
  }
  
  public void OooO0oO()
  {
    this.OooOOOo = false;
  }
  
  public void OooO0oo(int paramInt)
  {
    setNestedScrollAccepted(paramInt, false);
  }
  
  public final void OooOO0(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    int i = this.OooO0o;
    Object localObject = paramCoordinatorLayout.findViewById(i);
    this.OooOO0O = ((View)localObject);
    StringBuilder localStringBuilder = null;
    boolean bool2;
    if (localObject != null) {
      if (localObject == paramCoordinatorLayout)
      {
        bool2 = paramCoordinatorLayout.isInEditMode();
        if (!bool2) {}
      }
    }
    label154:
    boolean bool1;
    do
    {
      this.OooOO0o = null;
      this.OooOO0O = null;
      return;
      paramView = new java/lang/IllegalStateException;
      paramView.<init>("View can not be anchored to the the parent CoordinatorLayout");
      throw paramView;
      for (ViewParent localViewParent = ((View)localObject).getParent();; localViewParent = ((ViewParent)localViewParent).getParent())
      {
        if ((localViewParent == paramCoordinatorLayout) || (localViewParent == null)) {
          break label154;
        }
        if (localViewParent == paramView)
        {
          bool2 = paramCoordinatorLayout.isInEditMode();
          if (bool2) {
            break;
          }
          paramView = new java/lang/IllegalStateException;
          paramView.<init>("Anchor must not be a descendant of the anchored view");
          throw paramView;
        }
        boolean bool3 = localViewParent instanceof View;
        if (bool3)
        {
          localObject = localViewParent;
          localObject = (View)localViewParent;
        }
      }
      this.OooOO0o = ((View)localObject);
      return;
      bool1 = paramCoordinatorLayout.isInEditMode();
    } while (bool1);
    localObject = new java/lang/IllegalStateException;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
    paramCoordinatorLayout = paramCoordinatorLayout.getResources();
    int j = this.OooO0o;
    paramCoordinatorLayout = paramCoordinatorLayout.getResourceName(j);
    localStringBuilder.append(paramCoordinatorLayout);
    localStringBuilder.append(" to anchor view ");
    localStringBuilder.append(paramView);
    paramView = localStringBuilder.toString();
    ((IllegalStateException)localObject).<init>(paramView);
    throw ((Throwable)localObject);
  }
  
  public final boolean OooOO0O(View paramView, int paramInt)
  {
    paramView = (LayoutParams)paramView.getLayoutParams();
    int i = GravityCompat.OooO0O0(paramView.OooO0oO, paramInt);
    if (i != 0)
    {
      int j = this.OooO0oo;
      paramInt = GravityCompat.OooO0O0(j, paramInt) & i;
      if (paramInt == i) {
        return 1;
      }
    }
    i = 0;
    paramView = null;
    return i;
  }
  
  public final boolean OooOO0o(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    Object localObject = this.OooOO0O;
    int i = ((View)localObject).getId();
    int j = this.OooO0o;
    if (i != j) {
      return false;
    }
    localObject = this.OooOO0O;
    ViewParent localViewParent = ((View)localObject).getParent();
    while (localViewParent != paramCoordinatorLayout) {
      if ((localViewParent != null) && (localViewParent != paramView))
      {
        boolean bool = localViewParent instanceof View;
        if (bool)
        {
          localObject = localViewParent;
          localObject = (View)localViewParent;
        }
        localViewParent = ((ViewParent)localViewParent).getParent();
      }
      else
      {
        this.OooOO0o = null;
        this.OooOO0O = null;
        return false;
      }
    }
    this.OooOO0o = ((View)localObject);
    return true;
  }
  
  public int getAnchorId()
  {
    return this.OooO0o;
  }
  
  public CoordinatorLayout.Behavior getBehavior()
  {
    return this.OooO00o;
  }
  
  public boolean getChangedAfterNestedScroll()
  {
    return this.OooOOOo;
  }
  
  public Rect getLastChildRect()
  {
    return this.OooOOo0;
  }
  
  public boolean isNestedScrollAccepted(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i) {
        return false;
      }
      return this.OooOOOO;
    }
    return this.OooOOO;
  }
  
  public void setAnchorId(int paramInt)
  {
    OooO0o0();
    this.OooO0o = paramInt;
  }
  
  public void setBehavior(CoordinatorLayout.Behavior paramBehavior)
  {
    CoordinatorLayout.Behavior localBehavior = this.OooO00o;
    if (localBehavior != paramBehavior)
    {
      if (localBehavior != null) {
        localBehavior.onDetachedFromLayoutParams();
      }
      this.OooO00o = paramBehavior;
      localBehavior = null;
      this.OooOOo = null;
      boolean bool = true;
      this.OooO0O0 = bool;
      if (paramBehavior != null) {
        paramBehavior.onAttachedToLayoutParams(this);
      }
    }
  }
  
  public void setChangedAfterNestedScroll(boolean paramBoolean)
  {
    this.OooOOOo = paramBoolean;
  }
  
  public void setLastChildRect(Rect paramRect)
  {
    this.OooOOo0.set(paramRect);
  }
  
  public void setNestedScrollAccepted(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt == i) {
        this.OooOOOO = paramBoolean;
      }
    }
    else
    {
      this.OooOOO = paramBoolean;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */