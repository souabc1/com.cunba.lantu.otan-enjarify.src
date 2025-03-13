package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class TextDrawableHelper
{
  private WeakReference delegate;
  private final TextAppearanceFontCallback fontCallback;
  private TextAppearance textAppearance;
  private final TextPaint textPaint;
  private float textWidth;
  private boolean textWidthDirty;
  
  public TextDrawableHelper(TextDrawableHelper.TextDrawableDelegate paramTextDrawableDelegate)
  {
    Object localObject = new android/text/TextPaint;
    int i = 1;
    ((TextPaint)localObject).<init>(i);
    this.textPaint = ((TextPaint)localObject);
    localObject = new com/google/android/material/internal/TextDrawableHelper$1;
    ((TextDrawableHelper.1)localObject).<init>(this);
    this.fontCallback = ((TextAppearanceFontCallback)localObject);
    this.textWidthDirty = i;
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    this.delegate = ((WeakReference)localObject);
    setDelegate(paramTextDrawableDelegate);
  }
  
  private float calculateTextWidth(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return 0.0F;
    }
    TextPaint localTextPaint = this.textPaint;
    int i = paramCharSequence.length();
    return localTextPaint.measureText(paramCharSequence, 0, i);
  }
  
  public TextAppearance getTextAppearance()
  {
    return this.textAppearance;
  }
  
  public TextPaint getTextPaint()
  {
    return this.textPaint;
  }
  
  public float getTextWidth(String paramString)
  {
    boolean bool = this.textWidthDirty;
    if (!bool) {
      return this.textWidth;
    }
    float f = calculateTextWidth(paramString);
    this.textWidth = f;
    this.textWidthDirty = false;
    return f;
  }
  
  public boolean isTextWidthDirty()
  {
    return this.textWidthDirty;
  }
  
  public void setDelegate(TextDrawableHelper.TextDrawableDelegate paramTextDrawableDelegate)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramTextDrawableDelegate);
    this.delegate = localWeakReference;
  }
  
  public void setTextAppearance(TextAppearance paramTextAppearance, Context paramContext)
  {
    Object localObject1 = this.textAppearance;
    if (localObject1 != paramTextAppearance)
    {
      this.textAppearance = paramTextAppearance;
      if (paramTextAppearance != null)
      {
        localObject1 = this.textPaint;
        Object localObject2 = this.fontCallback;
        paramTextAppearance.updateMeasureState(paramContext, (TextPaint)localObject1, (TextAppearanceFontCallback)localObject2);
        localObject1 = (TextDrawableHelper.TextDrawableDelegate)this.delegate.get();
        if (localObject1 != null)
        {
          localObject2 = this.textPaint;
          localObject1 = ((TextDrawableHelper.TextDrawableDelegate)localObject1).getState();
          ((TextPaint)localObject2).drawableState = ((int[])localObject1);
        }
        localObject1 = this.textPaint;
        localObject2 = this.fontCallback;
        paramTextAppearance.updateDrawState(paramContext, (TextPaint)localObject1, (TextAppearanceFontCallback)localObject2);
        boolean bool = true;
        this.textWidthDirty = bool;
      }
      paramTextAppearance = (TextDrawableHelper.TextDrawableDelegate)this.delegate.get();
      if (paramTextAppearance != null)
      {
        paramTextAppearance.onTextSizeChange();
        paramContext = paramTextAppearance.getState();
        paramTextAppearance.onStateChange(paramContext);
      }
    }
  }
  
  public void setTextWidthDirty(boolean paramBoolean)
  {
    this.textWidthDirty = paramBoolean;
  }
  
  public void updateTextPaintDrawState(Context paramContext)
  {
    TextAppearance localTextAppearance = this.textAppearance;
    TextPaint localTextPaint = this.textPaint;
    TextAppearanceFontCallback localTextAppearanceFontCallback = this.fontCallback;
    localTextAppearance.updateDrawState(paramContext, localTextPaint, localTextAppearanceFontCallback);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.TextDrawableHelper
 * JD-Core Version:    0.7.0.1
 */