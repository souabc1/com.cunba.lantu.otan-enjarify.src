package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KeyTimeCycle
  extends Key
{
  public float OooO;
  public String OooO0oO;
  public int OooO0oo = -1;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public float OooOOOO;
  public float OooOOOo;
  public float OooOOo;
  public float OooOOo0;
  public float OooOOoo;
  public float OooOo;
  public int OooOo0;
  public float OooOo00;
  public String OooOo0O;
  public float OooOo0o;
  
  public KeyTimeCycle()
  {
    float f = 0.0F / 0.0F;
    this.OooO = f;
    this.OooOO0 = f;
    this.OooOO0O = f;
    this.OooOO0o = f;
    this.OooOOO0 = f;
    this.OooOOO = f;
    this.OooOOOO = f;
    this.OooOOOo = f;
    this.OooOOo0 = f;
    this.OooOOo = f;
    this.OooOOoo = f;
    this.OooOo00 = f;
    this.OooOo0 = 0;
    this.OooOo0O = null;
    this.OooOo0o = f;
    this.OooOo = 0.0F;
    this.OooO0Oo = 3;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o0 = localHashMap;
  }
  
  public void OooO00o(HashMap paramHashMap)
  {
    paramHashMap = new java/lang/IllegalArgumentException;
    paramHashMap.<init>(" KeyTimeCycles do not support SplineSet");
    throw paramHashMap;
  }
  
  public Key OooO0O0()
  {
    KeyTimeCycle localKeyTimeCycle = new androidx/constraintlayout/motion/widget/KeyTimeCycle;
    localKeyTimeCycle.<init>();
    return localKeyTimeCycle.OooO0OO(this);
  }
  
  public Key OooO0OO(Key paramKey)
  {
    super.OooO0OO(paramKey);
    paramKey = (KeyTimeCycle)paramKey;
    String str = paramKey.OooO0oO;
    this.OooO0oO = str;
    int i = paramKey.OooO0oo;
    this.OooO0oo = i;
    i = paramKey.OooOo0;
    this.OooOo0 = i;
    float f1 = paramKey.OooOo0o;
    this.OooOo0o = f1;
    f1 = paramKey.OooOo;
    this.OooOo = f1;
    f1 = paramKey.OooOo00;
    this.OooOo00 = f1;
    f1 = paramKey.OooO;
    this.OooO = f1;
    f1 = paramKey.OooOO0;
    this.OooOO0 = f1;
    f1 = paramKey.OooOO0O;
    this.OooOO0O = f1;
    f1 = paramKey.OooOOO;
    this.OooOOO = f1;
    f1 = paramKey.OooOO0o;
    this.OooOO0o = f1;
    f1 = paramKey.OooOOO0;
    this.OooOOO0 = f1;
    f1 = paramKey.OooOOOO;
    this.OooOOOO = f1;
    f1 = paramKey.OooOOOo;
    this.OooOOOo = f1;
    f1 = paramKey.OooOOo0;
    this.OooOOo0 = f1;
    f1 = paramKey.OooOOo;
    this.OooOOo = f1;
    float f2 = paramKey.OooOOoo;
    this.OooOOoo = f2;
    return this;
  }
  
  public void OooO0Oo(HashSet paramHashSet)
  {
    float f = this.OooO;
    boolean bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "alpha";
      paramHashSet.add(localObject);
    }
    f = this.OooOO0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "elevation";
      paramHashSet.add(localObject);
    }
    f = this.OooOO0O;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotation";
      paramHashSet.add(localObject);
    }
    f = this.OooOO0o;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOO0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOOoo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationZ";
      paramHashSet.add(localObject);
    }
    f = this.OooOOO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "transitionPathRotate";
      paramHashSet.add(localObject);
    }
    f = this.OooOOOO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleY";
      paramHashSet.add(localObject);
    }
    f = this.OooOo00;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "progress";
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
    int[] arrayOfInt = R.styleable.KeyTimeCycle;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    KeyTimeCycle.Loader.OooO00o(this, paramContext);
  }
  
  public void OoooO0O(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    boolean bool1;
    Object localObject3;
    float f4;
    do
    {
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        Object localObject1 = (String)localIterator.next();
        Object localObject2 = paramHashMap.get(localObject1);
        localObject3 = localObject2;
        localObject3 = (ViewTimeCycle)localObject2;
        if (localObject3 != null)
        {
          localObject2 = "CUSTOM";
          boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
          j = 7;
          Object localObject5;
          int k;
          if (bool2)
          {
            localObject1 = ((String)localObject1).substring(j);
            localObject2 = this.OooO0o0;
            localObject1 = ((HashMap)localObject2).get(localObject1);
            Object localObject4 = localObject1;
            localObject4 = (ConstraintAttribute)localObject1;
            if (localObject4 != null)
            {
              localObject5 = localObject3;
              localObject5 = (ViewTimeCycle.CustomSet)localObject3;
              k = this.OooO00o;
              float f1 = this.OooOo0o;
              int m = this.OooOo0;
              float f2 = this.OooOo;
              ((ViewTimeCycle.CustomSet)localObject5).OooO0oO(k, (ConstraintAttribute)localObject4, f1, m, f2);
            }
          }
          else
          {
            int i = ((String)localObject1).hashCode();
            k = -1;
            f3 = 0.0F / 0.0F;
            switch (i)
            {
            }
            boolean bool3;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          for (;;)
                          {
                            j = k;
                            break;
                            localObject2 = "alpha";
                            bool3 = ((String)localObject1).equals(localObject2);
                            if (bool3)
                            {
                              j = 11;
                              break;
                              localObject2 = "transitionPathRotate";
                              bool3 = ((String)localObject1).equals(localObject2);
                              if (bool3)
                              {
                                j = 10;
                                break;
                                localObject2 = "elevation";
                                bool3 = ((String)localObject1).equals(localObject2);
                                if (bool3)
                                {
                                  j = 9;
                                  break;
                                  localObject2 = "rotation";
                                  bool3 = ((String)localObject1).equals(localObject2);
                                  if (bool3)
                                  {
                                    j = 8;
                                    break;
                                    localObject2 = "scaleY";
                                    bool3 = ((String)localObject1).equals(localObject2);
                                    if (bool3) {
                                      break;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          localObject2 = "scaleX";
                          bool3 = ((String)localObject1).equals(localObject2);
                        } while (!bool3);
                        j = 6;
                        break;
                        localObject2 = "progress";
                        bool3 = ((String)localObject1).equals(localObject2);
                      } while (!bool3);
                      j = 5;
                      break;
                      localObject2 = "translationZ";
                      bool3 = ((String)localObject1).equals(localObject2);
                    } while (!bool3);
                    j = 4;
                    break;
                    localObject2 = "translationY";
                    bool3 = ((String)localObject1).equals(localObject2);
                  } while (!bool3);
                  j = 3;
                  break;
                  localObject2 = "translationX";
                  bool3 = ((String)localObject1).equals(localObject2);
                } while (!bool3);
                j = 2;
                break;
                localObject2 = "rotationY";
                bool3 = ((String)localObject1).equals(localObject2);
              } while (!bool3);
              j = 1;
              break;
              localObject2 = "rotationX";
              bool3 = ((String)localObject1).equals(localObject2);
            } while (!bool3);
            j = 0;
            localObject5 = null;
            switch (j)
            {
            default: 
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = "UNKNOWN addValues \"";
              ((StringBuilder)localObject2).append((String)localObject3);
              ((StringBuilder)localObject2).append((String)localObject1);
              localObject1 = "\"";
              ((StringBuilder)localObject2).append((String)localObject1);
            }
          }
        }
      }
      f4 = this.OooO;
      bool1 = Float.isNaN(f4);
    } while (bool1);
    int j = this.OooO00o;
    float f3 = this.OooO;
    for (;;)
    {
      float f5 = this.OooOo0o;
      int n = this.OooOo0;
      float f6 = this.OooOo;
      ((TimeCycleSplineSet)localObject3).OooO0O0(j, f3, f5, n, f6);
      break;
      f4 = this.OooOOO;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOO;
      continue;
      f4 = this.OooOO0;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOO0;
      continue;
      f4 = this.OooOO0O;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOO0O;
      continue;
      f4 = this.OooOOOo;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOOo;
      continue;
      f4 = this.OooOOOO;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOOO;
      continue;
      f4 = this.OooOo00;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOo00;
      continue;
      f4 = this.OooOOoo;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOoo;
      continue;
      f4 = this.OooOOo;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOo;
      continue;
      f4 = this.OooOOo0;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOo0;
      continue;
      f4 = this.OooOOO0;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOOO0;
      continue;
      f4 = this.OooOO0o;
      bool1 = Float.isNaN(f4);
      if (bool1) {
        break;
      }
      j = this.OooO00o;
      f3 = this.OooOO0o;
    }
  }
  
  public void setInterpolation(HashMap paramHashMap)
  {
    int i = this.OooO0oo;
    int i9 = -1;
    if (i == i9) {
      return;
    }
    float f = this.OooO;
    boolean bool1 = Float.isNaN(f);
    String str1;
    if (!bool1)
    {
      int j = this.OooO0oo;
      localObject1 = Integer.valueOf(j);
      str1 = "alpha";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOO0;
    boolean bool2 = Float.isNaN(f);
    if (!bool2)
    {
      int k = this.OooO0oo;
      localObject1 = Integer.valueOf(k);
      str1 = "elevation";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOO0O;
    boolean bool3 = Float.isNaN(f);
    if (!bool3)
    {
      int m = this.OooO0oo;
      localObject1 = Integer.valueOf(m);
      str1 = "rotation";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOO0o;
    boolean bool4 = Float.isNaN(f);
    if (!bool4)
    {
      int n = this.OooO0oo;
      localObject1 = Integer.valueOf(n);
      str1 = "rotationX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOO0;
    boolean bool5 = Float.isNaN(f);
    if (!bool5)
    {
      int i1 = this.OooO0oo;
      localObject1 = Integer.valueOf(i1);
      str1 = "rotationY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOo0;
    boolean bool6 = Float.isNaN(f);
    if (!bool6)
    {
      int i2 = this.OooO0oo;
      localObject1 = Integer.valueOf(i2);
      str1 = "translationX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOo;
    boolean bool7 = Float.isNaN(f);
    if (!bool7)
    {
      int i3 = this.OooO0oo;
      localObject1 = Integer.valueOf(i3);
      str1 = "translationY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOoo;
    boolean bool8 = Float.isNaN(f);
    if (!bool8)
    {
      int i4 = this.OooO0oo;
      localObject1 = Integer.valueOf(i4);
      str1 = "translationZ";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOO;
    boolean bool9 = Float.isNaN(f);
    if (!bool9)
    {
      int i5 = this.OooO0oo;
      localObject1 = Integer.valueOf(i5);
      str1 = "transitionPathRotate";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOOO;
    boolean bool10 = Float.isNaN(f);
    if (!bool10)
    {
      int i6 = this.OooO0oo;
      localObject1 = Integer.valueOf(i6);
      str1 = "scaleX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOOO;
    boolean bool11 = Float.isNaN(f);
    if (!bool11)
    {
      int i7 = this.OooO0oo;
      localObject1 = Integer.valueOf(i7);
      str1 = "scaleY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOo00;
    boolean bool12 = Float.isNaN(f);
    if (!bool12)
    {
      i8 = this.OooO0oo;
      localObject1 = Integer.valueOf(i8);
      str1 = "progress";
      paramHashMap.put(str1, localObject1);
    }
    Object localObject1 = this.OooO0o0;
    int i8 = ((HashMap)localObject1).size();
    if (i8 > 0)
    {
      localObject1 = this.OooO0o0.keySet().iterator();
      for (;;)
      {
        boolean bool13 = ((Iterator)localObject1).hasNext();
        if (!bool13) {
          break;
        }
        str1 = (String)((Iterator)localObject1).next();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "CUSTOM,";
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append(str1);
        str1 = ((StringBuilder)localObject2).toString();
        int i10 = this.OooO0oo;
        localObject2 = Integer.valueOf(i10);
        paramHashMap.put(str1, localObject2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTimeCycle
 * JD-Core Version:    0.7.0.1
 */