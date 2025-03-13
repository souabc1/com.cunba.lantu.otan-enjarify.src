package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R.styleable;
import m54207b69;

public class TextAppearance
{
  private static final String TAG = "TextAppearance";
  private static final int TYPEFACE_MONOSPACE = 3;
  private static final int TYPEFACE_SANS = 1;
  private static final int TYPEFACE_SERIF = 2;
  private Typeface font;
  public final String fontFamily;
  private final int fontFamilyResourceId;
  private boolean fontResolved = false;
  public final boolean hasLetterSpacing;
  public final float letterSpacing;
  public final ColorStateList shadowColor;
  public final float shadowDx;
  public final float shadowDy;
  public final float shadowRadius;
  public final boolean textAllCaps;
  private ColorStateList textColor;
  public final ColorStateList textColorHint;
  public final ColorStateList textColorLink;
  private float textSize;
  public final int textStyle;
  public final int typeface;
  
  public TextAppearance(Context paramContext, int paramInt)
  {
    Object localObject1 = R.styleable.TextAppearance;
    localObject1 = paramContext.obtainStyledAttributes(paramInt, (int[])localObject1);
    int i = R.styleable.TextAppearance_android_textSize;
    float f1 = ((TypedArray)localObject1).getDimension(i, 0.0F);
    setTextSize(f1);
    i = R.styleable.TextAppearance_android_textColor;
    Object localObject2 = MaterialResources.getColorStateList(paramContext, (TypedArray)localObject1, i);
    setTextColor((ColorStateList)localObject2);
    i = R.styleable.TextAppearance_android_textColorHint;
    localObject2 = MaterialResources.getColorStateList(paramContext, (TypedArray)localObject1, i);
    this.textColorHint = ((ColorStateList)localObject2);
    i = R.styleable.TextAppearance_android_textColorLink;
    localObject2 = MaterialResources.getColorStateList(paramContext, (TypedArray)localObject1, i);
    this.textColorLink = ((ColorStateList)localObject2);
    i = R.styleable.TextAppearance_android_textStyle;
    i = ((TypedArray)localObject1).getInt(i, 0);
    this.textStyle = i;
    i = R.styleable.TextAppearance_android_typeface;
    i = ((TypedArray)localObject1).getInt(i, 1);
    this.typeface = i;
    i = R.styleable.TextAppearance_fontFamily;
    int j = R.styleable.TextAppearance_android_fontFamily;
    i = MaterialResources.getIndexWithValue((TypedArray)localObject1, i, j);
    j = ((TypedArray)localObject1).getResourceId(i, 0);
    this.fontFamilyResourceId = j;
    localObject2 = ((TypedArray)localObject1).getString(i);
    this.fontFamily = ((String)localObject2);
    i = R.styleable.TextAppearance_textAllCaps;
    boolean bool = ((TypedArray)localObject1).getBoolean(i, false);
    this.textAllCaps = bool;
    int k = R.styleable.TextAppearance_android_shadowColor;
    Object localObject3 = MaterialResources.getColorStateList(paramContext, (TypedArray)localObject1, k);
    this.shadowColor = ((ColorStateList)localObject3);
    k = R.styleable.TextAppearance_android_shadowDx;
    float f2 = ((TypedArray)localObject1).getFloat(k, 0.0F);
    this.shadowDx = f2;
    k = R.styleable.TextAppearance_android_shadowDy;
    f2 = ((TypedArray)localObject1).getFloat(k, 0.0F);
    this.shadowDy = f2;
    k = R.styleable.TextAppearance_android_shadowRadius;
    f2 = ((TypedArray)localObject1).getFloat(k, 0.0F);
    this.shadowRadius = f2;
    ((TypedArray)localObject1).recycle();
    localObject3 = R.styleable.MaterialTextAppearance;
    paramContext = paramContext.obtainStyledAttributes(paramInt, (int[])localObject3);
    paramInt = R.styleable.MaterialTextAppearance_android_letterSpacing;
    paramInt = paramContext.hasValue(paramInt);
    this.hasLetterSpacing = paramInt;
    paramInt = R.styleable.MaterialTextAppearance_android_letterSpacing;
    float f3 = paramContext.getFloat(paramInt, 0.0F);
    this.letterSpacing = f3;
    paramContext.recycle();
  }
  
