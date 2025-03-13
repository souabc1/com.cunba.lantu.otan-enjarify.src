package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionManager
{
  public static Transition OooO0OO;
  public static ThreadLocal OooO0Oo;
  public static ArrayList OooO0o0;
  public ArrayMap OooO00o;
  public ArrayMap OooO0O0;
  
  static
  {
    Object localObject = new androidx/transition/AutoTransition;
    ((AutoTransition)localObject).<init>();
    OooO0OO = (Transition)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    OooO0Oo = (ThreadLocal)localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    OooO0o0 = (ArrayList)localObject;
  }
  
  public TransitionManager()
  {
    ArrayMap localArrayMap = new androidx/collection/ArrayMap;
    localArrayMap.<init>();
    this.OooO00o = localArrayMap;
    localArrayMap = new androidx/collection/ArrayMap;
    localArrayMap.<init>();
    this.OooO0O0 = localArrayMap;
  }
  
  public static void OooO00o(ViewGroup paramViewGroup)
  {
    OooO0O0(paramViewGroup, null);
  }
  
  public static void OooO0O0(ViewGroup paramViewGroup, Transition paramTransition)
  {
    ArrayList localArrayList = OooO0o0;
    boolean bool = localArrayList.contains(paramViewGroup);
    if (!bool)
    {
      bool = ViewCompat.OoooOOO(paramViewGroup);
      if (bool)
      {
        localArrayList = OooO0o0;
        localArrayList.add(paramViewGroup);
        if (paramTransition == null) {
          paramTransition = OooO0OO;
        }
        paramTransition = paramTransition.clone();
        OooO0Oo(paramViewGroup, paramTransition);
        bool = false;
        localArrayList = null;
        Scene.OooO0OO(paramViewGroup, null);
        OooO0OO(paramViewGroup, paramTransition);
      }
    }
  }
  
  public static void OooO0OO(ViewGroup paramViewGroup, Transition paramTransition)
  {
    if ((paramTransition != null) && (paramViewGroup != null))
    {
      TransitionManager.MultiListener localMultiListener = new androidx/transition/TransitionManager$MultiListener;
      localMultiListener.<init>(paramTransition, paramViewGroup);
      paramViewGroup.addOnAttachStateChangeListener(localMultiListener);
      paramViewGroup = paramViewGroup.getViewTreeObserver();
      paramViewGroup.addOnPreDrawListener(localMultiListener);
    }
  }
  
  public static void OooO0Oo(ViewGroup paramViewGroup, Transition paramTransition)
  {
    Object localObject = (ArrayList)getRunningTransitions().get(paramViewGroup);
    if (localObject != null)
    {
      int i = ((ArrayList)localObject).size();
      if (i > 0)
      {
        localObject = ((ArrayList)localObject).iterator();
        for (;;)
        {
          boolean bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          Transition localTransition = (Transition)((Iterator)localObject).next();
          localTransition.pause(paramViewGroup);
        }
      }
    }
    if (paramTransition != null)
    {
      boolean bool2 = true;
      paramTransition.captureValues(paramViewGroup, bool2);
    }
    paramViewGroup = Scene.OooO0O0(paramViewGroup);
    if (paramViewGroup != null) {
      paramViewGroup.OooO00o();
    }
  }
  
  public static ArrayMap getRunningTransitions()
  {
    Object localObject = (WeakReference)OooO0Oo.get();
    if (localObject != null)
    {
      localObject = (ArrayMap)((Reference)localObject).get();
      if (localObject != null) {
        return localObject;
      }
    }
    localObject = new androidx/collection/ArrayMap;
    ((ArrayMap)localObject).<init>();
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(localObject);
    OooO0Oo.set(localWeakReference);
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.TransitionManager
 * JD-Core Version:    0.7.0.1
 */