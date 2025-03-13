package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

final class AppCompatTextClassifierHelper$Api26Impl
{
  public static TextClassifier OooO00o(TextView paramTextView)
  {
    paramTextView = paramTextView.getContext();
    TextClassificationManager localTextClassificationManager = TextClassificationManager.class;
    paramTextView = (TextClassificationManager)paramTextView.getSystemService(localTextClassificationManager);
    if (paramTextView != null) {
      return paramTextView.getTextClassifier();
    }
    return TextClassifier.NO_OP;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextClassifierHelper.Api26Impl
 * JD-Core Version:    0.7.0.1
 */