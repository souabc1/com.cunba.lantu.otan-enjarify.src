package androidx.core.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.PrecomputedText.Params;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;

public final class PrecomputedTextCompat$Params
{
  public final TextPaint OooO00o;
  public final TextDirectionHeuristic OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  public final PrecomputedText.Params OooO0o0;
  
  public PrecomputedTextCompat$Params(PrecomputedText.Params paramParams)
  {
    Object localObject = paramParams.getTextPaint();
    this.OooO00o = ((TextPaint)localObject);
    localObject = paramParams.getTextDirection();
    this.OooO0O0 = ((TextDirectionHeuristic)localObject);
    int i = paramParams.getBreakStrategy();
    this.OooO0OO = i;
    i = paramParams.getHyphenationFrequency();
    this.OooO0Oo = i;
    i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j) {
      paramParams = null;
    }
    this.OooO0o0 = paramParams;
  }
  
  public boolean OooO00o(Params paramParams)
  {
    int i = this.OooO0OO;
    int k = paramParams.getBreakStrategy();
    if (i != k) {
      return false;
    }
    i = this.OooO0Oo;
    k = paramParams.getHyphenationFrequency();
    if (i != k) {
      return false;
    }
    Object localObject1 = this.OooO00o;
    float f1 = ((Paint)localObject1).getTextSize();
    Object localObject2 = paramParams.getTextPaint();
    float f2 = ((Paint)localObject2).getTextSize();
    boolean bool1 = f1 < f2;
    if (bool1) {
      return false;
    }
    localObject1 = this.OooO00o;
    f1 = ((Paint)localObject1).getTextScaleX();
    localObject2 = paramParams.getTextPaint();
    f2 = ((Paint)localObject2).getTextScaleX();
    bool1 = f1 < f2;
    if (bool1) {
      return false;
    }
    localObject1 = this.OooO00o;
    f1 = ((Paint)localObject1).getTextSkewX();
    localObject2 = paramParams.getTextPaint();
    f2 = ((Paint)localObject2).getTextSkewX();
    bool1 = f1 < f2;
    if (bool1) {
      return false;
    }
    localObject1 = this.OooO00o;
    f1 = ((Paint)localObject1).getLetterSpacing();
    localObject2 = paramParams.getTextPaint();
    f2 = ((Paint)localObject2).getLetterSpacing();
    bool1 = f1 < f2;
    if (bool1) {
      return false;
    }
    localObject1 = this.OooO00o.getFontFeatureSettings();
    localObject2 = paramParams.getTextPaint().getFontFeatureSettings();
    bool1 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
    if (!bool1) {
      return false;
    }
    localObject1 = this.OooO00o;
    int j = ((Paint)localObject1).getFlags();
    localObject2 = paramParams.getTextPaint();
    k = ((Paint)localObject2).getFlags();
    if (j != k) {
      return false;
    }
    localObject1 = this.OooO00o.getTextLocales();
    localObject2 = paramParams.getTextPaint().getTextLocales();
    boolean bool2 = ((LocaleList)localObject1).equals(localObject2);
    if (!bool2) {
      return false;
    }
    localObject1 = this.OooO00o.getTypeface();
    if (localObject1 == null)
    {
      paramParams = paramParams.getTextPaint().getTypeface();
      if (paramParams != null) {
        return false;
      }
    }
    else
    {
      localObject1 = this.OooO00o.getTypeface();
      paramParams = paramParams.getTextPaint().getTypeface();
      boolean bool3 = ((Typeface)localObject1).equals(paramParams);
      if (!bool3) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Params;
    if (!bool2) {
      return false;
    }
    paramObject = (Params)paramObject;
    bool2 = OooO00o(paramObject);
    if (!bool2) {
      return false;
    }
    TextDirectionHeuristic localTextDirectionHeuristic = this.OooO0O0;
    paramObject = paramObject.getTextDirection();
    if (localTextDirectionHeuristic != paramObject) {
      return false;
    }
    return bool1;
  }
  
  public int getBreakStrategy()
  {
    return this.OooO0OO;
  }
  
  public int getHyphenationFrequency()
  {
    return this.OooO0Oo;
  }
  
  public TextDirectionHeuristic getTextDirection()
  {
    return this.OooO0O0;
  }
  
  public TextPaint getTextPaint()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    Float localFloat1 = Float.valueOf(this.OooO00o.getTextSize());
    Float localFloat2 = Float.valueOf(this.OooO00o.getTextScaleX());
    Float localFloat3 = Float.valueOf(this.OooO00o.getTextSkewX());
    Float localFloat4 = Float.valueOf(this.OooO00o.getLetterSpacing());
    Integer localInteger1 = Integer.valueOf(this.OooO00o.getFlags());
    LocaleList localLocaleList = this.OooO00o.getTextLocales();
    Typeface localTypeface = this.OooO00o.getTypeface();
    Boolean localBoolean = Boolean.valueOf(this.OooO00o.isElegantTextHeight());
    TextDirectionHeuristic localTextDirectionHeuristic = this.OooO0O0;
    Integer localInteger2 = Integer.valueOf(this.OooO0OO);
    Integer localInteger3 = Integer.valueOf(this.OooO0Oo);
    Object[] tmp116_113 = new Object[11];
    Object[] tmp117_116 = tmp116_113;
    Object[] tmp117_116 = tmp116_113;
    tmp117_116[0] = localFloat1;
    tmp117_116[1] = localFloat2;
    Object[] tmp124_117 = tmp117_116;
    Object[] tmp124_117 = tmp117_116;
    tmp124_117[2] = localFloat3;
    tmp124_117[3] = localFloat4;
    Object[] tmp132_124 = tmp124_117;
    Object[] tmp132_124 = tmp124_117;
    tmp132_124[4] = localInteger1;
    tmp132_124[5] = localLocaleList;
    Object[] tmp141_132 = tmp132_124;
    Object[] tmp141_132 = tmp132_124;
    tmp141_132[6] = localTypeface;
    tmp141_132[7] = localBoolean;
    Object[] tmp152_141 = tmp141_132;
    Object[] tmp152_141 = tmp141_132;
    tmp152_141[8] = localTextDirectionHeuristic;
    tmp152_141[9] = localInteger2;
    tmp152_141[10] = localInteger3;
    return ObjectsCompat.OooO0O0(tmp152_141);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("{");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("textSize=");
    float f = this.OooO00o.getTextSize();
    ((StringBuilder)localObject1).append(f);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", textScaleX=");
    f = this.OooO00o.getTextScaleX();
    ((StringBuilder)localObject1).append(f);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", textSkewX=");
    f = this.OooO00o.getTextSkewX();
    ((StringBuilder)localObject1).append(f);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", letterSpacing=");
    f = this.OooO00o.getLetterSpacing();
    ((StringBuilder)localObject1).append(f);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", elegantTextHeight=");
    boolean bool = this.OooO00o.isElegantTextHeight();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", textLocale=");
    Object localObject2 = this.OooO00o.getTextLocales();
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", typeface=");
    localObject2 = this.OooO00o.getTypeface();
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", variationSettings=");
    localObject2 = this.OooO00o.getFontVariationSettings();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", textDir=");
    localObject2 = this.OooO0O0;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", breakStrategy=");
    int i = this.OooO0OO;
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(", hyphenationFrequency=");
    i = this.OooO0Oo;
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat.Params
 * JD-Core Version:    0.7.0.1
 */