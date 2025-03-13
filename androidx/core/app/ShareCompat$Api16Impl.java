package androidx.core.app;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.util.ArrayList;

class ShareCompat$Api16Impl
{
  public static String OooO00o(CharSequence paramCharSequence)
  {
    return Html.escapeHtml(paramCharSequence);
  }
  
  public static void OooO0O0(Intent paramIntent, ArrayList paramArrayList)
  {
    CharSequence localCharSequence = paramIntent.getCharSequenceExtra("android.intent.extra.TEXT");
    String str = paramIntent.getStringExtra("android.intent.extra.HTML_TEXT");
    ClipData localClipData = new android/content/ClipData;
    Object localObject1 = paramIntent.getType();
    localObject1 = new String[] { localObject1 };
    Object localObject2 = new android/content/ClipData$Item;
    Object localObject3 = (Uri)paramArrayList.get(0);
    ((ClipData.Item)localObject2).<init>(localCharSequence, str, null, (Uri)localObject3);
    localClipData.<init>(null, (String[])localObject1, (ClipData.Item)localObject2);
    int i = paramArrayList.size();
    int j = 1;
    int k = j;
    while (k < i)
    {
      localObject2 = (Uri)paramArrayList.get(k);
      localObject3 = new android/content/ClipData$Item;
      ((ClipData.Item)localObject3).<init>((Uri)localObject2);
      localClipData.addItem((ClipData.Item)localObject3);
      k += 1;
    }
    paramIntent.setClipData(localClipData);
    paramIntent.addFlags(j);
  }
  
  public static void OooO0OO(Intent paramIntent)
  {
    paramIntent.setClipData(null);
    int i = paramIntent.getFlags() & 0xFFFFFFFE;
    paramIntent.setFlags(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ShareCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */