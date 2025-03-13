package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

class EmojiTransformationMethod
  implements TransformationMethod
{
  public final TransformationMethod o00OoOoo;
  
  public EmojiTransformationMethod(TransformationMethod paramTransformationMethod)
  {
    this.o00OoOoo = paramTransformationMethod;
  }
  
  public TransformationMethod getOriginalTransformationMethod()
  {
    return this.o00OoOoo;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    int i = paramView.isInEditMode();
    if (i != 0) {
      return paramCharSequence;
    }
    TransformationMethod localTransformationMethod = this.o00OoOoo;
    if (localTransformationMethod != null) {
      paramCharSequence = localTransformationMethod.getTransformation(paramCharSequence, paramView);
    }
    if (paramCharSequence != null)
    {
      paramView = EmojiCompat.get();
      int j = paramView.getLoadState();
      i = 1;
      if (j == i)
      {
        paramView = EmojiCompat.get();
        paramCharSequence = paramView.OooO(paramCharSequence);
      }
    }
    return paramCharSequence;
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
    TransformationMethod localTransformationMethod = this.o00OoOoo;
    if (localTransformationMethod != null) {
      localTransformationMethod.onFocusChanged(paramView, paramCharSequence, paramBoolean, paramInt, paramRect);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTransformationMethod
 * JD-Core Version:    0.7.0.1
 */