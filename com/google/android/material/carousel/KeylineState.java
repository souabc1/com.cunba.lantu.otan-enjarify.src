package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m54207b69;

final class KeylineState
{
  private final int firstFocalKeylineIndex;
  private final float itemSize;
  private final List keylines;
  private final int lastFocalKeylineIndex;
  
  private KeylineState(float paramFloat, List paramList, int paramInt1, int paramInt2)
  {
    this.itemSize = paramFloat;
    List localList = Collections.unmodifiableList(paramList);
    this.keylines = localList;
    this.firstFocalKeylineIndex = paramInt1;
    this.lastFocalKeylineIndex = paramInt2;
  }
  
  public static KeylineState lerp(KeylineState paramKeylineState1, KeylineState paramKeylineState2, float paramFloat)
  {
    float f1 = paramKeylineState1.getItemSize();
    float f2 = paramKeylineState2.getItemSize();
    boolean bool = f1 < f2;
    if (!bool)
    {
      List localList1 = paramKeylineState1.getKeylines();
      List localList2 = paramKeylineState2.getKeylines();
      int j = localList1.size();
      int k = localList2.size();
      if (j == k)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        k = 0;
        for (;;)
        {
          Object localObject = paramKeylineState1.getKeylines();
          int m = ((List)localObject).size();
          if (k >= m) {
            break;
          }
          localObject = (KeylineState.Keyline)localList1.get(k);
          KeylineState.Keyline localKeyline = (KeylineState.Keyline)localList2.get(k);
          localObject = KeylineState.Keyline.lerp((KeylineState.Keyline)localObject, localKeyline, paramFloat);
          localArrayList.add(localObject);
          k += 1;
        }
        int i = paramKeylineState1.getFirstFocalKeylineIndex();
        int n = paramKeylineState2.getFirstFocalKeylineIndex();
        i = AnimationUtils.lerp(i, n, paramFloat);
        n = paramKeylineState1.getLastFocalKeylineIndex();
        int i1 = paramKeylineState2.getLastFocalKeylineIndex();
        i1 = AnimationUtils.lerp(n, i1, paramFloat);
        KeylineState localKeylineState = new com/google/android/material/carousel/KeylineState;
        float f3 = paramKeylineState1.getItemSize();
        localKeylineState.<init>(f3, localArrayList, i, i1);
        return localKeylineState;
      }
      paramKeylineState1 = new java/lang/IllegalArgumentException;
      paramKeylineState2 = m54207b69.F54207b69_11("KO042B38262A263043773634312D357D3236323C4151384C863E3A5545595C3E424E5C4C4E934760636398515965579D6A575BA16F625760A659735C68667AAD5F69B0666D7A686C687285AB");
      paramKeylineState1.<init>(paramKeylineState2);
      throw paramKeylineState1;
    }
    paramKeylineState1 = new java/lang/IllegalArgumentException;
    paramKeylineState2 = m54207b69.F54207b69_11("`b29081D110F110D184A0911161812501D1B1D191624233159232530222C2F2B2D2337292966343D383E6B342E403470453A38744437443D79434F414A7E4E4957478D");
    paramKeylineState1.<init>(paramKeylineState2);
    throw paramKeylineState1;
  }
  
  public static KeylineState reverse(KeylineState paramKeylineState)
  {
    KeylineState.Builder localBuilder = new com/google/android/material/carousel/KeylineState$Builder;
    float f1 = paramKeylineState.getItemSize();
    localBuilder.<init>(f1);
    KeylineState.Keyline localKeyline1 = paramKeylineState.getFirstKeyline();
    f1 = localKeyline1.locOffset;
    float f2 = paramKeylineState.getFirstKeyline().maskedItemSize;
    float f3 = 2.0F;
    f2 /= f3;
    f1 -= f2;
    List localList = paramKeylineState.getKeylines();
    int i = localList.size();
    int j = 1;
    i -= j;
    while (i >= 0)
    {
      KeylineState.Keyline localKeyline2 = (KeylineState.Keyline)paramKeylineState.getKeylines().get(i);
      float f4 = localKeyline2.maskedItemSize / f3 + f1;
      int k = paramKeylineState.getFirstFocalKeylineIndex();
      if (i >= k)
      {
        k = paramKeylineState.getLastFocalKeylineIndex();
        if (i <= k)
        {
          k = j;
          break label143;
        }
      }
      k = 0;
      label143:
      float f5 = localKeyline2.mask;
      float f6 = localKeyline2.maskedItemSize;
      localBuilder.addKeyline(f4, f5, f6, k);
      float f7 = localKeyline2.maskedItemSize;
      f1 += f7;
      i += -1;
    }
    return localBuilder.build();
  }
  
  public KeylineState.Keyline getFirstFocalKeyline()
  {
    List localList = this.keylines;
    int i = this.firstFocalKeylineIndex;
    return (KeylineState.Keyline)localList.get(i);
  }
  
  public int getFirstFocalKeylineIndex()
  {
    return this.firstFocalKeylineIndex;
  }
  
  public KeylineState.Keyline getFirstKeyline()
  {
    return (KeylineState.Keyline)this.keylines.get(0);
  }
  
  public float getItemSize()
  {
    return this.itemSize;
  }
  
  public List getKeylines()
  {
    return this.keylines;
  }
  
  public KeylineState.Keyline getLastFocalKeyline()
  {
    List localList = this.keylines;
    int i = this.lastFocalKeylineIndex;
    return (KeylineState.Keyline)localList.get(i);
  }
  
  public int getLastFocalKeylineIndex()
  {
    return this.lastFocalKeylineIndex;
  }
  
  public KeylineState.Keyline getLastKeyline()
  {
    List localList = this.keylines;
    int i = localList.size() + -1;
    return (KeylineState.Keyline)localList.get(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.KeylineState
 * JD-Core Version:    0.7.0.1
 */