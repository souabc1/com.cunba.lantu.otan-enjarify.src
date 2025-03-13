package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.CancelableFontCallback.ApplyFont;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.resources.TypefaceUtils;

public final class CollapsingTextHelper
{
  private static final boolean DEBUG_DRAW = false;
  private static final Paint DEBUG_DRAW_PAINT = null;
  private static final String ELLIPSIS_NORMAL = "…";
  private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5F;
  private static final String TAG = "CollapsingTextHelper";
  private static final boolean USE_SCALING_TEXTURE = false;
  private boolean boundsChanged;
  private final Rect collapsedBounds;
  private float collapsedDrawX;
  private float collapsedDrawY;
  private CancelableFontCallback collapsedFontCallback;
  private float collapsedLetterSpacing;
  private ColorStateList collapsedShadowColor;
  private float collapsedShadowDx;
  private float collapsedShadowDy;
  private float collapsedShadowRadius;
  private float collapsedTextBlend;
  private ColorStateList collapsedTextColor;
  private int collapsedTextGravity;
  private float collapsedTextSize;
  private float collapsedTextWidth;
  private Typeface collapsedTypeface;
  private Typeface collapsedTypefaceBold;
  private Typeface collapsedTypefaceDefault;
  private final RectF currentBounds;
  private float currentDrawX;
  private float currentDrawY;
  private float currentLetterSpacing;
  private int currentOffsetY;
  private int currentShadowColor;
  private float currentShadowDx;
  private float currentShadowDy;
  private float currentShadowRadius;
  private float currentTextSize;
  private Typeface currentTypeface;
  private final Rect expandedBounds;
  private float expandedDrawX;
  private float expandedDrawY;
  private CancelableFontCallback expandedFontCallback;
  private float expandedFraction;
  private float expandedLetterSpacing;
  private int expandedLineCount;
  private ColorStateList expandedShadowColor;
  private float expandedShadowDx;
  private float expandedShadowDy;
  private float expandedShadowRadius;
  private float expandedTextBlend;
  private ColorStateList expandedTextColor;
  private int expandedTextGravity;
  private float expandedTextSize;
  private Bitmap expandedTitleTexture;
  private Typeface expandedTypeface;
  private Typeface expandedTypefaceBold;
  private Typeface expandedTypefaceDefault;
  private boolean fadeModeEnabled;
  private float fadeModeStartFraction;
  private float fadeModeThresholdFraction;
  private int hyphenationFrequency;
  private boolean isRtl;
  private boolean isRtlTextDirectionHeuristicsEnabled;
  private float lineSpacingAdd;
  private float lineSpacingMultiplier;
  private int maxLines;
  private TimeInterpolator positionInterpolator;
  private float scale;
  private int[] state;
  private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
  private CharSequence text;
  private StaticLayout textLayout;
  private final TextPaint textPaint;
  private TimeInterpolator textSizeInterpolator;
  private CharSequence textToDraw;
  private CharSequence textToDrawCollapsed;
  private Paint texturePaint;
  private TextUtils.TruncateAt titleTextEllipsize;
  private final TextPaint tmpPaint;
  private boolean useTexture;
  private final View view;
  
  public CollapsingTextHelper(View paramView)
  {
    int i = 16;
    this.expandedTextGravity = i;
    this.collapsedTextGravity = i;
    float f = 15.0F;
    this.expandedTextSize = f;
    this.collapsedTextSize = f;
    Object localObject = TextUtils.TruncateAt.END;
    this.titleTextEllipsize = ((TextUtils.TruncateAt)localObject);
    i = 1;
    this.isRtlTextDirectionHeuristicsEnabled = i;
    this.maxLines = i;
    this.lineSpacingAdd = 0.0F;
    this.lineSpacingMultiplier = 1.0F;
    i = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;
    this.hyphenationFrequency = i;
    this.view = paramView;
    localObject = new android/text/TextPaint;
    ((TextPaint)localObject).<init>(129);
    this.textPaint = ((TextPaint)localObject);
    TextPaint localTextPaint = new android/text/TextPaint;
    localTextPaint.<init>((Paint)localObject);
    this.tmpPaint = localTextPaint;
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.collapsedBounds = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.expandedBounds = ((Rect)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.currentBounds = ((RectF)localObject);
    f = calculateFadeModeThresholdFraction();
    this.fadeModeThresholdFraction = f;
    paramView = paramView.getContext().getResources().getConfiguration();
    maybeUpdateFontWeightAdjustment(paramView);
  }
  
  private static int blendARGB(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1) * f1;
    float f3 = Color.alpha(paramInt2) * paramFloat;
    f2 += f3;
    f3 = Color.red(paramInt1) * f1;
    float f4 = Color.red(paramInt2) * paramFloat;
    f3 += f4;
    f4 = Color.green(paramInt1) * f1;
    float f5 = Color.green(paramInt2) * paramFloat;
    f4 += f5;
    float f6 = Color.blue(paramInt1) * f1;
    float f7 = Color.blue(paramInt2) * paramFloat;
    f6 += f7;
    paramInt2 = Math.round(f2);
    int i = Math.round(f3);
    int j = Math.round(f4);
    paramInt1 = Math.round(f6);
    return Color.argb(paramInt2, i, j, paramInt1);
  }
  
