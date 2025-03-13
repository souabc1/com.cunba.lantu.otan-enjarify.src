package androidx.core.text;

import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

public class PrecomputedTextCompat
  implements Spannable
{
  public static final Object o00Ooo0o;
  public final Spannable o00OoOoo;
  public final int[] o00Ooo0;
  public final PrecomputedTextCompat.Params o00Ooo00;
  public final PrecomputedText o00Ooo0O;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    o00Ooo0o = localObject;
  }
  
  public PrecomputedTextCompat(PrecomputedText paramPrecomputedText, PrecomputedTextCompat.Params paramParams)
  {
    this.o00OoOoo = paramPrecomputedText;
    this.o00Ooo00 = paramParams;
    paramParams = null;
    this.o00Ooo0 = null;
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i < j) {
      paramPrecomputedText = null;
    }
    this.o00Ooo0O = paramPrecomputedText;
  }
  
  public PrecomputedTextCompat(CharSequence paramCharSequence, PrecomputedTextCompat.Params paramParams, int[] paramArrayOfInt)
  {
    SpannableString localSpannableString = new android/text/SpannableString;
    localSpannableString.<init>(paramCharSequence);
    this.o00OoOoo = localSpannableString;
    this.o00Ooo00 = paramParams;
    this.o00Ooo0 = paramArrayOfInt;
    this.o00Ooo0O = null;
  }
  
  public static PrecomputedTextCompat OooO00o(CharSequence paramCharSequence, PrecomputedTextCompat.Params paramParams)
  {
    Preconditions.OooO0oo(paramCharSequence);
    Preconditions.OooO0oo(paramParams);
    Object localObject1 = "PrecomputedText";
    try
    {
      TraceCompat.OooO00o((String)localObject1);
      int i = Build.VERSION.SDK_INT;
      int j = 29;
      if (i >= j)
      {
        localObject1 = paramParams.OooO0o0;
        if (localObject1 != null)
        {
          localObject2 = new androidx/core/text/PrecomputedTextCompat;
          paramCharSequence = PrecomputedText.create(paramCharSequence, (PrecomputedText.Params)localObject1);
          ((PrecomputedTextCompat)localObject2).<init>(paramCharSequence, paramParams);
          return localObject2;
        }
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      j = paramCharSequence.length();
      int k = 0;
      TextDirectionHeuristic localTextDirectionHeuristic = null;
      int m = 0;
      TextPaint localTextPaint = null;
      Object localObject3;
      while (m < j)
      {
        char c = '\n';
        m = TextUtils.indexOf(paramCharSequence, c, m, j);
        if (m < 0) {
          m = j;
        } else {
          m += 1;
        }
        localObject3 = Integer.valueOf(m);
        ((ArrayList)localObject1).add(localObject3);
      }
      j = ((ArrayList)localObject1).size();
      Object localObject2 = new int[j];
      m = 0;
      localTextPaint = null;
      for (;;)
      {
        n = ((ArrayList)localObject1).size();
        if (m >= n) {
          break;
        }
        localObject3 = ((ArrayList)localObject1).get(m);
        localObject3 = (Integer)localObject3;
        n = ((Integer)localObject3).intValue();
        localObject2[m] = n;
        m += 1;
      }
      i = paramCharSequence.length();
      localTextPaint = paramParams.getTextPaint();
      int n = -1 >>> 1;
      localObject1 = StaticLayout.Builder.obtain(paramCharSequence, 0, i, localTextPaint, n);
      k = paramParams.getBreakStrategy();
      localObject1 = ((StaticLayout.Builder)localObject1).setBreakStrategy(k);
      k = paramParams.getHyphenationFrequency();
      localObject1 = ((StaticLayout.Builder)localObject1).setHyphenationFrequency(k);
      localTextDirectionHeuristic = paramParams.getTextDirection();
      localObject1 = ((StaticLayout.Builder)localObject1).setTextDirection(localTextDirectionHeuristic);
      ((StaticLayout.Builder)localObject1).build();
      localObject1 = new androidx/core/text/PrecomputedTextCompat;
      ((PrecomputedTextCompat)localObject1).<init>(paramCharSequence, paramParams, (int[])localObject2);
      return localObject1;
    }
    finally
    {
      TraceCompat.OooO0O0();
    }
  }
  
  public char charAt(int paramInt)
  {
    return this.o00OoOoo.charAt(paramInt);
  }
  
  public int getParagraphCount()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return this.o00Ooo0O.getParagraphCount();
    }
    return this.o00Ooo0.length;
  }
  
  public int getParagraphEnd(int paramInt)
  {
    int i = getParagraphCount();
    String str = "paraIndex";
    Preconditions.OooO0Oo(paramInt, 0, i, str);
    i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return this.o00Ooo0O.getParagraphEnd(paramInt);
    }
    return this.o00Ooo0[paramInt];
  }
  
  public int getParagraphStart(int paramInt)
  {
    int i = getParagraphCount();
    String str = "paraIndex";
    int j = 0;
    Preconditions.OooO0Oo(paramInt, 0, i, str);
    i = Build.VERSION.SDK_INT;
    int k = 29;
    if (i >= k) {
      return this.o00Ooo0O.getParagraphStart(paramInt);
    }
    if (paramInt != 0)
    {
      int[] arrayOfInt = this.o00Ooo0;
      paramInt += -1;
      j = arrayOfInt[paramInt];
    }
    return j;
  }
  
  public PrecomputedTextCompat.Params getParams()
  {
    return this.o00Ooo00;
  }
  
  public PrecomputedText getPrecomputedText()
  {
    Spannable localSpannable = this.o00OoOoo;
    boolean bool = localSpannable instanceof PrecomputedText;
    if (bool) {
      return (PrecomputedText)localSpannable;
    }
    return null;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return this.o00OoOoo.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return this.o00OoOoo.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return this.o00OoOoo.getSpanStart(paramObject);
  }
  
  public Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return this.o00Ooo0O.getSpans(paramInt1, paramInt2, paramClass);
    }
    return this.o00OoOoo.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public int length()
  {
    return this.o00OoOoo.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.o00OoOoo.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    boolean bool = paramObject instanceof MetricAffectingSpan;
    if (!bool)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 29;
      Object localObject;
      if (i >= j)
      {
        localObject = this.o00Ooo0O;
        ((PrecomputedText)localObject).removeSpan(paramObject);
      }
      else
      {
        localObject = this.o00OoOoo;
        ((Spannable)localObject).removeSpan(paramObject);
      }
      return;
    }
    paramObject = new java/lang/IllegalArgumentException;
    paramObject.<init>("MetricAffectingSpan can not be removed from PrecomputedText.");
    throw paramObject;
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = paramObject instanceof MetricAffectingSpan;
    if (!bool)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 29;
      Object localObject;
      if (i >= j)
      {
        localObject = this.o00Ooo0O;
        ((PrecomputedText)localObject).setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      }
      else
      {
        localObject = this.o00OoOoo;
        ((Spannable)localObject).setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
    paramObject = new java/lang/IllegalArgumentException;
    paramObject.<init>("MetricAffectingSpan can not be set to PrecomputedText.");
    throw paramObject;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.o00OoOoo.subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.o00OoOoo.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat
 * JD-Core Version:    0.7.0.1
 */