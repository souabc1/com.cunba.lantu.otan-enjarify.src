package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewUtilsBase
{
  public static Method OooO0O0;
  public static boolean OooO0OO;
  public static Field OooO0Oo;
  public static boolean OooO0o0;
  public float[] OooO00o;
  
  public void OooO(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if (bool1)
    {
      localObject = (View)localObject;
      OooO((View)localObject, paramMatrix);
      i = -((View)localObject).getScrollX();
      f1 = i;
      int j = -((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.preTranslate(f1, f2);
    }
    float f2 = paramView.getLeft();
    int i = paramView.getTop();
    float f1 = i;
    paramMatrix.preTranslate(f2, f1);
    paramView = paramView.getMatrix();
    boolean bool2 = paramView.isIdentity();
    if (!bool2) {
      paramMatrix.preConcat(paramView);
    }
  }
  
  public void OooO00o(View paramView)
  {
    int i = paramView.getVisibility();
    if (i == 0)
    {
      i = R.id.save_non_transition_alpha;
      paramView.setTag(i, null);
    }
  }
  
  public final void OooO0O0()
  {
    boolean bool = OooO0OO;
    Object localObject;
    String str;
    int i;
    if (!bool)
    {
      bool = true;
      localObject = View.class;
      str = "setFrame";
      i = 4;
    }
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass = Integer.TYPE;
      int j = 0;
      arrayOfClass[0] = localClass;
      arrayOfClass[bool] = localClass;
      j = 2;
      arrayOfClass[j] = localClass;
      j = 3;
      arrayOfClass[j] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      OooO0O0 = (Method)localObject;
      ((AccessibleObject)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label83:
      break label83;
    }
    OooO0OO = bool;
  }
  
  public float OooO0OO(View paramView)
  {
    int i = R.id.save_non_transition_alpha;
    Float localFloat = (Float)paramView.getTag(i);
    float f1 = paramView.getAlpha();
    if (localFloat != null)
    {
      float f2 = localFloat.floatValue();
      f1 /= f2;
    }
    return f1;
  }
  
  public void OooO0Oo(View paramView)
  {
    int i = R.id.save_non_transition_alpha;
    Object localObject = paramView.getTag(i);
    if (localObject == null)
    {
      i = R.id.save_non_transition_alpha;
      float f = paramView.getAlpha();
      Float localFloat = Float.valueOf(f);
      paramView.setTag(i, localFloat);
    }
  }
  
  public void OooO0o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    OooO0O0();
    Method localMethod = OooO0O0;
    if (localMethod != null)
    {
      int i = 4;
      try
      {
        Object[] arrayOfObject = new Object[i];
        localObject = Integer.valueOf(paramInt1);
        arrayOfObject[0] = localObject;
        localObject = Integer.valueOf(paramInt2);
        paramInt2 = 1;
        arrayOfObject[paramInt2] = localObject;
        localObject = Integer.valueOf(paramInt3);
        paramInt2 = 2;
        arrayOfObject[paramInt2] = localObject;
        localObject = Integer.valueOf(paramInt4);
        paramInt2 = 3;
        arrayOfObject[paramInt2] = localObject;
        localMethod.invoke(paramView, arrayOfObject);
      }
      catch (InvocationTargetException paramView)
      {
        Object localObject = new java/lang/RuntimeException;
        paramView = paramView.getCause();
        ((RuntimeException)localObject).<init>(paramView);
        throw ((Throwable)localObject);
      }
      catch (IllegalAccessException localIllegalAccessException) {}
    }
  }
  
  public void OooO0o0(View paramView, Matrix paramMatrix)
  {
    float f1 = 1.0F;
    int i = 2;
    float f2 = 2.802597E-045F;
    if (paramMatrix != null)
    {
      boolean bool1 = paramMatrix.isIdentity();
      if (!bool1)
      {
        float[] arrayOfFloat = this.OooO00o;
        if (arrayOfFloat == null)
        {
          int j = 9;
          arrayOfFloat = new float[j];
          this.OooO00o = arrayOfFloat;
        }
        paramMatrix.getValues(arrayOfFloat);
        k = 3;
        f3 = arrayOfFloat[k];
        float f4 = f3 * f3;
        double d1 = Math.sqrt(f1 - f4);
        f1 = (float)d1;
        f4 = 0.0F;
        float f5 = arrayOfFloat[0];
        boolean bool2 = f5 < 0.0F;
        if (bool2)
        {
          m = -1;
          f5 = 0.0F / 0.0F;
        }
        else
        {
          m = 1;
          f5 = 1.4E-45F;
        }
        f5 = m;
        f1 *= f5;
        double d2 = f3;
        double d3 = f1;
        d2 = Math.toDegrees(Math.atan2(d2, d3));
        f3 = (float)d2;
        f4 = arrayOfFloat[0] / f1;
        int m = 4;
        f5 = arrayOfFloat[m] / f1;
        f1 = arrayOfFloat[i];
        i = 5;
        f2 = arrayOfFloat[i];
        paramView.setPivotX(0.0F);
        paramView.setPivotY(0.0F);
        paramView.setTranslationX(f1);
        paramView.setTranslationY(f2);
        paramView.setRotation(f3);
        paramView.setScaleX(f4);
        paramView.setScaleY(f5);
        return;
      }
    }
    float f3 = paramView.getWidth() / i;
    paramView.setPivotX(f3);
    int k = paramView.getHeight() / i;
    f3 = k;
    paramView.setPivotY(f3);
    paramView.setTranslationX(0.0F);
    paramView.setTranslationY(0.0F);
    paramView.setScaleX(f1);
    paramView.setScaleY(f1);
    paramView.setRotation(0.0F);
  }
  
  public void OooO0oO(View paramView, float paramFloat)
  {
    int i = R.id.save_non_transition_alpha;
    Float localFloat = (Float)paramView.getTag(i);
    if (localFloat != null)
    {
      float f = localFloat.floatValue() * paramFloat;
      paramView.setAlpha(f);
    }
    else
    {
      paramView.setAlpha(paramFloat);
    }
  }
  
  public void OooO0oo(View paramView, int paramInt)
  {
    boolean bool = OooO0o0;
    String str;
    if (!bool)
    {
      bool = true;
      localObject = View.class;
      str = "mViewFlags";
    }
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      OooO0Oo = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(bool);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          Field localField;
          int i = localField.getInt(paramView);
          localObject = OooO0Oo;
          i &= 0xFFFFFFF3;
          paramInt |= i;
          ((Field)localObject).setInt(paramView, paramInt);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          continue;
        }
        localNoSuchFieldException;
      }
    }
    OooO0o0 = bool;
    localField = OooO0Oo;
    if (localField == null) {}
  }
  
  public void OooOO0(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if (bool1)
    {
      localObject = (View)localObject;
      OooOO0((View)localObject, paramMatrix);
      i = ((View)localObject).getScrollX();
      f1 = i;
      int j = ((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.postTranslate(f1, f2);
    }
    float f2 = -paramView.getLeft();
    int i = -paramView.getTop();
    float f1 = i;
    paramMatrix.postTranslate(f2, f1);
    paramView = paramView.getMatrix();
    boolean bool2 = paramView.isIdentity();
    if (!bool2)
    {
      localObject = new android/graphics/Matrix;
      ((Matrix)localObject).<init>();
      boolean bool3 = paramView.invert((Matrix)localObject);
      if (bool3) {
        paramMatrix.postConcat((Matrix)localObject);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ViewUtilsBase
 * JD-Core Version:    0.7.0.1
 */