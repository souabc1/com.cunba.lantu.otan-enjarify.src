package androidx.appcompat.widget;

import android.graphics.drawable.LayerDrawable;

class AppCompatProgressBarHelper$Api23Impl
{
  public static void OooO00o(LayerDrawable paramLayerDrawable1, LayerDrawable paramLayerDrawable2, int paramInt)
  {
    int i = paramLayerDrawable1.getLayerGravity(paramInt);
    paramLayerDrawable2.setLayerGravity(paramInt, i);
    i = paramLayerDrawable1.getLayerWidth(paramInt);
    paramLayerDrawable2.setLayerWidth(paramInt, i);
    i = paramLayerDrawable1.getLayerHeight(paramInt);
    paramLayerDrawable2.setLayerHeight(paramInt, i);
    i = paramLayerDrawable1.getLayerInsetLeft(paramInt);
    paramLayerDrawable2.setLayerInsetLeft(paramInt, i);
    i = paramLayerDrawable1.getLayerInsetRight(paramInt);
    paramLayerDrawable2.setLayerInsetRight(paramInt, i);
    i = paramLayerDrawable1.getLayerInsetTop(paramInt);
    paramLayerDrawable2.setLayerInsetTop(paramInt, i);
    i = paramLayerDrawable1.getLayerInsetBottom(paramInt);
    paramLayerDrawable2.setLayerInsetBottom(paramInt, i);
    i = paramLayerDrawable1.getLayerInsetStart(paramInt);
    paramLayerDrawable2.setLayerInsetStart(paramInt, i);
    int j = paramLayerDrawable1.getLayerInsetEnd(paramInt);
    paramLayerDrawable2.setLayerInsetEnd(paramInt, j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatProgressBarHelper.Api23Impl
 * JD-Core Version:    0.7.0.1
 */