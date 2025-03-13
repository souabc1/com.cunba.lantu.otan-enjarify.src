package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute
{
  public boolean OooO00o;
  public String OooO0O0;
  public ConstraintAttribute.AttributeType OooO0OO;
  public int OooO0Oo;
  public String OooO0o;
  public float OooO0o0;
  public boolean OooO0oO;
  public int OooO0oo;
  
  public ConstraintAttribute(ConstraintAttribute paramConstraintAttribute, Object paramObject)
  {
    this.OooO00o = false;
    String str = paramConstraintAttribute.OooO0O0;
    this.OooO0O0 = str;
    paramConstraintAttribute = paramConstraintAttribute.OooO0OO;
    this.OooO0OO = paramConstraintAttribute;
    setValue(paramObject);
  }
  
  public ConstraintAttribute(String paramString, ConstraintAttribute.AttributeType paramAttributeType, Object paramObject, boolean paramBoolean)
  {
    this.OooO0O0 = paramString;
    this.OooO0OO = paramAttributeType;
    this.OooO00o = paramBoolean;
    setValue(paramObject);
  }
  
  public static int OooO0O0(int paramInt)
  {
    int i = paramInt >> 31 ^ 0xFFFFFFFF;
    paramInt = (paramInt & i) + -255;
    i = paramInt >> 31;
    return (paramInt & i) + 255;
  }
  
  public static HashMap OooO0OO(HashMap paramHashMap, View paramView)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Class localClass = paramView.getClass();
    Iterator localIterator = paramHashMap.keySet().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      String str = (String)localIterator.next();
      ConstraintAttribute localConstraintAttribute = (ConstraintAttribute)paramHashMap.get(str);
      Object localObject1 = "BackgroundColor";
      try
      {
        boolean bool2 = str.equals(localObject1);
        Object localObject2;
        if (bool2)
        {
          localObject1 = paramView.getBackground();
          localObject1 = (ColorDrawable)localObject1;
          int i = ((ColorDrawable)localObject1).getColor();
          localObject1 = Integer.valueOf(i);
          localObject2 = new androidx/constraintlayout/widget/ConstraintAttribute;
          ((ConstraintAttribute)localObject2).<init>(localConstraintAttribute, localObject1);
        }
        for (;;)
        {
          localHashMap.put(str, localObject2);
          break;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "getMap";
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(str);
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject2 = null;
          Class[] arrayOfClass = new Class[0];
          localObject1 = localClass.getMethod((String)localObject1, arrayOfClass);
          localObject2 = new Object[0];
          localObject1 = ((Method)localObject1).invoke(paramView, (Object[])localObject2);
          localObject2 = new androidx/constraintlayout/widget/ConstraintAttribute;
          ((ConstraintAttribute)localObject2).<init>(localConstraintAttribute, localObject1);
        }
        localNoSuchMethodException.printStackTrace();
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    }
    return localHashMap;
  }
  
  public static void OooO0o(Context paramContext, XmlPullParser paramXmlPullParser, HashMap paramHashMap)
  {
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.CustomAttribute;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int i = paramXmlPullParser.getIndexCount();
    String str = null;
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    float f = 0.0F;
    int k = 0;
    boolean bool2 = false;
    while (k < i)
    {
      int m = paramXmlPullParser.getIndex(k);
      int n = R.styleable.CustomAttribute_attributeName;
      int i2 = 1;
      Object localObject3;
      if (m == n)
      {
        str = paramXmlPullParser.getString(m);
        if (str != null)
        {
          m = str.length();
          if (m > 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            n = Character.toUpperCase(str.charAt(0));
            ((StringBuilder)localObject3).append(n);
            str = str.substring(i2);
            ((StringBuilder)localObject3).append(str);
            str = ((StringBuilder)localObject3).toString();
          }
        }
      }
      else
      {
        int i1 = R.styleable.CustomAttribute_methodName;
        if (m == i1)
        {
          str = paramXmlPullParser.getString(m);
          bool2 = i2;
        }
        else
        {
          i1 = R.styleable.CustomAttribute_customBoolean;
          if (m == i1)
          {
            bool1 = paramXmlPullParser.getBoolean(m, false);
            localObject1 = Boolean.valueOf(bool1);
            localObject2 = ConstraintAttribute.AttributeType.o00OooO0;
          }
          else
          {
            i1 = R.styleable.CustomAttribute_customColorValue;
            if (m == i1)
            {
              localObject1 = ConstraintAttribute.AttributeType.o00Ooo0;
              j = paramXmlPullParser.getColor(m, 0);
            }
            for (;;)
            {
              label246:
              localObject2 = Integer.valueOf(j);
              for (;;)
              {
                Object localObject4 = localObject2;
                localObject2 = localObject1;
                localObject1 = localObject4;
                break label517;
                i1 = R.styleable.CustomAttribute_customColorDrawableValue;
                if (m == i1)
                {
                  localObject1 = ConstraintAttribute.AttributeType.o00Ooo0O;
                  break;
                }
                i1 = R.styleable.CustomAttribute_customPixelDimension;
                if (m == i1)
                {
                  localObject1 = ConstraintAttribute.AttributeType.o00OooO;
                  f = paramXmlPullParser.getDimension(m, 0.0F);
                  localObject3 = paramContext.getResources().getDisplayMetrics();
                  f = TypedValue.applyDimension(i2, f, (DisplayMetrics)localObject3);
                }
                for (;;)
                {
                  localObject2 = Float.valueOf(f);
                  break;
                  i1 = R.styleable.CustomAttribute_customDimension;
                  if (m == i1)
                  {
                    localObject1 = ConstraintAttribute.AttributeType.o00OooO;
                    f = paramXmlPullParser.getDimension(m, 0.0F);
                  }
                  else
                  {
                    i1 = R.styleable.CustomAttribute_customFloatValue;
                    if (m != i1) {
                      break label409;
                    }
                    localObject1 = ConstraintAttribute.AttributeType.o00Ooo00;
                    j = 2143289344;
                    f = paramXmlPullParser.getFloat(m, 0.0F / 0.0F);
                  }
                }
                label409:
                i1 = R.styleable.CustomAttribute_customIntegerValue;
                i2 = -1;
                if (m == i1)
                {
                  localObject1 = ConstraintAttribute.AttributeType.o00OoOoo;
                  j = paramXmlPullParser.getInteger(m, i2);
                  break label246;
                }
                i1 = R.styleable.CustomAttribute_customStringValue;
                if (m != i1) {
                  break label470;
                }
                localObject1 = ConstraintAttribute.AttributeType.o00Ooo0o;
                localObject2 = paramXmlPullParser.getString(m);
              }
              label470:
              i1 = R.styleable.CustomAttribute_customReference;
              if (m != i1) {
                break label517;
              }
              localObject1 = ConstraintAttribute.AttributeType.o00OooOO;
              j = paramXmlPullParser.getResourceId(m, i2);
              if (j == i2) {
                j = paramXmlPullParser.getInt(m, i2);
              }
            }
          }
        }
      }
      label517:
      k += 1;
    }
    if ((str != null) && (localObject1 != null))
    {
      paramContext = new androidx/constraintlayout/widget/ConstraintAttribute;
      paramContext.<init>(str, (ConstraintAttribute.AttributeType)localObject2, localObject1, bool2);
      paramHashMap.put(str, paramContext);
    }
    paramXmlPullParser.recycle();
  }
  
  public static void OooO0oO(View paramView, HashMap paramHashMap)
  {
    String str1 = "\" not found on ";
    String str2 = " Custom Attribute \"";
    Class localClass = paramView.getClass();
    Iterator localIterator = paramHashMap.keySet().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = (String)localIterator.next();
      Object localObject2 = (ConstraintAttribute)paramHashMap.get(localObject1);
      boolean bool2 = ((ConstraintAttribute)localObject2).OooO00o;
      Object localObject4;
      Object localObject5;
      if (!bool2)
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "set";
        ((StringBuilder)localObject4).append((String)localObject5);
        ((StringBuilder)localObject4).append((String)localObject1);
        localObject4 = ((StringBuilder)localObject4).toString();
      }
      else
      {
        localObject4 = localObject1;
      }
      try
      {
        try
        {
          localObject5 = ConstraintAttribute.1.OooO00o;
          Object localObject6 = ((ConstraintAttribute)localObject2).OooO0OO;
          int i = ((Enum)localObject6).ordinal();
          int j = localObject5[i];
          i = 0;
          localObject6 = null;
          int k = 1;
          Object localObject7;
          Object localObject8;
          float f;
          int m;
          switch (j)
          {
          default: 
            break;
          case 8: 
            localObject5 = new Class[k];
            localObject7 = Float.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            f = ((ConstraintAttribute)localObject2).OooO0o0;
            localObject2 = Float.valueOf(f);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 7: 
            localObject5 = new Class[k];
            localObject7 = Float.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            f = ((ConstraintAttribute)localObject2).OooO0o0;
            localObject2 = Float.valueOf(f);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 6: 
            localObject5 = new Class[k];
            localObject7 = Integer.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            m = ((ConstraintAttribute)localObject2).OooO0Oo;
            localObject2 = Integer.valueOf(m);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 5: 
            localObject5 = new Class[k];
            localObject8 = Drawable.class;
            localObject5[0] = localObject8;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject6 = new android/graphics/drawable/ColorDrawable;
            ((ColorDrawable)localObject6).<init>();
            m = ((ConstraintAttribute)localObject2).OooO0oo;
            ((ColorDrawable)localObject6).setColor(m);
            localObject2 = new Object[] { localObject6 };
            ((Method)localObject5).invoke(paramView, (Object[])localObject2);
            break;
          case 4: 
            localObject5 = new Class[k];
            localObject7 = Integer.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            m = ((ConstraintAttribute)localObject2).OooO0oo;
            localObject2 = Integer.valueOf(m);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 3: 
            localObject5 = new Class[k];
            localObject7 = CharSequence.class;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            localObject2 = ((ConstraintAttribute)localObject2).OooO0o;
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 2: 
            localObject5 = new Class[k];
            localObject7 = Boolean.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            boolean bool3 = ((ConstraintAttribute)localObject2).OooO0oO;
            localObject2 = Boolean.valueOf(bool3);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
            break;
          case 1: 
            localObject5 = new Class[k];
            localObject7 = Integer.TYPE;
            localObject5[0] = localObject7;
            localObject5 = localClass.getMethod((String)localObject4, (Class[])localObject5);
            localObject8 = new Object[k];
            int n = ((ConstraintAttribute)localObject2).OooO0Oo;
            localObject2 = Integer.valueOf(n);
            localObject8[0] = localObject2;
            ((Method)localObject5).invoke(paramView, (Object[])localObject8);
          }
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
        }
        ((StringBuilder)localObject4).append(str2);
        ((StringBuilder)localObject4).append((String)localObject1);
        ((StringBuilder)localObject4).append(str1);
        localObject1 = localClass.getName();
        ((StringBuilder)localObject4).append((String)localObject1);
        localIllegalAccessException.printStackTrace();
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localNoSuchMethodException.getMessage();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append(str2);
        ((StringBuilder)localObject3).append((String)localObject1);
        ((StringBuilder)localObject3).append(str1);
        localObject1 = localClass.getName();
        ((StringBuilder)localObject3).append((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = localClass.getName();
        ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = " must have a method ";
        ((StringBuilder)localObject1).append((String)localObject3);
        ((StringBuilder)localObject1).append((String)localObject4);
      }
    }
  }
  
  public void OooO00o(View paramView)
  {
    String str1 = "\" not found on ";
    String str2 = " Custom Attribute \"";
    Class localClass = paramView.getClass();
    String str3 = this.OooO0O0;
    boolean bool1 = this.OooO00o;
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "set";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(str3);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = str3;
    }
    try
    {
      try
      {
        localObject2 = ConstraintAttribute.1.OooO00o;
        Object localObject3 = this.OooO0OO;
        int i = ((Enum)localObject3).ordinal();
        int j = localObject2[i];
        i = 0;
        localObject3 = null;
        int k = 1;
        Object localObject4;
        Object localObject5;
        float f;
        switch (j)
        {
        default: 
          break;
        case 8: 
          localObject2 = new Class[k];
          localObject4 = Float.TYPE;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          f = this.OooO0o0;
          localObject4 = Float.valueOf(f);
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
          break;
        case 7: 
          localObject2 = new Class[k];
          localObject4 = Float.TYPE;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          f = this.OooO0o0;
          localObject4 = Float.valueOf(f);
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
          break;
        case 5: 
          localObject2 = new Class[k];
          localObject5 = Drawable.class;
          localObject2[0] = localObject5;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject3 = new android/graphics/drawable/ColorDrawable;
          ((ColorDrawable)localObject3).<init>();
          k = this.OooO0oo;
          ((ColorDrawable)localObject3).setColor(k);
          localObject3 = new Object[] { localObject3 };
          ((Method)localObject2).invoke(paramView, (Object[])localObject3);
          break;
        case 4: 
          localObject2 = new Class[k];
          localObject4 = Integer.TYPE;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          int m = this.OooO0oo;
          localObject4 = Integer.valueOf(m);
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
          break;
        case 3: 
          localObject2 = new Class[k];
          localObject4 = CharSequence.class;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          localObject4 = this.OooO0o;
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
          break;
        case 2: 
          localObject2 = new Class[k];
          localObject4 = Boolean.TYPE;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          boolean bool2 = this.OooO0oO;
          localObject4 = Boolean.valueOf(bool2);
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
          break;
        case 1: 
        case 6: 
          localObject2 = new Class[k];
          localObject4 = Integer.TYPE;
          localObject2[0] = localObject4;
          localObject2 = localClass.getMethod((String)localObject1, (Class[])localObject2);
          localObject5 = new Object[k];
          int n = this.OooO0Oo;
          localObject4 = Integer.valueOf(n);
          localObject5[0] = localObject4;
          ((Method)localObject2).invoke(paramView, (Object[])localObject5);
        }
      }
      catch (InvocationTargetException paramView)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
      catch (IllegalAccessException paramView)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
      }
      ((StringBuilder)localObject1).append(str2);
      ((StringBuilder)localObject1).append(str3);
      ((StringBuilder)localObject1).append(str1);
      str1 = localClass.getName();
      ((StringBuilder)localObject1).append(str1);
      paramView.printStackTrace();
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.getMessage();
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      paramView.append(str2);
      paramView.append(str3);
      paramView.append(str1);
      str1 = localClass.getName();
      paramView.append(str1);
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      str1 = localClass.getName();
      paramView.append(str1);
      str1 = " must have a method ";
      paramView.append(str1);
      paramView.append((String)localObject1);
    }
  }
  
  public void OooO0Oo(float[] paramArrayOfFloat)
  {
    int[] arrayOfInt = ConstraintAttribute.1.OooO00o;
    int i = this.OooO0OO.ordinal();
    int j = arrayOfInt[i];
    i = 0;
    float f1;
    switch (j)
    {
    default: 
      break;
    case 8: 
      f1 = this.OooO0o0;
      paramArrayOfFloat[0] = f1;
      break;
    case 7: 
      f1 = this.OooO0o0;
      paramArrayOfFloat[0] = f1;
      break;
    case 6: 
      j = this.OooO0Oo;
      f1 = j;
      paramArrayOfFloat[0] = f1;
      break;
    case 4: 
    case 5: 
      j = this.OooO0oo;
      int m = j >> 24 & 0xFF;
      int n = j >> 16 & 0xFF;
      int i1 = j >> 8 & 0xFF;
      j &= 0xFF;
      float f2 = n;
      float f3 = 255.0F;
      double d1 = f2 / f3;
      double d2 = 2.2D;
      f2 = (float)Math.pow(d1, d2);
      float f4 = (float)Math.pow(i1 / f3, d2);
      d1 = Math.pow(j / f3, d2);
      f1 = (float)d1;
      paramArrayOfFloat[0] = f2;
      paramArrayOfFloat[1] = f4;
      paramArrayOfFloat[2] = f1;
      f1 = m / f3;
      i = 3;
      paramArrayOfFloat[i] = f1;
      break;
    case 3: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Color does not have a single color to interpolate");
      throw paramArrayOfFloat;
    case 2: 
      boolean bool = this.OooO0oO;
      int k;
      if (bool)
      {
        k = 1065353216;
        f1 = 1.0F;
      }
      else
      {
        k = 0;
        f1 = 0.0F;
        arrayOfInt = null;
      }
      paramArrayOfFloat[0] = f1;
    }
  }
  
  public int OooO0o0()
  {
    int[] arrayOfInt = ConstraintAttribute.1.OooO00o;
    ConstraintAttribute.AttributeType localAttributeType = this.OooO0OO;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    i = 4;
    if (j != i)
    {
      int k = 5;
      if (j != k) {
        return 1;
      }
    }
    return i;
  }
  
  public int getColorValue()
  {
    return this.OooO0oo;
  }
  
  public float getFloatValue()
  {
    return this.OooO0o0;
  }
  
  public int getIntegerValue()
  {
    return this.OooO0Oo;
  }
  
  public String getName()
  {
    return this.OooO0O0;
  }
  
  public String getStringValue()
  {
    return this.OooO0o;
  }
  
  public ConstraintAttribute.AttributeType getType()
  {
    return this.OooO0OO;
  }
  
  public float getValueToInterpolate()
  {
    Object localObject = ConstraintAttribute.1.OooO00o;
    ConstraintAttribute.AttributeType localAttributeType = this.OooO0OO;
    int i = localAttributeType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      return 0.0F / 0.0F;
    case 8: 
      return this.OooO0o0;
    case 7: 
      return this.OooO0o0;
    case 6: 
      return this.OooO0Oo;
    case 4: 
    case 5: 
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Color does not have a single color to interpolate");
      throw ((Throwable)localObject);
    case 3: 
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Cannot interpolate String");
      throw ((Throwable)localObject);
    }
    boolean bool = this.OooO0oO;
    int k;
    float f;
    if (bool)
    {
      k = 1065353216;
      f = 1.0F;
    }
    else
    {
      k = 0;
      f = 0.0F;
      localObject = null;
    }
    return f;
  }
  
  public boolean isBooleanValue()
  {
    return this.OooO0oO;
  }
  
  public boolean isContinuous()
  {
    int[] arrayOfInt = ConstraintAttribute.1.OooO00o;
    ConstraintAttribute.AttributeType localAttributeType = this.OooO0OO;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    i = 1;
    if (j != i)
    {
      int k = 2;
      if (j != k)
      {
        int m = 3;
        if (j != m) {
          return i;
        }
      }
    }
    return false;
  }
  
  public boolean isMethod()
  {
    return this.OooO00o;
  }
  
  public void setColorValue(int paramInt)
  {
    this.OooO0oo = paramInt;
  }
  
  public void setFloatValue(float paramFloat)
  {
    this.OooO0o0 = paramFloat;
  }
  
  public void setIntValue(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
  
  public void setStringValue(String paramString)
  {
    this.OooO0o = paramString;
  }
  
  public void setValue(Object paramObject)
  {
    int[] arrayOfInt = ConstraintAttribute.1.OooO00o;
    ConstraintAttribute.AttributeType localAttributeType = this.OooO0OO;
    int i = localAttributeType.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      break;
    case 7: 
    case 8: 
      paramObject = (Float)paramObject;
      float f = paramObject.floatValue();
      this.OooO0o0 = f;
      break;
    case 4: 
    case 5: 
      paramObject = (Integer)paramObject;
      int k = paramObject.intValue();
      this.OooO0oo = k;
      break;
    case 3: 
      paramObject = (String)paramObject;
      this.OooO0o = paramObject;
      break;
    case 2: 
      paramObject = (Boolean)paramObject;
      boolean bool = paramObject.booleanValue();
      this.OooO0oO = bool;
      break;
    case 1: 
    case 6: 
      paramObject = (Integer)paramObject;
      int m = paramObject.intValue();
      this.OooO0Oo = m;
    }
  }
  
  public void setValue(float[] paramArrayOfFloat)
  {
    int[] arrayOfInt = ConstraintAttribute.1.OooO00o;
    int i = this.OooO0OO.ordinal();
    int j = arrayOfInt[i];
    i = 0;
    float f1 = 0.0F;
    switch (j)
    {
    default: 
      break;
    case 8: 
      f2 = paramArrayOfFloat[0];
      break;
    case 7: 
      f2 = paramArrayOfFloat[0];
      this.OooO0o0 = f2;
      break;
    case 4: 
    case 5: 
      j = Color.HSVToColor(paramArrayOfFloat);
      this.OooO0oo = j;
      j &= 0xFFFFFF;
      f2 = paramArrayOfFloat[3];
      i = 1132396544;
      f1 = 255.0F;
      f2 *= f1;
      int k = OooO0O0((int)f2) << 24 | j;
      this.OooO0oo = k;
      break;
    case 3: 
      paramArrayOfFloat = new java/lang/RuntimeException;
      paramArrayOfFloat.<init>("Color does not have a single color to interpolate");
      throw paramArrayOfFloat;
    case 2: 
      f2 = paramArrayOfFloat[0];
      double d1 = f2;
      double d2 = 0.5D;
      boolean bool = d1 < d2;
      if (bool)
      {
        i = 1;
        f1 = 1.4E-45F;
      }
      this.OooO0oO = i;
      break;
    }
    float f2 = paramArrayOfFloat[0];
    int m = (int)f2;
    this.OooO0Oo = m;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintAttribute
 * JD-Core Version:    0.7.0.1
 */