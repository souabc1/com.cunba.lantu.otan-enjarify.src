package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

class SearchView$UpdatableTouchDelegate
  extends TouchDelegate
{
  public final View OooO00o;
  public final Rect OooO0O0;
  public final Rect OooO0OO;
  public final Rect OooO0Oo;
  public boolean OooO0o;
  public final int OooO0o0;
  
  public SearchView$UpdatableTouchDelegate(Rect paramRect1, Rect paramRect2, View paramView)
  {
    super(paramRect1, paramView);
    int i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.OooO0o0 = i;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO0O0 = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO0Oo = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO0OO = localRect;
    OooO00o(paramRect1, paramRect2);
    this.OooO00o = paramView;
  }
  
  public void OooO00o(Rect paramRect1, Rect paramRect2)
  {
    this.OooO0O0.set(paramRect1);
    this.OooO0Oo.set(paramRect1);
    paramRect1 = this.OooO0Oo;
    int i = this.OooO0o0;
    int j = -i;
    i = -i;
    paramRect1.inset(j, i);
    this.OooO0OO.set(paramRect2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    int i = (int)f1;
    float f2 = paramMotionEvent.getY();
    int j = (int)f2;
    int k = paramMotionEvent.getAction();
    int i1 = 2;
    boolean bool1 = false;
    int i2 = 1;
    Rect localRect2;
    if (k != 0)
    {
      if ((k != i2) && (k != i1))
      {
        int i3 = 3;
        if (k != i3) {
          break label174;
        }
        m = this.OooO0o;
        this.OooO0o = false;
      }
      else
      {
        m = this.OooO0o;
        if (m != 0)
        {
          Rect localRect1 = this.OooO0Oo;
          boolean bool2 = localRect1.contains(i, j);
          if (!bool2)
          {
            i2 = m;
            m = 0;
            localRect2 = null;
            break label181;
          }
        }
      }
      int i4 = i2;
      i2 = m;
      m = i4;
      break label181;
    }
    else
    {
      localRect2 = this.OooO0O0;
      m = localRect2.contains(i, j);
      if (m != 0)
      {
        this.OooO0o = i2;
        m = i2;
        break label181;
      }
    }
    label174:
    int m = i2;
    i2 = 0;
    label181:
    if (i2 != 0)
    {
      if (m != 0)
      {
        localRect2 = this.OooO0OO;
        m = localRect2.contains(i, j);
        if (m == 0)
        {
          localView1 = this.OooO00o;
          i = localView1.getWidth() / i1;
          f1 = i;
          View localView2 = this.OooO00o;
          j = localView2.getHeight() / i1;
          break label284;
        }
      }
      localRect2 = this.OooO0OO;
      i1 = localRect2.left;
      i -= i1;
      f1 = i;
      int n = localRect2.top;
      j -= n;
      f2 = j;
      paramMotionEvent.setLocation(f1, f2);
      View localView1 = this.OooO00o;
      bool1 = localView1.dispatchTouchEvent(paramMotionEvent);
    }
    label284:
    return bool1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.UpdatableTouchDelegate
 * JD-Core Version:    0.7.0.1
 */