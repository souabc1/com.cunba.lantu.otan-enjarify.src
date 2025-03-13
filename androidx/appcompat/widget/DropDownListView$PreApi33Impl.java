package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class DropDownListView$PreApi33Impl
{
  public static final Field OooO00o;
  
  static
  {
    Field localField = null;
    AbsListView localAbsListView = AbsListView.class;
    String str = "mIsChildViewEnabled";
    try
    {
      localField = localAbsListView.getDeclaredField(str);
      boolean bool = true;
      localField.setAccessible(bool);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
    }
    OooO00o = localField;
  }
  
  public static boolean OooO00o(AbsListView paramAbsListView)
  {
    Field localField = OooO00o;
    if (localField != null) {
      try
      {
        return localField.getBoolean(paramAbsListView);
      }
      catch (IllegalAccessException paramAbsListView)
      {
        paramAbsListView.printStackTrace();
      }
    }
    return false;
  }
  
  public static void OooO0O0(AbsListView paramAbsListView, boolean paramBoolean)
  {
    Field localField = OooO00o;
    if (localField != null) {
      try
      {
        Boolean localBoolean = Boolean.valueOf(paramBoolean);
        localField.set(paramAbsListView, localBoolean);
      }
      catch (IllegalAccessException paramAbsListView)
      {
        paramAbsListView.printStackTrace();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.PreApi33Impl
 * JD-Core Version:    0.7.0.1
 */