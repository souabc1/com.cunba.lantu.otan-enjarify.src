package androidx.core.widget;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

public final class TextViewOnReceiveContentListener
  implements OnReceiveContentListener
{
  public static CharSequence OooO0O0(Context paramContext, ClipData.Item paramItem, int paramInt)
  {
    return TextViewOnReceiveContentListener.Api16Impl.OooO00o(paramContext, paramItem, paramInt);
  }
  
  public static void OooO0OO(Editable paramEditable, CharSequence paramCharSequence)
  {
    int i = Selection.getSelectionStart(paramEditable);
    int j = Selection.getSelectionEnd(paramEditable);
    int k = Math.min(i, j);
    k = Math.max(0, k);
    i = Math.max(i, j);
    i = Math.max(0, i);
    Selection.setSelection(paramEditable, i);
    paramEditable.replace(k, i, paramCharSequence);
  }
  
  public ContentInfoCompat OooO00o(View paramView, ContentInfoCompat paramContentInfoCompat)
  {
    Object localObject1 = "ReceiveContent";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "onReceive: ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramContentInfoCompat);
    }
    int j = paramContentInfoCompat.getSource();
    i = 2;
    if (j == i) {
      return paramContentInfoCompat;
    }
    localObject1 = paramContentInfoCompat.getClip();
    int k = paramContentInfoCompat.getFlags();
    paramView = (TextView)paramView;
    Object localObject2 = (Editable)paramView.getText();
    paramView = paramView.getContext();
    int m = 0;
    int n = 0;
    for (;;)
    {
      int i1 = ((ClipData)localObject1).getItemCount();
      if (m >= i1) {
        break;
      }
      Object localObject3 = ((ClipData)localObject1).getItemAt(m);
      localObject3 = OooO0O0(paramView, (ClipData.Item)localObject3, k);
      if (localObject3 != null) {
        if (n == 0)
        {
          OooO0OO((Editable)localObject2, (CharSequence)localObject3);
          n = 1;
        }
        else
        {
          int i2 = Selection.getSelectionEnd((CharSequence)localObject2);
          String str = "\n";
          ((Editable)localObject2).insert(i2, str);
          i2 = Selection.getSelectionEnd((CharSequence)localObject2);
          ((Editable)localObject2).insert(i2, (CharSequence)localObject3);
        }
      }
      m += 1;
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewOnReceiveContentListener
 * JD-Core Version:    0.7.0.1
 */