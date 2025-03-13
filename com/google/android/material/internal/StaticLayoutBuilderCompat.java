package com.google.android.material.internal;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

final class StaticLayoutBuilderCompat
{
  static final int DEFAULT_HYPHENATION_FREQUENCY = 1;
  static final float DEFAULT_LINE_SPACING_ADD = 0.0F;
  static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0F;
  private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
  private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
  private static final String TEXT_DIR_CLASS_LTR = "LTR";
  private static final String TEXT_DIR_CLASS_RTL = "RTL";
  private static Constructor constructor;
  private static boolean initialized;
  private static Object textDirection;
  private Layout.Alignment alignment;
  private TextUtils.TruncateAt ellipsize;
  private int end;
  private int hyphenationFrequency;
  private boolean includePad;
  private boolean isRtl;
  private float lineSpacingAdd;
  private float lineSpacingMultiplier;
  private int maxLines;
  private final TextPaint paint;
  private CharSequence source;
  private int start;
  private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
  private final int width;
  
  private StaticLayoutBuilderCompat(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt)
  {
    this.source = paramCharSequence;
    this.paint = paramTextPaint;
    this.width = paramInt;
    this.start = 0;
    int i = paramCharSequence.length();
    this.end = i;
    paramCharSequence = Layout.Alignment.ALIGN_NORMAL;
    this.alignment = paramCharSequence;
    this.maxLines = (-1 >>> 1);
    this.lineSpacingAdd = 0.0F;
    this.lineSpacingMultiplier = 1.0F;
    i = DEFAULT_HYPHENATION_FREQUENCY;
    this.hyphenationFrequency = i;
    this.includePad = true;
    this.ellipsize = null;
  }
  
