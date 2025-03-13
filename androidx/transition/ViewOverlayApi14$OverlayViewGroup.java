package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14$OverlayViewGroup
  extends ViewGroup
{
  public static Method o00Ooo0o;
  public ViewGroup o00OoOoo;
  public ArrayList o00Ooo0;
  public View o00Ooo00;
  public boolean o00Ooo0O;
  
  static
  {
    Object localObject1 = ViewGroup.class;
    String str = "invalidateChildInParentFast";
    int i = 3;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Object localObject2 = Integer.TYPE;
      int j = 0;
      arrayOfClass[0] = localObject2;
      j = 1;
      arrayOfClass[j] = localObject2;
      localObject2 = Rect.class;
      j = 2;
      arrayOfClass[j] = localObject2;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
      o00Ooo0o = (Method)localObject1;
      label59:
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label59;
    }
  }
  
  public void OooO00o(Drawable paramDrawable)
  {
    OooO0OO();
    Object localObject = this.o00Ooo0;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.o00Ooo0 = ((ArrayList)localObject);
    }
    localObject = this.o00Ooo0;
    boolean bool = ((ArrayList)localObject).contains(paramDrawable);
    if (!bool)
    {
      this.o00Ooo0.add(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      paramDrawable.setCallback(this);
    }
  }
  
  public void OooO0O0(View paramView)
  {
    OooO0OO();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof ViewGroup;
    if (bool1)
    {
      localObject1 = (ViewGroup)paramView.getParent();
      Object localObject2 = this.o00OoOoo;
      if (localObject1 != localObject2)
      {
        localObject2 = ((View)localObject1).getParent();
        if (localObject2 != null)
        {
          boolean bool2 = ViewCompat.o000oOoO((View)localObject1);
          if (bool2)
          {
            int i = 2;
            int[] arrayOfInt = new int[i];
            localObject2 = new int[i];
            ((View)localObject1).getLocationOnScreen(arrayOfInt);
            this.o00OoOoo.getLocationOnScreen((int[])localObject2);
            int j = arrayOfInt[0];
            int k = localObject2[0];
            j -= k;
            ViewCompat.Ooooo0o(paramView, j);
            k = 1;
            int m = arrayOfInt[k];
            i = localObject2[k];
            m -= i;
            ViewCompat.OooooO0(paramView, m);
          }
        }
      }
      ((ViewGroup)localObject1).removeView(paramView);
      localObject2 = paramView.getParent();
      if (localObject2 != null) {
        ((ViewGroup)localObject1).removeView(paramView);
      }
    }
    super.addView(paramView);
  }
  
  public final void OooO0OO()
  {
    boolean bool = this.o00Ooo0O;
    if (!bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    throw localIllegalStateException;
  }
  
  public final void OooO0Oo()
  {
    int i = getChildCount();
    if (i == 0)
    {
      Object localObject = this.o00Ooo0;
      if (localObject != null)
      {
        i = ((ArrayList)localObject).size();
        if (i != 0) {}
      }
      else
      {
        i = 1;
        this.o00Ooo0O = i;
        localObject = this.o00OoOoo;
        ((ViewGroup)localObject).removeView(this);
      }
    }
  }
  
  public void OooO0o(Drawable paramDrawable)
  {
    Object localObject = this.o00Ooo0;
    if (localObject != null)
    {
      ((ArrayList)localObject).remove(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      localObject = null;
      paramDrawable.setCallback(null);
      OooO0Oo();
    }
  }
  
  public final void OooO0o0(int[] paramArrayOfInt)
  {
    int i = 2;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    this.o00OoOoo.getLocationOnScreen(arrayOfInt1);
    this.o00Ooo00.getLocationOnScreen(arrayOfInt2);
    int j = arrayOfInt2[0];
    int k = arrayOfInt1[0];
    j -= k;
    paramArrayOfInt[0] = j;
    int m = 1;
    i = arrayOfInt2[m];
    int n = arrayOfInt1[m];
    i -= n;
    paramArrayOfInt[m] = i;
  }
  
  public void OooO0oO(View paramView)
  {
    super.removeView(paramView);
    OooO0Oo();
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    int i = 2;
    Object localObject1 = new int[i];
    Object localObject2 = new int[i];
    this.o00OoOoo.getLocationOnScreen((int[])localObject1);
    this.o00Ooo00.getLocationOnScreen((int[])localObject2);
    int j = 0;
    int k = localObject2[0];
    int m = localObject1[0];
    float f1 = k - m;
    m = 1;
    i = localObject2[m];
    int n = localObject1[m];
    i -= n;
    float f2 = i;
    paramCanvas.translate(f1, f2);
    localObject2 = new android/graphics/Rect;
    localObject1 = this.o00Ooo00;
    n = ((View)localObject1).getWidth();
    View localView = this.o00Ooo00;
    k = localView.getHeight();
    ((Rect)localObject2).<init>(0, 0, n, k);
    paramCanvas.clipRect((Rect)localObject2);
    super.dispatchDraw(paramCanvas);
    localObject2 = this.o00Ooo0;
    if (localObject2 == null)
    {
      i = 0;
      localObject2 = null;
      f2 = 0.0F;
    }
    else
    {
      i = ((ArrayList)localObject2).size();
    }
    while (j < i)
    {
      localObject1 = (Drawable)this.o00Ooo0.get(j);
      ((Drawable)localObject1).draw(paramCanvas);
      j += 1;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    ViewGroup localViewGroup = this.o00OoOoo;
    if (localViewGroup != null)
    {
      int i = 0;
      localViewGroup = null;
      int j = paramArrayOfInt[0];
      int k = 1;
      int m = paramArrayOfInt[k];
      paramRect.offset(j, m);
      Object localObject = this.o00OoOoo;
      if (localObject != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[k] = 0;
        localObject = new int[2];
        OooO0o0((int[])localObject);
        i = localObject[0];
        j = localObject[k];
        paramRect.offset(i, j);
        return super.invalidateChildInParent(paramArrayOfInt, paramRect);
      }
      invalidate(paramRect);
    }
    return null;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    paramDrawable = paramDrawable.getBounds();
    invalidate(paramDrawable);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool1 = super.verifyDrawable(paramDrawable);
    if (!bool1)
    {
      ArrayList localArrayList = this.o00Ooo0;
      if (localArrayList != null)
      {
        bool2 = localArrayList.contains(paramDrawable);
        if (bool2) {}
      }
      else
      {
        bool2 = false;
        paramDrawable = null;
        break label45;
      }
    }
    boolean bool2 = true;
    label45:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ViewOverlayApi14.OverlayViewGroup
 * JD-Core Version:    0.7.0.1
 */