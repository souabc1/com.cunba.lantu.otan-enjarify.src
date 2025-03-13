package androidx.core.view;

import android.view.View;
import java.util.Collection;

class ViewCompat$Api26Impl
{
  public static boolean OooO(View paramView)
  {
    return paramView.restoreDefaultFocus();
  }
  
  public static void OooO00o(View paramView, Collection paramCollection, int paramInt)
  {
    paramView.addKeyboardNavigationClusters(paramCollection, paramInt);
  }
  
  public static int OooO0O0(View paramView)
  {
    return paramView.getImportantForAutofill();
  }
  
  public static int OooO0OO(View paramView)
  {
    return paramView.getNextClusterForwardId();
  }
  
  public static boolean OooO0Oo(View paramView)
  {
    return paramView.hasExplicitFocusable();
  }
  
  public static boolean OooO0o(View paramView)
  {
    return paramView.isImportantForAutofill();
  }
  
  public static boolean OooO0o0(View paramView)
  {
    return paramView.isFocusedByDefault();
  }
  
  public static boolean OooO0oO(View paramView)
  {
    return paramView.isKeyboardNavigationCluster();
  }
  
  public static View OooO0oo(View paramView1, View paramView2, int paramInt)
  {
    return paramView1.keyboardNavigationClusterSearch(paramView2, paramInt);
  }
  
  public static void OooOO0(View paramView, String... paramVarArgs)
  {
    paramView.setAutofillHints(paramVarArgs);
  }
  
  public static void OooOO0O(View paramView, boolean paramBoolean)
  {
    paramView.setFocusedByDefault(paramBoolean);
  }
  
  public static void OooOO0o(View paramView, int paramInt)
  {
    paramView.setImportantForAutofill(paramInt);
  }
  
  public static void OooOOO(View paramView, int paramInt)
  {
    paramView.setNextClusterForwardId(paramInt);
  }
  
  public static void OooOOO0(View paramView, boolean paramBoolean)
  {
    paramView.setKeyboardNavigationCluster(paramBoolean);
  }
  
  public static void OooOOOO(View paramView, CharSequence paramCharSequence)
  {
    paramView.setTooltipText(paramCharSequence);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api26Impl
 * JD-Core Version:    0.7.0.1
 */