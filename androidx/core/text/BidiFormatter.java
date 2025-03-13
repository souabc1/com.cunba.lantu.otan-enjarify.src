package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class BidiFormatter
{
  public static final TextDirectionHeuristicCompat OooO0Oo;
  public static final String OooO0o;
  public static final String OooO0o0;
  public static final BidiFormatter OooO0oO;
  public static final BidiFormatter OooO0oo;
  public final boolean OooO00o;
  public final int OooO0O0;
  public final TextDirectionHeuristicCompat OooO0OO;
  
  static
  {
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.OooO0OO;
    OooO0Oo = localTextDirectionHeuristicCompat;
    OooO0o0 = Character.toString('‎');
    OooO0o = Character.toString('‏');
    BidiFormatter localBidiFormatter = new androidx/core/text/BidiFormatter;
    int i = 2;
    localBidiFormatter.<init>(false, i, localTextDirectionHeuristicCompat);
    OooO0oO = localBidiFormatter;
    localBidiFormatter = new androidx/core/text/BidiFormatter;
    localBidiFormatter.<init>(true, i, localTextDirectionHeuristicCompat);
    OooO0oo = localBidiFormatter;
  }
  
  public BidiFormatter(boolean paramBoolean, int paramInt, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    this.OooO00o = paramBoolean;
    this.OooO0O0 = paramInt;
    this.OooO0OO = paramTextDirectionHeuristicCompat;
  }
  
  public static int OooO00o(CharSequence paramCharSequence)
  {
    BidiFormatter.DirectionalityEstimator localDirectionalityEstimator = new androidx/core/text/BidiFormatter$DirectionalityEstimator;
    localDirectionalityEstimator.<init>(paramCharSequence, false);
    return localDirectionalityEstimator.getEntryDir();
  }
  
  public static int OooO0O0(CharSequence paramCharSequence)
  {
    BidiFormatter.DirectionalityEstimator localDirectionalityEstimator = new androidx/core/text/BidiFormatter$DirectionalityEstimator;
    localDirectionalityEstimator.<init>(paramCharSequence, false);
    return localDirectionalityEstimator.getExitDir();
  }
  
  public static boolean OooO0OO(Locale paramLocale)
  {
    int i = TextUtilsCompat.OooO00o(paramLocale);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static BidiFormatter getInstance()
  {
    BidiFormatter.Builder localBuilder = new androidx/core/text/BidiFormatter$Builder;
    localBuilder.<init>();
    return localBuilder.OooO00o();
  }
  
  public String OooO(String paramString, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    return OooO0oO(paramString, paramTextDirectionHeuristicCompat, paramBoolean).toString();
  }
  
  public final String OooO0Oo(CharSequence paramCharSequence, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    int i = paramCharSequence.length();
    int k = 0;
    boolean bool3 = paramTextDirectionHeuristicCompat.OooO00o(paramCharSequence, 0, i);
    boolean bool1 = this.OooO00o;
    if (!bool1) {
      if (!bool3)
      {
        int j = OooO0O0(paramCharSequence);
        k = 1;
        if (j != k) {}
      }
      else
      {
        return OooO0o0;
      }
    }
    boolean bool2 = this.OooO00o;
    if (bool2) {
      if (bool3)
      {
        int n = OooO0O0(paramCharSequence);
        int m = -1;
        if (n != m) {}
      }
      else
      {
        return OooO0o;
      }
    }
    return "";
  }
  
  public CharSequence OooO0o(CharSequence paramCharSequence)
  {
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat = this.OooO0OO;
    return OooO0oO(paramCharSequence, localTextDirectionHeuristicCompat, true);
  }
  
  public final String OooO0o0(CharSequence paramCharSequence, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    int i = paramCharSequence.length();
    int k = 0;
    boolean bool3 = paramTextDirectionHeuristicCompat.OooO00o(paramCharSequence, 0, i);
    boolean bool1 = this.OooO00o;
    if (!bool1) {
      if (!bool3)
      {
        int j = OooO00o(paramCharSequence);
        k = 1;
        if (j != k) {}
      }
      else
      {
        return OooO0o0;
      }
    }
    boolean bool2 = this.OooO00o;
    if (bool2) {
      if (bool3)
      {
        int n = OooO00o(paramCharSequence);
        int m = -1;
        if (n != m) {}
      }
      else
      {
        return OooO0o;
      }
    }
    return "";
  }
  
  public CharSequence OooO0oO(CharSequence paramCharSequence, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat, boolean paramBoolean)
  {
    if (paramCharSequence == null) {
      return null;
    }
    int i = paramCharSequence.length();
    boolean bool2 = paramTextDirectionHeuristicCompat.OooO00o(paramCharSequence, 0, i);
    SpannableStringBuilder localSpannableStringBuilder = new android/text/SpannableStringBuilder;
    localSpannableStringBuilder.<init>();
    boolean bool1 = getStereoReset();
    if ((bool1) && (paramBoolean))
    {
      if (bool2) {
        localObject = TextDirectionHeuristicsCompat.OooO0O0;
      } else {
        localObject = TextDirectionHeuristicsCompat.OooO00o;
      }
      Object localObject = OooO0o0(paramCharSequence, (TextDirectionHeuristicCompat)localObject);
      localSpannableStringBuilder.append((CharSequence)localObject);
    }
    bool1 = this.OooO00o;
    if (bool2 != bool1)
    {
      int j;
      if (bool2) {
        j = 8235;
      } else {
        j = 8234;
      }
      localSpannableStringBuilder.append(j);
      localSpannableStringBuilder.append(paramCharSequence);
      int k = 8236;
      localSpannableStringBuilder.append(k);
    }
    else
    {
      localSpannableStringBuilder.append(paramCharSequence);
    }
    if (paramBoolean)
    {
      if (bool2) {
        paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.OooO0O0;
      } else {
        paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.OooO00o;
      }
      paramCharSequence = OooO0Oo(paramCharSequence, paramTextDirectionHeuristicCompat);
      localSpannableStringBuilder.append(paramCharSequence);
    }
    return localSpannableStringBuilder;
  }
  
  public String OooO0oo(String paramString)
  {
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat = this.OooO0OO;
    return OooO(paramString, localTextDirectionHeuristicCompat, true);
  }
  
  public boolean getStereoReset()
  {
    int i = this.OooO0O0 & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isRtlContext()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.BidiFormatter
 * JD-Core Version:    0.7.0.1
 */