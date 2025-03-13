package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import androidx.preference.R.styleable;

public class PreferenceImageView
  extends ImageView
{
  public int o00OoOoo;
  public int o00Ooo00;
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = -1 >>> 1;
    this.o00OoOoo = i;
    this.o00Ooo00 = i;
    int[] arrayOfInt = R.styleable.PreferenceImageView;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    int j = R.styleable.PreferenceImageView_maxWidth;
    j = paramContext.getDimensionPixelSize(j, i);
    setMaxWidth(j);
    j = R.styleable.PreferenceImageView_maxHeight;
    j = paramContext.getDimensionPixelSize(j, i);
    setMaxHeight(j);
    paramContext.recycle();
  }
  
  public int getMaxHeight()
  {
    return this.o00Ooo00;
  }
  
  public int getMaxWidth()
  {
    return this.o00OoOoo;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = -1 >>> 1;
    int k = -1 << -1;
    int m;
    int n;
    if ((i == k) || (i == 0))
    {
      m = View.MeasureSpec.getSize(paramInt1);
      n = getMaxWidth();
      if ((n != j) && ((n < m) || (i == 0))) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(n, k);
      }
    }
    i = View.MeasureSpec.getMode(paramInt2);
    if ((i == k) || (i == 0))
    {
      m = View.MeasureSpec.getSize(paramInt2);
      n = getMaxHeight();
      if ((n != j) && ((n < m) || (i == 0))) {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(n, k);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.o00Ooo00 = paramInt;
    super.setMaxHeight(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.o00OoOoo = paramInt;
    super.setMaxWidth(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.internal.PreferenceImageView
 * JD-Core Version:    0.7.0.1
 */