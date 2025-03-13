package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KeyAttributes
  extends Key
{
  public boolean OooO = false;
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
  public float OooOo0;
  public float OooOo00;
  public float OooOo0O;
  public float OooOo0o;
  
  public KeyAttributes()
  {
    float f = 0.0F / 0.0F;
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
    this.OooOo0 = f;
    this.OooOo0O = f;
    this.OooOo0o = f;
    this.OooO0Oo = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0o0 = localHashMap;
  }
  
  public void OooO00o(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    boolean bool1;
    Object localObject2;
    float f1;
    do
    {
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        Object localObject1 = (String)localIterator.next();
        localObject2 = (SplineSet)paramHashMap.get(localObject1);
        if (localObject2 != null)
        {
          Object localObject3 = "CUSTOM";
          boolean bool15 = ((String)localObject1).startsWith((String)localObject3);
          int i11 = 7;
          int i10;
          if (bool15)
          {
            localObject1 = ((String)localObject1).substring(i11);
            localObject3 = this.OooO0o0;
            localObject1 = (ConstraintAttribute)((HashMap)localObject3).get(localObject1);
            if (localObject1 != null)
            {
              localObject2 = (ViewSpline.CustomSet)localObject2;
              i10 = this.OooO00o;
              ((ViewSpline.CustomSet)localObject2).setPoint(i10, (ConstraintAttribute)localObject1);
            }
          }
          else
          {
            i10 = ((String)localObject1).hashCode();
            int i12 = -1;
            switch (i10)
            {
            }
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
                            i11 = i12;
                            break;
                            localObject3 = "alpha";
                            bool1 = ((String)localObject1).equals(localObject3);
                            if (bool1)
                            {
                              i11 = 13;
                              break;
                              localObject3 = "transitionPathRotate";
                              bool1 = ((String)localObject1).equals(localObject3);
                              if (bool1)
                              {
                                i11 = 12;
                                break;
                                localObject3 = "elevation";
                                bool1 = ((String)localObject1).equals(localObject3);
                                if (bool1)
                                {
                                  i11 = 11;
                                  break;
                                  localObject3 = "rotation";
                                  bool1 = ((String)localObject1).equals(localObject3);
                                  if (bool1)
                                  {
                                    i11 = 10;
                                    break;
                                    localObject3 = "transformPivotY";
                                    bool1 = ((String)localObject1).equals(localObject3);
                                    if (bool1)
                                    {
                                      i11 = 9;
                                      break;
                                      localObject3 = "transformPivotX";
                                      bool1 = ((String)localObject1).equals(localObject3);
                                      if (bool1)
                                      {
                                        i11 = 8;
                                        break;
                                        localObject3 = "scaleY";
                                        bool1 = ((String)localObject1).equals(localObject3);
                                        if (bool1) {
                                          break;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          localObject3 = "scaleX";
                          bool1 = ((String)localObject1).equals(localObject3);
                        } while (!bool1);
                        i11 = 6;
                        break;
                        localObject3 = "progress";
                        bool1 = ((String)localObject1).equals(localObject3);
                      } while (!bool1);
                      i11 = 5;
                      break;
                      localObject3 = "translationZ";
                      bool1 = ((String)localObject1).equals(localObject3);
                    } while (!bool1);
                    i11 = 4;
                    break;
                    localObject3 = "translationY";
                    bool1 = ((String)localObject1).equals(localObject3);
                  } while (!bool1);
                  i11 = 3;
                  break;
                  localObject3 = "translationX";
                  bool1 = ((String)localObject1).equals(localObject3);
                } while (!bool1);
                i11 = 2;
                break;
                localObject3 = "rotationY";
                bool1 = ((String)localObject1).equals(localObject3);
              } while (!bool1);
              i11 = 1;
              break;
              localObject3 = "rotationX";
              bool1 = ((String)localObject1).equals(localObject3);
            } while (!bool1);
            i11 = 0;
            switch (i11)
            {
            }
          }
        }
      }
      f1 = this.OooOO0;
      bool1 = Float.isNaN(f1);
    } while (bool1);
    int i = this.OooO00o;
    float f2 = this.OooOO0;
    for (;;)
    {
      ((SplineSet)localObject2).setPoint(i, f2);
      break;
      f1 = this.OooOOo0;
      boolean bool2 = Float.isNaN(f1);
      if (bool2) {
        break;
      }
      int j = this.OooO00o;
      f2 = this.OooOOo0;
      continue;
      f1 = this.OooOO0O;
      boolean bool3 = Float.isNaN(f1);
      if (bool3) {
        break;
      }
      int k = this.OooO00o;
      f2 = this.OooOO0O;
      continue;
      f1 = this.OooOO0o;
      boolean bool4 = Float.isNaN(f1);
      if (bool4) {
        break;
      }
      int m = this.OooO00o;
      f2 = this.OooOO0o;
      continue;
      f1 = this.OooOOO;
      boolean bool5 = Float.isNaN(f1);
      if (bool5) {
        break;
      }
      int n = this.OooO00o;
      f2 = this.OooOOOo;
      continue;
      f1 = this.OooOOO0;
      boolean bool6 = Float.isNaN(f1);
      if (bool6) {
        break;
      }
      int i1 = this.OooO00o;
      f2 = this.OooOOOO;
      continue;
      f1 = this.OooOOoo;
      boolean bool7 = Float.isNaN(f1);
      if (bool7) {
        break;
      }
      int i2 = this.OooO00o;
      f2 = this.OooOOoo;
      continue;
      f1 = this.OooOOo;
      boolean bool8 = Float.isNaN(f1);
      if (bool8) {
        break;
      }
      int i3 = this.OooO00o;
      f2 = this.OooOOo;
      continue;
      f1 = this.OooOo0o;
      boolean bool9 = Float.isNaN(f1);
      if (bool9) {
        break;
      }
      int i4 = this.OooO00o;
      f2 = this.OooOo0o;
      continue;
      f1 = this.OooOo0O;
      boolean bool10 = Float.isNaN(f1);
      if (bool10) {
        break;
      }
      int i5 = this.OooO00o;
      f2 = this.OooOo0O;
      continue;
      f1 = this.OooOo0;
      boolean bool11 = Float.isNaN(f1);
      if (bool11) {
        break;
      }
      int i6 = this.OooO00o;
      f2 = this.OooOo0;
      continue;
      f1 = this.OooOo00;
      boolean bool12 = Float.isNaN(f1);
      if (bool12) {
        break;
      }
      int i7 = this.OooO00o;
      f2 = this.OooOo00;
      continue;
      f1 = this.OooOOO;
      boolean bool13 = Float.isNaN(f1);
      if (bool13) {
        break;
      }
      int i8 = this.OooO00o;
      f2 = this.OooOOO;
      continue;
      f1 = this.OooOOO0;
      boolean bool14 = Float.isNaN(f1);
      if (bool14) {
        break;
      }
      int i9 = this.OooO00o;
      f2 = this.OooOOO0;
    }
  }
  
  public Key OooO0O0()
  {
    KeyAttributes localKeyAttributes = new androidx/constraintlayout/motion/widget/KeyAttributes;
    localKeyAttributes.<init>();
    return localKeyAttributes.OooO0OO(this);
  }
  
  public Key OooO0OO(Key paramKey)
  {
    super.OooO0OO(paramKey);
    paramKey = (KeyAttributes)paramKey;
    int i = paramKey.OooO0oo;
    this.OooO0oo = i;
    boolean bool = paramKey.OooO;
    this.OooO = bool;
    float f1 = paramKey.OooOO0;
    this.OooOO0 = f1;
    f1 = paramKey.OooOO0O;
    this.OooOO0O = f1;
    f1 = paramKey.OooOO0o;
    this.OooOO0o = f1;
    f1 = paramKey.OooOOO0;
    this.OooOOO0 = f1;
    f1 = paramKey.OooOOO;
    this.OooOOO = f1;
    f1 = paramKey.OooOOOO;
    this.OooOOOO = f1;
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
    float f2 = paramKey.OooOo0o;
    this.OooOo0o = f2;
    return this;
  }
  
  public void OooO0Oo(HashSet paramHashSet)
  {
    float f = this.OooOO0;
    boolean bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "alpha";
      paramHashSet.add(localObject);
    }
    f = this.OooOO0O;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "elevation";
      paramHashSet.add(localObject);
    }
    f = this.OooOO0o;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotation";
      paramHashSet.add(localObject);
    }
    f = this.OooOOO0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "rotationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOOOO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "transformPivotX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "transformPivotY";
      paramHashSet.add(localObject);
    }
    f = this.OooOo00;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationX";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationY";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0O;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "translationZ";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "transitionPathRotate";
      paramHashSet.add(localObject);
    }
    f = this.OooOOo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleX";
      paramHashSet.add(localObject);
    }
    f = this.OooOOoo;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      localObject = "scaleY";
      paramHashSet.add(localObject);
    }
    f = this.OooOo0o;
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
    int[] arrayOfInt = R.styleable.KeyAttribute;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    KeyAttributes.Loader.OooO00o(this, paramContext);
  }
  
  public void Oooo(String paramString, Object paramObject)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    String str;
    boolean bool;
    switch (i)
    {
    default: 
      break;
    case 1941332754: 
      str = "visibility";
      bool = paramString.equals(str);
      if (bool) {
        j = 16;
      }
      break;
    case 579057826: 
      str = "curveFit";
      bool = paramString.equals(str);
      if (bool) {
        j = 15;
      }
      break;
    case 92909918: 
      str = "alpha";
      bool = paramString.equals(str);
      if (bool) {
        j = 14;
      }
      break;
    case 37232917: 
      str = "transitionPathRotate";
      bool = paramString.equals(str);
      if (bool) {
        j = 13;
      }
      break;
    case -4379043: 
      str = "elevation";
      bool = paramString.equals(str);
      if (bool) {
        j = 12;
      }
      break;
    case -40300674: 
      str = "rotation";
      bool = paramString.equals(str);
      if (bool) {
        j = 11;
      }
      break;
    case -760884509: 
      str = "transformPivotY";
      bool = paramString.equals(str);
      if (bool) {
        j = 10;
      }
      break;
    case -760884510: 
      str = "transformPivotX";
      bool = paramString.equals(str);
      if (bool) {
        j = 9;
      }
      break;
    case -908189617: 
      str = "scaleY";
      bool = paramString.equals(str);
      if (bool) {
        j = 8;
      }
      break;
    case -908189618: 
      str = "scaleX";
      bool = paramString.equals(str);
      if (bool) {
        j = 7;
      }
      break;
    case -1225497655: 
      str = "translationZ";
      bool = paramString.equals(str);
      if (bool) {
        j = 6;
      }
      break;
    case -1225497656: 
      str = "translationY";
      bool = paramString.equals(str);
      if (bool) {
        j = 5;
      }
      break;
    case -1225497657: 
      str = "translationX";
      bool = paramString.equals(str);
      if (bool) {
        j = 4;
      }
      break;
    case -1249320805: 
      str = "rotationY";
      bool = paramString.equals(str);
      if (bool) {
        j = 3;
      }
      break;
    case -1249320806: 
      str = "rotationX";
      bool = paramString.equals(str);
      if (bool) {
        j = 2;
      }
      break;
    case -1812823328: 
      str = "transitionEasing";
      bool = paramString.equals(str);
      if (bool) {
        j = 1;
      }
      break;
    case -1913008125: 
      str = "motionProgress";
      bool = paramString.equals(str);
      if (bool) {
        j = 0;
      }
      break;
    }
    float f;
    switch (j)
    {
    default: 
      break;
    case 16: 
      bool = OooO0oo(paramObject);
      this.OooO = bool;
      break;
    case 15: 
      int k = OooOO0(paramObject);
      this.OooO0oo = k;
      break;
    case 14: 
      f = OooO(paramObject);
      this.OooOO0 = f;
      break;
    case 13: 
      f = OooO(paramObject);
      this.OooOOo0 = f;
      break;
    case 12: 
      f = OooO(paramObject);
      this.OooOO0O = f;
      break;
    case 11: 
      f = OooO(paramObject);
      this.OooOO0o = f;
      break;
    case 10: 
      f = OooO(paramObject);
      this.OooOOOo = f;
      break;
    case 9: 
      f = OooO(paramObject);
      this.OooOOOO = f;
      break;
    case 8: 
      f = OooO(paramObject);
      this.OooOOoo = f;
      break;
    case 7: 
      f = OooO(paramObject);
      this.OooOOo = f;
      break;
    case 6: 
      f = OooO(paramObject);
      this.OooOo0O = f;
      break;
    case 5: 
      f = OooO(paramObject);
      this.OooOo0 = f;
      break;
    case 4: 
      f = OooO(paramObject);
      this.OooOo00 = f;
      break;
    case 3: 
      f = OooO(paramObject);
      this.OooOOO = f;
      break;
    case 2: 
      f = OooO(paramObject);
      this.OooOOO0 = f;
      break;
    case 1: 
      paramString = paramObject.toString();
      this.OooO0oO = paramString;
      break;
    case 0: 
      f = OooO(paramObject);
      this.OooOo0o = f;
    }
  }
  
  public int getCurveFit()
  {
    return this.OooO0oo;
  }
  
  public void setInterpolation(HashMap paramHashMap)
  {
    int i = this.OooO0oo;
    int i11 = -1;
    if (i == i11) {
      return;
    }
    float f = this.OooOO0;
    boolean bool1 = Float.isNaN(f);
    String str1;
    if (!bool1)
    {
      int j = this.OooO0oo;
      localObject1 = Integer.valueOf(j);
      str1 = "alpha";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOO0O;
    boolean bool2 = Float.isNaN(f);
    if (!bool2)
    {
      int k = this.OooO0oo;
      localObject1 = Integer.valueOf(k);
      str1 = "elevation";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOO0o;
    boolean bool3 = Float.isNaN(f);
    if (!bool3)
    {
      int m = this.OooO0oo;
      localObject1 = Integer.valueOf(m);
      str1 = "rotation";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOO0;
    boolean bool4 = Float.isNaN(f);
    if (!bool4)
    {
      int n = this.OooO0oo;
      localObject1 = Integer.valueOf(n);
      str1 = "rotationX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOO;
    boolean bool5 = Float.isNaN(f);
    if (!bool5)
    {
      int i1 = this.OooO0oo;
      localObject1 = Integer.valueOf(i1);
      str1 = "rotationY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOOO;
    boolean bool6 = Float.isNaN(f);
    if (!bool6)
    {
      int i2 = this.OooO0oo;
      localObject1 = Integer.valueOf(i2);
      str1 = "transformPivotX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOOo;
    boolean bool7 = Float.isNaN(f);
    if (!bool7)
    {
      int i3 = this.OooO0oo;
      localObject1 = Integer.valueOf(i3);
      str1 = "transformPivotY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOo00;
    boolean bool8 = Float.isNaN(f);
    if (!bool8)
    {
      int i4 = this.OooO0oo;
      localObject1 = Integer.valueOf(i4);
      str1 = "translationX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOo0;
    boolean bool9 = Float.isNaN(f);
    if (!bool9)
    {
      int i5 = this.OooO0oo;
      localObject1 = Integer.valueOf(i5);
      str1 = "translationY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOo0O;
    boolean bool10 = Float.isNaN(f);
    if (!bool10)
    {
      int i6 = this.OooO0oo;
      localObject1 = Integer.valueOf(i6);
      str1 = "translationZ";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOo0;
    boolean bool11 = Float.isNaN(f);
    if (!bool11)
    {
      int i7 = this.OooO0oo;
      localObject1 = Integer.valueOf(i7);
      str1 = "transitionPathRotate";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOo;
    boolean bool12 = Float.isNaN(f);
    if (!bool12)
    {
      int i8 = this.OooO0oo;
      localObject1 = Integer.valueOf(i8);
      str1 = "scaleX";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOOoo;
    boolean bool13 = Float.isNaN(f);
    if (!bool13)
    {
      int i9 = this.OooO0oo;
      localObject1 = Integer.valueOf(i9);
      str1 = "scaleY";
      paramHashMap.put(str1, localObject1);
    }
    f = this.OooOo0o;
    boolean bool14 = Float.isNaN(f);
    if (!bool14)
    {
      i10 = this.OooO0oo;
      localObject1 = Integer.valueOf(i10);
      str1 = "progress";
      paramHashMap.put(str1, localObject1);
    }
    Object localObject1 = this.OooO0o0;
    int i10 = ((HashMap)localObject1).size();
    if (i10 > 0)
    {
      localObject1 = this.OooO0o0.keySet().iterator();
      for (;;)
      {
        boolean bool15 = ((Iterator)localObject1).hasNext();
        if (!bool15) {
          break;
        }
        str1 = (String)((Iterator)localObject1).next();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "CUSTOM,";
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append(str1);
        str1 = ((StringBuilder)localObject2).toString();
        int i12 = this.OooO0oo;
        localObject2 = Integer.valueOf(i12);
        paramHashMap.put(str1, localObject2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyAttributes
 * JD-Core Version:    0.7.0.1
 */