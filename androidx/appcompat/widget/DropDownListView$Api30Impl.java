package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DropDownListView$Api30Impl
{
  public static Method OooO00o;
  public static Method OooO0O0;
  public static Method OooO0OO;
  public static boolean OooO0Oo;
  
  static
  {
    Object localObject1 = AdapterView.class;
    Object localObject2 = AbsListView.class;
    Object localObject3 = "positionSelector";
    int i = 5;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      Object localObject4 = View.class;
      boolean bool = true;
      arrayOfClass[bool] = localObject4;
      localObject4 = Boolean.TYPE;
      int j = 2;
      arrayOfClass[j] = localObject4;
      localObject4 = Float.TYPE;
      j = 3;
      arrayOfClass[j] = localObject4;
      j = 4;
      arrayOfClass[j] = localObject4;
      localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject3, arrayOfClass);
      OooO00o = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(bool);
      localObject2 = "setSelectedPositionInt";
      localObject3 = new Class[bool];
      localObject3[0] = localClass;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      OooO0O0 = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(bool);
      localObject2 = "setNextSelectedPositionInt";
      localObject3 = new Class[bool];
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      OooO0OO = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(bool);
      OooO0Oo = bool;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
    }
  }
  
  public static boolean OooO00o()
  {
    return OooO0Oo;
  }
  
  public static void OooO0O0(DropDownListView paramDropDownListView, int paramInt, View paramView)
  {
    try
    {
      Object localObject1 = OooO00o;
      int i = 5;
      Object localObject2 = new Object[i];
      Integer localInteger1 = Integer.valueOf(paramInt);
      localObject2[0] = localInteger1;
      int j = 1;
      localObject2[j] = paramView;
      paramView = Boolean.FALSE;
      int k = 2;
      localObject2[k] = paramView;
      int m = -1;
      Integer localInteger2 = Integer.valueOf(m);
      int n = 3;
      localObject2[n] = localInteger2;
      paramView = Integer.valueOf(m);
      k = 4;
      localObject2[k] = paramView;
      ((Method)localObject1).invoke(paramDropDownListView, (Object[])localObject2);
      paramView = OooO0O0;
      localObject1 = new Object[j];
      localObject2 = Integer.valueOf(paramInt);
      localObject1[0] = localObject2;
      paramView.invoke(paramDropDownListView, (Object[])localObject1);
      paramView = OooO0OO;
      localObject1 = new Object[j];
      Integer localInteger3 = Integer.valueOf(paramInt);
      localObject1[0] = localInteger3;
      paramView.invoke(paramDropDownListView, (Object[])localObject1);
    }
    catch (InvocationTargetException paramDropDownListView) {}catch (IllegalAccessException paramDropDownListView) {}
    paramDropDownListView.printStackTrace();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.Api30Impl
 * JD-Core Version:    0.7.0.1
 */