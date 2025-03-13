package androidx.fragment.app;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class FragmentTransitionImpl
{
  public static boolean OooO(List paramList)
  {
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool)
      {
        bool = false;
        paramList = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static void OooO0Oo(List paramList, View paramView)
  {
    int i = paramList.size();
    boolean bool1 = OooO0oO(paramList, paramView, i);
    if (bool1) {
      return;
    }
    Object localObject = ViewCompat.Oooo0O0(paramView);
    if (localObject != null) {
      paramList.add(paramView);
    }
    int k = i;
    for (;;)
    {
      int j = paramList.size();
      if (k >= j) {
        break;
      }
      localObject = (View)paramList.get(k);
      boolean bool2 = localObject instanceof ViewGroup;
      if (bool2)
      {
        localObject = (ViewGroup)localObject;
        int m = ((ViewGroup)localObject).getChildCount();
        int n = 0;
        while (n < m)
        {
          View localView = ((ViewGroup)localObject).getChildAt(n);
          boolean bool3 = OooO0oO(paramList, localView, i);
          if (!bool3)
          {
            String str = ViewCompat.Oooo0O0(localView);
            if (str != null) {
              paramList.add(localView);
            }
          }
          n += 1;
        }
      }
      k += 1;
    }
  }
  
  public static boolean OooO0oO(List paramList, View paramView, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      Object localObject = paramList.get(i);
      if (localObject == paramView) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public abstract void OooO00o(Object paramObject, View paramView);
  
  public abstract void OooO0O0(Object paramObject, ArrayList paramArrayList);
  
  public abstract void OooO0OO(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract Object OooO0o(Object paramObject);
  
  public abstract boolean OooO0o0(Object paramObject);
  
  public void OooO0oo(View paramView, Rect paramRect)
  {
    boolean bool1 = ViewCompat.o000oOoO(paramView);
    if (!bool1) {
      return;
    }
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    float f1 = paramView.getWidth();
    float f2 = paramView.getHeight();
    int j = 0;
    float f3 = 0.0F;
    localRectF.set(0.0F, 0.0F, f1, f2);
    paramView.getMatrix().mapRect(localRectF);
    int k = paramView.getLeft();
    f1 = k;
    int m = paramView.getTop();
    f2 = m;
    localRectF.offset(f1, f2);
    for (Object localObject = paramView.getParent();; localObject = ((View)localObject).getParent())
    {
      boolean bool2 = localObject instanceof View;
      if (!bool2) {
        break;
      }
      localObject = (View)localObject;
      f2 = -((View)localObject).getScrollX();
      f3 = -((View)localObject).getScrollY();
      localRectF.offset(f2, f3);
      Matrix localMatrix = ((View)localObject).getMatrix();
      localMatrix.mapRect(localRectF);
      n = ((View)localObject).getLeft();
      f2 = n;
      j = ((View)localObject).getTop();
      f3 = j;
      localRectF.offset(f2, f3);
    }
    localObject = new int[2];
    paramView.getRootView().getLocationOnScreen((int[])localObject);
    float f4 = localObject[0];
    f1 = localObject[1];
    localRectF.offset(f4, f1);
    int i1 = Math.round(localRectF.left);
    k = Math.round(localRectF.top);
    int n = Math.round(localRectF.right);
    int i = Math.round(localRectF.bottom);
    paramRect.set(i1, k, n, i);
  }
  
  public abstract Object OooOO0(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract Object OooOO0O(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public ArrayList OooOO0o(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayList.size();
    int j = 0;
    while (j < i)
    {
      View localView = (View)paramArrayList.get(j);
      String str = ViewCompat.Oooo0O0(localView);
      localArrayList.add(str);
      str = null;
      ViewCompat.o00000oO(localView, null);
      j += 1;
    }
    return localArrayList;
  }
  
  public abstract void OooOOO(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3);
  
  public abstract void OooOOO0(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public abstract void OooOOOO(Object paramObject, Rect paramRect);
  
  public abstract void OooOOOo(Object paramObject, View paramView);
  
  public void OooOOo(View paramView, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Map paramMap)
  {
    int i = paramArrayList2.size();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    while (j < i)
    {
      localObject1 = (View)paramArrayList1.get(j);
      localObject2 = ViewCompat.Oooo0O0((View)localObject1);
      localArrayList.add(localObject2);
      if (localObject2 != null)
      {
        ViewCompat.o00000oO((View)localObject1, null);
        localObject1 = (String)paramMap.get(localObject2);
        int k = 0;
        while (k < i)
        {
          Object localObject3 = paramArrayList3.get(k);
          boolean bool = ((String)localObject1).equals(localObject3);
          if (bool)
          {
            localObject1 = (View)paramArrayList2.get(k);
            ViewCompat.o00000oO((View)localObject1, (String)localObject2);
            break;
          }
          k += 1;
        }
      }
      j += 1;
    }
    paramMap = new androidx/fragment/app/FragmentTransitionImpl$1;
    Object localObject1 = paramArrayList2;
    Object localObject2 = paramArrayList3;
    paramMap.<init>(this, i, paramArrayList2, paramArrayList3, paramArrayList1, localArrayList);
    OneShotPreDrawListener.OooO00o(paramView, paramMap);
  }
  
  public void OooOOo0(Fragment paramFragment, Object paramObject, CancellationSignal paramCancellationSignal, Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public abstract void OooOOoo(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public abstract Object OooOo0(Object paramObject);
  
  public abstract void OooOo00(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl
 * JD-Core Version:    0.7.0.1
 */