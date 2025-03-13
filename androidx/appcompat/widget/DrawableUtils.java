package androidx.appcompat.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableUtils
{
  public static final int[] OooO00o = { 16842912 };
  public static final int[] OooO0O0 = new int[0];
  public static final Rect OooO0OO;
  
  static
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    OooO0OO = localRect;
  }
  
  public static boolean OooO00o(Drawable paramDrawable)
  {
    return true;
  }
  
  public static void OooO0O0(Drawable paramDrawable)
  {
    String str1 = paramDrawable.getClass().getName();
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      j = 31;
      if (i < j)
      {
        String str2 = "android.graphics.drawable.ColorStateListDrawable";
        boolean bool = str2.equals(str1);
        if (bool) {
          OooO0OO(paramDrawable);
        }
      }
    }
  }
  
  public static void OooO0OO(Drawable paramDrawable)
  {
    int[] arrayOfInt1 = paramDrawable.getState();
    if (arrayOfInt1 != null)
    {
      int i = arrayOfInt1.length;
      if (i != 0)
      {
        arrayOfInt2 = OooO0O0;
        paramDrawable.setState(arrayOfInt2);
        break label42;
      }
    }
    int[] arrayOfInt2 = OooO00o;
    paramDrawable.setState(arrayOfInt2);
    label42:
    paramDrawable.setState(arrayOfInt1);
  }
  
  public static Rect OooO0Oo(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j)
    {
      paramDrawable = DrawableUtils.Api29Impl.OooO00o(paramDrawable);
      Rect localRect = new android/graphics/Rect;
      j = OooO0OO.OooO00o(paramDrawable);
      int k = OooO0o.OooO00o(paramDrawable);
      int m = OooO.OooO00o(paramDrawable);
      int n = OooOO0.OooO00o(paramDrawable);
      localRect.<init>(j, k, m, n);
      return localRect;
    }
    return DrawableUtils.Api18Impl.OooO00o(DrawableCompat.OooOOo0(paramDrawable));
  }
  
  public static PorterDuff.Mode OooO0o0(int paramInt, PorterDuff.Mode paramMode)
  {
    int i = 3;
    if (paramInt != i)
    {
      i = 5;
      if (paramInt != i)
      {
        i = 9;
        if (paramInt != i)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.DrawableUtils
 * JD-Core Version:    0.7.0.1
 */