  private void createFallbackFont()
  {
    Object localObject = this.font;
    int i;
    if (localObject == null)
    {
      localObject = this.fontFamily;
      if (localObject != null)
      {
        i = this.textStyle;
        localObject = Typeface.create((String)localObject, i);
        this.font = ((Typeface)localObject);
      }
    }
    localObject = this.font;
    if (localObject == null)
    {
      int j = this.typeface;
      i = 1;
      if (j != i)
      {
        i = 2;
        if (j != i)
        {
          i = 3;
          if (j != i) {
            localObject = Typeface.DEFAULT;
          } else {
            localObject = Typeface.MONOSPACE;
          }
        }
        else
        {
          localObject = Typeface.SERIF;
        }
      }
      else
      {
        localObject = Typeface.SANS_SERIF;
      }
      this.font = ((Typeface)localObject);
      localObject = this.font;
      i = this.textStyle;
      localObject = Typeface.create((Typeface)localObject, i);
      this.font = ((Typeface)localObject);
    }
  }
  
  private boolean shouldLoadFontSynchronously(Context paramContext)
  {
    boolean bool1 = TextAppearanceConfig.shouldLoadFontSynchronously();
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    int i = this.fontFamilyResourceId;
    if (i != 0) {
      paramContext = ResourcesCompat.OooO0OO(paramContext, i);
    } else {
      paramContext = null;
    }
    if (paramContext == null) {
      bool2 = false;
    }
    return bool2;
  }
  
  public Typeface getFallbackFont()
  {
    createFallbackFont();
    return this.font;
  }
  
  public Typeface getFont(Context paramContext)
  {
    boolean bool = this.fontResolved;
    if (bool) {
      return this.font;
    }
    bool = paramContext.isRestricted();
    if (!bool) {}
    try
    {
      try
      {
        int i = this.fontFamilyResourceId;
        paramContext = ResourcesCompat.OooO0oO(paramContext, i);
        this.font = paramContext;
        if (paramContext != null)
        {
          i = this.textStyle;
          paramContext = Typeface.create(paramContext, i);
          this.font = paramContext;
        }
      }
      catch (Exception localException)
      {
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        String str = m54207b69.F54207b69_11("BQ1424254127764345383E424A427E454D4F3683");
        paramContext.append(str);
        str = this.fontFamily;
        paramContext.append(str);
      }
    }
    catch (UnsupportedOperationException|Resources.NotFoundException localUnsupportedOperationException)
    {
      label94:
      break label94;
    }
    createFallbackFont();
    this.fontResolved = true;
    return this.font;
  }
  
  public void getFontAsync(Context paramContext, TextPaint paramTextPaint, TextAppearanceFontCallback paramTextAppearanceFontCallback)
  {
    Object localObject = getFallbackFont();
    updateTextPaintMeasureState(paramContext, paramTextPaint, (Typeface)localObject);
    localObject = new com/google/android/material/resources/TextAppearance$2;
    ((TextAppearance.2)localObject).<init>(this, paramContext, paramTextPaint, paramTextAppearanceFontCallback);
    getFontAsync(paramContext, (TextAppearanceFontCallback)localObject);
  }
  
