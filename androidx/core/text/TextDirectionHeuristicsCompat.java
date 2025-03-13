package androidx.core.text;

public final class TextDirectionHeuristicsCompat
{
  public static final TextDirectionHeuristicCompat OooO00o;
  public static final TextDirectionHeuristicCompat OooO0O0;
  public static final TextDirectionHeuristicCompat OooO0OO;
  public static final TextDirectionHeuristicCompat OooO0Oo;
  public static final TextDirectionHeuristicCompat OooO0o = TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.OooO0O0;
  public static final TextDirectionHeuristicCompat OooO0o0;
  
  static
  {
    TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal localTextDirectionHeuristicInternal = new androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal.<init>(null, false);
    OooO00o = localTextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal = new androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
    boolean bool = true;
    localTextDirectionHeuristicInternal.<init>(null, bool);
    OooO0O0 = localTextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal = new androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
    Object localObject = TextDirectionHeuristicsCompat.FirstStrong.OooO00o;
    localTextDirectionHeuristicInternal.<init>((TextDirectionHeuristicsCompat.TextDirectionAlgorithm)localObject, false);
    OooO0OO = localTextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal = new androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal.<init>((TextDirectionHeuristicsCompat.TextDirectionAlgorithm)localObject, bool);
    OooO0Oo = localTextDirectionHeuristicInternal;
    localTextDirectionHeuristicInternal = new androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
    localObject = TextDirectionHeuristicsCompat.AnyStrong.OooO0O0;
    localTextDirectionHeuristicInternal.<init>((TextDirectionHeuristicsCompat.TextDirectionAlgorithm)localObject, false);
    OooO0o0 = localTextDirectionHeuristicInternal;
  }
  
  public static int OooO00o(int paramInt)
  {
    int i = 1;
    if (paramInt != 0)
    {
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i) {
          return i;
        }
      }
      return 0;
    }
    return i;
  }
  
  public static int OooO0O0(int paramInt)
  {
    int i = 1;
    if (paramInt != 0)
    {
      int j;
      if (paramInt != i)
      {
        j = 2;
        if (paramInt == j) {}
      }
      switch (paramInt)
      {
      default: 
        return j;
      case 16: 
      case 17: 
        return 0;
      }
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.TextDirectionHeuristicsCompat
 * JD-Core Version:    0.7.0.1
 */