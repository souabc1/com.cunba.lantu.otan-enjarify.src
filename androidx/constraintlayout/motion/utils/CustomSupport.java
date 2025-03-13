package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomSupport
{
  public static int OooO00o(int paramInt)
  {
    int i = paramInt >> 31 ^ 0xFFFFFFFF;
    paramInt = (paramInt & i) + -255;
    i = paramInt >> 31;
    return (paramInt & i) + 255;
  }
  
  public static void OooO0O0(ConstraintAttribute paramConstraintAttribute, View paramView, float[] paramArrayOfFloat)
  {
    Object localObject1 = paramView;
    String str1 = "\"";
    String str2 = " on View \"";
    Object localObject2 = paramView.getClass();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append("set");
    Object localObject4 = paramConstraintAttribute.getName();
    ((StringBuilder)localObject3).append((String)localObject4);
    localObject3 = ((StringBuilder)localObject3).toString();
    Object localObject5;
    try
    {
      localObject4 = CustomSupport.1.OooO00o;
      localObject5 = paramConstraintAttribute.getType();
      int i = ((Enum)localObject5).ordinal();
      int k = localObject4[i];
      i = 3;
      float f1 = 4.203895E-045F;
      int m = 2;
      float f2 = 2.802597E-045F;
      double d1 = 0.4545454545454545D;
      float f3 = 255.0F;
      boolean bool2 = true;
      float f4 = 1.4E-45F;
      boolean bool1;
      Object localObject6;
      float f5;
      double d4;
      int j;
      int n;
      switch (k)
      {
      default: 
        break;
      case 7: 
        localObject4 = new Class[bool2];
        localObject5 = Float.TYPE;
        localObject4[0] = localObject5;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        localObject4 = new Object[bool2];
        f1 = paramArrayOfFloat[0];
        localObject5 = Float.valueOf(f1);
        localObject4[0] = localObject5;
        ((Method)localObject2).invoke(paramView, (Object[])localObject4);
        break;
      case 6: 
        localObject4 = new Class[bool2];
        localObject5 = Boolean.TYPE;
        localObject4[0] = localObject5;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        localObject4 = new Object[bool2];
        f1 = paramArrayOfFloat[0];
        m = 1056964608;
        f2 = 0.5F;
        bool1 = f1 < f2;
        if (!bool1)
        {
          bool2 = false;
          f4 = 0.0F;
        }
        localObject5 = Boolean.valueOf(bool2);
        localObject4[0] = localObject5;
        ((Method)localObject2).invoke(localObject1, (Object[])localObject4);
        break;
      case 5: 
        localObject2 = new java/lang/RuntimeException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "unable to interpolate strings ";
        ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = paramConstraintAttribute.getName();
        ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((RuntimeException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      case 4: 
        localObject4 = new Class[bool2];
        localObject6 = Integer.TYPE;
        localObject4[0] = localObject6;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        f5 = paramArrayOfFloat[0];
        double d2 = f5;
        d2 = Math.pow(d2, d1);
        f5 = (float)d2 * f3;
        k = (int)f5;
        k = OooO00o(k);
        float f6 = paramArrayOfFloat[bool2];
        d2 = f6;
        d2 = Math.pow(d2, d1);
        f6 = (float)d2 * f3;
        int i1 = (int)f6;
        i1 = OooO00o(i1);
        f2 = paramArrayOfFloat[m];
        double d3 = f2;
        d4 = Math.pow(d3, d1);
        f2 = (float)d4 * f3;
        m = (int)f2;
        m = OooO00o(m);
        f1 = paramArrayOfFloat[bool1] * f3;
        j = (int)f1;
        j = OooO00o(j) << 24;
        k = k << 16 | j;
        j = i1 << 8;
        k = k | j | m;
        localObject5 = new Object[bool2];
        localObject4 = Integer.valueOf(k);
        localObject5[0] = localObject4;
        ((Method)localObject2).invoke(localObject1, (Object[])localObject5);
        break;
      case 3: 
        localObject4 = new Class[bool2];
        localObject6 = Drawable.class;
        localObject4[0] = localObject6;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        f5 = paramArrayOfFloat[0];
        double d5 = f5;
        d5 = Math.pow(d5, d1);
        f5 = (float)d5 * f3;
        k = (int)f5;
        k = OooO00o(k);
        f4 = paramArrayOfFloat[bool2];
        double d6 = f4;
        d6 = Math.pow(d6, d1);
        f4 = (float)d6 * f3;
        n = (int)f4;
        n = OooO00o(n);
        f2 = paramArrayOfFloat[m];
        d5 = f2;
        d4 = Math.pow(d5, d1);
        f2 = (float)d4 * f3;
        m = (int)f2;
        m = OooO00o(m);
        f1 = paramArrayOfFloat[j] * f3;
        j = (int)f1;
        j = OooO00o(j) << 24;
        k = k << 16 | j;
        j = n << 8;
        k = k | j | m;
        localObject5 = new android/graphics/drawable/ColorDrawable;
        ((ColorDrawable)localObject5).<init>();
        ((ColorDrawable)localObject5).setColor(k);
        localObject4 = new Object[] { localObject5 };
        ((Method)localObject2).invoke(paramView, (Object[])localObject4);
        break;
      case 2: 
        localObject4 = new Class[n];
        localObject5 = Float.TYPE;
        localObject4[0] = localObject5;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        localObject4 = new Object[n];
        f1 = paramArrayOfFloat[0];
        localObject5 = Float.valueOf(f1);
        localObject4[0] = localObject5;
        ((Method)localObject2).invoke(paramView, (Object[])localObject4);
        break;
      case 1: 
        localObject4 = new Class[n];
        localObject5 = Integer.TYPE;
        localObject4[0] = localObject5;
        localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
        localObject4 = new Object[n];
        f1 = paramArrayOfFloat[0];
        j = (int)f1;
        localObject5 = Integer.valueOf(j);
        localObject4[0] = localObject5;
        ((Method)localObject2).invoke(paramView, (Object[])localObject4);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label1068;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "cannot access method ";
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "no method ";
    }
    ((StringBuilder)localObject4).append((String)localObject5);
    ((StringBuilder)localObject4).append((String)localObject3);
    ((StringBuilder)localObject4).append(str2);
    localObject1 = Debug.OooO0O0(paramView);
    ((StringBuilder)localObject4).append((String)localObject1);
    ((StringBuilder)localObject4).append(str1);
    label1068:
    localNoSuchMethodException.printStackTrace();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.utils.CustomSupport
 * JD-Core Version:    0.7.0.1
 */