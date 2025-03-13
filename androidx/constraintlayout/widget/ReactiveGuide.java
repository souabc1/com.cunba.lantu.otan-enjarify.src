package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.View;

public class ReactiveGuide
  extends View
  implements SharedValues.SharedValuesListener
{
  public int o00OoOoo;
  public int o00Ooo0;
  public boolean o00Ooo00;
  
  public void draw(Canvas paramCanvas) {}
  
  public int getApplyToConstraintSetId()
  {
    return this.o00Ooo0;
  }
  
  public int getAttributeId()
  {
    return this.o00OoOoo;
  }
  
  public boolean isAnimatingChange()
  {
    return this.o00Ooo00;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setAnimateChange(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
  
  public void setApplyToConstraintSetId(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setAttributeId(int paramInt)
  {
    SharedValues localSharedValues = ConstraintLayout.getSharedValues();
    int i = this.o00OoOoo;
    int j = -1;
    if (i != j) {
      localSharedValues.OooO0O0(i, this);
    }
    this.o00OoOoo = paramInt;
    if (paramInt != j) {
      localSharedValues.OooO00o(paramInt, this);
    }
  }
  
  public void setGuidelineBegin(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.OooO00o = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelineEnd(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.OooO0O0 = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelinePercent(float paramFloat)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.OooO0OO = paramFloat;
    setLayoutParams(localLayoutParams);
  }
  
  public void setVisibility(int paramInt) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ReactiveGuide
 * JD-Core Version:    0.7.0.1
 */