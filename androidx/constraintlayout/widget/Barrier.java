package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class Barrier
  extends ConstraintHelper
{
  public int o00OoooO;
  public androidx.constraintlayout.core.widgets.Barrier o00Ooooo;
  public int o0O00o0;
  
  public Barrier(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public void OooOOOO(AttributeSet paramAttributeSet)
  {
    super.OooOOOO(paramAttributeSet);
    Object localObject = new androidx/constraintlayout/core/widgets/Barrier;
    ((androidx.constraintlayout.core.widgets.Barrier)localObject).<init>();
    this.o00Ooooo = ((androidx.constraintlayout.core.widgets.Barrier)localObject);
    if (paramAttributeSet != null)
    {
      localObject = getContext();
      int[] arrayOfInt = R.styleable.ConstraintLayout_Layout;
      paramAttributeSet = ((Context)localObject).obtainStyledAttributes(paramAttributeSet, arrayOfInt);
      int i = paramAttributeSet.getIndexCount();
      arrayOfInt = null;
      int j = 0;
      while (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        int i1 = R.styleable.ConstraintLayout_Layout_barrierDirection;
        if (k == i1)
        {
          k = paramAttributeSet.getInt(k, 0);
          setType(k);
        }
        else
        {
          i1 = R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets;
          androidx.constraintlayout.core.widgets.Barrier localBarrier;
          int m;
          if (k == i1)
          {
            localBarrier = this.o00Ooooo;
            boolean bool = true;
            m = paramAttributeSet.getBoolean(k, bool);
            localBarrier.setAllowsGoneWidget(m);
          }
          else
          {
            i1 = R.styleable.ConstraintLayout_Layout_barrierMargin;
            if (m == i1)
            {
              int n = paramAttributeSet.getDimensionPixelSize(m, 0);
              localBarrier = this.o00Ooooo;
              localBarrier.setMargin(n);
            }
          }
        }
        j += 1;
      }
      paramAttributeSet.recycle();
    }
    paramAttributeSet = this.o00Ooooo;
    this.o00Ooo0O = paramAttributeSet;
    OooOo0o();
  }
  
  public void OooOOOo(ConstraintSet.Constraint paramConstraint, HelperWidget paramHelperWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray paramSparseArray)
  {
    super.OooOOOo(paramConstraint, paramHelperWidget, paramLayoutParams, paramSparseArray);
    boolean bool1 = paramHelperWidget instanceof androidx.constraintlayout.core.widgets.Barrier;
    if (bool1)
    {
      paramLayoutParams = paramHelperWidget;
      paramLayoutParams = (androidx.constraintlayout.core.widgets.Barrier)paramHelperWidget;
      boolean bool2 = ((ConstraintWidgetContainer)((ConstraintWidget)paramHelperWidget).getParent()).isRtl();
      paramSparseArray = paramConstraint.OooO0o0;
      int i = paramSparseArray.Oooooo;
      OooOo(paramLayoutParams, i, bool2);
      paramHelperWidget = paramConstraint.OooO0o0;
      bool2 = paramHelperWidget.o00o0O;
      paramLayoutParams.setAllowsGoneWidget(bool2);
      paramConstraint = paramConstraint.OooO0o0;
      int j = paramConstraint.OoooooO;
      paramLayoutParams.setMargin(j);
    }
  }
  
  public void OooOOo0(ConstraintWidget paramConstraintWidget, boolean paramBoolean)
  {
    int i = this.o0O00o0;
    OooOo(paramConstraintWidget, i, paramBoolean);
  }
  
  public final void OooOo(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean)
  {
    this.o00OoooO = paramInt;
    paramInt = 1;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramBoolean)
    {
      paramBoolean = this.o0O00o0;
      if (paramBoolean != bool2) {}
    }
    label57:
    do
    {
      this.o00OoooO = paramInt;
      break;
      if (paramBoolean != bool1) {
        break;
      }
      break label57;
      paramBoolean = this.o0O00o0;
      if (paramBoolean == bool2)
      {
        this.o00OoooO = 0;
        break;
      }
    } while (paramBoolean == bool1);
    paramInt = paramConstraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier;
    if (paramInt != 0)
    {
      paramConstraintWidget = (androidx.constraintlayout.core.widgets.Barrier)paramConstraintWidget;
      paramInt = this.o00OoooO;
      paramConstraintWidget.setBarrierType(paramInt);
    }
  }
  
  public boolean getAllowsGoneWidget()
  {
    return this.o00Ooooo.getAllowsGoneWidget();
  }
  
  public int getMargin()
  {
    return this.o00Ooooo.getMargin();
  }
  
  public int getType()
  {
    return this.o0O00o0;
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    this.o00Ooooo.setAllowsGoneWidget(paramBoolean);
  }
  
  public void setDpMargin(int paramInt)
  {
    float f = getResources().getDisplayMetrics().density;
    paramInt = (int)(paramInt * f + 0.5F);
    this.o00Ooooo.setMargin(paramInt);
  }
  
  public void setMargin(int paramInt)
  {
    this.o00Ooooo.setMargin(paramInt);
  }
  
  public void setType(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.Barrier
 * JD-Core Version:    0.7.0.1
 */