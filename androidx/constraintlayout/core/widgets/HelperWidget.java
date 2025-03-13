package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HelperWidget
  extends ConstraintWidget
  implements Helper
{
  public int o0000O;
  public ConstraintWidget[] o000OO;
  
  public HelperWidget()
  {
    ConstraintWidget[] arrayOfConstraintWidget = new ConstraintWidget[4];
    this.o000OO = arrayOfConstraintWidget;
    this.o0000O = 0;
  }
  
  public void OooO00o()
  {
    this.o0000O = 0;
    Arrays.fill(this.o000OO, null);
  }
  
  public void OooO0O0(ConstraintWidget paramConstraintWidget)
  {
    if ((paramConstraintWidget != this) && (paramConstraintWidget != null))
    {
      int i = this.o0000O + 1;
      ConstraintWidget[] arrayOfConstraintWidget1 = this.o000OO;
      int j = arrayOfConstraintWidget1.length;
      if (i > j)
      {
        i = arrayOfConstraintWidget1.length * 2;
        arrayOfConstraintWidget2 = (ConstraintWidget[])Arrays.copyOf(arrayOfConstraintWidget1, i);
        this.o000OO = arrayOfConstraintWidget2;
      }
      ConstraintWidget[] arrayOfConstraintWidget2 = this.o000OO;
      int k = this.o0000O;
      arrayOfConstraintWidget2[k] = paramConstraintWidget;
      k += 1;
      this.o0000O = k;
    }
  }
  
  public void OooO0OO(ConstraintWidgetContainer paramConstraintWidgetContainer) {}
  
  public void OooOOO(ConstraintWidget paramConstraintWidget, HashMap paramHashMap)
  {
    super.OooOOO(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (HelperWidget)paramConstraintWidget;
    int i = 0;
    this.o0000O = 0;
    int j = paramConstraintWidget.o0000O;
    while (i < j)
    {
      ConstraintWidget localConstraintWidget = paramConstraintWidget.o000OO[i];
      localConstraintWidget = (ConstraintWidget)paramHashMap.get(localConstraintWidget);
      OooO0O0(localConstraintWidget);
      i += 1;
    }
  }
  
  public void OoooO0(ArrayList paramArrayList, int paramInt, WidgetGroup paramWidgetGroup)
  {
    int i = 0;
    int j = 0;
    ConstraintWidget localConstraintWidget1 = null;
    for (;;)
    {
      int k = this.o0000O;
      if (j >= k) {
        break;
      }
      ConstraintWidget localConstraintWidget2 = this.o000OO[j];
      paramWidgetGroup.OooO00o(localConstraintWidget2);
      j += 1;
    }
    for (;;)
    {
      j = this.o0000O;
      if (i >= j) {
        break;
      }
      localConstraintWidget1 = this.o000OO[i];
      Grouping.OooO00o(localConstraintWidget1, paramInt, paramArrayList, paramWidgetGroup);
      i += 1;
    }
  }
  
  public int OoooO0O(int paramInt)
  {
    int i = 0;
    int k;
    for (;;)
    {
      int j = this.o0000O;
      k = -1;
      if (i >= j) {
        break;
      }
      ConstraintWidget localConstraintWidget = this.o000OO[i];
      if (paramInt == 0)
      {
        m = localConstraintWidget.o0000oO;
        if (m != k) {
          return m;
        }
      }
      int m = 1;
      if (paramInt == m)
      {
        j = localConstraintWidget.o0000O0;
        if (j != k) {
          return j;
        }
      }
      i += 1;
    }
    return k;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.HelperWidget
 * JD-Core Version:    0.7.0.1
 */