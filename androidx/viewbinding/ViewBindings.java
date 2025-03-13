package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

public class ViewBindings
{
  public static View OooO00o(View paramView, int paramInt)
  {
    boolean bool = paramView instanceof ViewGroup;
    if (!bool) {
      return null;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = paramView.getChildAt(j).findViewById(paramInt);
      if (localView != null) {
        return localView;
      }
      j += 1;
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewbinding.ViewBindings
 * JD-Core Version:    0.7.0.1
 */