package androidx.transition;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class TransitionManager$MultiListener
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  public Transition o00OoOoo;
  public ViewGroup o00Ooo00;
  
  public TransitionManager$MultiListener(Transition paramTransition, ViewGroup paramViewGroup)
  {
    this.o00OoOoo = paramTransition;
    this.o00Ooo00 = paramViewGroup;
  }
  
  public final void OooO00o()
  {
    this.o00Ooo00.getViewTreeObserver().removeOnPreDrawListener(this);
    this.o00Ooo00.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    OooO00o();
    Object localObject1 = TransitionManager.OooO0o0;
    ViewGroup localViewGroup = this.o00Ooo00;
    boolean bool1 = ((ArrayList)localObject1).remove(localViewGroup);
    boolean bool2 = true;
    if (!bool1) {
      return bool2;
    }
    localObject1 = TransitionManager.getRunningTransitions();
    Object localObject2 = this.o00Ooo00;
    localObject2 = (ArrayList)((SimpleArrayMap)localObject1).get(localObject2);
    Object localObject3 = null;
    if (localObject2 == null)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject4 = this.o00Ooo00;
      ((SimpleArrayMap)localObject1).put(localObject4, localObject2);
    }
    else
    {
      i = ((ArrayList)localObject2).size();
      if (i > 0)
      {
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>((Collection)localObject2);
      }
    }
    Object localObject4 = this.o00OoOoo;
    ((ArrayList)localObject2).add(localObject4);
    localObject2 = this.o00OoOoo;
    localObject4 = new androidx/transition/TransitionManager$MultiListener$1;
    ((TransitionManager.MultiListener.1)localObject4).<init>(this, (ArrayMap)localObject1);
    ((Transition)localObject2).addListener((Transition.TransitionListener)localObject4);
    localObject1 = this.o00OoOoo;
    localObject2 = this.o00Ooo00;
    int i = 0;
    localObject4 = null;
    ((Transition)localObject1).captureValues((ViewGroup)localObject2, false);
    if (localObject3 != null)
    {
      localObject1 = ((ArrayList)localObject3).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (Transition)((Iterator)localObject1).next();
        localObject3 = this.o00Ooo00;
        ((Transition)localObject2).resume((View)localObject3);
      }
    }
    localObject1 = this.o00OoOoo;
    localObject2 = this.o00Ooo00;
    ((Transition)localObject1).playTransition((ViewGroup)localObject2);
    return bool2;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    OooO00o();
    paramView = TransitionManager.OooO0o0;
    Object localObject = this.o00Ooo00;
    paramView.remove(localObject);
    paramView = TransitionManager.getRunningTransitions();
    localObject = this.o00Ooo00;
    paramView = (ArrayList)paramView.get(localObject);
    if (paramView != null)
    {
      int i = paramView.size();
      if (i > 0)
      {
        paramView = paramView.iterator();
        for (;;)
        {
          boolean bool = paramView.hasNext();
          if (!bool) {
            break;
          }
          localObject = (Transition)paramView.next();
          ViewGroup localViewGroup = this.o00Ooo00;
          ((Transition)localObject).resume(localViewGroup);
        }
      }
    }
    this.o00OoOoo.clearValues(true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TransitionManager.MultiListener
 * JD-Core Version:    0.7.0.1
 */