  private void createConstructorWithReflection()
  {
    boolean bool1 = initialized;
    if (bool1) {
      return;
    }
    try
    {
      bool1 = this.isRtl;
      localObject1 = null;
      boolean bool2 = true;
      if (bool1)
      {
        bool1 = bool2;
      }
      else
      {
        bool1 = false;
        localObject2 = null;
      }
      Object localObject3 = TextDirectionHeuristic.class;
      if (bool1) {
        localObject2 = TextDirectionHeuristics.RTL;
      } else {
        localObject2 = TextDirectionHeuristics.LTR;
      }
      textDirection = localObject2;
      int i = 13;
      Object localObject2 = new Class[i];
      Object localObject4 = CharSequence.class;
      localObject2[0] = localObject4;
      localObject1 = Integer.TYPE;
      localObject2[bool2] = localObject1;
      int j = 2;
      localObject2[j] = localObject1;
      localObject4 = TextPaint.class;
      int k = 3;
      localObject2[k] = localObject4;
      j = 4;
      localObject2[j] = localObject1;
      localObject4 = Layout.Alignment.class;
      k = 5;
      localObject2[k] = localObject4;
      j = 6;
      localObject2[j] = localObject3;
      localObject3 = Float.TYPE;
      j = 7;
      localObject2[j] = localObject3;
      j = 8;
      localObject2[j] = localObject3;
      localObject3 = Boolean.TYPE;
      j = 9;
      localObject2[j] = localObject3;
      localObject3 = TextUtils.TruncateAt.class;
      j = 10;
      localObject2[j] = localObject3;
      int m = 11;
      localObject2[m] = localObject1;
      m = 12;
      localObject2[m] = localObject1;
      localObject1 = StaticLayout.class;
      localObject2 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject2);
      constructor = (Constructor)localObject2;
      ((AccessibleObject)localObject2).setAccessible(bool2);
      initialized = bool2;
      return;
    }
    catch (Exception localException)
    {
      Object localObject1 = new com/google/android/material/internal/StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
      ((StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException)localObject1).<init>(localException);
      throw ((Throwable)localObject1);
    }
  }
  
  public static StaticLayoutBuilderCompat obtain(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt)
  {
    StaticLayoutBuilderCompat localStaticLayoutBuilderCompat = new com/google/android/material/internal/StaticLayoutBuilderCompat;
    localStaticLayoutBuilderCompat.<init>(paramCharSequence, paramTextPaint, paramInt);
    return localStaticLayoutBuilderCompat;
  }
  
  public StaticLayout build()
  {
    Object localObject1 = this.source;
    if (localObject1 == null)
    {
      localObject1 = "";
      this.source = ((CharSequence)localObject1);
    }
    localObject1 = null;
    int i = this.width;
    int k = Math.max(0, i);
    Object localObject2 = this.source;
    int m = this.maxLines;
    int n = 1;
    float f1;
    if (m == n)
    {
      localTextPaint = this.paint;
      f1 = k;
      localObject3 = this.ellipsize;
      localObject2 = TextUtils.ellipsize((CharSequence)localObject2, localTextPaint, f1, (TextUtils.TruncateAt)localObject3);
    }
    m = ((CharSequence)localObject2).length();
    int i1 = this.end;
    m = Math.min(m, i1);
    this.end = m;
    boolean bool3 = this.isRtl;
    if (bool3)
    {
      i2 = this.maxLines;
      if (i2 == n)
      {
        Layout.Alignment localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
        this.alignment = localAlignment;
      }
    }
    int i2 = this.start;
    Object localObject3 = this.paint;
    localObject1 = StaticLayout.Builder.obtain((CharSequence)localObject2, i2, m, (TextPaint)localObject3, k);
    localObject2 = this.alignment;
    ((StaticLayout.Builder)localObject1).setAlignment((Layout.Alignment)localObject2);
    boolean bool1 = this.includePad;
    ((StaticLayout.Builder)localObject1).setIncludePad(bool1);
    bool1 = this.isRtl;
    if (bool1) {
      localObject2 = TextDirectionHeuristics.RTL;
    } else {
      localObject2 = TextDirectionHeuristics.LTR;
    }
    ((StaticLayout.Builder)localObject1).setTextDirection((TextDirectionHeuristic)localObject2);
    localObject2 = this.ellipsize;
    if (localObject2 != null) {
      ((StaticLayout.Builder)localObject1).setEllipsize((TextUtils.TruncateAt)localObject2);
    }
    int j = this.maxLines;
    ((StaticLayout.Builder)localObject1).setMaxLines(j);
    float f2 = this.lineSpacingAdd;
    float f3 = 0.0F;
    TextPaint localTextPaint = null;
    boolean bool2 = f2 < 0.0F;
    if (!bool2)
    {
      f3 = this.lineSpacingMultiplier;
      i2 = 1065353216;
      f1 = 1.0F;
      bool2 = f3 < f1;
      if (!bool2) {}
    }
    else
    {
      f3 = this.lineSpacingMultiplier;
      ((StaticLayout.Builder)localObject1).setLineSpacing(f2, f3);
    }
    j = this.maxLines;
    if (j > n)
    {
      j = this.hyphenationFrequency;
      ((StaticLayout.Builder)localObject1).setHyphenationFrequency(j);
    }
    localObject2 = this.staticLayoutBuilderConfigurer;
    if (localObject2 != null) {
      ((StaticLayoutBuilderConfigurer)localObject2).configure((StaticLayout.Builder)localObject1);
    }
    return ((StaticLayout.Builder)localObject1).build();
  }
  
  public StaticLayoutBuilderCompat setAlignment(Layout.Alignment paramAlignment)
  {
    this.alignment = paramAlignment;
    return this;
  }
  
  public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    this.ellipsize = paramTruncateAt;
    return this;
  }
  
  public StaticLayoutBuilderCompat setEnd(int paramInt)
  {
    this.end = paramInt;
    return this;
  }
  
  public StaticLayoutBuilderCompat setHyphenationFrequency(int paramInt)
  {
    this.hyphenationFrequency = paramInt;
    return this;
  }
  
  public StaticLayoutBuilderCompat setIncludePad(boolean paramBoolean)
  {
    this.includePad = paramBoolean;
    return this;
  }
  
  public StaticLayoutBuilderCompat setIsRtl(boolean paramBoolean)
  {
    this.isRtl = paramBoolean;
    return this;
  }
  
  public StaticLayoutBuilderCompat setLineSpacing(float paramFloat1, float paramFloat2)
  {
    this.lineSpacingAdd = paramFloat1;
    this.lineSpacingMultiplier = paramFloat2;
    return this;
  }
  
  public StaticLayoutBuilderCompat setMaxLines(int paramInt)
  {
    this.maxLines = paramInt;
    return this;
  }
  
  public StaticLayoutBuilderCompat setStart(int paramInt)
  {
    this.start = paramInt;
    return this;
  }
  
  public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer paramStaticLayoutBuilderConfigurer)
  {
    this.staticLayoutBuilderConfigurer = paramStaticLayoutBuilderConfigurer;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.StaticLayoutBuilderCompat
 * JD-Core Version:    0.7.0.1
 */