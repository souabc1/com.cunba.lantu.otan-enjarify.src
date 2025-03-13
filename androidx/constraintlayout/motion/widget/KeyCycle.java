package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintAttribute.AttributeType;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KeyCycle
  extends Key
{
  public int OooO;
  public String OooO0oO = null;
  public int OooO0oo = 0;
  public String OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public int OooOOOO;
  public float OooOOOo;
  public float OooOOo;
  public float OooOOo0;
  public float OooOOoo;
  public float OooOo;
  public float OooOo0;
  public float OooOo00;
  public float OooOo0O;
  public float OooOo0o;
  public float OooOoO;
  public float OooOoO0;
  
  public KeyCycle()
  {
    int i = -1;
    this.OooO = i;
    this.OooOO0 = null;
    float f = 0.0F / 0.0F;
    this.OooOO0O = f;
    this.OooOO0o = 0.0F;
    this.OooOOO0 = 0.0F;
    this.OooOOO = f;
    this.OooOOOO = i;
    this.OooOOOo = f;
    this.OooOOo0 = f;
    this.OooOOo = f;
    this.OooOOoo = f;
    this.OooOo00 = f;
    this.OooOo0 = f;
    this.OooOo0O = f;
    this.OooOo0o = f;
    this.OooOo = f;
    this.OooOoO0 = f;
    this.OooOoO = f;
    this.OooO0Oo = 4;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o0 = localHashMap;
  }
  
  public void OooO00o(HashMap paramHashMap)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("add ");
    int i = paramHashMap.size();
    ((StringBuilder)localObject1).append(i);
    ((StringBuilder)localObject1).append(" values");
    localObject1 = ((StringBuilder)localObject1).toString();
    String str1 = "KeyCycle";
    int k = 2;
    Debug.OooO0o0(str1, (String)localObject1, k);
    localObject1 = paramHashMap.keySet().iterator();
    Object localObject2;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      str1 = (String)((Iterator)localObject1).next();
      localObject2 = (SplineSet)paramHashMap.get(str1);
      if (localObject2 != null)
      {
        str1.hashCode();
        int m = str1.hashCode();
        int n = -1;
        String str2;
        boolean bool2;
        switch (m)
        {
        default: 
          break;
        case 1530034690: 
          str2 = "wavePhase";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 13;
          }
          break;
        case 156108012: 
          str2 = "waveOffset";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 12;
          }
          break;
        case 92909918: 
          str2 = "alpha";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 11;
          }
          break;
        case 37232917: 
          str2 = "transitionPathRotate";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 10;
          }
          break;
        case -4379043: 
          str2 = "elevation";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 9;
          }
          break;
        case -40300674: 
          str2 = "rotation";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 8;
          }
          break;
        case -908189617: 
          str2 = "scaleY";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 7;
          }
          break;
        case -908189618: 
          str2 = "scaleX";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 6;
          }
          break;
        case -1001078227: 
          str2 = "progress";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 5;
          }
          break;
        case -1225497655: 
          str2 = "translationZ";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 4;
          }
          break;
        case -1225497656: 
          str2 = "translationY";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 3;
          }
          break;
        case -1225497657: 
          str2 = "translationX";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = k;
          }
          break;
        case -1249320805: 
          str2 = "rotationY";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 1;
          }
          break;
        case -1249320806: 
          str2 = "rotationX";
          bool2 = str1.equals(str2);
          if (bool2) {
            n = 0;
          }
          break;
        }
        switch (n)
        {
        default: 
          localObject2 = "CUSTOM";
          boolean bool3 = str1.startsWith((String)localObject2);
          if (!bool3)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            str2 = "  UNKNOWN  ";
            ((StringBuilder)localObject2).append(str2);
            ((StringBuilder)localObject2).append(str1);
          }
          break;
        }
      }
    }
    int j = this.OooO00o;
    float f = this.OooOOO0;
    break label794;
    j = this.OooO00o;
    f = this.OooOO0o;
    break label794;
    j = this.OooO00o;
    f = this.OooOOOo;
    for (;;)
    {
      label794:
      ((SplineSet)localObject2).setPoint(j, f);
      break;
      j = this.OooO00o;
      f = this.OooOOoo;
      continue;
      j = this.OooO00o;
      f = this.OooOOo0;
      continue;
      j = this.OooO00o;
      f = this.OooOOo;
      continue;
      j = this.OooO00o;
      f = this.OooOo0o;
      continue;
      j = this.OooO00o;
      f = this.OooOo0O;
      continue;
      j = this.OooO00o;
      f = this.OooOOO;
      continue;
      j = this.OooO00o;
      f = this.OooOoO;
      continue;
      j = this.OooO00o;
      f = this.OooOoO0;
      continue;
      j = this.OooO00o;
      f = this.OooOo;
      continue;
      j = this.OooO00o;
      f = this.OooOo0;
      continue;
      j = this.OooO00o;
      f = this.OooOo00;
    }
  }
  
  public Key OooO0O0()
  {
    KeyCycle localKeyCycle = new androidx/constraintlayout/motion/widget/KeyCycle;
    localKeyCycle.<init>();
    return localKeyCycle.OooO0OO(this);
  }
  
  public Key OooO0OO(Key paramKey)
  {
    super.OooO0OO(paramKey);
    paramKey = (KeyCycle)paramKey;
    String str = paramKey.OooO0oO;
    this.OooO0oO = str;
    int i = paramKey.OooO0oo;
    this.OooO0oo = i;
    i = paramKey.OooO;
    this.OooO = i;
    str = paramKey.OooOO0;
    this.OooOO0 = str;
    float f1 = paramKey.OooOO0O;
    this.OooOO0O = f1;
    f1 = paramKey.OooOO0o;
    this.OooOO0o = f1;
    f1 = paramKey.OooOOO0;
    this.OooOOO0 = f1;
    f1 = paramKey.OooOOO;
    this.OooOOO = f1;
    i = paramKey.OooOOOO;
    this.OooOOOO = i;
    f1 = paramKey.OooOOOo;
    this.OooOOOo = f1;
    f1 = paramKey.OooOOo0;
    this.OooOOo0 = f1;
    f1 = paramKey.OooOOo;
    this.OooOOo = f1;
    f1 = paramKey.OooOOoo;
    this.OooOOoo = f1;
    f1 = paramKey.OooOo00;
    this.OooOo00 = f1;
    f1 = paramKey.OooOo0;
    this.OooOo0 = f1;
    f1 = paramKey.OooOo0O;
    this.OooOo0O = f1;
    f1 = paramKey.OooOo0o;
    this.OooOo0o = f1;
    f1 = paramKey.OooOo;
    this.OooOo = f1;
    f1 = paramKey.OooOoO0;
    this.OooOoO0 = f1;
    float f2 = paramKey.OooOoO;
    this.OooOoO = f2;
    return this;
  }
  
  public void OooO0Oo(HashSet paramHashSet)
  {
    float f = this.OooOOOo;
    boolean bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "alpha";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "elevation";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotation";
      paramHashSet.add(localObject);
    }
    f = this.OooOo00;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0O;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleX";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0o;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleY";
      paramHashSet.add(localObject);
    }
    f = this.OooOOoo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "transitionPathRotate";
      paramHashSet.add(localObject);
    }
    f = this.OooOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOoO0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOoO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationZ";
      paramHashSet.add(localObject);
    }
    Object localObject = this.OooO0o0;
    int i = ((HashMap)localObject).size();
    if (i > 0)
    {
      localObject = this.OooO0o0.keySet().iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        String str1 = (String)((Iterator)localObject).next();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = "CUSTOM,";
        localStringBuilder.append(str2);
        localStringBuilder.append(str1);
        str1 = localStringBuilder.toString();
        paramHashSet.add(str1);
      }
    }
  }
  
  public void OooO0o0(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.KeyCycle;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    KeyCycle.Loader.OooO00o(this, paramContext);
  }
  
  public void OoooOOO(HashMap paramHashMap)
  {
    KeyCycle localKeyCycle = this;
    HashMap localHashMap = paramHashMap;
    Iterator localIterator = paramHashMap.keySet().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = (String)localIterator.next();
      Object localObject2 = "CUSTOM";
      boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
      Object localObject3;
      int m;
      if (bool2)
      {
        int j = 7;
        localObject2 = ((String)localObject1).substring(j);
        localObject3 = localKeyCycle.OooO0o0;
        localObject2 = ((HashMap)localObject3).get(localObject2);
        Object localObject4 = localObject2;
        localObject4 = (ConstraintAttribute)localObject2;
        if (localObject4 != null)
        {
          localObject2 = ((ConstraintAttribute)localObject4).getType();
          localObject3 = ConstraintAttribute.AttributeType.o00Ooo00;
          if (localObject2 == localObject3)
          {
            localObject1 = localHashMap.get(localObject1);
            localObject3 = localObject1;
            localObject3 = (ViewOscillator)localObject1;
            if (localObject3 != null)
            {
              m = localKeyCycle.OooO00o;
              int n = localKeyCycle.OooO;
              String str = localKeyCycle.OooOO0;
              int i1 = localKeyCycle.OooOOOO;
              float f1 = localKeyCycle.OooOO0O;
              float f2 = localKeyCycle.OooOO0o;
              float f3 = localKeyCycle.OooOOO0;
              float f4 = ((ConstraintAttribute)localObject4).getValueToInterpolate();
              ((KeyCycleOscillator)localObject3).OooO0Oo(m, n, str, i1, f1, f2, f3, f4, localObject4);
            }
          }
        }
      }
      else
      {
        float f5 = localKeyCycle.OoooOOo((String)localObject1);
        boolean bool3 = Float.isNaN(f5);
        if (!bool3)
        {
          localObject1 = localHashMap.get(localObject1);
          Object localObject5 = localObject1;
          localObject5 = (ViewOscillator)localObject1;
          if (localObject5 != null)
          {
            int i = localKeyCycle.OooO00o;
            int k = localKeyCycle.OooO;
            localObject3 = localKeyCycle.OooOO0;
            m = localKeyCycle.OooOOOO;
            float f6 = localKeyCycle.OooOO0O;
            float f7 = localKeyCycle.OooOO0o;
            float f8 = localKeyCycle.OooOOO0;
            ((KeyCycleOscillator)localObject5).OooO0OO(i, k, (String)localObject3, m, f6, f7, f8, f5);
          }
        }
      }
    }
  }
  
  public float OoooOOo(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    Object localObject;
    boolean bool;
    String str;
    switch (i)
    {
    default: 
      break;
    case 1530034690: 
      localObject = "wavePhase";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 13;
      }
      break;
    case 156108012: 
      localObject = "waveOffset";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 12;
      }
      break;
    case 92909918: 
      localObject = "alpha";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 11;
      }
      break;
    case 37232917: 
      localObject = "transitionPathRotate";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 10;
      }
      break;
    case -4379043: 
      localObject = "elevation";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 9;
      }
      break;
    case -40300674: 
      localObject = "rotation";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 8;
      }
      break;
    case -908189617: 
      localObject = "scaleY";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 7;
      }
      break;
    case -908189618: 
      localObject = "scaleX";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 6;
      }
      break;
    case -1001078227: 
      localObject = "progress";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 5;
      }
      break;
    case -1225497655: 
      localObject = "translationZ";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 4;
      }
      break;
    case -1225497656: 
      localObject = "translationY";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 3;
      }
      break;
    case -1225497657: 
      localObject = "translationX";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 2;
      }
      break;
    case -1249320805: 
      localObject = "rotationY";
      bool = paramString.equals(localObject);
      if (bool) {
        j = 1;
      }
      break;
    case -1249320806: 
      localObject = "rotationX";
      bool = paramString.equals(localObject);
      if (bool)
      {
        j = 0;
        str = null;
      }
      break;
    }
    switch (j)
    {
    default: 
      localObject = "CUSTOM";
      bool = paramString.startsWith((String)localObject);
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "  UNKNOWN  ";
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramString);
      }
      return 0.0F / 0.0F;
    case 13: 
      return this.OooOOO0;
    case 12: 
      return this.OooOO0o;
    case 11: 
      return this.OooOOOo;
    case 10: 
      return this.OooOOoo;
    case 9: 
      return this.OooOOo0;
    case 8: 
      return this.OooOOo;
    case 7: 
      return this.OooOo0o;
    case 6: 
      return this.OooOo0O;
    case 5: 
      return this.OooOOO;
    case 4: 
      return this.OooOoO;
    case 3: 
      return this.OooOoO0;
    case 2: 
      return this.OooOo;
    case 1: 
      return this.OooOo0;
    }
    return this.OooOo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyCycle
 * JD-Core Version:    0.7.0.1
 */