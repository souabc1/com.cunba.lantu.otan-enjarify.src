package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public enum SpecialEffectsController$Operation$State
{
  public static final SpecialEffectsController.Operation.State.Companion o00OoOoo;
  
  static
  {
    Object localObject = new androidx/fragment/app/SpecialEffectsController$Operation$State;
    ((State)localObject).<init>("REMOVED", 0);
    o00Ooo00 = (State)localObject;
    localObject = new androidx/fragment/app/SpecialEffectsController$Operation$State;
    ((State)localObject).<init>("VISIBLE", 1);
    o00Ooo0 = (State)localObject;
    localObject = new androidx/fragment/app/SpecialEffectsController$Operation$State;
    ((State)localObject).<init>("GONE", 2);
    o00Ooo0O = (State)localObject;
    localObject = new androidx/fragment/app/SpecialEffectsController$Operation$State;
    ((State)localObject).<init>("INVISIBLE", 3);
    o00Ooo0o = (State)localObject;
    o00OooO0 = OooO0O0();
    localObject = new androidx/fragment/app/SpecialEffectsController$Operation$State$Companion;
    ((SpecialEffectsController.Operation.State.Companion)localObject).<init>(null);
    o00OoOoo = (SpecialEffectsController.Operation.State.Companion)localObject;
  }
  
  public static final State OooO0Oo(int paramInt)
  {
    return o00OoOoo.OooO0O0(paramInt);
  }
  
  public final void OooO0OO(View paramView)
  {
    Intrinsics.OooO0o(paramView, "view");
    Object localObject1 = SpecialEffectsController.Operation.State.WhenMappings.OooO00o;
    int i = ordinal();
    int j = localObject1[i];
    i = 1;
    int i1 = 2;
    Object localObject2;
    if (j != i)
    {
      localObject2 = "SpecialEffectsController: Setting view ";
      int m;
      if (j != i1)
      {
        int i2 = 3;
        if (j != i2)
        {
          i2 = 4;
          if (j != i2) {
            return;
          }
          bool2 = FragmentManager.isLoggingEnabled(i1);
          if (bool2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(paramView);
            localObject2 = " to INVISIBLE";
            ((StringBuilder)localObject1).append((String)localObject2);
          }
          paramView.setVisibility(i2);
          return;
        }
        boolean bool2 = FragmentManager.isLoggingEnabled(i1);
        if (bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(paramView);
          localObject2 = " to GONE";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        int k = 8;
      }
      else
      {
        m = FragmentManager.isLoggingEnabled(i1);
        if (m != 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(paramView);
          localObject2 = " to VISIBLE";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        m = 0;
        localObject1 = null;
      }
      paramView.setVisibility(m);
    }
    else
    {
      localObject1 = paramView.getParent();
      boolean bool1 = localObject1 instanceof ViewGroup;
      if (bool1)
      {
        localObject1 = (ViewGroup)localObject1;
      }
      else
      {
        int n = 0;
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        bool1 = FragmentManager.isLoggingEnabled(i1);
        if (bool1)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("SpecialEffectsController: Removing view ");
          ((StringBuilder)localObject2).append(paramView);
          String str = " from container ";
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append(localObject1);
        }
        ((ViewGroup)localObject1).removeView(paramView);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Operation.State
 * JD-Core Version:    0.7.0.1
 */