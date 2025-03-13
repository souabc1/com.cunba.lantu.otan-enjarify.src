package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;

public class TypefaceCompat$ResourcesCallbackAdapter
  extends FontsContractCompat.FontRequestCallback
{
  public ResourcesCompat.FontCallback OooO00o;
  
  public TypefaceCompat$ResourcesCallbackAdapter(ResourcesCompat.FontCallback paramFontCallback)
  {
    this.OooO00o = paramFontCallback;
  }
  
  public void OooO00o(int paramInt)
  {
    ResourcesCompat.FontCallback localFontCallback = this.OooO00o;
    if (localFontCallback != null) {
      localFontCallback.onFontRetrievalFailed(paramInt);
    }
  }
  
  public void OooO0O0(Typeface paramTypeface)
  {
    ResourcesCompat.FontCallback localFontCallback = this.OooO00o;
    if (localFontCallback != null) {
      localFontCallback.onFontRetrieved(paramTypeface);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter
 * JD-Core Version:    0.7.0.1
 */