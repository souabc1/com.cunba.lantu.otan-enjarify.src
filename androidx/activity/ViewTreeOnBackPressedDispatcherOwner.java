package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

public final class ViewTreeOnBackPressedDispatcherOwner
{
  public static final OnBackPressedDispatcherOwner OooO00o(View paramView)
  {
    Intrinsics.OooO0o(paramView, "<this>");
    Object localObject = ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1.o00OoOoo;
    paramView = SequencesKt.OooO0o(paramView, (Function1)localObject);
    localObject = ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2.o00OoOoo;
    return (OnBackPressedDispatcherOwner)SequencesKt.OooOO0O(SequencesKt.OooOOO(paramView, (Function1)localObject));
  }
  
  public static final void OooO0O0(View paramView, OnBackPressedDispatcherOwner paramOnBackPressedDispatcherOwner)
  {
    Intrinsics.OooO0o(paramView, "<this>");
    Intrinsics.OooO0o(paramOnBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
    int i = R.id.view_tree_on_back_pressed_dispatcher_owner;
    paramView.setTag(i, paramOnBackPressedDispatcherOwner);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.ViewTreeOnBackPressedDispatcherOwner
 * JD-Core Version:    0.7.0.1
 */