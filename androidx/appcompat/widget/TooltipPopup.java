package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;

class TooltipPopup
{
  public final Context OooO00o;
  public final View OooO0O0;
  public final TextView OooO0OO;
  public final WindowManager.LayoutParams OooO0Oo;
  public final int[] OooO0o;
  public final Rect OooO0o0;
  public final int[] OooO0oO;
  
  public TooltipPopup(Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = new android/view/WindowManager$LayoutParams;
    localLayoutParams.<init>();
    this.OooO0Oo = localLayoutParams;
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.OooO0o0 = ((Rect)localObject);
    int i = 2;
    int[] arrayOfInt = new int[i];
    this.OooO0o = arrayOfInt;
    localObject = new int[i];
    this.OooO0oO = ((int[])localObject);
    this.OooO00o = paramContext;
    localObject = LayoutInflater.from(paramContext);
    int j = R.layout.abc_tooltip;
    localObject = ((LayoutInflater)localObject).inflate(j, null);
    this.OooO0O0 = ((View)localObject);
    j = R.id.message;
    localObject = (TextView)((View)localObject).findViewById(j);
    this.OooO0OO = ((TextView)localObject);
    localObject = getClass().getSimpleName();
    localLayoutParams.setTitle((CharSequence)localObject);
    paramContext = paramContext.getPackageName();
    localLayoutParams.packageName = paramContext;
    localLayoutParams.type = 1002;
    int k = -2;
    localLayoutParams.width = k;
    localLayoutParams.height = k;
    localLayoutParams.format = -3;
    k = R.style.Animation_AppCompat_Tooltip;
    localLayoutParams.windowAnimations = k;
    localLayoutParams.flags = 24;
  }
  
  public static View OooO0O0(View paramView)
  {
    View localView = paramView.getRootView();
    Object localObject = localView.getLayoutParams();
    boolean bool1 = localObject instanceof WindowManager.LayoutParams;
    if (bool1)
    {
      localObject = (WindowManager.LayoutParams)localObject;
      int j = ((WindowManager.LayoutParams)localObject).type;
      int i = 2;
      if (j == i) {
        return localView;
      }
    }
    for (paramView = paramView.getContext();; paramView = ((ContextWrapper)paramView).getBaseContext())
    {
      boolean bool2 = paramView instanceof ContextWrapper;
      if (!bool2) {
        break;
      }
      bool2 = paramView instanceof Activity;
      if (bool2) {
        return ((Activity)paramView).getWindow().getDecorView();
      }
    }
    return localView;
  }
  
  public final void OooO00o(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams)
  {
    Object localObject1 = paramView.getApplicationWindowToken();
    paramLayoutParams.token = ((IBinder)localObject1);
    localObject1 = this.OooO00o.getResources();
    int i = R.dimen.tooltip_precise_anchor_threshold;
    int j = ((Resources)localObject1).getDimensionPixelOffset(i);
    i = paramView.getWidth();
    if (i < j) {
      paramInt1 = paramView.getWidth() / 2;
    }
    i = paramView.getHeight();
    if (i >= j)
    {
      localObject1 = this.OooO00o.getResources();
      i = R.dimen.tooltip_precise_anchor_extra_offset;
      j = ((Resources)localObject1).getDimensionPixelOffset(i);
      i = paramInt2 + j;
      paramInt2 -= j;
    }
    else
    {
      i = paramView.getHeight();
      paramInt2 = 0;
    }
    j = 49;
    paramLayoutParams.gravity = j;
    localObject1 = this.OooO00o.getResources();
    int k;
    if (paramBoolean) {
      k = R.dimen.tooltip_y_offset_touch;
    } else {
      k = R.dimen.tooltip_y_offset_non_touch;
    }
    j = ((Resources)localObject1).getDimensionPixelOffset(k);
    View localView = OooO0O0(paramView);
    if (localView == null) {
      return;
    }
    Object localObject2 = this.OooO0o0;
    localView.getWindowVisibleDisplayFrame((Rect)localObject2);
    localObject2 = this.OooO0o0;
    int m = ((Rect)localObject2).left;
    if (m < 0)
    {
      n = ((Rect)localObject2).top;
      if (n < 0)
      {
        localObject2 = this.OooO00o.getResources();
        localObject3 = "dimen";
        Object localObject4 = "android";
        String str = "status_bar_height";
        m = ((Resources)localObject2).getIdentifier(str, (String)localObject3, (String)localObject4);
        if (m != 0)
        {
          m = ((Resources)localObject2).getDimensionPixelSize(m);
        }
        else
        {
          m = 0;
          localObject3 = null;
        }
        localObject2 = ((Resources)localObject2).getDisplayMetrics();
        localObject4 = this.OooO0o0;
        i1 = ((DisplayMetrics)localObject2).widthPixels;
        n = ((DisplayMetrics)localObject2).heightPixels;
        ((Rect)localObject4).set(0, m, i1, n);
      }
    }
    localObject2 = this.OooO0oO;
    localView.getLocationOnScreen((int[])localObject2);
    localObject2 = this.OooO0o;
    paramView.getLocationOnScreen((int[])localObject2);
    paramView = this.OooO0o;
    int n = paramView[0];
    Object localObject3 = this.OooO0oO;
    int i2 = localObject3[0];
    n -= i2;
    paramView[0] = n;
    i2 = 1;
    int i1 = paramView[i2];
    m = localObject3[i2];
    i1 -= m;
    paramView[i2] = i1;
    n += paramInt1;
    int i3 = localView.getWidth() / 2;
    n -= i3;
    paramLayoutParams.x = n;
    i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.OooO0O0.measure(i3, i3);
    paramView = this.OooO0O0;
    i3 = paramView.getMeasuredHeight();
    int[] arrayOfInt = this.OooO0o;
    paramInt1 = arrayOfInt[i2];
    paramInt2 = paramInt2 + paramInt1 - j - i3;
    paramInt1 = paramInt1 + i + j;
    if (paramBoolean)
    {
      if (paramInt2 >= 0) {
        break label538;
      }
    }
    else
    {
      i3 += paramInt1;
      Rect localRect = this.OooO0o0;
      paramBoolean = localRect.height();
      if (i3 > paramBoolean) {
        break label538;
      }
    }
    paramLayoutParams.y = paramInt1;
    return;
    label538:
    paramLayoutParams.y = paramInt2;
  }
  
  public void OooO0OO()
  {
    boolean bool = isShowing();
    if (!bool) {
      return;
    }
    WindowManager localWindowManager = (WindowManager)this.OooO00o.getSystemService("window");
    View localView = this.OooO0O0;
    localWindowManager.removeView(localView);
  }
  
  public void OooO0Oo(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence)
  {
    boolean bool = isShowing();
    if (bool) {
      OooO0OO();
    }
    this.OooO0OO.setText(paramCharSequence);
    WindowManager.LayoutParams localLayoutParams1 = this.OooO0Oo;
    OooO00o(paramView, paramInt1, paramInt2, paramBoolean, localLayoutParams1);
    paramView = (WindowManager)this.OooO00o.getSystemService("window");
    View localView = this.OooO0O0;
    WindowManager.LayoutParams localLayoutParams2 = this.OooO0Oo;
    paramView.addView(localView, localLayoutParams2);
  }
  
  public boolean isShowing()
  {
    ViewParent localViewParent = this.OooO0O0.getParent();
    boolean bool;
    if (localViewParent != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localViewParent = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.TooltipPopup
 * JD-Core Version:    0.7.0.1
 */