  private void calculateBaseOffsets(boolean paramBoolean)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    calculateUsingTextSize(f1, paramBoolean);
    Object localObject1 = this.textToDraw;
    Object localObject3;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject2 = this.textLayout;
      if (localObject2 != null)
      {
        localObject3 = this.textPaint;
        j = ((Layout)localObject2).getWidth();
        f2 = j;
        localObject4 = this.titleTextEllipsize;
        localObject1 = TextUtils.ellipsize((CharSequence)localObject1, (TextPaint)localObject3, f2, (TextUtils.TruncateAt)localObject4);
        this.textToDrawCollapsed = ((CharSequence)localObject1);
      }
    }
    localObject1 = this.textToDrawCollapsed;
    int j = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject3 = this.textPaint;
      f1 = measureTextWidth((TextPaint)localObject3, (CharSequence)localObject1);
      this.collapsedTextWidth = f1;
    }
    else
    {
      this.collapsedTextWidth = 0.0F;
    }
    i = this.collapsedTextGravity;
    int k = this.isRtl;
    i = GravityCompat.OooO0O0(i, k);
    int m = i & 0x70;
    int n = 80;
    float f3 = 1.121039E-043F;
    int i1 = 48;
    float f4 = 2.0F;
    if (m != i1)
    {
      if (m != n)
      {
        localObject3 = this.textPaint;
        f5 = ((Paint)localObject3).descent();
        f6 = this.textPaint.ascent();
        f5 = (f5 - f6) / f4;
        localObject5 = this.collapsedBounds;
        bool1 = ((Rect)localObject5).centerY();
        f6 = bool1 - f5;
        this.collapsedDrawY = f6;
        break label308;
      }
      localObject3 = this.collapsedBounds;
      m = ((Rect)localObject3).bottom;
      f5 = m;
      Object localObject5 = this.textPaint;
      f6 = ((Paint)localObject5).ascent();
      f5 += f6;
    }
    else
    {
      localObject3 = this.collapsedBounds;
      m = ((Rect)localObject3).top;
      f5 = m;
    }
    this.collapsedDrawY = f5;
    label308:
    m = 8388615;
    float f5 = 1.175495E-038F;
    i &= m;
    boolean bool1 = true;
    float f6 = 7.006492E-045F;
    boolean bool2 = true;
    float f7;
    if (i != bool2)
    {
      if (i != bool1)
      {
        localObject1 = this.collapsedBounds;
        i = ((Rect)localObject1).left;
        f1 = i;
        break label417;
      }
      localObject1 = this.collapsedBounds;
      i = ((Rect)localObject1).right;
      f1 = i;
      f7 = this.collapsedTextWidth;
    }
    else
    {
      localObject1 = this.collapsedBounds;
      i = ((Rect)localObject1).centerX();
      f1 = i;
      f7 = this.collapsedTextWidth / f4;
    }
    f1 -= f7;
    label417:
    this.collapsedDrawX = f1;
    calculateUsingTextSize(0.0F, paramBoolean);
    Object localObject6 = this.textLayout;
    if (localObject6 != null)
    {
      paramBoolean = ((Layout)localObject6).getHeight();
      f8 = paramBoolean;
    }
    else
    {
      paramBoolean = false;
      localObject6 = null;
      f8 = 0.0F;
    }
    localObject1 = this.textLayout;
    if (localObject1 != null)
    {
      bool3 = this.maxLines;
      if (bool3 > bool2)
      {
        i = ((Layout)localObject1).getWidth();
        f2 = i;
        break label524;
      }
    }
    localObject1 = this.textToDraw;
    if (localObject1 != null)
    {
      localObject2 = this.textPaint;
      f2 = measureTextWidth((TextPaint)localObject2, (CharSequence)localObject1);
    }
    label524:
    localObject1 = this.textLayout;
    if (localObject1 != null)
    {
      i = ((StaticLayout)localObject1).getLineCount();
    }
    else
    {
      i = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    this.expandedLineCount = i;
    i = this.expandedTextGravity;
    boolean bool3 = this.isRtl;
    i = GravityCompat.OooO0O0(i, bool3);
    int i2 = i & 0x70;
    if (i2 != i1)
    {
      if (i2 != n)
      {
        f8 /= f4;
        localObject4 = this.expandedBounds;
        n = ((Rect)localObject4).centerY();
      }
      for (f3 = n - f8;; f3 += f8)
      {
        this.expandedDrawY = f3;
        break;
        localObject4 = this.expandedBounds;
        n = ((Rect)localObject4).bottom;
        f3 = n - f8;
        localObject6 = this.textPaint;
        f8 = ((Paint)localObject6).descent();
      }
    }
    localObject6 = this.expandedBounds;
    paramBoolean = ((Rect)localObject6).top;
    float f8 = paramBoolean;
    this.expandedDrawY = f8;
    paramBoolean = i & m;
    if (paramBoolean != bool2)
    {
      if (paramBoolean != bool1)
      {
        localObject6 = this.expandedBounds;
        paramBoolean = ((Rect)localObject6).left;
        f8 = paramBoolean;
        break label782;
      }
      localObject6 = this.expandedBounds;
      paramBoolean = ((Rect)localObject6).right;
      f8 = paramBoolean;
    }
    else
    {
      localObject6 = this.expandedBounds;
      paramBoolean = ((Rect)localObject6).centerX();
      f8 = paramBoolean;
      f2 /= f4;
    }
    f8 -= f2;
    label782:
    this.expandedDrawX = f8;
    clearTexture();
    f8 = this.expandedFraction;
    setInterpolatedTextSize(f8);
  }
  
  private void calculateCurrentOffsets()
  {
    float f = this.expandedFraction;
    calculateOffsets(f);
  }
  
  private float calculateFadeModeTextAlpha(float paramFloat)
  {
    float f1 = this.fadeModeThresholdFraction;
    boolean bool = paramFloat < f1;
    float f2 = 1.0F;
    if (!bool)
    {
      float f3 = this.fadeModeStartFraction;
      return AnimationUtils.lerp(f2, 0.0F, f3, f1, paramFloat);
    }
    return AnimationUtils.lerp(0.0F, f2, f1, f2, paramFloat);
  }
  
  private float calculateFadeModeThresholdFraction()
  {
    float f1 = this.fadeModeStartFraction;
    float f2 = (1.0F - f1) * 0.5F;
    return f1 + f2;
  }
  
  private boolean calculateIsRtl(CharSequence paramCharSequence)
  {
    boolean bool1 = isDefaultIsRtl();
    boolean bool2 = this.isRtlTextDirectionHeuristicsEnabled;
    if (bool2) {
      bool1 = isTextDirectionHeuristicsIsRtl(paramCharSequence, bool1);
    }
    return bool1;
  }
  
  private void calculateOffsets(float paramFloat)
  {
    interpolateBounds(paramFloat);
    boolean bool1 = this.fadeModeEnabled;
    int k = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int m = 1065353216;
    float f2 = 1.0F;
    int i1;
    if (bool1)
    {
      f3 = this.fadeModeThresholdFraction;
      bool1 = paramFloat < f3;
      if (bool1)
      {
        f3 = this.expandedDrawX;
        this.currentDrawX = f3;
        f3 = this.expandedDrawY;
        this.currentDrawY = f3;
        setInterpolatedTextSize(0.0F);
        bool1 = false;
        localObject2 = null;
        f3 = 0.0F;
      }
      else
      {
        f3 = this.collapsedDrawX;
        this.currentDrawX = f3;
        f3 = this.collapsedDrawY;
        int n = this.currentOffsetY;
        i1 = Math.max(0, n);
        f4 = i1;
        f3 -= f4;
        this.currentDrawY = f3;
        setInterpolatedTextSize(f2);
        bool1 = m;
        f3 = f2;
      }
    }
    else
    {
      f3 = this.expandedDrawX;
      f4 = this.collapsedDrawX;
      localTimeInterpolator = this.positionInterpolator;
      f3 = lerp(f3, f4, paramFloat, localTimeInterpolator);
      this.currentDrawX = f3;
      f3 = this.expandedDrawY;
      f4 = this.collapsedDrawY;
      localTimeInterpolator = this.positionInterpolator;
      f3 = lerp(f3, f4, paramFloat, localTimeInterpolator);
      this.currentDrawY = f3;
      setInterpolatedTextSize(paramFloat);
      f3 = paramFloat;
    }
    float f4 = f2 - paramFloat;
    TimeInterpolator localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    f4 = lerp(0.0F, f2, f4, localTimeInterpolator);
    f4 = f2 - f4;
    setCollapsedTextBlend(f4);
    f1 = lerp(f2, 0.0F, paramFloat, localTimeInterpolator);
    setExpandedTextBlend(f1);
    localObject1 = this.collapsedTextColor;
    Object localObject3 = this.expandedTextColor;
    if (localObject1 != localObject3)
    {
      localObject1 = this.textPaint;
      m = getCurrentExpandedTextColor();
      i1 = getCurrentCollapsedTextColor();
      i = blendARGB(m, i1, f3);
      ((Paint)localObject1).setColor(i);
    }
    else
    {
      localObject2 = this.textPaint;
      k = getCurrentCollapsedTextColor();
      ((Paint)localObject2).setColor(k);
    }
    float f3 = this.collapsedLetterSpacing;
    f1 = this.expandedLetterSpacing;
    boolean bool3 = f3 < f1;
    if (bool3)
    {
      localObject3 = this.textPaint;
      f3 = lerp(f1, f3, paramFloat, localTimeInterpolator);
      ((Paint)localObject3).setLetterSpacing(f3);
    }
    else
    {
      localObject1 = this.textPaint;
      ((Paint)localObject1).setLetterSpacing(f3);
    }
    f3 = this.expandedShadowRadius;
    f1 = this.collapsedShadowRadius;
    bool3 = false;
    localObject3 = null;
    f3 = lerp(f3, f1, paramFloat, null);
    this.currentShadowRadius = f3;
    f3 = this.expandedShadowDx;
    f1 = this.collapsedShadowDx;
    f3 = lerp(f3, f1, paramFloat, null);
    this.currentShadowDx = f3;
    f3 = this.expandedShadowDy;
    f1 = this.collapsedShadowDy;
    f3 = lerp(f3, f1, paramFloat, null);
    this.currentShadowDy = f3;
    Object localObject2 = this.expandedShadowColor;
    int i = getCurrentColor((ColorStateList)localObject2);
    localObject1 = this.collapsedShadowColor;
    k = getCurrentColor((ColorStateList)localObject1);
    i = blendARGB(i, k, paramFloat);
    this.currentShadowColor = i;
    localObject1 = this.textPaint;
    f2 = this.currentShadowRadius;
    f4 = this.currentShadowDx;
    float f5 = this.currentShadowDy;
    ((Paint)localObject1).setShadowLayer(f2, f4, f5, i);
    boolean bool2 = this.fadeModeEnabled;
    if (bool2)
    {
      int j = this.textPaint.getAlpha();
      paramFloat = calculateFadeModeTextAlpha(paramFloat);
      f3 = j;
      paramFloat *= f3;
      int i2 = (int)paramFloat;
      localObject2 = this.textPaint;
      ((Paint)localObject2).setAlpha(i2);
    }
    ViewCompat.Ooooooo(this.view);
  }
  
  private void calculateUsingTextSize(float paramFloat)
  {
    calculateUsingTextSize(paramFloat, false);
  }
  
  private void calculateUsingTextSize(float paramFloat, boolean paramBoolean)
  {
    Object localObject1 = this.text;
    if (localObject1 == null) {
      return;
    }
    localObject1 = this.collapsedBounds;
    int i = ((Rect)localObject1).width();
    float f1 = i;
    Object localObject2 = this.expandedBounds;
    int j = ((Rect)localObject2).width();
    float f2 = j;
    float f3 = 1.0F;
    boolean bool1 = isClose(paramFloat, f3);
    int k = 0;
    float f4 = 0.0F;
    float f5;
    float f6;
    Typeface localTypeface1;
    boolean bool2;
    float f8;
    float f9;
    if (bool1)
    {
      paramFloat = this.collapsedTextSize;
      f5 = this.collapsedLetterSpacing;
      this.scale = f3;
      localObject2 = this.collapsedTypeface;
    }
    else
    {
      f6 = this.expandedTextSize;
      f7 = this.expandedLetterSpacing;
      localTypeface1 = this.expandedTypeface;
      bool2 = isClose(paramFloat, 0.0F);
      if (bool2)
      {
        this.scale = f3;
      }
      else
      {
        f8 = this.expandedTextSize;
        f9 = this.collapsedTextSize;
        TimeInterpolator localTimeInterpolator = this.textSizeInterpolator;
        paramFloat = lerp(f8, f9, paramFloat, localTimeInterpolator);
        f8 = this.expandedTextSize;
        paramFloat /= f8;
        this.scale = paramFloat;
      }
      paramFloat = this.collapsedTextSize;
      f8 = this.expandedTextSize;
      paramFloat /= f8;
      f8 = f2 * paramFloat;
      if (paramBoolean) {}
      for (f1 = f2;; f1 = paramFloat)
      {
        paramFloat = f6;
        f5 = f7;
        localObject2 = localTypeface1;
        break label247;
        paramBoolean = f8 < f1;
        if (!paramBoolean) {
          break;
        }
        paramFloat = Math.min(f1 / paramFloat, f2);
      }
    }
    label247:
    bool1 = f1 < 0.0F;
    k = 1;
    f4 = 1.4E-45F;
    boolean bool3 = false;
    float f7 = 0.0F;
    if (bool1)
    {
      f6 = this.currentTextSize;
      bool1 = f6 < paramFloat;
      if (bool1)
      {
        bool1 = k;
        f6 = f4;
      }
      else
      {
        bool1 = false;
        f6 = 0.0F;
      }
      float f10 = this.currentLetterSpacing;
      boolean bool4 = f10 < f5;
      if (bool4)
      {
        bool4 = k;
        f10 = f4;
      }
      else
      {
        bool4 = false;
        localTypeface1 = null;
        f10 = 0.0F;
      }
      Typeface localTypeface2 = this.currentTypeface;
      if (localTypeface2 != localObject2)
      {
        bool2 = k;
        f8 = f4;
      }
      else
      {
        bool2 = false;
        localTypeface2 = null;
        f8 = 0.0F;
      }
      StaticLayout localStaticLayout = this.textLayout;
      if (localStaticLayout != null)
      {
        f9 = localStaticLayout.getWidth();
        bool5 = f1 < f9;
        if (bool5)
        {
          bool5 = k;
          f9 = f4;
          break label427;
        }
      }
      boolean bool5 = false;
      localStaticLayout = null;
      f9 = 0.0F;
      label427:
      if ((!bool1) && (!bool4) && (!bool5) && (!bool2))
      {
        bool1 = this.boundsChanged;
        if (!bool1)
        {
          bool1 = false;
          f6 = 0.0F;
          break label478;
        }
      }
      bool1 = k;
      f6 = f4;
      label478:
      this.currentTextSize = paramFloat;
      this.currentLetterSpacing = f5;
      this.currentTypeface = ((Typeface)localObject2);
      this.boundsChanged = false;
      localObject3 = this.textPaint;
      f5 = this.scale;
      paramBoolean = f5 < f3;
      if (paramBoolean)
      {
        bool3 = k;
        f7 = f4;
      }
      ((Paint)localObject3).setLinearText(bool3);
      bool3 = bool1;
      f7 = f6;
    }
    Object localObject3 = this.textToDraw;
    if ((localObject3 == null) || (bool3))
    {
      localObject3 = this.textPaint;
      f5 = this.currentTextSize;
      ((Paint)localObject3).setTextSize(f5);
      localObject3 = this.textPaint;
      Typeface localTypeface3 = this.currentTypeface;
      ((Paint)localObject3).setTypeface(localTypeface3);
      localObject3 = this.textPaint;
      f5 = this.currentLetterSpacing;
      ((Paint)localObject3).setLetterSpacing(f5);
      localObject3 = this.text;
      boolean bool6 = calculateIsRtl((CharSequence)localObject3);
      this.isRtl = bool6;
      bool6 = shouldDrawMultiline();
      if (bool6) {
        k = this.maxLines;
      }
      bool6 = this.isRtl;
      localObject3 = createStaticLayout(k, f1, bool6);
      this.textLayout = ((StaticLayout)localObject3);
      localObject3 = ((Layout)localObject3).getText();
      this.textToDraw = ((CharSequence)localObject3);
    }
  }
  
  private void clearTexture()
  {
    Bitmap localBitmap = this.expandedTitleTexture;
    if (localBitmap != null)
    {
      localBitmap.recycle();
      localBitmap = null;
      this.expandedTitleTexture = null;
    }
  }
  
  private StaticLayout createStaticLayout(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i = 1;
    if (paramInt == i) {}
    label23:
    Object localObject3;
    try
    {
      Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
      break label23;
      localAlignment = getMultilineTextLayoutAlignment();
      Object localObject1 = this.text;
      TextPaint localTextPaint = this.textPaint;
      int j = (int)paramFloat;
      Object localObject2 = StaticLayoutBuilderCompat.obtain((CharSequence)localObject1, localTextPaint, j);
      localObject1 = this.titleTextEllipsize;
      localObject2 = ((StaticLayoutBuilderCompat)localObject2).setEllipsize((TextUtils.TruncateAt)localObject1);
      localObject2 = ((StaticLayoutBuilderCompat)localObject2).setIsRtl(paramBoolean);
      localObject2 = ((StaticLayoutBuilderCompat)localObject2).setAlignment(localAlignment);
      paramBoolean = false;
      float f = 0.0F;
      localObject2 = ((StaticLayoutBuilderCompat)localObject2).setIncludePad(false);
      localObject3 = ((StaticLayoutBuilderCompat)localObject2).setMaxLines(paramInt);
      paramFloat = this.lineSpacingAdd;
      f = this.lineSpacingMultiplier;
      localObject3 = ((StaticLayoutBuilderCompat)localObject3).setLineSpacing(paramFloat, f);
      j = this.hyphenationFrequency;
      localObject3 = ((StaticLayoutBuilderCompat)localObject3).setHyphenationFrequency(j);
      localObject2 = this.staticLayoutBuilderConfigurer;
      localObject3 = ((StaticLayoutBuilderCompat)localObject3).setStaticLayoutBuilderConfigurer((StaticLayoutBuilderConfigurer)localObject2);
      localObject3 = ((StaticLayoutBuilderCompat)localObject3).build();
    }
    catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException localStaticLayoutBuilderCompatException)
    {
      localStaticLayoutBuilderCompatException.getCause().getMessage();
      paramInt = 0;
      localObject3 = null;
    }
    return (StaticLayout)Preconditions.OooO0oo(localObject3);
  }
  
  private void drawMultilineTransition(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    CollapsingTextHelper localCollapsingTextHelper = this;
    Object localObject1 = this.textPaint;
    int i = ((Paint)localObject1).getAlpha();
    paramCanvas.translate(paramFloat1, paramFloat2);
    boolean bool1 = this.fadeModeEnabled;
    int n = 31;
    float f1 = 4.344025E-044F;
    Object localObject2;
    float f2;
    float f3;
    if (!bool1)
    {
      localObject2 = this.textPaint;
      f2 = this.expandedTextBlend;
      f3 = i;
      f2 *= f3;
      i2 = (int)f2;
      ((Paint)localObject2).setAlpha(i2);
      int j = Build.VERSION.SDK_INT;
      if (j >= n)
      {
        localObject2 = this.textPaint;
        f2 = this.currentShadowRadius;
        f3 = this.currentShadowDx;
        f4 = this.currentShadowDy;
        i3 = this.currentShadowColor;
        i4 = ((Paint)localObject2).getAlpha();
        i3 = MaterialColors.compositeARGBWithAlpha(i3, i4);
        ((Paint)localObject2).setShadowLayer(f2, f3, f4, i3);
      }
      localObject2 = localCollapsingTextHelper.textLayout;
      ((Layout)localObject2).draw(paramCanvas);
    }
    boolean bool2 = localCollapsingTextHelper.fadeModeEnabled;
    if (!bool2)
    {
      localObject2 = localCollapsingTextHelper.textPaint;
      f2 = localCollapsingTextHelper.collapsedTextBlend;
      f3 = i;
      f2 *= f3;
      i2 = (int)f2;
      ((Paint)localObject2).setAlpha(i2);
    }
    int k = Build.VERSION.SDK_INT;
    if (k >= n)
    {
      localObject3 = localCollapsingTextHelper.textPaint;
      f3 = localCollapsingTextHelper.currentShadowRadius;
      f4 = localCollapsingTextHelper.currentShadowDx;
      float f5 = localCollapsingTextHelper.currentShadowDy;
      i4 = localCollapsingTextHelper.currentShadowColor;
      int i5 = ((Paint)localObject3).getAlpha();
      i4 = MaterialColors.compositeARGBWithAlpha(i4, i5);
      ((Paint)localObject3).setShadowLayer(f3, f4, f5, i4);
    }
    int i2 = localCollapsingTextHelper.textLayout.getLineBaseline(0);
    Object localObject4 = localCollapsingTextHelper.textToDrawCollapsed;
    int i6 = 0;
    float f4 = 0.0F;
    int i3 = ((CharSequence)localObject4).length();
    int i4 = 0;
    float f6 = i2;
    TextPaint localTextPaint = localCollapsingTextHelper.textPaint;
    Object localObject3 = paramCanvas;
    paramCanvas.drawText((CharSequence)localObject4, 0, i3, 0.0F, f6, localTextPaint);
    if (k >= n)
    {
      localObject2 = localCollapsingTextHelper.textPaint;
      f1 = localCollapsingTextHelper.currentShadowRadius;
      f2 = localCollapsingTextHelper.currentShadowDx;
      f3 = localCollapsingTextHelper.currentShadowDy;
      i6 = localCollapsingTextHelper.currentShadowColor;
      ((Paint)localObject2).setShadowLayer(f1, f2, f3, i6);
    }
    boolean bool3 = localCollapsingTextHelper.fadeModeEnabled;
    if (!bool3)
    {
      localObject2 = localCollapsingTextHelper.textToDrawCollapsed.toString().trim();
      String str = "…";
      boolean bool4 = ((String)localObject2).endsWith(str);
      if (bool4)
      {
        int i1 = ((String)localObject2).length() + -1;
        localObject2 = ((String)localObject2).substring(0, i1);
      }
      localObject4 = localObject2;
      localObject2 = localCollapsingTextHelper.textPaint;
      ((Paint)localObject2).setAlpha(i);
      i6 = 0;
      f4 = 0.0F;
      localObject1 = localCollapsingTextHelper.textLayout;
      i = ((Layout)localObject1).getLineEnd(0);
      int m = ((String)localObject4).length();
      i3 = Math.min(i, m);
      i4 = 0;
      localTextPaint = localCollapsingTextHelper.textPaint;
      localObject3 = paramCanvas;
      paramCanvas.drawText((String)localObject4, 0, i3, 0.0F, f6, localTextPaint);
    }
  }
  
  private void ensureExpandedTexture()
  {
    Object localObject1 = this.expandedTitleTexture;
    if (localObject1 == null)
    {
      localObject1 = this.expandedBounds;
      boolean bool = ((Rect)localObject1).isEmpty();
      if (!bool)
      {
        localObject1 = this.textToDraw;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool)
        {
          calculateOffsets(0.0F);
          localObject1 = this.textLayout;
          int i = ((Layout)localObject1).getWidth();
          Object localObject2 = this.textLayout;
          int j = ((Layout)localObject2).getHeight();
          if ((i > 0) && (j > 0))
          {
            Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
            localObject1 = Bitmap.createBitmap(i, j, localConfig);
            this.expandedTitleTexture = ((Bitmap)localObject1);
            localObject1 = new android/graphics/Canvas;
            localObject2 = this.expandedTitleTexture;
            ((Canvas)localObject1).<init>((Bitmap)localObject2);
            localObject2 = this.textLayout;
            ((Layout)localObject2).draw((Canvas)localObject1);
            localObject1 = this.texturePaint;
            if (localObject1 == null)
            {
              localObject1 = new android/graphics/Paint;
              j = 3;
              ((Paint)localObject1).<init>(j);
              this.texturePaint = ((Paint)localObject1);
            }
          }
        }
      }
    }
  }
  
  private float getCollapsedTextLeftBound(int paramInt1, int paramInt2)
  {
    int i = 17;
    float f1 = 2.382207E-044F;
    if (paramInt2 != i)
    {
      i = paramInt2 & 0x7;
      int j = 1;
      if (i != j)
      {
        paramInt1 = 8388613;
        f2 = 1.175495E-038F;
        i = paramInt2 & paramInt1;
        Rect localRect;
        if (i != paramInt1)
        {
          paramInt1 = 5;
          f2 = 7.006492E-045F;
          paramInt2 &= paramInt1;
          if (paramInt2 != paramInt1)
          {
            paramInt1 = this.isRtl;
            if (paramInt1 != 0)
            {
              localRect = this.collapsedBounds;
              paramInt1 = localRect.right;
              f2 = paramInt1;
              f3 = this.collapsedTextWidth;
              f2 -= f3;
            }
            else
            {
              localRect = this.collapsedBounds;
              paramInt1 = localRect.left;
              f2 = paramInt1;
            }
            return f2;
          }
        }
        paramInt1 = this.isRtl;
        if (paramInt1 != 0)
        {
          localRect = this.collapsedBounds;
          paramInt1 = localRect.left;
          f2 = paramInt1;
        }
        else
        {
          localRect = this.collapsedBounds;
          paramInt1 = localRect.right;
          f2 = paramInt1;
          f3 = this.collapsedTextWidth;
          f2 -= f3;
        }
        return f2;
      }
    }
    float f2 = paramInt1;
    float f3 = 2.0F;
    f2 /= f3;
    f1 = this.collapsedTextWidth / f3;
    return f2 - f1;
  }
  
  private float getCollapsedTextRightBound(RectF paramRectF, int paramInt1, int paramInt2)
  {
    int i = 17;
    if (paramInt2 != i)
    {
      i = paramInt2 & 0x7;
      int j = 1;
      if (i != j)
      {
        paramInt1 = 8388613;
        f1 = 1.175495E-038F;
        i = paramInt2 & paramInt1;
        int k;
        if (i != paramInt1)
        {
          paramInt1 = 5;
          f1 = 7.006492E-045F;
          paramInt2 &= paramInt1;
          if (paramInt2 != paramInt1)
          {
            paramInt1 = this.isRtl;
            if (paramInt1 != 0)
            {
              paramRectF = this.collapsedBounds;
              k = paramRectF.right;
              f2 = k;
            }
            else
            {
              f2 = paramRectF.left;
              f1 = this.collapsedTextWidth;
              f2 += f1;
            }
            return f2;
          }
        }
        paramInt1 = this.isRtl;
        if (paramInt1 != 0)
        {
          f2 = paramRectF.left;
          f1 = this.collapsedTextWidth;
          f2 += f1;
        }
        else
        {
          paramRectF = this.collapsedBounds;
          k = paramRectF.right;
          f2 = k;
        }
        return f2;
      }
    }
    float f2 = paramInt1;
    float f1 = 2.0F;
    f2 /= f1;
    float f3 = this.collapsedTextWidth / f1;
    return f2 + f3;
  }
  
  private int getCurrentColor(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null) {
      return 0;
    }
    int[] arrayOfInt = this.state;
    if (arrayOfInt != null) {
      return paramColorStateList.getColorForState(arrayOfInt, 0);
    }
    return paramColorStateList.getDefaultColor();
  }
  
  private int getCurrentExpandedTextColor()
  {
    ColorStateList localColorStateList = this.expandedTextColor;
    return getCurrentColor(localColorStateList);
  }
  
  private Layout.Alignment getMultilineTextLayoutAlignment()
  {
    int i = this.expandedTextGravity;
    int j = this.isRtl;
    i = GravityCompat.OooO0O0(i, j) & 0x7;
    int k = 1;
    if (i != k)
    {
      k = 5;
      Layout.Alignment localAlignment;
      if (i != k)
      {
        bool = this.isRtl;
        if (bool) {
          localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
          localAlignment = Layout.Alignment.ALIGN_NORMAL;
        }
        return localAlignment;
      }
      boolean bool = this.isRtl;
      if (bool) {
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
      } else {
        localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
      }
      return localAlignment;
    }
    return Layout.Alignment.ALIGN_CENTER;
  }
  
  private void getTextPaintCollapsed(TextPaint paramTextPaint)
  {
    float f = this.collapsedTextSize;
    paramTextPaint.setTextSize(f);
    Typeface localTypeface = this.collapsedTypeface;
    paramTextPaint.setTypeface(localTypeface);
    f = this.collapsedLetterSpacing;
    paramTextPaint.setLetterSpacing(f);
  }
  
  private void getTextPaintExpanded(TextPaint paramTextPaint)
  {
    float f = this.expandedTextSize;
    paramTextPaint.setTextSize(f);
    Typeface localTypeface = this.expandedTypeface;
    paramTextPaint.setTypeface(localTypeface);
    f = this.expandedLetterSpacing;
    paramTextPaint.setLetterSpacing(f);
  }
  
  private void interpolateBounds(float paramFloat)
  {
    boolean bool1 = this.fadeModeEnabled;
    RectF localRectF;
    float f1;
    if (bool1)
    {
      localRectF = this.currentBounds;
      f1 = this.fadeModeThresholdFraction;
      boolean bool2 = paramFloat < f1;
      Rect localRect1;
      if (bool2) {
        localRect1 = this.expandedBounds;
      } else {
        localRect1 = this.collapsedBounds;
      }
      localRectF.set(localRect1);
    }
    else
    {
      localRectF = this.currentBounds;
      f1 = this.expandedBounds.left;
      float f2 = this.collapsedBounds.left;
      TimeInterpolator localTimeInterpolator = this.positionInterpolator;
      f1 = lerp(f1, f2, paramFloat, localTimeInterpolator);
      localRectF.left = f1;
      localRectF = this.currentBounds;
      f1 = this.expandedDrawY;
      f2 = this.collapsedDrawY;
      localTimeInterpolator = this.positionInterpolator;
      f1 = lerp(f1, f2, paramFloat, localTimeInterpolator);
      localRectF.top = f1;
      localRectF = this.currentBounds;
      f1 = this.expandedBounds.right;
      f2 = this.collapsedBounds.right;
      localTimeInterpolator = this.positionInterpolator;
      f1 = lerp(f1, f2, paramFloat, localTimeInterpolator);
      localRectF.right = f1;
      localRectF = this.currentBounds;
      Rect localRect2 = this.expandedBounds;
      int i = localRect2.bottom;
      f1 = i;
      Rect localRect3 = this.collapsedBounds;
      int j = localRect3.bottom;
      f2 = j;
      localTimeInterpolator = this.positionInterpolator;
      paramFloat = lerp(f1, f2, paramFloat, localTimeInterpolator);
      localRectF.bottom = paramFloat;
    }
  }
  
  private static boolean isClose(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = Math.abs(paramFloat1 - paramFloat2);
    paramFloat2 = 1.0E-005F;
    boolean bool = paramFloat1 < paramFloat2;
    if (bool)
    {
      bool = true;
      paramFloat1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat1 = 0.0F;
    }
    return bool;
  }
  
  private boolean isDefaultIsRtl()
  {
    View localView = this.view;
    int i = ViewCompat.OooOoOO(localView);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  private boolean isTextDirectionHeuristicsIsRtl(CharSequence paramCharSequence, boolean paramBoolean)
  {
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat;
    if (paramBoolean) {
      localTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.OooO0Oo;
    } else {
      localTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.OooO0OO;
    }
    int i = paramCharSequence.length();
    return localTextDirectionHeuristicCompat.OooO00o(paramCharSequence, 0, i);
  }
  
  private static float lerp(float paramFloat1, float paramFloat2, float paramFloat3, TimeInterpolator paramTimeInterpolator)
  {
    if (paramTimeInterpolator != null) {
      paramFloat3 = paramTimeInterpolator.getInterpolation(paramFloat3);
    }
    return AnimationUtils.lerp(paramFloat1, paramFloat2, paramFloat3);
  }
  
  private float measureTextWidth(TextPaint paramTextPaint, CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    return paramTextPaint.measureText(paramCharSequence, 0, i);
  }
  
  private static boolean rectEquals(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramRect.left;
    if (i == paramInt1)
    {
      paramInt1 = paramRect.top;
      if (paramInt1 == paramInt2)
      {
        paramInt1 = paramRect.right;
        if (paramInt1 == paramInt3)
        {
          j = paramRect.bottom;
          if (j == paramInt4)
          {
            j = 1;
            break label56;
          }
        }
      }
    }
    int j = 0;
    paramRect = null;
    label56:
    return j;
  }
  
  private void setCollapsedTextBlend(float paramFloat)
  {
    this.collapsedTextBlend = paramFloat;
    ViewCompat.Ooooooo(this.view);
  }
  
  private boolean setCollapsedTypefaceInternal(Typeface paramTypeface)
  {
    Object localObject = this.collapsedFontCallback;
    if (localObject != null) {
      ((CancelableFontCallback)localObject).cancel();
    }
    localObject = this.collapsedTypefaceDefault;
    if (localObject != paramTypeface)
    {
      this.collapsedTypefaceDefault = paramTypeface;
      localObject = this.view.getContext().getResources().getConfiguration();
      paramTypeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment((Configuration)localObject, paramTypeface);
      this.collapsedTypefaceBold = paramTypeface;
      if (paramTypeface == null) {
        paramTypeface = this.collapsedTypefaceDefault;
      }
      this.collapsedTypeface = paramTypeface;
      return true;
    }
    return false;
  }
  
  private void setExpandedTextBlend(float paramFloat)
  {
    this.expandedTextBlend = paramFloat;
    ViewCompat.Ooooooo(this.view);
  }
  
  private boolean setExpandedTypefaceInternal(Typeface paramTypeface)
  {
    Object localObject = this.expandedFontCallback;
    if (localObject != null) {
      ((CancelableFontCallback)localObject).cancel();
    }
    localObject = this.expandedTypefaceDefault;
    if (localObject != paramTypeface)
    {
      this.expandedTypefaceDefault = paramTypeface;
      localObject = this.view.getContext().getResources().getConfiguration();
      paramTypeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment((Configuration)localObject, paramTypeface);
      this.expandedTypefaceBold = paramTypeface;
      if (paramTypeface == null) {
        paramTypeface = this.expandedTypefaceDefault;
      }
      this.expandedTypeface = paramTypeface;
      return true;
    }
    return false;
  }
  
  private void setInterpolatedTextSize(float paramFloat)
  {
    calculateUsingTextSize(paramFloat);
    boolean bool = USE_SCALING_TEXTURE;
    if (bool)
    {
      paramFloat = this.scale;
      float f = 1.0F;
      bool = paramFloat < f;
      if (bool)
      {
        bool = true;
        paramFloat = 1.4E-45F;
        break label41;
      }
    }
    bool = false;
    paramFloat = 0.0F;
    label41:
    this.useTexture = bool;
    if (bool) {
      ensureExpandedTexture();
    }
    ViewCompat.Ooooooo(this.view);
  }
  
  private boolean shouldDrawMultiline()
  {
    int i = this.maxLines;
    int j = 1;
    if (i > j)
    {
      boolean bool = this.isRtl;
      if (bool)
      {
        bool = this.fadeModeEnabled;
        if (!bool) {}
      }
      else
      {
        bool = this.useTexture;
        if (!bool) {
          return j;
        }
      }
    }
    j = 0;
    return j;
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = paramCanvas.save();
    Object localObject1 = this.textToDraw;
    if (localObject1 != null)
    {
      localObject1 = this.currentBounds;
      float f1 = ((RectF)localObject1).width();
      float f2 = 0.0F;
      boolean bool1 = f1 < 0.0F;
      if (bool1)
      {
        localObject1 = this.currentBounds;
        f1 = ((RectF)localObject1).height();
        bool1 = f1 < 0.0F;
        if (bool1)
        {
          localObject1 = this.textPaint;
          f2 = this.currentTextSize;
          ((Paint)localObject1).setTextSize(f2);
          f1 = this.currentDrawX;
          f2 = this.currentDrawY;
          boolean bool2 = this.useTexture;
          Paint localPaint = null;
          if (bool2)
          {
            localObject2 = this.expandedTitleTexture;
            if (localObject2 != null)
            {
              bool2 = true;
              f3 = 1.4E-45F;
              break label134;
            }
          }
          bool2 = false;
          Object localObject2 = null;
          float f3 = 0.0F;
          label134:
          float f4 = this.scale;
          float f5 = 1.0F;
          boolean bool3 = f4 < f5;
          if (bool3)
          {
            bool3 = this.fadeModeEnabled;
            if (!bool3) {
              paramCanvas.scale(f4, f4, f1, f2);
            }
          }
          if (bool2)
          {
            localObject2 = this.expandedTitleTexture;
            localPaint = this.texturePaint;
            paramCanvas.drawBitmap((Bitmap)localObject2, f1, f2, localPaint);
            paramCanvas.restoreToCount(i);
            return;
          }
          bool2 = shouldDrawMultiline();
          if (bool2)
          {
            bool2 = this.fadeModeEnabled;
            if (bool2)
            {
              f3 = this.expandedFraction;
              f4 = this.fadeModeThresholdFraction;
              bool2 = f3 < f4;
              if (!bool2) {}
            }
            else
            {
              f1 = this.currentDrawX;
              localObject2 = this.textLayout;
              int j = ((StaticLayout)localObject2).getLineStart(0);
              f3 = j;
              f1 -= f3;
              drawMultilineTransition(paramCanvas, f1, f2);
              break label322;
            }
          }
          paramCanvas.translate(f1, f2);
          localObject1 = this.textLayout;
          ((Layout)localObject1).draw(paramCanvas);
          label322:
          paramCanvas.restoreToCount(i);
        }
      }
    }
  }
  
  public void getCollapsedTextActualBounds(RectF paramRectF, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = this.text;
    boolean bool = calculateIsRtl(localCharSequence);
    this.isRtl = bool;
    float f1 = getCollapsedTextLeftBound(paramInt1, paramInt2);
    float f2 = this.collapsedBounds.left;
    f1 = Math.max(f1, f2);
    paramRectF.left = f1;
    f1 = this.collapsedBounds.top;
    paramRectF.top = f1;
    float f3 = getCollapsedTextRightBound(paramRectF, paramInt1, paramInt2);
    float f4 = this.collapsedBounds.right;
    f3 = Math.min(f3, f4);
    paramRectF.right = f3;
    f3 = this.collapsedBounds.top;
    f4 = getCollapsedTextHeight();
    f3 += f4;
    paramRectF.bottom = f3;
  }
  
  public ColorStateList getCollapsedTextColor()
  {
    return this.collapsedTextColor;
  }
  
  public int getCollapsedTextGravity()
  {
    return this.collapsedTextGravity;
  }
  
  public float getCollapsedTextHeight()
  {
    TextPaint localTextPaint = this.tmpPaint;
    getTextPaintCollapsed(localTextPaint);
    return -this.tmpPaint.ascent();
  }
  
  public float getCollapsedTextSize()
  {
    return this.collapsedTextSize;
  }
  
  public Typeface getCollapsedTypeface()
  {
    Typeface localTypeface = this.collapsedTypeface;
    if (localTypeface == null) {
      localTypeface = Typeface.DEFAULT;
    }
    return localTypeface;
  }
  
  public int getCurrentCollapsedTextColor()
  {
    ColorStateList localColorStateList = this.collapsedTextColor;
    return getCurrentColor(localColorStateList);
  }
  
  public int getExpandedLineCount()
  {
    return this.expandedLineCount;
  }
  
  public ColorStateList getExpandedTextColor()
  {
    return this.expandedTextColor;
  }
  
  public float getExpandedTextFullHeight()
  {
    TextPaint localTextPaint = this.tmpPaint;
    getTextPaintExpanded(localTextPaint);
    float f1 = -this.tmpPaint.ascent();
    float f2 = this.tmpPaint.descent();
    return f1 + f2;
  }
  
  public int getExpandedTextGravity()
  {
    return this.expandedTextGravity;
  }
  
  public float getExpandedTextHeight()
  {
    TextPaint localTextPaint = this.tmpPaint;
    getTextPaintExpanded(localTextPaint);
    return -this.tmpPaint.ascent();
  }
  
  public float getExpandedTextSize()
  {
    return this.expandedTextSize;
  }
  
  public Typeface getExpandedTypeface()
  {
    Typeface localTypeface = this.expandedTypeface;
    if (localTypeface == null) {
      localTypeface = Typeface.DEFAULT;
    }
    return localTypeface;
  }
  
  public float getExpansionFraction()
  {
    return this.expandedFraction;
  }
  
  public float getFadeModeThresholdFraction()
  {
    return this.fadeModeThresholdFraction;
  }
  
  public int getHyphenationFrequency()
  {
    return this.hyphenationFrequency;
  }
  
  public int getLineCount()
  {
    StaticLayout localStaticLayout = this.textLayout;
    int i;
    if (localStaticLayout != null)
    {
      i = localStaticLayout.getLineCount();
    }
    else
    {
      i = 0;
      localStaticLayout = null;
    }
    return i;
  }
  
  public float getLineSpacingAdd()
  {
    return this.textLayout.getSpacingAdd();
  }
  
  public float getLineSpacingMultiplier()
  {
    return this.textLayout.getSpacingMultiplier();
  }
  
  public int getMaxLines()
  {
    return this.maxLines;
  }
  
  public TimeInterpolator getPositionInterpolator()
  {
    return this.positionInterpolator;
  }
  
  public CharSequence getText()
  {
    return this.text;
  }
  
  public TextUtils.TruncateAt getTitleTextEllipsize()
  {
    return this.titleTextEllipsize;
  }
  
  public boolean isRtlTextDirectionHeuristicsEnabled()
  {
    return this.isRtlTextDirectionHeuristicsEnabled;
  }
  
  public final boolean isStateful()
  {
    ColorStateList localColorStateList = this.collapsedTextColor;
    if (localColorStateList != null)
    {
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      localColorStateList = this.expandedTextColor;
      if (localColorStateList == null) {
        break label41;
      }
      bool = localColorStateList.isStateful();
      if (!bool) {
        break label41;
      }
    }
    boolean bool = true;
    return bool;
    label41:
    bool = false;
    localColorStateList = null;
    return bool;
  }
  
  public void maybeUpdateFontWeightAdjustment(Configuration paramConfiguration)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j)
    {
      Typeface localTypeface = this.collapsedTypefaceDefault;
      if (localTypeface != null)
      {
        localTypeface = TypefaceUtils.maybeCopyWithFontWeightAdjustment(paramConfiguration, localTypeface);
        this.collapsedTypefaceBold = localTypeface;
      }
      localTypeface = this.expandedTypefaceDefault;
      if (localTypeface != null)
      {
        paramConfiguration = TypefaceUtils.maybeCopyWithFontWeightAdjustment(paramConfiguration, localTypeface);
        this.expandedTypefaceBold = paramConfiguration;
      }
      paramConfiguration = this.collapsedTypefaceBold;
      if (paramConfiguration == null) {
        paramConfiguration = this.collapsedTypefaceDefault;
      }
      this.collapsedTypeface = paramConfiguration;
      paramConfiguration = this.expandedTypefaceBold;
      if (paramConfiguration == null) {
        paramConfiguration = this.expandedTypefaceDefault;
      }
      this.expandedTypeface = paramConfiguration;
      boolean bool = true;
      recalculate(bool);
    }
  }
  
  public void recalculate()
  {
    recalculate(false);
  }
  
  public void recalculate(boolean paramBoolean)
  {
    View localView = this.view;
    int i = localView.getHeight();
    if (i > 0)
    {
      localView = this.view;
      i = localView.getWidth();
      if (i > 0) {}
    }
    else if (!paramBoolean)
    {
      return;
    }
    calculateBaseOffsets(paramBoolean);
    calculateCurrentOffsets();
  }
  
  public void setCollapsedAndExpandedTextColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.collapsedTextColor;
    if (localColorStateList == paramColorStateList)
    {
      localColorStateList = this.expandedTextColor;
      if (localColorStateList == paramColorStateList) {}
    }
    else
    {
      this.collapsedTextColor = paramColorStateList;
      this.expandedTextColor = paramColorStateList;
      recalculate();
    }
  }
  
  public void setCollapsedBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.collapsedBounds;
    boolean bool = rectEquals(localRect, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!bool)
    {
      localRect = this.collapsedBounds;
      localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      paramInt1 = 1;
      this.boundsChanged = paramInt1;
    }
  }
  
  public void setCollapsedBounds(Rect paramRect)
  {
    int i = paramRect.left;
    int j = paramRect.top;
    int k = paramRect.right;
    int m = paramRect.bottom;
    setCollapsedBounds(i, j, k, m);
  }
  
  public void setCollapsedTextAppearance(int paramInt)
  {
    TextAppearance localTextAppearance = new com/google/android/material/resources/TextAppearance;
    Object localObject1 = this.view.getContext();
    localTextAppearance.<init>((Context)localObject1, paramInt);
    Object localObject2 = localTextAppearance.getTextColor();
    if (localObject2 != null)
    {
      localObject2 = localTextAppearance.getTextColor();
      this.collapsedTextColor = ((ColorStateList)localObject2);
    }
    float f = localTextAppearance.getTextSize();
    localObject1 = null;
    paramInt = f < 0.0F;
    if (paramInt != 0)
    {
      f = localTextAppearance.getTextSize();
      this.collapsedTextSize = f;
    }
    localObject2 = localTextAppearance.shadowColor;
    if (localObject2 != null) {
      this.collapsedShadowColor = ((ColorStateList)localObject2);
    }
    f = localTextAppearance.shadowDx;
    this.collapsedShadowDx = f;
    f = localTextAppearance.shadowDy;
    this.collapsedShadowDy = f;
    f = localTextAppearance.shadowRadius;
    this.collapsedShadowRadius = f;
    f = localTextAppearance.letterSpacing;
    this.collapsedLetterSpacing = f;
    localObject2 = this.collapsedFontCallback;
    if (localObject2 != null) {
      ((CancelableFontCallback)localObject2).cancel();
    }
    localObject2 = new com/google/android/material/resources/CancelableFontCallback;
    localObject1 = new com/google/android/material/internal/CollapsingTextHelper$1;
    ((CollapsingTextHelper.1)localObject1).<init>(this);
    Typeface localTypeface = localTextAppearance.getFallbackFont();
    ((CancelableFontCallback)localObject2).<init>((CancelableFontCallback.ApplyFont)localObject1, localTypeface);
    this.collapsedFontCallback = ((CancelableFontCallback)localObject2);
    localObject2 = this.view.getContext();
    localObject1 = this.collapsedFontCallback;
    localTextAppearance.getFontAsync((Context)localObject2, (TextAppearanceFontCallback)localObject1);
    recalculate();
  }
  
  public void setCollapsedTextColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.collapsedTextColor;
    if (localColorStateList != paramColorStateList)
    {
      this.collapsedTextColor = paramColorStateList;
      recalculate();
    }
  }
  
  public void setCollapsedTextGravity(int paramInt)
  {
    int i = this.collapsedTextGravity;
    if (i != paramInt)
    {
      this.collapsedTextGravity = paramInt;
      recalculate();
    }
  }
  
  public void setCollapsedTextSize(float paramFloat)
  {
    float f = this.collapsedTextSize;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.collapsedTextSize = paramFloat;
      recalculate();
    }
  }
  
  public void setCollapsedTypeface(Typeface paramTypeface)
  {
    boolean bool = setCollapsedTypefaceInternal(paramTypeface);
    if (bool) {
      recalculate();
    }
  }
  
  public void setCurrentOffsetY(int paramInt)
  {
    this.currentOffsetY = paramInt;
  }
  
  public void setExpandedBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.expandedBounds;
    boolean bool = rectEquals(localRect, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!bool)
    {
      localRect = this.expandedBounds;
      localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      paramInt1 = 1;
      this.boundsChanged = paramInt1;
    }
  }
  
  public void setExpandedBounds(Rect paramRect)
  {
    int i = paramRect.left;
    int j = paramRect.top;
    int k = paramRect.right;
    int m = paramRect.bottom;
    setExpandedBounds(i, j, k, m);
  }
  
  public void setExpandedLetterSpacing(float paramFloat)
  {
    float f = this.expandedLetterSpacing;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.expandedLetterSpacing = paramFloat;
      recalculate();
    }
  }
  
  public void setExpandedTextAppearance(int paramInt)
  {
    TextAppearance localTextAppearance = new com/google/android/material/resources/TextAppearance;
    Object localObject1 = this.view.getContext();
    localTextAppearance.<init>((Context)localObject1, paramInt);
    Object localObject2 = localTextAppearance.getTextColor();
    if (localObject2 != null)
    {
      localObject2 = localTextAppearance.getTextColor();
      this.expandedTextColor = ((ColorStateList)localObject2);
    }
    float f = localTextAppearance.getTextSize();
    localObject1 = null;
    paramInt = f < 0.0F;
    if (paramInt != 0)
    {
      f = localTextAppearance.getTextSize();
      this.expandedTextSize = f;
    }
    localObject2 = localTextAppearance.shadowColor;
    if (localObject2 != null) {
      this.expandedShadowColor = ((ColorStateList)localObject2);
    }
    f = localTextAppearance.shadowDx;
    this.expandedShadowDx = f;
    f = localTextAppearance.shadowDy;
    this.expandedShadowDy = f;
    f = localTextAppearance.shadowRadius;
    this.expandedShadowRadius = f;
    f = localTextAppearance.letterSpacing;
    this.expandedLetterSpacing = f;
    localObject2 = this.expandedFontCallback;
    if (localObject2 != null) {
      ((CancelableFontCallback)localObject2).cancel();
    }
    localObject2 = new com/google/android/material/resources/CancelableFontCallback;
    localObject1 = new com/google/android/material/internal/CollapsingTextHelper$2;
    ((CollapsingTextHelper.2)localObject1).<init>(this);
    Typeface localTypeface = localTextAppearance.getFallbackFont();
    ((CancelableFontCallback)localObject2).<init>((CancelableFontCallback.ApplyFont)localObject1, localTypeface);
    this.expandedFontCallback = ((CancelableFontCallback)localObject2);
    localObject2 = this.view.getContext();
    localObject1 = this.expandedFontCallback;
    localTextAppearance.getFontAsync((Context)localObject2, (TextAppearanceFontCallback)localObject1);
    recalculate();
  }
  
  public void setExpandedTextColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.expandedTextColor;
    if (localColorStateList != paramColorStateList)
    {
      this.expandedTextColor = paramColorStateList;
      recalculate();
    }
  }
  
  public void setExpandedTextGravity(int paramInt)
  {
    int i = this.expandedTextGravity;
    if (i != paramInt)
    {
      this.expandedTextGravity = paramInt;
      recalculate();
    }
  }
  
  public void setExpandedTextSize(float paramFloat)
  {
    float f = this.expandedTextSize;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.expandedTextSize = paramFloat;
      recalculate();
    }
  }
  
  public void setExpandedTypeface(Typeface paramTypeface)
  {
    boolean bool = setExpandedTypefaceInternal(paramTypeface);
    if (bool) {
      recalculate();
    }
  }
  
  public void setExpansionFraction(float paramFloat)
  {
    float f1 = 1.0F;
    paramFloat = MathUtils.OooO00o(paramFloat, 0.0F, f1);
    float f2 = this.expandedFraction;
    boolean bool = paramFloat < f2;
    if (bool)
    {
      this.expandedFraction = paramFloat;
      calculateCurrentOffsets();
    }
  }
  
  public void setFadeModeEnabled(boolean paramBoolean)
  {
    this.fadeModeEnabled = paramBoolean;
  }
  
  public void setFadeModeStartFraction(float paramFloat)
  {
    this.fadeModeStartFraction = paramFloat;
    paramFloat = calculateFadeModeThresholdFraction();
    this.fadeModeThresholdFraction = paramFloat;
  }
  
  public void setHyphenationFrequency(int paramInt)
  {
    this.hyphenationFrequency = paramInt;
  }
  
  public void setLineSpacingAdd(float paramFloat)
  {
    this.lineSpacingAdd = paramFloat;
  }
  
  public void setLineSpacingMultiplier(float paramFloat)
  {
    this.lineSpacingMultiplier = paramFloat;
  }
  
  public void setMaxLines(int paramInt)
  {
    int i = this.maxLines;
    if (paramInt != i)
    {
      this.maxLines = paramInt;
      clearTexture();
      recalculate();
    }
  }
  
  public void setPositionInterpolator(TimeInterpolator paramTimeInterpolator)
  {
    this.positionInterpolator = paramTimeInterpolator;
    recalculate();
  }
  
  public void setRtlTextDirectionHeuristicsEnabled(boolean paramBoolean)
  {
    this.isRtlTextDirectionHeuristicsEnabled = paramBoolean;
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    this.state = paramArrayOfInt;
    boolean bool = isStateful();
    if (bool)
    {
      recalculate();
      return true;
    }
    return false;
  }
  
  public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer paramStaticLayoutBuilderConfigurer)
  {
    StaticLayoutBuilderConfigurer localStaticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
    if (localStaticLayoutBuilderConfigurer != paramStaticLayoutBuilderConfigurer)
    {
      this.staticLayoutBuilderConfigurer = paramStaticLayoutBuilderConfigurer;
      boolean bool = true;
      recalculate(bool);
    }
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      CharSequence localCharSequence = this.text;
      boolean bool = TextUtils.equals(localCharSequence, paramCharSequence);
      if (bool) {}
    }
    else
    {
      this.text = paramCharSequence;
      paramCharSequence = null;
      this.textToDraw = null;
      clearTexture();
      recalculate();
    }
  }
  
  public void setTextSizeInterpolator(TimeInterpolator paramTimeInterpolator)
  {
    this.textSizeInterpolator = paramTimeInterpolator;
    recalculate();
  }
  
  public void setTitleTextEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    this.titleTextEllipsize = paramTruncateAt;
    recalculate();
  }
  
  public void setTypefaces(Typeface paramTypeface)
  {
    boolean bool1 = setCollapsedTypefaceInternal(paramTypeface);
    boolean bool2 = setExpandedTypefaceInternal(paramTypeface);
    if ((bool1) || (bool2)) {
      recalculate();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.CollapsingTextHelper
 * JD-Core Version:    0.7.0.1
 */