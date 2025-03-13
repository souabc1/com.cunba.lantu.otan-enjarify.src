package androidx.core.content;

import android.content.ClipData.Item;
import androidx.core.util.Consumer;

class IntentSanitizer$Api16Impl$Api31Impl
{
  public static void OooO00o(int paramInt, ClipData.Item paramItem, Consumer paramConsumer)
  {
    Object localObject = paramItem.getHtmlText();
    if (localObject == null)
    {
      localObject = paramItem.getIntent();
      if (localObject == null)
      {
        localObject = OooO00o.OooO00o(paramItem);
        if (localObject == null) {
          return;
        }
      }
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = "ClipData item at position ";
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" contains htmlText, textLinks or intent: ");
    ((StringBuilder)localObject).append(paramItem);
    String str2 = ((StringBuilder)localObject).toString();
    paramConsumer.accept(str2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl
 * JD-Core Version:    0.7.0.1
 */