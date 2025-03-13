package androidx.appcompat.text;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class AllCapsTransformationMethod
  implements TransformationMethod
{
  public Locale o00OoOoo;
  
  public AllCapsTransformationMethod(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration().locale;
    this.o00OoOoo = paramContext;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
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
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.text.AllCapsTransformationMethod
 * JD-Core Version:    0.7.0.1
 */