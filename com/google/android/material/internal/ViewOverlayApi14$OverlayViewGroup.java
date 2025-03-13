package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m54207b69;

class ViewOverlayApi14$OverlayViewGroup
  extends ViewGroup
{
  static Method invalidateChildInParentFastMethod;
  private boolean disposed;
  ArrayList drawables = null;
  ViewGroup hostView;
  View requestingView;
  ViewOverlayApi14 viewOverlay;
  
  static
  {
    Object localObject1 = ViewGroup.class;
    String str = ">n07011A12060C101622143711130F1836104F212F1F15303F273634";
    try
    {
      str = m54207b69.F54207b69_11(str);
      int i = 3;
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
      invalidateChildInParentFastMethod = (Method)localObject1;
      label64:
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label64;
    }
  }
  
  public ViewOverlayApi14$OverlayViewGroup(Context paramContext, ViewGroup paramViewGroup, View paramView, ViewOverlayApi14 paramViewOverlayApi14)
  {
    super(paramContext);
    this.hostView = paramViewGroup;
    this.requestingView = paramView;
    int i = paramViewGroup.getWidth();
    setRight(i);
    i = paramViewGroup.getHeight();
    setBottom(i);
    paramViewGroup.addView(this);
    this.viewOverlay = paramViewOverlayApi14;
  }
  
  private void assertNotDisposed()
  {
    boolean bool = this.disposed;
    if (!bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("IP04393B2674442C3C2A453B347C343F3280454B363454394C4C894B573E524F53499F9223605A574A5D994F4E619D5F9F6E6659A373736BA75E726BAB4276736657638168644A6A80846CC88281716D7585738E847DCDCF");
    localIllegalStateException.<init>(str);
    throw localIllegalStateException;
  }
  
  private void disposeIfEmpty()
  {
    int i = getChildCount();
    if (i == 0)
    {
      Object localObject = this.drawables;
      if (localObject != null)
      {
        i = ((ArrayList)localObject).size();
        if (i != 0) {}
      }
      else
      {
        i = 1;
        this.disposed = i;
        localObject = this.hostView;
        ((ViewGroup)localObject).removeView(this);
      }
    }
  }
  
  private void getOffset(int[] paramArrayOfInt)
  {
    int i = 2;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    this.hostView.getLocationOnScreen(arrayOfInt1);
    this.requestingView.getLocationOnScreen(arrayOfInt2);
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
  
  public void add(Drawable paramDrawable)
  {
    assertNotDisposed();
    Object localObject = this.drawables;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.drawables = ((ArrayList)localObject);
    }
    localObject = this.drawables;
    boolean bool = ((ArrayList)localObject).contains(paramDrawable);
    if (!bool)
    {
      this.drawables.add(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      paramDrawable.setCallback(this);
    }
  }
  
  public void add(View paramView)
  {
    assertNotDisposed();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof ViewGroup;
    if (bool1)
    {
      localObject1 = (ViewGroup)paramView.getParent();
      Object localObject2 = this.hostView;
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
            this.hostView.getLocationOnScreen((int[])localObject2);
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
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    int i = 2;
    Object localObject1 = new int[i];
    Object localObject2 = new int[i];
    this.hostView.getLocationOnScreen((int[])localObject1);
    this.requestingView.getLocationOnScreen((int[])localObject2);
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
    localObject1 = this.requestingView;
    n = ((View)localObject1).getWidth();
    View localView = this.requestingView;
    k = localView.getHeight();
    ((Rect)localObject2).<init>(0, 0, n, k);
    paramCanvas.clipRect((Rect)localObject2);
    super.dispatchDraw(paramCanvas);
    localObject2 = this.drawables;
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
      localObject1 = (Drawable)this.drawables.get(j);
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
    ViewGroup localViewGroup = this.hostView;
    if (localViewGroup != null)
    {
      int i = 0;
      localViewGroup = null;
      int j = paramArrayOfInt[0];
      int k = 1;
      int m = paramArrayOfInt[k];
      paramRect.offset(j, m);
      Object localObject = this.hostView;
      if (localObject != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[k] = 0;
        localObject = new int[2];
        getOffset((int[])localObject);
        i = localObject[0];
        j = localObject[k];
        paramRect.offset(i, j);
        return super.invalidateChildInParent(paramArrayOfInt, paramRect);
      }
      invalidate(paramRect);
    }
    return null;
  }
  
  public ViewParent invalidateChildInParentFast(int paramInt1, int paramInt2, Rect paramRect)
  {
    Object localObject1 = this.hostView;
    if (localObject1 != null)
    {
      localObject1 = invalidateChildInParentFastMethod;
      if (localObject1 != null)
      {
        int i = 2;
        try
        {
          Object localObject2 = new int[i];
          getOffset((int[])localObject2);
          localObject2 = invalidateChildInParentFastMethod;
          ViewGroup localViewGroup = this.hostView;
          int j = 3;
          Object[] arrayOfObject = new Object[j];
          Integer localInteger = Integer.valueOf(paramInt1);
          arrayOfObject[0] = localInteger;
          localInteger = Integer.valueOf(paramInt2);
          paramInt2 = 1;
          arrayOfObject[paramInt2] = localInteger;
          arrayOfObject[i] = paramRect;
          ((Method)localObject2).invoke(localViewGroup, arrayOfObject);
        }
        catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}
        localIllegalAccessException.printStackTrace();
      }
    }
    return null;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    paramDrawable = paramDrawable.getBounds();
    invalidate(paramDrawable);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void remove(Drawable paramDrawable)
  {
    Object localObject = this.drawables;
    if (localObject != null)
    {
      ((ArrayList)localObject).remove(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      localObject = null;
      paramDrawable.setCallback(null);
      disposeIfEmpty();
    }
  }
  
  public void remove(View paramView)
  {
    super.removeView(paramView);
    disposeIfEmpty();
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool1 = super.verifyDrawable(paramDrawable);
    if (!bool1)
    {
      ArrayList localArrayList = this.drawables;
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
 * Qualified Name:     com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup
 * JD-Core Version:    0.7.0.1
 */