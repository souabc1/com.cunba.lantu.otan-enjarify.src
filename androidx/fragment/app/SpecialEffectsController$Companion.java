package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R.id;
import kotlin.jvm.internal.Intrinsics;

public final class SpecialEffectsController$Companion
{
  public final SpecialEffectsController OooO00o(ViewGroup paramViewGroup, FragmentManager paramFragmentManager)
  {
    Intrinsics.OooO0o(paramViewGroup, "container");
    Intrinsics.OooO0o(paramFragmentManager, "fragmentManager");
    paramFragmentManager = paramFragmentManager.getSpecialEffectsControllerFactory();
    Intrinsics.OooO0o0(paramFragmentManager, "fragmentManager.specialEffectsControllerFactory");
    return OooO0O0(paramViewGroup, paramFragmentManager);
  }
  
  public final SpecialEffectsController OooO0O0(ViewGroup paramViewGroup, SpecialEffectsControllerFactory paramSpecialEffectsControllerFactory)
  {
    Intrinsics.OooO0o(paramViewGroup, "container");
    Intrinsics.OooO0o(paramSpecialEffectsControllerFactory, "factory");
    int i = R.id.special_effects_controller_view_tag;
    Object localObject = paramViewGroup.getTag(i);
    boolean bool = localObject instanceof SpecialEffectsController;
    if (bool) {
      return (SpecialEffectsController)localObject;
    }
    paramSpecialEffectsControllerFactory = paramSpecialEffectsControllerFactory.OooO00o(paramViewGroup);
    Intrinsics.OooO0o0(paramSpecialEffectsControllerFactory, "factory.createController(container)");
    i = R.id.special_effects_controller_view_tag;
    paramViewGroup.setTag(i, paramSpecialEffectsControllerFactory);
    return paramSpecialEffectsControllerFactory;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Companion
 * JD-Core Version:    0.7.0.1
 */