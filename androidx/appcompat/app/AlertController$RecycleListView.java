package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.R.styleable;

public class AlertController$RecycleListView
  extends ListView
{
  public final int o00OoOoo;
  public final int o00Ooo00;
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.RecycleListView;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.RecycleListView_paddingBottomNoButtons;
    int j = -1;
    i = paramContext.getDimensionPixelOffset(i, j);
    this.o00Ooo00 = i;
    i = R.styleable.RecycleListView_paddingTopNoTitle;
    int k = paramContext.getDimensionPixelOffset(i, j);
    this.o00OoOoo = k;
  }
  
  public void OooO00o(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) || (!paramBoolean1))
    {
      int i = getPaddingLeft();
      if (paramBoolean1) {
        paramBoolean1 = getPaddingTop();
      } else {
        paramBoolean1 = this.o00OoOoo;
      }
      int j = getPaddingRight();
      if (paramBoolean2) {
        paramBoolean2 = getPaddingBottom();
      } else {
        paramBoolean2 = this.o00Ooo00;
      }
      setPadding(i, paramBoolean1, j, paramBoolean2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.RecycleListView
 * JD-Core Version:    0.7.0.1
 */