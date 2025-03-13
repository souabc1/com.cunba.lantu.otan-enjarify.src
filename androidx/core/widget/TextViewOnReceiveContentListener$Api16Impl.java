package androidx.core.widget;

import android.content.ClipData.Item;
import android.content.Context;
import android.text.Spanned;

final class TextViewOnReceiveContentListener$Api16Impl
{
  public static CharSequence OooO00o(Context paramContext, ClipData.Item paramItem, int paramInt)
  {
    paramInt &= 0x1;
    if (paramInt != 0)
    {
      paramContext = paramItem.coerceToText(paramContext);
      boolean bool = paramContext instanceof Spanned;
      if (bool) {
        paramContext = ((CharSequence)paramContext).toString();
      }
      return paramContext;
    }
    return paramItem.coerceToStyledText(paramContext);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewOnReceiveContentListener.Api16Impl
 * JD-Core Version:    0.7.0.1
 */