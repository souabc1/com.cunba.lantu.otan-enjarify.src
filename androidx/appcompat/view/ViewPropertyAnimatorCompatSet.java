package androidx.appcompat.view;

import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{
  public final ArrayList OooO00o;
  public long OooO0O0 = -1;
  public Interpolator OooO0OO;
  public ViewPropertyAnimatorListener OooO0Oo;
  public final ViewPropertyAnimatorListenerAdapter OooO0o;
  public boolean OooO0o0;
  
  public ViewPropertyAnimatorCompatSet()
  {
    Object localObject = new androidx/appcompat/view/ViewPropertyAnimatorCompatSet$1;
    ((ViewPropertyAnimatorCompatSet.1)localObject).<init>(this);
    this.OooO0o = ((ViewPropertyAnimatorListenerAdapter)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO00o = ((ArrayList)localObject);
  }
  
  public void OooO00o()
  {
    boolean bool1 = this.OooO0o0;
    if (!bool1) {
      return;
    }
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat)localIterator.next();
      localViewPropertyAnimatorCompat.OooO0OO();
    }
    this.OooO0o0 = false;
  }
  
  public void OooO0O0()
  {
    this.OooO0o0 = false;
  }
  
  public ViewPropertyAnimatorCompatSet OooO0OO(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat)
  {
    boolean bool = this.OooO0o0;
    if (!bool)
    {
      ArrayList localArrayList = this.OooO00o;
      localArrayList.add(paramViewPropertyAnimatorCompat);
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet OooO0Oo(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat1, ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat2)
  {
    this.OooO00o.add(paramViewPropertyAnimatorCompat1);
    long l = paramViewPropertyAnimatorCompat1.getDuration();
    paramViewPropertyAnimatorCompat2.OooO(l);
    this.OooO00o.add(paramViewPropertyAnimatorCompat2);
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet OooO0o(Interpolator paramInterpolator)
  {
    boolean bool = this.OooO0o0;
    if (!bool) {
      this.OooO0OO = paramInterpolator;
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet OooO0o0(long paramLong)
  {
    boolean bool = this.OooO0o0;
    if (!bool) {
      this.OooO0O0 = paramLong;
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet OooO0oO(ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    boolean bool = this.OooO0o0;
    if (!bool) {
      this.OooO0Oo = paramViewPropertyAnimatorListener;
    }
    return this;
  }
  
  public void OooO0oo()
  {
    boolean bool1 = this.OooO0o0;
    if (bool1) {
      return;
    }
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat)localIterator.next();
      long l1 = this.OooO0O0;
      long l2 = 0L;
      boolean bool3 = l1 < l2;
      if (!bool3) {
        localViewPropertyAnimatorCompat.OooO0o0(l1);
      }
      Object localObject = this.OooO0OO;
      if (localObject != null) {
        localViewPropertyAnimatorCompat.OooO0o((Interpolator)localObject);
      }
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        localObject = this.OooO0o;
        localViewPropertyAnimatorCompat.OooO0oO((ViewPropertyAnimatorListener)localObject);
      }
      localViewPropertyAnimatorCompat.OooOO0O();
    }
    this.OooO0o0 = true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.ViewPropertyAnimatorCompatSet
 * JD-Core Version:    0.7.0.1
 */