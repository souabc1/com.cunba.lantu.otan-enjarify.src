package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class KeyTrigger
  extends Key
{
  public int OooO;
  public int OooO0oO = -1;
  public String OooO0oo = null;
  public String OooOO0;
  public String OooOO0O;
  public int OooOO0o;
  public View OooOOO;
  public int OooOOO0;
  public float OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public float OooOOoo;
  public int OooOo;
  public boolean OooOo0;
  public float OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  public RectF OooOoO;
  public RectF OooOoO0;
  public HashMap OooOoOO;
  
  public KeyTrigger()
  {
    int i = Key.OooO0o;
    this.OooO = i;
    this.OooOO0 = null;
    this.OooOO0O = null;
    this.OooOO0o = i;
    this.OooOOO0 = i;
    this.OooOOO = null;
    this.OooOOOO = 0.1F;
    boolean bool = true;
    this.OooOOOo = bool;
    this.OooOOo0 = bool;
    this.OooOOo = bool;
    this.OooOOoo = (0.0F / 0.0F);
    this.OooOo0 = false;
    this.OooOo0O = i;
    this.OooOo0o = i;
    this.OooOo = i;
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.OooOoO0 = ((RectF)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.OooOoO = ((RectF)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooOoOO = ((HashMap)localObject);
    this.OooO0Oo = 5;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0o0 = ((HashMap)localObject);
  }
  
  public void OooO00o(HashMap paramHashMap) {}
  
  public Key OooO0O0()
  {
    KeyTrigger localKeyTrigger = new androidx/constraintlayout/motion/widget/KeyTrigger;
    localKeyTrigger.<init>();
    return localKeyTrigger.OooO0OO(this);
  }
  
  public Key OooO0OO(Key paramKey)
  {
    super.OooO0OO(paramKey);
    paramKey = (KeyTrigger)paramKey;
    int i = paramKey.OooO0oO;
    this.OooO0oO = i;
    Object localObject = paramKey.OooO0oo;
    this.OooO0oo = ((String)localObject);
    i = paramKey.OooO;
    this.OooO = i;
    localObject = paramKey.OooOO0;
    this.OooOO0 = ((String)localObject);
    localObject = paramKey.OooOO0O;
    this.OooOO0O = ((String)localObject);
    i = paramKey.OooOO0o;
    this.OooOO0o = i;
    i = paramKey.OooOOO0;
    this.OooOOO0 = i;
    localObject = paramKey.OooOOO;
    this.OooOOO = ((View)localObject);
    float f = paramKey.OooOOOO;
    this.OooOOOO = f;
    boolean bool = paramKey.OooOOOo;
    this.OooOOOo = bool;
    bool = paramKey.OooOOo0;
    this.OooOOo0 = bool;
    bool = paramKey.OooOOo;
    this.OooOOo = bool;
    f = paramKey.OooOOoo;
    this.OooOOoo = f;
    f = paramKey.OooOo00;
    this.OooOo00 = f;
    bool = paramKey.OooOo0;
    this.OooOo0 = bool;
    localObject = paramKey.OooOoO0;
    this.OooOoO0 = ((RectF)localObject);
    localObject = paramKey.OooOoO;
    this.OooOoO = ((RectF)localObject);
    paramKey = paramKey.OooOoOO;
    this.OooOoOO = paramKey;
    return this;
  }
  
  public void OooO0Oo(HashSet paramHashSet) {}
  
  public void OooO0o0(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.KeyTrigger;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    KeyTrigger.Loader.OooO00o(this, paramAttributeSet, paramContext);
  }
  
  public final void OooOo(String paramString, View paramView)
  {
    if (paramString == null) {
      return;
    }
    Object localObject1 = ".";
    boolean bool = paramString.startsWith((String)localObject1);
    if (bool)
    {
      OooOoO0(paramString, paramView);
      return;
    }
    localObject1 = this.OooOoOO;
    bool = ((HashMap)localObject1).containsKey(paramString);
    if (bool)
    {
      localObject1 = (Method)this.OooOoOO.get(paramString);
      if (localObject1 != null) {}
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    String str1 = " ";
    String str2 = "\"on class ";
    if (localObject1 == null) {
      try
      {
        localObject1 = paramView.getClass();
        Object localObject2 = new Class[0];
        localObject1 = ((Class)localObject1).getMethod(paramString, (Class[])localObject2);
        localObject2 = this.OooOoOO;
        ((HashMap)localObject2).put(paramString, localObject1);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        this.OooOoOO.put(paramString, null);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Could not find method \"");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(str2);
        paramString = paramView.getClass().getSimpleName();
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(str1);
        paramString = Debug.OooO0O0(paramView);
        ((StringBuilder)localObject1).append(paramString);
        return;
      }
    }
    try
    {
      paramString = new Object[0];
      ((Method)localObject1).invoke(paramView, paramString);
    }
    catch (Exception localException)
    {
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramString.append("Exception in call \"");
      localObject1 = this.OooO0oo;
      paramString.append((String)localObject1);
      paramString.append(str2);
      localObject1 = paramView.getClass().getSimpleName();
      paramString.append((String)localObject1);
      paramString.append(str1);
      paramView = Debug.OooO0O0(paramView);
      paramString.append(paramView);
    }
  }
  
  public void OooOo0o(float paramFloat, View paramView)
  {
    int i = this.OooOOO0;
    int k = Key.OooO0o;
    boolean bool3 = true;
    float f1 = 1.4E-45F;
    Object localObject1;
    Object localObject2;
    boolean bool2;
    boolean bool1;
    float f2;
    float f3;
    if (i != k)
    {
      localObject1 = this.OooOOO;
      if (localObject1 == null)
      {
        localObject1 = (ViewGroup)paramView.getParent();
        k = this.OooOOO0;
        localObject1 = ((View)localObject1).findViewById(k);
        this.OooOOO = ((View)localObject1);
      }
      localObject1 = this.OooOoO0;
      localObject2 = this.OooOOO;
      bool4 = this.OooOo0;
      OooOoO((RectF)localObject1, (View)localObject2, bool4);
      localObject1 = this.OooOoO;
      bool2 = this.OooOo0;
      OooOoO((RectF)localObject1, paramView, bool2);
      localObject1 = this.OooOoO0;
      localObject2 = this.OooOoO;
      bool1 = ((RectF)localObject1).intersect((RectF)localObject2);
      if (bool1)
      {
        bool1 = this.OooOOOo;
        if (bool1)
        {
          this.OooOOOo = false;
          bool1 = bool3;
          f2 = f1;
        }
        else
        {
          bool1 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        bool2 = this.OooOOo;
        if (bool2)
        {
          this.OooOOo = false;
          bool2 = bool3;
          f3 = f1;
        }
        else
        {
          bool2 = false;
          localObject2 = null;
          f3 = 0.0F;
        }
        this.OooOOo0 = bool3;
        bool4 = bool2;
        f4 = f3;
        bool2 = false;
        localObject2 = null;
        f3 = 0.0F;
        break label704;
      }
      bool1 = this.OooOOOo;
      if (!bool1)
      {
        this.OooOOOo = bool3;
        bool1 = bool3;
        f2 = f1;
      }
      else
      {
        bool1 = false;
        localObject1 = null;
        f2 = 0.0F;
      }
      bool2 = this.OooOOo0;
      if (bool2)
      {
        this.OooOOo0 = false;
        bool2 = bool3;
        f3 = f1;
      }
      else
      {
        bool2 = false;
        localObject2 = null;
        f3 = 0.0F;
      }
      this.OooOOo = bool3;
    }
    else
    {
      bool1 = this.OooOOOo;
      bool2 = false;
      f3 = 0.0F;
      localObject2 = null;
      if (bool1)
      {
        f2 = this.OooOOoo;
        f4 = paramFloat - f2;
        f5 = this.OooOo00 - f2;
        f4 *= f5;
        bool1 = f4 < 0.0F;
        if (bool1)
        {
          this.OooOOOo = false;
          bool1 = bool3;
          f2 = f1;
          break label424;
        }
      }
      else
      {
        f2 = this.OooOOoo;
        f2 = Math.abs(paramFloat - f2);
        f4 = this.OooOOOO;
        bool1 = f2 < f4;
        if (bool1) {
          this.OooOOOo = bool3;
        }
      }
      bool1 = false;
      localObject1 = null;
      f2 = 0.0F;
      label424:
      bool4 = this.OooOOo0;
      float f6;
      if (bool4)
      {
        f4 = this.OooOOoo;
        f5 = paramFloat - f4;
        f6 = (this.OooOo00 - f4) * f5;
        bool4 = f6 < 0.0F;
        if (bool4)
        {
          bool4 = f5 < 0.0F;
          if (bool4)
          {
            this.OooOOo0 = false;
            bool4 = bool3;
            f4 = f1;
            break label542;
          }
        }
      }
      else
      {
        f4 = this.OooOOoo;
        f4 = Math.abs(paramFloat - f4);
        f5 = this.OooOOOO;
        bool4 = f4 < f5;
        if (bool4) {
          this.OooOOo0 = bool3;
        }
      }
      bool4 = false;
      f4 = 0.0F;
      label542:
      boolean bool5 = this.OooOOo;
      if (bool5)
      {
        f5 = this.OooOOoo;
        f6 = paramFloat - f5;
        float f7 = (this.OooOo00 - f5) * f6;
        bool5 = f7 < 0.0F;
        if (bool5)
        {
          bool2 = f6 < 0.0F;
          if (bool2)
          {
            this.OooOOo = false;
            bool2 = bool3;
            f3 = f1;
            break label624;
          }
        }
        bool2 = false;
        localObject2 = null;
        f3 = 0.0F;
        label624:
        boolean bool6 = bool4;
        float f8 = f4;
        bool4 = bool2;
        f4 = f3;
        bool2 = bool6;
        f3 = f8;
        break label704;
      }
      f3 = this.OooOOoo;
      f3 = Math.abs(paramFloat - f3);
      float f5 = this.OooOOOO;
      bool2 = f3 < f5;
      if (bool2) {
        this.OooOOo = bool3;
      }
      bool2 = bool4;
      f3 = f4;
    }
    boolean bool4 = false;
    float f4 = 0.0F;
    label704:
    this.OooOo00 = paramFloat;
    Object localObject3;
    if ((bool2) || (bool1) || (bool4))
    {
      localObject3 = (MotionLayout)paramView.getParent();
      int i2 = this.OooOO0o;
      ((MotionLayout)localObject3).Oooo0o(i2, bool4, paramFloat);
    }
    int i3 = this.OooO;
    int i1 = Key.OooO0o;
    Object localObject4;
    if (i3 == i1)
    {
      localObject4 = paramView;
    }
    else
    {
      localObject4 = (MotionLayout)paramView.getParent();
      i1 = this.OooO;
      localObject4 = ((View)localObject4).findViewById(i1);
    }
    int m;
    if (bool2)
    {
      localObject2 = this.OooOO0;
      if (localObject2 != null) {
        OooOo((String)localObject2, (View)localObject4);
      }
      m = this.OooOo0O;
      i1 = Key.OooO0o;
      if (m != i1)
      {
        localObject2 = (MotionLayout)paramView.getParent();
        i1 = this.OooOo0O;
        View[] arrayOfView = new View[bool3];
        arrayOfView[0] = localObject4;
        ((MotionLayout)localObject2).OoooooO(i1, arrayOfView);
      }
    }
    if (bool4)
    {
      localObject2 = this.OooOO0O;
      if (localObject2 != null) {
        OooOo((String)localObject2, (View)localObject4);
      }
      m = this.OooOo0o;
      int n = Key.OooO0o;
      if (m != n)
      {
        localObject2 = (MotionLayout)paramView.getParent();
        n = this.OooOo0o;
        localObject3 = new View[bool3];
        localObject3[0] = localObject4;
        ((MotionLayout)localObject2).OoooooO(n, (View[])localObject3);
      }
    }
    if (bool1)
    {
      localObject1 = this.OooO0oo;
      if (localObject1 != null) {
        OooOo((String)localObject1, (View)localObject4);
      }
      int j = this.OooOo;
      m = Key.OooO0o;
      if (j != m)
      {
        paramView = (MotionLayout)paramView.getParent();
        j = this.OooOo;
        localObject2 = new View[bool3];
        localObject2[0] = localObject4;
        paramView.OoooooO(j, (View[])localObject2);
      }
    }
  }
  
  public final void OooOoO(RectF paramRectF, View paramView, boolean paramBoolean)
  {
    float f = paramView.getTop();
    paramRectF.top = f;
    f = paramView.getBottom();
    paramRectF.bottom = f;
    f = paramView.getLeft();
    paramRectF.left = f;
    int i = paramView.getRight();
    f = i;
    paramRectF.right = f;
    if (paramBoolean)
    {
      paramView = paramView.getMatrix();
      paramView.mapRect(paramRectF);
    }
  }
  
  public final void OooOoO0(String paramString, View paramView)
  {
    int i = paramString.length();
    int j = 1;
    if (i == j) {
      i = j;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      paramString = paramString.substring(j);
      localObject1 = Locale.ROOT;
      paramString = paramString.toLowerCase((Locale)localObject1);
    }
    Object localObject1 = this.OooO0o0.keySet().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      Object localObject2 = (String)((Iterator)localObject1).next();
      Object localObject3 = Locale.ROOT;
      localObject3 = ((String)localObject2).toLowerCase((Locale)localObject3);
      if (i == 0)
      {
        boolean bool2 = ((String)localObject3).matches(paramString);
        if (!bool2) {}
      }
      else
      {
        localObject3 = this.OooO0o0;
        localObject2 = (ConstraintAttribute)((HashMap)localObject3).get(localObject2);
        if (localObject2 != null) {
          ((ConstraintAttribute)localObject2).OooO00o(paramView);
        }
      }
    }
  }
  
  public int getCurveFit()
  {
    return this.OooO0oO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTrigger
 * JD-Core Version:    0.7.0.1
 */