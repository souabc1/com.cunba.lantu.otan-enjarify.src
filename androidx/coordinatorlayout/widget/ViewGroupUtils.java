package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class ViewGroupUtils
{
  public static final ThreadLocal OooO00o;
  public static final ThreadLocal OooO0O0;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO00o = localThreadLocal;
    localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO0O0 = localThreadLocal;
  }
  
  public static void OooO00o(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramRect.set(0, 0, i, j);
    OooO0OO(paramViewGroup, paramView, paramRect);
  }
  
  public static void OooO0O0(ViewParent paramViewParent, View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if ((bool1) && (localObject != paramViewParent))
    {
      localObject = (View)localObject;
      OooO0O0(paramViewParent, (View)localObject, paramMatrix);
      int i = -((View)localObject).getScrollX();
      f1 = i;
      j = -((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.preTranslate(f1, f2);
    }
    float f1 = paramView.getLeft();
    int j = paramView.getTop();
    float f2 = j;
    paramMatrix.preTranslate(f1, f2);
    paramViewParent = paramView.getMatrix();
    boolean bool2 = paramViewParent.isIdentity();
    if (!bool2)
    {
      paramViewParent = paramView.getMatrix();
      paramMatrix.preConcat(paramViewParent);
    }
  }
  
  public static void OooO0OO(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    ThreadLocal localThreadLocal = OooO00o;
    Matrix localMatrix = (Matrix)localThreadLocal.get();
    if (localMatrix == null)
    {
      localMatrix = new android/graphics/Matrix;
      localMatrix.<init>();
      localThreadLocal.set(localMatrix);
    }
    else
    {
      localMatrix.reset();
    }
    OooO0O0(paramViewGroup, paramView, localMatrix);
    paramViewGroup = OooO0O0;
    paramView = (RectF)paramViewGroup.get();
    if (paramView == null)
    {
      paramView = new android/graphics/RectF;
      paramView.<init>();
      paramViewGroup.set(paramView);
    }
    paramView.set(paramRect);
    localMatrix.mapRect(paramView);
    float f1 = paramView.left;
    float f2 = 0.5F;
    int i = (int)(f1 + f2);
    int j = (int)(paramView.top + f2);
    int k = (int)(paramView.right + f2);
    int m = (int)(paramView.bottom + f2);
    paramRect.set(i, j, k, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.ViewGroupUtils
 * JD-Core Version:    0.7.0.1
 */