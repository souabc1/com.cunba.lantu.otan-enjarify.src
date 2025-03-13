package com.lzf.easyfloat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.FloatCallbacks;
import com.lzf.easyfloat.interfaces.FloatCallbacks.Builder;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;
import com.lzf.easyfloat.interfaces.OnFloatTouchListener;
import com.lzf.easyfloat.utils.InputMethodUtils;
import kotlin.jvm.functions.Function0;

public final class ParentFrameLayout
  extends FrameLayout
{
  public final FloatConfig o00OoOoo;
  public ParentFrameLayout.OnLayoutListener o00Ooo0;
  public OnFloatTouchListener o00Ooo00;
  public boolean o00Ooo0O;
  
  public ParentFrameLayout(Context paramContext, FloatConfig paramFloatConfig, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.o00OoOoo = paramFloatConfig;
  }
  
  public boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((FloatConfig)localObject).getHasEditText();
    if (bool)
    {
      bool = false;
      localObject = null;
      int j;
      if (paramKeyEvent != null)
      {
        j = paramKeyEvent.getAction();
        if (j == 0) {
          bool = true;
        }
      }
      if (bool)
      {
        int i = paramKeyEvent.getKeyCode();
        j = 4;
        if (i == j)
        {
          localObject = this.o00OoOoo.getFloatTag();
          InputMethodUtils.OooO0OO((String)localObject);
        }
      }
    }
    return super.dispatchKeyEventPreIme(paramKeyEvent);
  }
  
  public final ParentFrameLayout.OnLayoutListener getLayoutListener()
  {
    return this.o00Ooo0;
  }
  
  public final OnFloatTouchListener getTouchListener()
  {
    return this.o00Ooo00;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.o00OoOoo.getCallbacks();
    if (localObject != null) {
      ((OnFloatCallbacks)localObject).dismiss();
    }
    localObject = this.o00OoOoo.getFloatCallbacks();
    if (localObject != null)
    {
      localObject = ((FloatCallbacks)localObject).getBuilder();
      if (localObject != null)
      {
        localObject = ((FloatCallbacks.Builder)localObject).getDismiss$easyfloat_release();
        if (localObject != null) {
          ((Function0)localObject).OooO00o();
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent != null)
    {
      localObject = this.o00Ooo00;
      if (localObject != null) {
        ((OnFloatTouchListener)localObject).OooO00o(paramMotionEvent);
      }
    }
    Object localObject = this.o00OoOoo;
    boolean bool1 = ((FloatConfig)localObject).isDrag();
    if (!bool1)
    {
      bool2 = super.onInterceptTouchEvent(paramMotionEvent);
      if (!bool2)
      {
        bool2 = false;
        paramMotionEvent = null;
        break label63;
      }
    }
    boolean bool2 = true;
    label63:
    return bool2;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramBoolean = this.o00Ooo0O;
    if (!paramBoolean)
    {
      paramBoolean = true;
      this.o00Ooo0O = paramBoolean;
      ParentFrameLayout.OnLayoutListener localOnLayoutListener = this.o00Ooo0;
      if (localOnLayoutListener != null) {
        localOnLayoutListener.OooO00o();
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent != null)
    {
      localObject = this.o00Ooo00;
      if (localObject != null) {
        ((OnFloatTouchListener)localObject).OooO00o(paramMotionEvent);
      }
    }
    Object localObject = this.o00OoOoo;
    boolean bool1 = ((FloatConfig)localObject).isDrag();
    if (!bool1)
    {
      bool2 = super.onTouchEvent(paramMotionEvent);
      if (!bool2)
      {
        bool2 = false;
        paramMotionEvent = null;
        break label63;
      }
    }
    boolean bool2 = true;
    label63:
    return bool2;
  }
  
  public final void setLayoutListener(ParentFrameLayout.OnLayoutListener paramOnLayoutListener)
  {
    this.o00Ooo0 = paramOnLayoutListener;
  }
  
  public final void setTouchListener(OnFloatTouchListener paramOnFloatTouchListener)
  {
    this.o00Ooo00 = paramOnFloatTouchListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.widget.ParentFrameLayout
 * JD-Core Version:    0.7.0.1
 */