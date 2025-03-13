package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.ReplacementTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class PagerTitleStrip$SingleLineAllCapsTransform
  extends SingleLineTransformationMethod
{
  public Locale o00OoOoo;
  
  public PagerTitleStrip$SingleLineAllCapsTransform(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration().locale;
    this.o00OoOoo = paramContext;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    if (paramCharSequence != null)
    {
      paramCharSequence = paramCharSequence.toString();
      paramView = this.o00OoOoo;
      paramCharSequence = paramCharSequence.toUpperCase(paramView);
    }
    else
    {
      paramCharSequence = null;
    }
    return paramCharSequence;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform
 * JD-Core Version:    0.7.0.1
 */