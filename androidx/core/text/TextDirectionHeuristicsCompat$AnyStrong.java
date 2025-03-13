package androidx.core.text;

class TextDirectionHeuristicsCompat$AnyStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final AnyStrong OooO0O0;
  public final boolean OooO00o;
  
  static
  {
    AnyStrong localAnyStrong = new androidx/core/text/TextDirectionHeuristicsCompat$AnyStrong;
    localAnyStrong.<init>(true);
    OooO0O0 = localAnyStrong;
  }
  
  public TextDirectionHeuristicsCompat$AnyStrong(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
  }
  
  public int OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramInt2 += paramInt1;
    boolean bool = false;
    while (paramInt1 < paramInt2)
    {
      int i = TextDirectionHeuristicsCompat.OooO00o(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
      int j = 1;
      if (i != 0)
      {
        if (i != j) {
          break label76;
        }
        bool = this.OooO00o;
        if (!bool) {
          return j;
        }
      }
      else
      {
        bool = this.OooO00o;
        if (bool) {
          return 0;
        }
      }
      bool = j;
      label76:
      paramInt1 += 1;
    }
    if (bool) {
      return this.OooO00o;
    }
    return 2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong
 * JD-Core Version:    0.7.0.1
 */