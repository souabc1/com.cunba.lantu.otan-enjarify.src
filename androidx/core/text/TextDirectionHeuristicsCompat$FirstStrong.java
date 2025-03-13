package androidx.core.text;

class TextDirectionHeuristicsCompat$FirstStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final FirstStrong OooO00o;
  
  static
  {
    FirstStrong localFirstStrong = new androidx/core/text/TextDirectionHeuristicsCompat$FirstStrong;
    localFirstStrong.<init>();
    OooO00o = localFirstStrong;
  }
  
  public int OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramInt2 += paramInt1;
    int i = 2;
    int j = i;
    while ((paramInt1 < paramInt2) && (j == i))
    {
      j = TextDirectionHeuristicsCompat.OooO0O0(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
      paramInt1 += 1;
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong
 * JD-Core Version:    0.7.0.1
 */