package androidx.emoji2.text;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;

public class FontRequestEmojiCompatConfig$FontProviderHelper
{
  public Typeface OooO00o(Context paramContext, FontsContractCompat.FontInfo paramFontInfo)
  {
    FontsContractCompat.FontInfo[] arrayOfFontInfo = new FontsContractCompat.FontInfo[1];
    arrayOfFontInfo[0] = paramFontInfo;
    return FontsContractCompat.OooO00o(paramContext, null, arrayOfFontInfo);
  }
  
  public FontsContractCompat.FontFamilyResult OooO0O0(Context paramContext, FontRequest paramFontRequest)
  {
    return FontsContractCompat.OooO0O0(paramContext, null, paramFontRequest);
  }
  
  public void OooO0OO(Context paramContext, Uri paramUri, ContentObserver paramContentObserver)
  {
    paramContext.getContentResolver().registerContentObserver(paramUri, false, paramContentObserver);
  }
  
  public void OooO0Oo(Context paramContext, ContentObserver paramContentObserver)
  {
    paramContext.getContentResolver().unregisterContentObserver(paramContentObserver);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper
 * JD-Core Version:    0.7.0.1
 */