  public void getFontAsync(Context paramContext, TextAppearanceFontCallback paramTextAppearanceFontCallback)
  {
    boolean bool1 = shouldLoadFontSynchronously(paramContext);
    if (bool1) {
      getFont(paramContext);
    } else {
      createFallbackFont();
    }
    int i = this.fontFamilyResourceId;
    int j = 1;
    if (i == 0) {
      this.fontResolved = j;
    }
    boolean bool2 = this.fontResolved;
    if (bool2)
    {
      paramContext = this.font;
      paramTextAppearanceFontCallback.onFontRetrieved(paramContext, j);
      return;
    }
    try
    {
      TextAppearance.1 local1 = new com/google/android/material/resources/TextAppearance$1;
      local1.<init>(this, paramTextAppearanceFontCallback);
      ResourcesCompat.OooO(paramContext, i, local1, null);
    }
    catch (Exception localException)
    {
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      String str = m54207b69.F54207b69_11("BQ1424254127764345383E424A427E454D4F3683");
      paramContext.append(str);
      str = this.fontFamily;
      paramContext.append(str);
      this.fontResolved = j;
      int k = -3;
      paramTextAppearanceFontCallback.onFontRetrievalFailed(k);
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      this.fontResolved = j;
      paramTextAppearanceFontCallback.onFontRetrievalFailed(j);
    }
  }
  
  public ColorStateList getTextColor()
  {
    return this.textColor;
  }
  
  public float getTextSize()
  {
    return this.textSize;
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.textColor = paramColorStateList;
  }
  
  public void setTextSize(float paramFloat)
  {
    this.textSize = paramFloat;
  }
  
  public void updateDrawState(Context paramContext, TextPaint paramTextPaint, TextAppearanceFontCallback paramTextAppearanceFontCallback)
  {
    updateMeasureState(paramContext, paramTextPaint, paramTextAppearanceFontCallback);
    paramContext = this.textColor;
    int j;
    if (paramContext != null)
    {
      paramTextAppearanceFontCallback = paramTextPaint.drawableState;
      int i = paramContext.getDefaultColor();
      j = paramContext.getColorForState(paramTextAppearanceFontCallback, i);
    }
    else
    {
      j = -16777216;
      f1 = -1.701412E+038F;
    }
    paramTextPaint.setColor(j);
    float f1 = this.shadowRadius;
    float f2 = this.shadowDx;
    float f3 = this.shadowDy;
    ColorStateList localColorStateList = this.shadowColor;
    int m;
    if (localColorStateList != null)
    {
      int[] arrayOfInt = paramTextPaint.drawableState;
      int k = localColorStateList.getDefaultColor();
      m = localColorStateList.getColorForState(arrayOfInt, k);
    }
    else
    {
      m = 0;
      localColorStateList = null;
    }
    paramTextPaint.setShadowLayer(f1, f2, f3, m);
  }
  
  public void updateMeasureState(Context paramContext, TextPaint paramTextPaint, TextAppearanceFontCallback paramTextAppearanceFontCallback)
  {
    boolean bool = shouldLoadFontSynchronously(paramContext);
    if (bool)
    {
      paramTextAppearanceFontCallback = getFont(paramContext);
      updateTextPaintMeasureState(paramContext, paramTextPaint, paramTextAppearanceFontCallback);
    }
    else
    {
      getFontAsync(paramContext, paramTextPaint, paramTextAppearanceFontCallback);
    }
  }
  
  public void updateTextPaintMeasureState(Context paramContext, TextPaint paramTextPaint, Typeface paramTypeface)
  {
    paramContext = TypefaceUtils.maybeCopyWithFontWeightAdjustment(paramContext, paramTypeface);
    if (paramContext != null) {
      paramTypeface = paramContext;
    }
    paramTextPaint.setTypeface(paramTypeface);
    int i = this.textStyle;
    int j = paramTypeface.getStyle() ^ 0xFFFFFFFF;
    i &= j;
    j = i & 0x1;
    if (j != 0)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramTypeface = null;
    }
    paramTextPaint.setFakeBoldText(j);
    i &= 0x2;
    if (i != 0)
    {
      i = -1098907648;
      f = -0.25F;
    }
    else
    {
      i = 0;
      f = 0.0F;
      paramContext = null;
    }
    paramTextPaint.setTextSkewX(f);
    float f = this.textSize;
    paramTextPaint.setTextSize(f);
    boolean bool = this.hasLetterSpacing;
    if (bool)
    {
      f = this.letterSpacing;
      paramTextPaint.setLetterSpacing(f);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.resources.TextAppearance
 * JD-Core Version:    0.7.0.1
 */