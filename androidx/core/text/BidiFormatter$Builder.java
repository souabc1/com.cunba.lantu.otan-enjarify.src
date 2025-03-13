package androidx.core.text;

import java.util.Locale;

public final class BidiFormatter$Builder
{
  public boolean OooO00o;
  public int OooO0O0;
  public TextDirectionHeuristicCompat OooO0OO;
  
  public BidiFormatter$Builder()
  {
    boolean bool = BidiFormatter.OooO0OO(Locale.getDefault());
    OooO0OO(bool);
  }
  
  public static BidiFormatter OooO0O0(boolean paramBoolean)
  {
    BidiFormatter localBidiFormatter;
    if (paramBoolean) {
      localBidiFormatter = BidiFormatter.OooO0oo;
    } else {
      localBidiFormatter = BidiFormatter.OooO0oO;
    }
    return localBidiFormatter;
  }
  
  public BidiFormatter OooO00o()
  {
    int i = this.OooO0O0;
    int j = 2;
    if (i == j)
    {
      localObject = this.OooO0OO;
      TextDirectionHeuristicCompat localTextDirectionHeuristicCompat1 = BidiFormatter.OooO0Oo;
      if (localObject == localTextDirectionHeuristicCompat1) {
        return OooO0O0(this.OooO00o);
      }
    }
    Object localObject = new androidx/core/text/BidiFormatter;
    boolean bool = this.OooO00o;
    int k = this.OooO0O0;
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat2 = this.OooO0OO;
    ((BidiFormatter)localObject).<init>(bool, k, localTextDirectionHeuristicCompat2);
    return localObject;
  }
  
  public final void OooO0OO(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    TextDirectionHeuristicCompat localTextDirectionHeuristicCompat = BidiFormatter.OooO0Oo;
    this.OooO0OO = localTextDirectionHeuristicCompat;
    this.OooO0O0 = 2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.BidiFormatter.Builder
 * JD-Core Version:    0.7.0.1
 */