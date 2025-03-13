package androidx.core.provider;

import android.graphics.Typeface;

final class FontRequestWorker$TypefaceResult
{
  public final Typeface OooO00o;
  public final int OooO0O0;
  
  public FontRequestWorker$TypefaceResult(int paramInt)
  {
    this.OooO00o = null;
    this.OooO0O0 = paramInt;
  }
  
  public FontRequestWorker$TypefaceResult(Typeface paramTypeface)
  {
    this.OooO00o = paramTypeface;
    this.OooO0O0 = 0;
  }
  
  public boolean isSuccess()
  {
    int i = this.OooO0O0;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontRequestWorker.TypefaceResult
 * JD-Core Version:    0.7.0.1
 */