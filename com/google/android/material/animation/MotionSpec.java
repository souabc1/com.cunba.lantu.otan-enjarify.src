package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class MotionSpec
{
  private static final String TAG = "MotionSpec";
  private final SimpleArrayMap propertyValues;
  private final SimpleArrayMap timings;
  
  public MotionSpec()
  {
    SimpleArrayMap localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    this.timings = localSimpleArrayMap;
    localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    this.propertyValues = localSimpleArrayMap;
  }
  
  private static void addInfoFromAnimator(MotionSpec paramMotionSpec, Animator paramAnimator)
  {
    boolean bool = paramAnimator instanceof ObjectAnimator;
    if (bool)
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject1 = paramAnimator.getPropertyName();
      localObject2 = paramAnimator.getValues();
      paramMotionSpec.setPropertyValues((String)localObject1, (PropertyValuesHolder[])localObject2);
      localObject1 = paramAnimator.getPropertyName();
      paramAnimator = MotionTiming.createFromAnimator(paramAnimator);
      paramMotionSpec.setTiming((String)localObject1, paramAnimator);
      return;
    }
    paramMotionSpec = new java/lang/IllegalArgumentException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("B=7C545653604E585625595259552A6D672D6D653086746D6F7662966E706D7A6872702940");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramAnimator);
    paramAnimator = ((StringBuilder)localObject1).toString();
    paramMotionSpec.<init>(paramAnimator);
    throw paramMotionSpec;
  }
  
  private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] paramArrayOfPropertyValuesHolder)
  {
    int i = paramArrayOfPropertyValuesHolder.length;
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[i];
    int j = 0;
    for (;;)
    {
      int k = paramArrayOfPropertyValuesHolder.length;
      if (j >= k) {
        break;
      }
      PropertyValuesHolder localPropertyValuesHolder = paramArrayOfPropertyValuesHolder[j].clone();
      arrayOfPropertyValuesHolder[j] = localPropertyValuesHolder;
      j += 1;
    }
    return arrayOfPropertyValuesHolder;
  }
  
  public static MotionSpec createFromAttribute(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    boolean bool = paramTypedArray.hasValue(paramInt);
    if (bool)
    {
      bool = false;
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        return createFromResource(paramContext, i);
      }
    }
    return null;
  }
  
  public static MotionSpec createFromResource(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = AnimatorInflater.loadAnimator(paramContext, paramInt);
      boolean bool = paramContext instanceof AnimatorSet;
      if (bool)
      {
        paramContext = (AnimatorSet)paramContext;
        paramContext = paramContext.getChildAnimations();
        return createSpecFromAnimators(paramContext);
      }
      if (paramContext != null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        ((List)localObject).add(paramContext);
        return createSpecFromAnimators((List)localObject);
      }
      return null;
    }
    catch (Exception localException)
    {
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      Object localObject = m54207b69.F54207b69_11("3?7C5F531B4F245957666429695D63606D5B6762643362706368636777763C949A3F3D316A");
      paramContext.append((String)localObject);
      String str = Integer.toHexString(paramInt);
      paramContext.append(str);
    }
    return null;
  }
  
  private static MotionSpec createSpecFromAnimators(List paramList)
  {
    MotionSpec localMotionSpec = new com/google/android/material/animation/MotionSpec;
    localMotionSpec.<init>();
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      Animator localAnimator = (Animator)paramList.get(j);
      addInfoFromAnimator(localMotionSpec, localAnimator);
      j += 1;
    }
    return localMotionSpec;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof MotionSpec;
    if (!bool) {
      return false;
    }
    paramObject = (MotionSpec)paramObject;
    SimpleArrayMap localSimpleArrayMap = this.timings;
    paramObject = paramObject.timings;
    return localSimpleArrayMap.equals(paramObject);
  }
  
  public ObjectAnimator getAnimator(String paramString, Object paramObject, Property paramProperty)
  {
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = getPropertyValues(paramString);
    paramObject = ObjectAnimator.ofPropertyValuesHolder(paramObject, arrayOfPropertyValuesHolder);
    paramObject.setProperty(paramProperty);
    getTiming(paramString).apply(paramObject);
    return paramObject;
  }
  
  public PropertyValuesHolder[] getPropertyValues(String paramString)
  {
    boolean bool = hasPropertyValues(paramString);
    if (bool)
    {
      paramString = (PropertyValuesHolder[])this.propertyValues.get(paramString);
      return clonePropertyValuesHolder(paramString);
    }
    paramString = new java/lang/IllegalArgumentException;
    paramString.<init>();
    throw paramString;
  }
  
  public MotionTiming getTiming(String paramString)
  {
    boolean bool = hasTiming(paramString);
    if (bool) {
      return (MotionTiming)this.timings.get(paramString);
    }
    paramString = new java/lang/IllegalArgumentException;
    paramString.<init>();
    throw paramString;
  }
  
  public long getTotalDuration()
  {
    SimpleArrayMap localSimpleArrayMap = this.timings;
    int i = localSimpleArrayMap.size();
    long l1 = 0L;
    int j = 0;
    while (j < i)
    {
      MotionTiming localMotionTiming = (MotionTiming)this.timings.OooOOO0(j);
      long l2 = localMotionTiming.getDelay();
      long l3 = localMotionTiming.getDuration();
      l2 += l3;
      l1 = Math.max(l1, l2);
      j += 1;
    }
    return l1;
  }
  
  public boolean hasPropertyValues(String paramString)
  {
    SimpleArrayMap localSimpleArrayMap = this.propertyValues;
    paramString = localSimpleArrayMap.get(paramString);
    boolean bool;
    if (paramString != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramString = null;
    }
    return bool;
  }
  
  public boolean hasTiming(String paramString)
  {
    SimpleArrayMap localSimpleArrayMap = this.timings;
    paramString = localSimpleArrayMap.get(paramString);
    boolean bool;
    if (paramString != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      paramString = null;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return this.timings.hashCode();
  }
  
  public void setPropertyValues(String paramString, PropertyValuesHolder[] paramArrayOfPropertyValuesHolder)
  {
    this.propertyValues.put(paramString, paramArrayOfPropertyValuesHolder);
  }
  
  public void setTiming(String paramString, MotionTiming paramMotionTiming)
  {
    this.timings.put(paramString, paramMotionTiming);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('\n');
    Object localObject = getClass().getName();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('{');
    localObject = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("'N6E3B29262B252F447C77");
    localStringBuilder.append((String)localObject);
    localObject = this.timings;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.MotionSpec
 * JD-Core Version:    0.7.0.1
 */