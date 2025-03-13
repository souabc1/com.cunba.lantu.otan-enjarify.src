package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class Constraints
  extends ViewGroup
{
  public ConstraintSet o00OoOoo;
  
  public Constraints.LayoutParams OooO00o()
  {
    Constraints.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/Constraints$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public Constraints.LayoutParams OooO0O0(AttributeSet paramAttributeSet)
  {
    Constraints.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/Constraints$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    ConstraintLayout.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public ConstraintSet getConstraintSet()
  {
    ConstraintSet localConstraintSet = this.o00OoOoo;
    if (localConstraintSet == null)
    {
      localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
      localConstraintSet.<init>();
      this.o00OoOoo = localConstraintSet;
    }
    this.o00OoOoo.OooOOo0(this);
    return this.o00OoOoo;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.Constraints
 * JD-Core Version:    0.7.0.1
 */