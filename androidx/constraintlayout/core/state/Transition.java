package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

public class Transition
  implements TypedValues
{
  public float OooO;
  public HashMap OooO00o;
  public HashMap OooO0O0;
  public TypedBundle OooO0OO;
  public int OooO0Oo;
  public Easing OooO0o;
  public String OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  
  public Transition()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO00o = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0O0 = ((HashMap)localObject);
    localObject = new androidx/constraintlayout/core/motion/utils/TypedBundle;
    ((TypedBundle)localObject).<init>();
    this.OooO0OO = ((TypedBundle)localObject);
    this.OooO0Oo = 0;
    this.OooO0o0 = null;
    this.OooO0o = null;
    this.OooO0oO = 0;
    this.OooO0oo = 400;
    this.OooO = 0.0F;
  }
  
  public static Interpolator OooO0o0(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 6: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 5: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 4: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 3: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 2: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 1: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    case 0: 
      localObject = new androidx/constraintlayout/core/state/OooO0O0;
      ((OooO0O0)localObject).<init>();
      return localObject;
    }
    Object localObject = new androidx/constraintlayout/core/state/OooO00o;
    ((OooO00o)localObject).<init>(paramString);
    return localObject;
  }
  
  public boolean OooO00o(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean OooO0O0(int paramInt, float paramFloat)
  {
    int i = 706;
    if (paramInt == i) {
      this.OooO = paramFloat;
    }
    return false;
  }
  
  public boolean OooO0OO(int paramInt, String paramString)
  {
    int i = 705;
    if (paramInt == i)
    {
      this.OooO0o0 = paramString;
      Easing localEasing = Easing.OooO0OO(paramString);
      this.OooO0o = localEasing;
    }
    return false;
  }
  
  public boolean OooO0Oo(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public int getAutoTransition()
  {
    return this.OooO0oO;
  }
  
  public Interpolator getInterpolator()
  {
    int i = this.OooO0Oo;
    String str = this.OooO0o0;
    return OooO0o0(i, str);
  }
  
  public boolean isEmpty()
  {
    return this.OooO0O0.isEmpty();
  }
  
  public void setTransitionProperties(TypedBundle paramTypedBundle)
  {
    TypedBundle localTypedBundle = this.OooO0OO;
    paramTypedBundle.OooO0o0(localTypedBundle);
    paramTypedBundle.OooO0o(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.Transition
 * JD-Core Version:    0.7.0.1
 */