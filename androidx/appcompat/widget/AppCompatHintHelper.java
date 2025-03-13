package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class AppCompatHintHelper
{
  public static InputConnection OooO00o(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if (paramInputConnection != null)
    {
      CharSequence localCharSequence = paramEditorInfo.hintText;
      if (localCharSequence == null) {
        for (paramView = paramView.getParent();; paramView = ((ViewParent)paramView).getParent())
        {
          boolean bool = paramView instanceof View;
          if (!bool) {
            break;
          }
          bool = paramView instanceof WithHint;
          if (bool)
          {
            paramView = ((WithHint)paramView).getHint();
            paramEditorInfo.hintText = paramView;
            break;
          }
        }
      }
    }
    return paramInputConnection;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatHintHelper
 * JD-Core Version:    0.7.0.1
 */