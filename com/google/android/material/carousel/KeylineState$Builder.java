package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.List;
import m54207b69;

final class KeylineState$Builder
{
  private static final int NO_INDEX = 255;
  private static final float UNKNOWN_LOC = 1.4E-45F;
  private int firstFocalKeylineIndex;
  private final float itemSize;
  private int lastFocalKeylineIndex;
  private float lastKeylineMaskedSize;
  private KeylineState.Keyline tmpFirstFocalKeyline;
  private final List tmpKeylines;
  private KeylineState.Keyline tmpLastFocalKeyline;
  
  public KeylineState$Builder(float paramFloat)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.tmpKeylines = localArrayList;
    int i = -1;
    this.firstFocalKeylineIndex = i;
    this.lastFocalKeylineIndex = i;
    this.lastKeylineMaskedSize = 0.0F;
    this.itemSize = paramFloat;
  }
  
  private static float calculateKeylineLocationForItemPosition(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    float f = paramInt1 * paramFloat2;
    paramFloat1 -= f;
    f = paramInt2 * paramFloat2;
    return paramFloat1 + f;
  }
  
  public Builder addKeyline(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return addKeyline(paramFloat1, paramFloat2, paramFloat3, false);
  }
  
  public Builder addKeyline(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    KeylineState.Keyline localKeyline = null;
    boolean bool1 = paramFloat3 < 0.0F;
    if (!bool1) {
      return this;
    }
    localKeyline = new com/google/android/material/carousel/KeylineState$Keyline;
    float f = 1.4E-45F;
    localKeyline.<init>(f, paramFloat1, paramFloat2, paramFloat3);
    Object localObject = this.tmpFirstFocalKeyline;
    String str;
    if (paramBoolean)
    {
      if (localObject == null)
      {
        this.tmpFirstFocalKeyline = localKeyline;
        localObject = this.tmpKeylines;
        i = ((List)localObject).size();
        this.firstFocalKeylineIndex = i;
      }
      int i = this.lastFocalKeylineIndex;
      int k = -1;
      paramFloat2 = 0.0F / 0.0F;
      if (i != k)
      {
        localObject = this.tmpKeylines;
        i = ((List)localObject).size();
        k = this.lastFocalKeylineIndex;
        i -= k;
        k = 1;
        paramFloat2 = 1.4E-45F;
        if (i > k)
        {
          localObject = new java/lang/IllegalArgumentException;
          str = m54207b69.F54207b69_11("wR19382D413F413D287A483D2B4544448143328447514649558A58413C428F4E5692436056555C5C99646054519E536BA16764636DA6725C716F59B6AD4277755F77B373768081836DBA7981BD888A8ACE848E838692C78F8E83979597937ED08F9787879A9BA1D89BA59A9DA9DEA6A59AAEACAEAA95F1");
          ((IllegalArgumentException)localObject).<init>(str);
          throw ((Throwable)localObject);
        }
      }
      localObject = this.tmpFirstFocalKeyline;
      paramFloat1 = ((KeylineState.Keyline)localObject).maskedItemSize;
      boolean bool2 = paramFloat3 < paramFloat1;
      if (!bool2)
      {
        this.tmpLastFocalKeyline = localKeyline;
        localObject = this.tmpKeylines;
        int j = ((List)localObject).size();
        this.lastFocalKeylineIndex = j;
      }
      else
      {
        localObject = new java/lang/IllegalArgumentException;
        str = m54207b69.F54207b69_11("7F0D24412D332D293C6E3B38323E73354333773D3A484239397E404F813C4643464A874D5659578C4E52539059535D5195625F5599695C615A9E646170696060A56F73656EAA7A75836BB1");
        ((IllegalArgumentException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
    }
    else
    {
      boolean bool3;
      if (localObject == null)
      {
        paramFloat1 = localKeyline.maskedItemSize;
        paramFloat2 = this.lastKeylineMaskedSize;
        bool3 = paramFloat1 < paramFloat2;
        if (bool3)
        {
          localObject = new java/lang/IllegalArgumentException;
          str = m54207b69.F54207b69_11("Yv3D14111D231D190C5E1D1D1B25112165122F256924341A1C1A6F2A34313438753D34313D433D397D432C2F2D82414185493544463848488D4C48905A545242525B545A45635D579D63604F685F5FA46E52646DA95974626AB0");
          ((IllegalArgumentException)localObject).<init>(str);
          throw ((Throwable)localObject);
        }
      }
      localObject = this.tmpLastFocalKeyline;
      if (localObject != null)
      {
        paramFloat1 = localKeyline.maskedItemSize;
        paramFloat2 = this.lastKeylineMaskedSize;
        bool3 = paramFloat1 < paramFloat2;
        if (bool3)
        {
          localObject = new java/lang/IllegalArgumentException;
          str = m54207b69.F54207b69_11("3[103F243A363A442F8343473A4A36893E434F8D4A4E3D4592554D525553984E5D4258545862A05C555058A5646AA862586F6F5B7173B06F59B3787873657B786772767EBE7A7F6E778688C57D7B8B84CA78837391C9");
          ((IllegalArgumentException)localObject).<init>(str);
          throw ((Throwable)localObject);
        }
      }
    }
    paramFloat1 = localKeyline.maskedItemSize;
    this.lastKeylineMaskedSize = paramFloat1;
    this.tmpKeylines.add(localKeyline);
    return this;
  }
  
  public Builder addKeylineRange(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    return addKeylineRange(paramFloat1, paramFloat2, paramFloat3, paramInt, false);
  }
  
  public Builder addKeylineRange(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, boolean paramBoolean)
  {
    if (paramInt > 0)
    {
      int i = paramFloat3 < 0.0F;
      if (i > 0)
      {
        i = 0;
        while (i < paramInt)
        {
          float f = i * paramFloat3 + paramFloat1;
          addKeyline(f, paramFloat2, paramFloat3, paramBoolean);
          i += 1;
        }
      }
    }
    return this;
  }
  
  public KeylineState build()
  {
    Object localObject1 = this.tmpFirstFocalKeyline;
    if (localObject1 != null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = 0;
      localObject1 = null;
      for (;;)
      {
        localObject2 = this.tmpKeylines;
        int j = ((List)localObject2).size();
        if (i >= j) {
          break;
        }
        localObject2 = (KeylineState.Keyline)this.tmpKeylines.get(i);
        KeylineState.Keyline localKeyline1 = new com/google/android/material/carousel/KeylineState$Keyline;
        KeylineState.Keyline localKeyline2 = this.tmpFirstFocalKeyline;
        float f1 = localKeyline2.locOffset;
        float f2 = this.itemSize;
        int k = this.firstFocalKeylineIndex;
        f1 = calculateKeylineLocationForItemPosition(f1, f2, k, i);
        f2 = ((KeylineState.Keyline)localObject2).locOffset;
        float f3 = ((KeylineState.Keyline)localObject2).mask;
        float f4 = ((KeylineState.Keyline)localObject2).maskedItemSize;
        localKeyline1.<init>(f1, f2, f3, f4);
        localArrayList.add(localKeyline1);
        i += 1;
      }
      localObject1 = new com/google/android/material/carousel/KeylineState;
      float f5 = this.itemSize;
      int m = this.firstFocalKeylineIndex;
      int n = this.lastFocalKeylineIndex;
      localObject2 = localObject1;
      ((KeylineState)localObject1).<init>(f5, localArrayList, m, n, null);
      return localObject1;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = m54207b69.F54207b69_11("*&724F4557470B515A5D5B104F4F1355155D54715D635D591D63606E685F5F24667527626C696C702F");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.KeylineState.Builder
 * JD-Core Version:    0.7.0.1
 */