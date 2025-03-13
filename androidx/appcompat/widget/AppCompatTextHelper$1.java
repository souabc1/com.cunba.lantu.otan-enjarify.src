package androidx.appcompat.widget;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import java.lang.ref.WeakReference;

class AppCompatTextHelper$1
  extends ResourcesCompat.FontCallback
{
  public AppCompatTextHelper$1(AppCompatTextHelper paramAppCompatTextHelper, int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
  
  public void onFontRetrievalFailed(int paramInt) {}
  
  public void onFontRetrieved(Typeface paramTypeface)
  {
    int i = this.OooO00o;
    int j = -1;
    if (i != j)
    {
      j = this.OooO0O0 & 0x2;
      if (j != 0)
      {
        j = 1;
      }
      else
      {
        j = 0;
        localWeakReference = null;
      }
      paramTypeface = AppCompatTextHelper.Api28Impl.OooO00o(paramTypeface, i, j);
    }
    AppCompatTextHelper localAppCompatTextHelper = this.OooO0Oo;
    WeakReference localWeakReference = this.OooO0OO;
    localAppCompatTextHelper.OooO0o(localWeakReference, paramTypeface);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.1
 * JD-Core Version:    0.7.0.1
 */