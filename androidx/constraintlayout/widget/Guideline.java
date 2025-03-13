package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class Guideline
  extends View
{
  public boolean o00OoOoo = true;
  
  public Guideline(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public void draw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setFilterRedundantCalls(boolean paramBoolean)
  {
    this.o00OoOoo = paramBoolean;
  }
  
  public void setGuidelineBegin(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      int i = localLayoutParams.OooO00o;
      if (i == paramInt) {
        return;
      }
    }
    localLayoutParams.OooO00o = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelineEnd(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      int i = localLayoutParams.OooO0O0;
      if (i == paramInt) {
        return;
      }
    }
    localLayoutParams.OooO0O0 = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelinePercent(float paramFloat)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      float f = localLayoutParams.OooO0OO;
      bool = f < paramFloat;
      if (!bool) {
        return;
      }
    }
    localLayoutParams.OooO0OO = paramFloat;
    setLayoutParams(localLayoutParams);
  }
  
  public void setVisibility(int paramInt) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.Guideline
 * JD-Core Version:    0.7.0.1
 */