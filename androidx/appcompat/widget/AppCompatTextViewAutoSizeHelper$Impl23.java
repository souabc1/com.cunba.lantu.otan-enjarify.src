package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

class AppCompatTextViewAutoSizeHelper$Impl23
  extends AppCompatTextViewAutoSizeHelper.Impl
{
  public void OooO00o(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    TextDirectionHeuristic localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    paramTextView = (TextDirectionHeuristic)AppCompatTextViewAutoSizeHelper.OooO0oo(paramTextView, "getTextDirectionHeuristic", localTextDirectionHeuristic);
    paramBuilder.setTextDirection(paramTextView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23
 * JD-Core Version:    0.7.0.1
 */