package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class SpecialEffectsController$Operation$State$Companion
{
  public final SpecialEffectsController.Operation.State OooO00o(View paramView)
  {
    String str = "<this>";
    Intrinsics.OooO0o(paramView, str);
    float f = paramView.getAlpha();
    boolean bool = f < 0.0F;
    if (!bool)
    {
      bool = true;
      f = 1.4E-45F;
    }
    else
    {
      bool = false;
      f = 0.0F;
      str = null;
    }
    if (bool)
    {
      int i = paramView.getVisibility();
      if (i == 0) {
        return SpecialEffectsController.Operation.State.o00Ooo0o;
      }
    }
    int j = paramView.getVisibility();
    paramView = OooO0O0(j);
    return paramView;
  }
  
  public final SpecialEffectsController.Operation.State OooO0O0(int paramInt)
  {
    Object localObject;
    if (paramInt != 0)
    {
      int i = 4;
      if (paramInt != i)
      {
        i = 8;
        if (paramInt == i)
        {
          localObject = SpecialEffectsController.Operation.State.o00Ooo0O;
        }
        else
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Unknown visibility ");
          localStringBuilder.append(paramInt);
          localObject = localStringBuilder.toString();
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
      else
      {
        localObject = SpecialEffectsController.Operation.State.o00Ooo0o;
      }
    }
    else
    {
      localObject = SpecialEffectsController.Operation.State.o00Ooo0;
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
 * JD-Core Version:    0.7.0.1
 */