package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R.styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentContainerView
  extends FrameLayout
{
  public final List o00OoOoo;
  public View.OnApplyWindowInsetsListener o00Ooo0;
  public final List o00Ooo00;
  public boolean o00Ooo0O;
  
  public FragmentContainerView(Context paramContext)
  {
    super(paramContext);
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.o00OoOoo = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.o00Ooo00 = paramContext;
    this.o00Ooo0O = true;
  }
  
  public FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.o00OoOoo = ((List)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.o00Ooo00 = ((List)localObject2);
    paramInt = 1;
    this.o00Ooo0O = paramInt;
    if (paramAttributeSet != null)
    {
      localObject2 = paramAttributeSet.getClassAttribute();
      localObject1 = R.styleable.FragmentContainerView;
      Intrinsics.OooO0o0(localObject1, "FragmentContainerView");
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 0, 0);
      if (localObject2 == null)
      {
        int i = R.styleable.FragmentContainerView_android_name;
        localObject2 = paramContext.getString(i);
        paramAttributeSet = "android:name";
      }
      else
      {
        paramAttributeSet = "class";
      }
      paramContext.recycle();
      if (localObject2 != null)
      {
        boolean bool = isInEditMode();
        if (!bool)
        {
          paramContext = new java/lang/UnsupportedOperationException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("FragmentContainerView must be within a FragmentActivity to use ");
          ((StringBuilder)localObject1).append(paramAttributeSet);
          ((StringBuilder)localObject1).append("=\"");
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append('"');
          paramAttributeSet = ((StringBuilder)localObject1).toString();
          paramContext.<init>(paramAttributeSet);
          throw paramContext;
        }
      }
    }
  }
  
  public FragmentContainerView(Context paramContext, AttributeSet paramAttributeSet, FragmentManager paramFragmentManager)
  {
    super(paramContext, paramAttributeSet);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OoOoo = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00Ooo00 = localArrayList;
    boolean bool = true;
    this.o00Ooo0O = bool;
    Object localObject1 = paramAttributeSet.getClassAttribute();
    Object localObject2 = R.styleable.FragmentContainerView;
    Intrinsics.OooO0o0(localObject2, "FragmentContainerView");
    int i = 0;
    String str = null;
    localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, 0, 0);
    if (localObject1 == null)
    {
      int j = R.styleable.FragmentContainerView_android_name;
      localObject1 = ((TypedArray)localObject2).getString(j);
    }
    i = R.styleable.FragmentContainerView_android_tag;
    str = ((TypedArray)localObject2).getString(i);
    ((TypedArray)localObject2).recycle();
    int k = getId();
    Object localObject3 = paramFragmentManager.ooOO(k);
    if ((localObject1 != null) && (localObject3 == null))
    {
      int m = -1;
      if (k == m)
      {
        if (str != null)
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramAttributeSet = " with tag ";
          paramContext.append(paramAttributeSet);
          paramContext.append(str);
          paramContext = paramContext.toString();
        }
        else
        {
          paramContext = "";
        }
        paramAttributeSet = new java/lang/IllegalStateException;
        paramFragmentManager = new java/lang/StringBuilder;
        paramFragmentManager.<init>();
        paramFragmentManager.append("FragmentContainerView must have an android:id to add Fragment ");
        paramFragmentManager.append((String)localObject1);
        paramFragmentManager.append(paramContext);
        paramContext = paramFragmentManager.toString();
        paramAttributeSet.<init>(paramContext);
        throw paramAttributeSet;
      }
      localObject2 = paramFragmentManager.getFragmentFactory();
      localObject3 = paramContext.getClassLoader();
      localObject1 = ((FragmentFactory)localObject2).OooO00o((ClassLoader)localObject3, (String)localObject1);
      Intrinsics.OooO0o0(localObject1, "fm.fragmentFactory.insta…ontext.classLoader, name)");
      k = 0;
      localObject2 = null;
      ((Fragment)localObject1).onInflate(paramContext, paramAttributeSet, null);
      paramContext = paramFragmentManager.OooOOo0().OooOo(bool).OooO0Oo(this, (Fragment)localObject1, str);
      paramContext.OooOOO0();
    }
    paramFragmentManager.o0000(this);
  }
  
  public final void OooO00o(View paramView)
  {
    List localList = this.o00Ooo00;
    boolean bool = localList.contains(paramView);
    if (bool)
    {
      localList = this.o00OoOoo;
      localList.add(paramView);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Intrinsics.OooO0o(paramView, "child");
    Fragment localFragment = FragmentManager.o0ooOoO(paramView);
    if (localFragment != null)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" is not associated with a Fragment.");
    paramView = ((StringBuilder)localObject).toString();
    localObject = new java/lang/IllegalStateException;
    paramView = paramView.toString();
    ((IllegalStateException)localObject).<init>(paramView);
    throw ((Throwable)localObject);
  }
  
  public WindowInsets dispatchApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    Intrinsics.OooO0o(paramWindowInsets, "insets");
    Object localObject1 = WindowInsetsCompat.OooOO0(paramWindowInsets);
    Intrinsics.OooO0o0(localObject1, "toWindowInsetsCompat(insets)");
    Object localObject2 = this.o00Ooo0;
    if (localObject2 != null)
    {
      localObject1 = FragmentContainerView.Api20Impl.OooO00o;
      Intrinsics.OooO0OO(localObject2);
      localObject1 = WindowInsetsCompat.OooOO0(((FragmentContainerView.Api20Impl)localObject1).OooO00o((View.OnApplyWindowInsetsListener)localObject2, this, paramWindowInsets));
    }
    else
    {
      localObject1 = ViewCompat.OooooOO(this, (WindowInsetsCompat)localObject1);
    }
    localObject2 = "if (applyWindowInsetsLis…, insetsCompat)\n        }";
    Intrinsics.OooO0o0(localObject1, (String)localObject2);
    boolean bool = ((WindowInsetsCompat)localObject1).isConsumed();
    if (!bool)
    {
      int i = getChildCount();
      int j = 0;
      while (j < i)
      {
        View localView = getChildAt(j);
        ViewCompat.OooO0oO(localView, (WindowInsetsCompat)localObject1);
        j += 1;
      }
    }
    return paramWindowInsets;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject = "canvas";
    Intrinsics.OooO0o(paramCanvas, (String)localObject);
    boolean bool1 = this.o00Ooo0O;
    if (bool1)
    {
      localObject = this.o00OoOoo.iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        View localView = (View)((Iterator)localObject).next();
        long l = getDrawingTime();
        super.drawChild(paramCanvas, localView, l);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Intrinsics.OooO0o(paramCanvas, "canvas");
    Object localObject = "child";
    Intrinsics.OooO0o(paramView, (String)localObject);
    boolean bool = this.o00Ooo0O;
    if (bool)
    {
      localObject = this.o00OoOoo;
      bool = ((Collection)localObject).isEmpty() ^ true;
      if (bool)
      {
        localObject = this.o00OoOoo;
        bool = ((List)localObject).contains(paramView);
        if (bool) {
          return false;
        }
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void endViewTransition(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    this.o00Ooo00.remove(paramView);
    List localList = this.o00OoOoo;
    boolean bool = localList.remove(paramView);
    if (bool)
    {
      bool = true;
      this.o00Ooo0O = bool;
    }
    super.endViewTransition(paramView);
  }
  
  public final Fragment getFragment()
  {
    FragmentManager localFragmentManager = FragmentManager.o00Ooo(this);
    int i = getId();
    return localFragmentManager.ooOO(i);
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    Intrinsics.OooO0o(paramWindowInsets, "insets");
    return paramWindowInsets;
  }
  
  public void removeAllViewsInLayout()
  {
    int i = getChildCount() + -1;
    for (;;)
    {
      int j = -1;
      if (j >= i) {
        break;
      }
      View localView = getChildAt(i);
      String str = "view";
      Intrinsics.OooO0o0(localView, str);
      OooO00o(localView);
      i += -1;
    }
    super.removeAllViewsInLayout();
  }
  
  public void removeView(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    OooO00o(paramView);
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    View localView = getChildAt(paramInt);
    Intrinsics.OooO0o0(localView, "view");
    OooO00o(localView);
    super.removeViewAt(paramInt);
  }
  
  public void removeViewInLayout(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    OooO00o(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public void removeViews(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    int j = paramInt1;
    while (j < i)
    {
      View localView = getChildAt(j);
      String str = "view";
      Intrinsics.OooO0o0(localView, str);
      OooO00o(localView);
      j += 1;
    }
    super.removeViews(paramInt1, paramInt2);
  }
  
  public void removeViewsInLayout(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    int j = paramInt1;
    while (j < i)
    {
      View localView = getChildAt(j);
      String str = "view";
      Intrinsics.OooO0o0(localView, str);
      OooO00o(localView);
      j += 1;
    }
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public final void setDrawDisappearingViewsLast(boolean paramBoolean)
  {
    this.o00Ooo0O = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    paramLayoutTransition = new java/lang/UnsupportedOperationException;
    paramLayoutTransition.<init>("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    throw paramLayoutTransition;
  }
  
  public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    Intrinsics.OooO0o(paramOnApplyWindowInsetsListener, "listener");
    this.o00Ooo0 = paramOnApplyWindowInsetsListener;
  }
  
  public void startViewTransition(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    Object localObject = paramView.getParent();
    if (localObject == this)
    {
      localObject = this.o00Ooo00;
      ((List)localObject).add(paramView);
    }
    super.startViewTransition(paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentContainerView
 * JD-Core Version:    0.7.0.1
 */