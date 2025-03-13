package androidx.core.view;

import android.view.View;
import android.view.View.OnUnhandledKeyEventListener;
import androidx.collection.SimpleArrayMap;
import androidx.core.R.id;
import java.util.Objects;

class ViewCompat$Api28Impl
{
  public static void OooO(View paramView, boolean paramBoolean)
  {
    paramView.setScreenReaderFocusable(paramBoolean);
  }
  
  public static void OooO00o(View paramView, ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    int i = R.id.tag_unhandled_key_listeners;
    SimpleArrayMap localSimpleArrayMap = (SimpleArrayMap)paramView.getTag(i);
    if (localSimpleArrayMap == null)
    {
      localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
      localSimpleArrayMap.<init>();
      int j = R.id.tag_unhandled_key_listeners;
      paramView.setTag(j, localSimpleArrayMap);
    }
    Objects.requireNonNull(paramOnUnhandledKeyEventListenerCompat);
    o00Oo0 localo00Oo0 = new androidx/core/view/o00Oo0;
    localo00Oo0.<init>(paramOnUnhandledKeyEventListenerCompat);
    localSimpleArrayMap.put(paramOnUnhandledKeyEventListenerCompat, localo00Oo0);
    paramView.addOnUnhandledKeyEventListener(localo00Oo0);
  }
  
  public static CharSequence OooO0O0(View paramView)
  {
    return paramView.getAccessibilityPaneTitle();
  }
  
  public static boolean OooO0OO(View paramView)
  {
    return paramView.isAccessibilityHeading();
  }
  
  public static boolean OooO0Oo(View paramView)
  {
    return paramView.isScreenReaderFocusable();
  }
  
  public static Object OooO0o(View paramView, int paramInt)
  {
    return paramView.requireViewById(paramInt);
  }
  
  public static void OooO0o0(View paramView, ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    int i = R.id.tag_unhandled_key_listeners;
    SimpleArrayMap localSimpleArrayMap = (SimpleArrayMap)paramView.getTag(i);
    if (localSimpleArrayMap == null) {
      return;
    }
    paramOnUnhandledKeyEventListenerCompat = (View.OnUnhandledKeyEventListener)localSimpleArrayMap.get(paramOnUnhandledKeyEventListenerCompat);
    if (paramOnUnhandledKeyEventListenerCompat != null) {
      paramView.removeOnUnhandledKeyEventListener(paramOnUnhandledKeyEventListenerCompat);
    }
  }
  
  public static void OooO0oO(View paramView, boolean paramBoolean)
  {
    paramView.setAccessibilityHeading(paramBoolean);
  }
  
  public static void OooO0oo(View paramView, CharSequence paramCharSequence)
  {
    paramView.setAccessibilityPaneTitle(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api28Impl
 * JD-Core Version:    0.7.0.1
 */