package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class KeylineStateList
{
  private static final int NO_INDEX = 255;
  private final KeylineState defaultState;
  private final float leftShiftRange;
  private final List leftStateSteps;
  private final float[] leftStateStepsInterpolationPoints;
  private final float rightShiftRange;
  private final List rightStateSteps;
  private final float[] rightStateStepsInterpolationPoints;
  
  private KeylineStateList(KeylineState paramKeylineState, List paramList1, List paramList2)
  {
    this.defaultState = paramKeylineState;
    List localList = Collections.unmodifiableList(paramList1);
    this.leftStateSteps = localList;
    localList = Collections.unmodifiableList(paramList2);
    this.rightStateSteps = localList;
    int i = paramList1.size();
    int j = 1;
    i -= j;
    float f1 = ((KeylineState)paramList1.get(i)).getFirstKeyline().loc;
    float f2 = paramKeylineState.getFirstKeyline().loc;
    f1 -= f2;
    this.leftShiftRange = f1;
    float f3 = paramKeylineState.getLastKeyline().loc;
    int k = paramList2.size() - j;
    f2 = ((KeylineState)paramList2.get(k)).getLastKeyline().loc;
    f3 -= f2;
    this.rightShiftRange = f3;
    paramList1 = getStateStepInterpolationPoints(f1, paramList1, j);
    this.leftStateStepsInterpolationPoints = paramList1;
    paramKeylineState = getStateStepInterpolationPoints(f3, paramList2, false);
    this.rightStateStepsInterpolationPoints = paramKeylineState;
  }
  
  private static int findFirstInBoundsKeylineIndex(KeylineState paramKeylineState)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = paramKeylineState.getKeylines();
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (KeylineState.Keyline)paramKeylineState.getKeylines().get(i);
      float f = ((KeylineState.Keyline)localObject).locOffset;
      boolean bool = f < 0.0F;
      if (!bool) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState paramKeylineState, float paramFloat)
  {
    int i = paramKeylineState.getLastFocalKeylineIndex();
    for (;;)
    {
      Object localObject = paramKeylineState.getKeylines();
      int j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (KeylineState.Keyline)paramKeylineState.getKeylines().get(i);
      float f = ((KeylineState.Keyline)localObject).mask;
      boolean bool = paramFloat < f;
      if (!bool) {
        return i;
      }
      i += 1;
    }
    return paramKeylineState.getKeylines().size() + -1;
  }
  
  private static int findLastInBoundsKeylineIndex(Carousel paramCarousel, KeylineState paramKeylineState)
  {
    List localList = paramKeylineState.getKeylines();
    int i = localList.size() + -1;
    while (i >= 0)
    {
      KeylineState.Keyline localKeyline = (KeylineState.Keyline)paramKeylineState.getKeylines().get(i);
      float f1 = localKeyline.locOffset;
      int j = paramCarousel.getContainerWidth();
      float f2 = j;
      boolean bool = f1 < f2;
      if (!bool) {
        return i;
      }
      i += -1;
    }
    return -1;
  }
  
  private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState paramKeylineState, float paramFloat)
  {
    int i = paramKeylineState.getFirstFocalKeylineIndex() + -1;
    while (i >= 0)
    {
      KeylineState.Keyline localKeyline = (KeylineState.Keyline)paramKeylineState.getKeylines().get(i);
      float f = localKeyline.mask;
      boolean bool = paramFloat < f;
      if (!bool) {
        return i;
      }
      i += -1;
    }
    return 0;
  }
  
  public static KeylineStateList from(Carousel paramCarousel, KeylineState paramKeylineState)
  {
    KeylineStateList localKeylineStateList = new com/google/android/material/carousel/KeylineStateList;
    List localList = getStateStepsLeft(paramKeylineState);
    paramCarousel = getStateStepsRight(paramCarousel, paramKeylineState);
    localKeylineStateList.<init>(paramKeylineState, localList, paramCarousel);
    return localKeylineStateList;
  }
  
  private static float[] getStateStepInterpolationPoints(float paramFloat, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    float[] arrayOfFloat = new float[i];
    int j = 1;
    while (j < i)
    {
      int k = j + -1;
      Object localObject1 = (KeylineState)paramList.get(k);
      Object localObject2 = (KeylineState)paramList.get(j);
      float f1;
      float f2;
      if (paramBoolean)
      {
        localObject2 = ((KeylineState)localObject2).getFirstKeyline();
        f1 = ((KeylineState.Keyline)localObject2).loc;
        localObject1 = ((KeylineState)localObject1).getFirstKeyline();
        f2 = ((KeylineState.Keyline)localObject1).loc;
        f1 -= f2;
      }
      else
      {
        localObject1 = ((KeylineState)localObject1).getLastKeyline();
        f2 = ((KeylineState.Keyline)localObject1).loc;
        localObject2 = ((KeylineState)localObject2).getLastKeyline();
        f1 = ((KeylineState.Keyline)localObject2).loc;
        f1 = f2 - f1;
      }
      f1 /= paramFloat;
      int m = i + -1;
      float f3;
      if (j == m)
      {
        k = 1065353216;
        f3 = 1.0F;
      }
      else
      {
        f3 = arrayOfFloat[k] + f1;
      }
      arrayOfFloat[j] = f3;
      j += 1;
    }
    return arrayOfFloat;
  }
  
  private static List getStateStepsLeft(KeylineState paramKeylineState)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramKeylineState);
    int i = findFirstInBoundsKeylineIndex(paramKeylineState);
    boolean bool = isFirstFocalItemAtLeftOfContainer(paramKeylineState);
    if (!bool)
    {
      int j = -1;
      float f1 = 0.0F / 0.0F;
      if (i != j)
      {
        int k = paramKeylineState.getFirstFocalKeylineIndex() + -1 - i;
        f1 = paramKeylineState.getFirstKeyline().locOffset;
        KeylineState.Keyline localKeyline = paramKeylineState.getFirstKeyline();
        float f2 = localKeyline.maskedItemSize;
        int m = 1073741824;
        float f3 = 2.0F;
        f2 /= f3;
        float f4 = f1 - f2;
        j = 0;
        f1 = 0.0F;
        KeylineState localKeylineState = null;
        int n = 0;
        while (n <= k)
        {
          j = localArrayList.size() + -1;
          localKeylineState = (KeylineState)localArrayList.get(j);
          int i1 = i + n;
          List localList = paramKeylineState.getKeylines();
          m = localList.size() + -1;
          i1 += -1;
          if (i1 >= 0)
          {
            localList = paramKeylineState.getKeylines();
            localKeyline = (KeylineState.Keyline)localList.get(i1);
            f2 = localKeyline.mask;
            i1 = findFirstIndexAfterLastFocalKeylineWithMask(localKeylineState, f2) + -1;
            m = i1;
          }
          int i2 = paramKeylineState.getFirstFocalKeylineIndex() - n + -1;
          int i3 = paramKeylineState.getLastFocalKeylineIndex() - n + -1;
          i1 = i;
          localKeylineState = moveKeylineAndCreateKeylineState(localKeylineState, i, m, f4, i2, i3);
          localArrayList.add(localKeylineState);
          n += 1;
        }
      }
    }
    return localArrayList;
  }
  
  private static List getStateStepsRight(Carousel paramCarousel, KeylineState paramKeylineState)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramKeylineState);
    int i = findLastInBoundsKeylineIndex(paramCarousel, paramKeylineState);
    boolean bool = isLastFocalItemAtRightOfContainer(paramCarousel, paramKeylineState);
    if (!bool)
    {
      int j = -1;
      if (i != j)
      {
        j = paramKeylineState.getLastFocalKeylineIndex();
        j = i - j;
        Object localObject = paramKeylineState.getFirstKeyline();
        float f1 = ((KeylineState.Keyline)localObject).locOffset;
        KeylineState.Keyline localKeyline = paramKeylineState.getFirstKeyline();
        float f2 = localKeyline.maskedItemSize;
        int k = 1073741824;
        float f3 = 2.0F;
        f2 /= f3;
        float f4 = f1 - f2;
        int m = 0;
        while (m < j)
        {
          int n = localArrayList.size() + -1;
          localObject = (KeylineState)localArrayList.get(n);
          int i1 = i - m + 1;
          List localList = paramKeylineState.getKeylines();
          k = localList.size();
          if (i1 < k)
          {
            localList = paramKeylineState.getKeylines();
            localKeyline = (KeylineState.Keyline)localList.get(i1);
            f2 = localKeyline.mask;
            i1 = findLastIndexBeforeFirstFocalKeylineWithMask((KeylineState)localObject, f2) + 1;
            k = i1;
          }
          else
          {
            k = 0;
            localList = null;
            f3 = 0.0F;
          }
          int i2 = paramKeylineState.getFirstFocalKeylineIndex() + m + 1;
          int i3 = paramKeylineState.getLastFocalKeylineIndex() + m + 1;
          i1 = i;
          localObject = moveKeylineAndCreateKeylineState((KeylineState)localObject, i, k, f4, i2, i3);
          localArrayList.add(localObject);
          m += 1;
        }
      }
    }
    return localArrayList;
  }
  
  private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState paramKeylineState)
  {
    KeylineState.Keyline localKeyline = paramKeylineState.getFirstFocalKeyline();
    float f1 = localKeyline.locOffset;
    float f2 = paramKeylineState.getFirstFocalKeyline().maskedItemSize;
    float f3 = 2.0F;
    f2 /= f3;
    f1 -= f2;
    f2 = 0.0F;
    boolean bool1 = f1 < 0.0F;
    if (bool1)
    {
      localKeyline = paramKeylineState.getFirstFocalKeyline();
      paramKeylineState = paramKeylineState.getFirstKeyline();
      if (localKeyline != paramKeylineState)
      {
        bool2 = false;
        paramKeylineState = null;
        break label72;
      }
    }
    boolean bool2 = true;
    label72:
    return bool2;
  }
  
  private static boolean isLastFocalItemAtRightOfContainer(Carousel paramCarousel, KeylineState paramKeylineState)
  {
    KeylineState.Keyline localKeyline1 = paramKeylineState.getLastFocalKeyline();
    float f1 = localKeyline1.locOffset;
    KeylineState.Keyline localKeyline2 = paramKeylineState.getLastFocalKeyline();
    float f2 = localKeyline2.maskedItemSize;
    float f3 = 2.0F;
    f2 /= f3;
    f1 += f2;
    float f4 = paramCarousel.getContainerWidth();
    boolean bool = f1 < f4;
    if (bool)
    {
      paramCarousel = paramKeylineState.getLastFocalKeyline();
      paramKeylineState = paramKeylineState.getLastKeyline();
      if (paramCarousel != paramKeylineState)
      {
        bool = false;
        f4 = 0.0F;
        paramCarousel = null;
        break label95;
      }
    }
    bool = true;
    f4 = 1.4E-45F;
    label95:
    return bool;
  }
  
  private static KeylineState lerp(List paramList, float paramFloat, float[] paramArrayOfFloat)
  {
    int i = paramList.size();
    float f1 = paramArrayOfFloat[0];
    int j = 1;
    while (j < i)
    {
      float f2 = paramArrayOfFloat[j];
      boolean bool = paramFloat < f2;
      if (!bool)
      {
        int k = j + -1;
        paramFloat = AnimationUtils.lerp(0.0F, 1.0F, f1, f2, paramFloat);
        paramArrayOfFloat = (KeylineState)paramList.get(k);
        paramList = (KeylineState)paramList.get(j);
        return KeylineState.lerp(paramArrayOfFloat, paramList, paramFloat);
      }
      j += 1;
      f1 = f2;
    }
    return (KeylineState)paramList.get(0);
  }
  
  private static KeylineState moveKeylineAndCreateKeylineState(KeylineState paramKeylineState, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject1 = paramKeylineState.getKeylines();
    localArrayList.<init>((Collection)localObject1);
    Object localObject2 = (KeylineState.Keyline)localArrayList.remove(paramInt1);
    localArrayList.add(paramInt2, localObject2);
    localObject2 = new com/google/android/material/carousel/KeylineState$Builder;
    float f1 = paramKeylineState.getItemSize();
    ((KeylineState.Builder)localObject2).<init>(f1);
    f1 = 0.0F;
    paramKeylineState = null;
    paramInt2 = 0;
    for (;;)
    {
      int i = localArrayList.size();
      if (paramInt2 >= i) {
        break;
      }
      localObject1 = (KeylineState.Keyline)localArrayList.get(paramInt2);
      float f2 = ((KeylineState.Keyline)localObject1).maskedItemSize;
      float f3 = f2 / 2.0F + paramFloat;
      boolean bool;
      if ((paramInt2 >= paramInt3) && (paramInt2 <= paramInt4)) {
        bool = true;
      } else {
        bool = false;
      }
      float f4 = ((KeylineState.Keyline)localObject1).mask;
      ((KeylineState.Builder)localObject2).addKeyline(f3, f4, f2, bool);
      float f5 = ((KeylineState.Keyline)localObject1).maskedItemSize;
      paramFloat += f5;
      paramInt2 += 1;
    }
    return ((KeylineState.Builder)localObject2).build();
  }
  
  public KeylineState getDefaultState()
  {
    return this.defaultState;
  }
  
  public KeylineState getLeftState()
  {
    List localList = this.leftStateSteps;
    int i = localList.size() + -1;
    return (KeylineState)localList.get(i);
  }
  
  public KeylineState getRightState()
  {
    List localList = this.rightStateSteps;
    int i = localList.size() + -1;
    return (KeylineState)localList.get(i);
  }
  
  public KeylineState getShiftedState(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = this.leftShiftRange + paramFloat2;
    float f2 = this.rightShiftRange;
    f2 = paramFloat3 - f2;
    boolean bool1 = paramFloat1 < f1;
    float f3 = 1.0F;
    List localList;
    float[] arrayOfFloat;
    if (bool1)
    {
      paramFloat1 = AnimationUtils.lerp(f3, 0.0F, paramFloat2, f1, paramFloat1);
      localList = this.leftStateSteps;
      arrayOfFloat = this.leftStateStepsInterpolationPoints;
      return lerp(localList, paramFloat1, arrayOfFloat);
    }
    boolean bool2 = paramFloat1 < f2;
    if (bool2)
    {
      paramFloat1 = AnimationUtils.lerp(0.0F, f3, f2, paramFloat3, paramFloat1);
      localList = this.rightStateSteps;
      arrayOfFloat = this.rightStateStepsInterpolationPoints;
      return lerp(localList, paramFloat1, arrayOfFloat);
    }
    return this.defaultState;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.KeylineStateList
 * JD-Core Version:    0.7.0.1
 */