package androidx.core.text;

abstract class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
  implements TextDirectionHeuristicCompat
{
  public final TextDirectionHeuristicsCompat.TextDirectionAlgorithm OooO00o;
  
  public TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat.TextDirectionAlgorithm paramTextDirectionAlgorithm)
  {
    this.OooO00o = paramTextDirectionAlgorithm;
  }
  
  public boolean OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence != null) && (paramInt1 >= 0) && (paramInt2 >= 0))
    {
      int i = paramCharSequence.length() - paramInt2;
      if (i >= paramInt1)
      {
        TextDirectionHeuristicsCompat.TextDirectionAlgorithm localTextDirectionAlgorithm = this.OooO00o;
        if (localTextDirectionAlgorithm == null) {
          return OooO0O0();
        }
        return OooO0OO(paramCharSequence, paramInt1, paramInt2);
      }
    }
    paramCharSequence = new java/lang/IllegalArgumentException;
    paramCharSequence.<init>();
    throw paramCharSequence;
  }
  
  public abstract boolean OooO0O0();
  
  public final boolean OooO0OO(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    TextDirectionHeuristicsCompat.TextDirectionAlgorithm localTextDirectionAlgorithm = this.OooO00o;
    int i = localTextDirectionAlgorithm.OooO00o(paramCharSequence, paramInt1, paramInt2);
    paramInt1 = 1;
    if (i != 0)
    {
      if (i != paramInt1) {
        return OooO0O0();
      }
      return false;
    }
    return paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
 * JD-Core Version:    0.7.0.1
 */