package androidx.constraintlayout.widget;

import android.view.ViewGroup.MarginLayoutParams;
import java.util.HashMap;

public class ConstraintSet$Constraint
{
  public int OooO00o;
  public String OooO0O0;
  public final ConstraintSet.PropertySet OooO0OO;
  public final ConstraintSet.Motion OooO0Oo;
  public final ConstraintSet.Transform OooO0o;
  public final ConstraintSet.Layout OooO0o0;
  public HashMap OooO0oO;
  public ConstraintSet.Constraint.Delta OooO0oo;
  
  public ConstraintSet$Constraint()
  {
    Object localObject = new androidx/constraintlayout/widget/ConstraintSet$PropertySet;
    ((ConstraintSet.PropertySet)localObject).<init>();
    this.OooO0OO = ((ConstraintSet.PropertySet)localObject);
    localObject = new androidx/constraintlayout/widget/ConstraintSet$Motion;
    ((ConstraintSet.Motion)localObject).<init>();
    this.OooO0Oo = ((ConstraintSet.Motion)localObject);
    localObject = new androidx/constraintlayout/widget/ConstraintSet$Layout;
    ((ConstraintSet.Layout)localObject).<init>();
    this.OooO0o0 = ((ConstraintSet.Layout)localObject);
    localObject = new androidx/constraintlayout/widget/ConstraintSet$Transform;
    ((ConstraintSet.Transform)localObject).<init>();
    this.OooO0o = ((ConstraintSet.Transform)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0oO = ((HashMap)localObject);
  }
  
  public final void OooO(ConstraintHelper paramConstraintHelper, int paramInt, Constraints.LayoutParams paramLayoutParams)
  {
    OooO0oo(paramInt, paramLayoutParams);
    paramInt = paramConstraintHelper instanceof Barrier;
    if (paramInt != 0)
    {
      ConstraintSet.Layout localLayout = this.OooO0o0;
      localLayout.Ooooooo = 1;
      paramConstraintHelper = (Barrier)paramConstraintHelper;
      int i = paramConstraintHelper.getType();
      localLayout.Oooooo = i;
      localLayout = this.OooO0o0;
      paramLayoutParams = paramConstraintHelper.getReferencedIds();
      localLayout.o0OoOo0 = paramLayoutParams;
      localLayout = this.OooO0o0;
      int j = paramConstraintHelper.getMargin();
      localLayout.OoooooO = j;
    }
  }
  
  public void OooO0Oo(Constraint paramConstraint)
  {
    ConstraintSet.Constraint.Delta localDelta = this.OooO0oo;
    if (localDelta != null) {
      localDelta.OooO0o0(paramConstraint);
    }
  }
  
  public Constraint OooO0o()
  {
    Constraint localConstraint = new androidx/constraintlayout/widget/ConstraintSet$Constraint;
    localConstraint.<init>();
    Object localObject1 = localConstraint.OooO0o0;
    Object localObject2 = this.OooO0o0;
    ((ConstraintSet.Layout)localObject1).OooO00o((ConstraintSet.Layout)localObject2);
    localObject1 = localConstraint.OooO0Oo;
    localObject2 = this.OooO0Oo;
    ((ConstraintSet.Motion)localObject1).OooO00o((ConstraintSet.Motion)localObject2);
    localObject1 = localConstraint.OooO0OO;
    localObject2 = this.OooO0OO;
    ((ConstraintSet.PropertySet)localObject1).OooO00o((ConstraintSet.PropertySet)localObject2);
    localObject1 = localConstraint.OooO0o;
    localObject2 = this.OooO0o;
    ((ConstraintSet.Transform)localObject1).OooO00o((ConstraintSet.Transform)localObject2);
    int i = this.OooO00o;
    localConstraint.OooO00o = i;
    localObject1 = this.OooO0oo;
    localConstraint.OooO0oo = ((ConstraintSet.Constraint.Delta)localObject1);
    return localConstraint;
  }
  
  public void OooO0o0(ConstraintLayout.LayoutParams paramLayoutParams)
  {
    ConstraintSet.Layout localLayout = this.OooO0o0;
    int i = localLayout.OooOO0;
    paramLayoutParams.OooO0o0 = i;
    i = localLayout.OooOO0O;
    paramLayoutParams.OooO0o = i;
    i = localLayout.OooOO0o;
    paramLayoutParams.OooO0oO = i;
    i = localLayout.OooOOO0;
    paramLayoutParams.OooO0oo = i;
    i = localLayout.OooOOO;
    paramLayoutParams.OooO = i;
    i = localLayout.OooOOOO;
    paramLayoutParams.OooOO0 = i;
    i = localLayout.OooOOOo;
    paramLayoutParams.OooOO0O = i;
    i = localLayout.OooOOo0;
    paramLayoutParams.OooOO0o = i;
    i = localLayout.OooOOo;
    paramLayoutParams.OooOOO0 = i;
    i = localLayout.OooOOoo;
    paramLayoutParams.OooOOO = i;
    i = localLayout.OooOo00;
    paramLayoutParams.OooOOOO = i;
    i = localLayout.OooOo0;
    paramLayoutParams.OooOOoo = i;
    i = localLayout.OooOo0O;
    paramLayoutParams.OooOo00 = i;
    i = localLayout.OooOo0o;
    paramLayoutParams.OooOo0 = i;
    i = localLayout.OooOo;
    paramLayoutParams.OooOo0O = i;
    i = localLayout.Oooo00o;
    paramLayoutParams.leftMargin = i;
    i = localLayout.Oooo0;
    paramLayoutParams.rightMargin = i;
    i = localLayout.Oooo0O0;
    paramLayoutParams.topMargin = i;
    i = localLayout.Oooo0OO;
    paramLayoutParams.bottomMargin = i;
    i = localLayout.OoooO;
    paramLayoutParams.OooOoOO = i;
    i = localLayout.OoooO0O;
    paramLayoutParams.OooOoo0 = i;
    i = localLayout.Oooo;
    paramLayoutParams.OooOo = i;
    i = localLayout.OoooO0;
    paramLayoutParams.OooOoO = i;
    float f = localLayout.OooOoO0;
    paramLayoutParams.Oooo00O = f;
    f = localLayout.OooOoO;
    paramLayoutParams.Oooo00o = f;
    i = localLayout.OooOoo0;
    paramLayoutParams.OooOOOo = i;
    i = localLayout.OooOoo;
    paramLayoutParams.OooOOo0 = i;
    f = localLayout.OooOooO;
    paramLayoutParams.OooOOo = f;
    String str = localLayout.OooOoOO;
    paramLayoutParams.Oooo0 = str;
    i = localLayout.OooOooo;
    paramLayoutParams.OoooOOo = i;
    i = localLayout.Oooo000;
    paramLayoutParams.OoooOo0 = i;
    f = localLayout.o000oOoO;
    paramLayoutParams.Oooo0o = f;
    f = localLayout.OoooOOO;
    paramLayoutParams.Oooo0o0 = f;
    i = localLayout.OoooOo0;
    paramLayoutParams.Oooo0oo = i;
    i = localLayout.OoooOOo;
    paramLayoutParams.Oooo0oO = i;
    boolean bool = localLayout.o00Oo0;
    paramLayoutParams.OoooOoo = bool;
    bool = localLayout.o00Ooo;
    paramLayoutParams.Ooooo00 = bool;
    int j = localLayout.OoooOoO;
    paramLayoutParams.Oooo = j;
    j = localLayout.OoooOoo;
    paramLayoutParams.OoooO00 = j;
    j = localLayout.Ooooo00;
    paramLayoutParams.OoooO = j;
    j = localLayout.Ooooo0o;
    paramLayoutParams.OoooOO0 = j;
    j = localLayout.OooooO0;
    paramLayoutParams.OoooO0 = j;
    j = localLayout.OooooOO;
    paramLayoutParams.OoooO0O = j;
    f = localLayout.OooooOo;
    paramLayoutParams.o000oOoO = f;
    f = localLayout.Oooooo0;
    paramLayoutParams.OoooOOO = f;
    j = localLayout.Oooo00O;
    paramLayoutParams.OoooOoO = j;
    f = localLayout.OooO0oo;
    paramLayoutParams.OooO0OO = f;
    j = localLayout.OooO0o;
    paramLayoutParams.OooO00o = j;
    j = localLayout.OooO0oO;
    paramLayoutParams.OooO0O0 = j;
    j = localLayout.OooO0Oo;
    paramLayoutParams.width = j;
    j = localLayout.OooO0o0;
    paramLayoutParams.height = j;
    str = localLayout.o00O0O;
    if (str != null) {
      paramLayoutParams.Ooooo0o = str;
    }
    j = localLayout.o00ooo;
    paramLayoutParams.OooooO0 = j;
    int k = localLayout.Oooo0o;
    paramLayoutParams.setMarginStart(k);
    k = this.OooO0o0.Oooo0o0;
    paramLayoutParams.setMarginEnd(k);
    paramLayoutParams.OooO00o();
  }
  
  public final void OooO0oO(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams)
  {
    this.OooO00o = paramInt;
    ConstraintSet.Layout localLayout = this.OooO0o0;
    int i = paramLayoutParams.OooO0o0;
    localLayout.OooOO0 = i;
    i = paramLayoutParams.OooO0o;
    localLayout.OooOO0O = i;
    i = paramLayoutParams.OooO0oO;
    localLayout.OooOO0o = i;
    i = paramLayoutParams.OooO0oo;
    localLayout.OooOOO0 = i;
    i = paramLayoutParams.OooO;
    localLayout.OooOOO = i;
    i = paramLayoutParams.OooOO0;
    localLayout.OooOOOO = i;
    i = paramLayoutParams.OooOO0O;
    localLayout.OooOOOo = i;
    i = paramLayoutParams.OooOO0o;
    localLayout.OooOOo0 = i;
    i = paramLayoutParams.OooOOO0;
    localLayout.OooOOo = i;
    i = paramLayoutParams.OooOOO;
    localLayout.OooOOoo = i;
    i = paramLayoutParams.OooOOOO;
    localLayout.OooOo00 = i;
    i = paramLayoutParams.OooOOoo;
    localLayout.OooOo0 = i;
    i = paramLayoutParams.OooOo00;
    localLayout.OooOo0O = i;
    i = paramLayoutParams.OooOo0;
    localLayout.OooOo0o = i;
    i = paramLayoutParams.OooOo0O;
    localLayout.OooOo = i;
    float f = paramLayoutParams.Oooo00O;
    localLayout.OooOoO0 = f;
    f = paramLayoutParams.Oooo00o;
    localLayout.OooOoO = f;
    String str = paramLayoutParams.Oooo0;
    localLayout.OooOoOO = str;
    i = paramLayoutParams.OooOOOo;
    localLayout.OooOoo0 = i;
    i = paramLayoutParams.OooOOo0;
    localLayout.OooOoo = i;
    f = paramLayoutParams.OooOOo;
    localLayout.OooOooO = f;
    i = paramLayoutParams.OoooOOo;
    localLayout.OooOooo = i;
    i = paramLayoutParams.OoooOo0;
    localLayout.Oooo000 = i;
    i = paramLayoutParams.OoooOoO;
    localLayout.Oooo00O = i;
    f = paramLayoutParams.OooO0OO;
    localLayout.OooO0oo = f;
    i = paramLayoutParams.OooO00o;
    localLayout.OooO0o = i;
    i = paramLayoutParams.OooO0O0;
    localLayout.OooO0oO = i;
    i = paramLayoutParams.width;
    localLayout.OooO0Oo = i;
    i = paramLayoutParams.height;
    localLayout.OooO0o0 = i;
    i = paramLayoutParams.leftMargin;
    localLayout.Oooo00o = i;
    i = paramLayoutParams.rightMargin;
    localLayout.Oooo0 = i;
    i = paramLayoutParams.topMargin;
    localLayout.Oooo0O0 = i;
    i = paramLayoutParams.bottomMargin;
    localLayout.Oooo0OO = i;
    i = paramLayoutParams.OooOooO;
    localLayout.Oooo0oO = i;
    f = paramLayoutParams.Oooo0o;
    localLayout.o000oOoO = f;
    f = paramLayoutParams.Oooo0o0;
    localLayout.OoooOOO = f;
    i = paramLayoutParams.Oooo0oo;
    localLayout.OoooOo0 = i;
    i = paramLayoutParams.Oooo0oO;
    localLayout.OoooOOo = i;
    boolean bool = paramLayoutParams.OoooOoo;
    localLayout.o00Oo0 = bool;
    bool = paramLayoutParams.Ooooo00;
    localLayout.o00Ooo = bool;
    int j = paramLayoutParams.Oooo;
    localLayout.OoooOoO = j;
    j = paramLayoutParams.OoooO00;
    localLayout.OoooOoo = j;
    j = paramLayoutParams.OoooO;
    localLayout.Ooooo00 = j;
    j = paramLayoutParams.OoooOO0;
    localLayout.Ooooo0o = j;
    j = paramLayoutParams.OoooO0;
    localLayout.OooooO0 = j;
    j = paramLayoutParams.OoooO0O;
    localLayout.OooooOO = j;
    f = paramLayoutParams.o000oOoO;
    localLayout.OooooOo = f;
    f = paramLayoutParams.OoooOOO;
    localLayout.Oooooo0 = f;
    str = paramLayoutParams.Ooooo0o;
    localLayout.o00O0O = str;
    j = paramLayoutParams.OooOo;
    localLayout.Oooo = j;
    j = paramLayoutParams.OooOoO;
    localLayout.OoooO0 = j;
    j = paramLayoutParams.OooOo0o;
    localLayout.Oooo0oo = j;
    j = paramLayoutParams.OooOoO0;
    localLayout.OoooO00 = j;
    j = paramLayoutParams.OooOoOO;
    localLayout.OoooO = j;
    j = paramLayoutParams.OooOoo0;
    localLayout.OoooO0O = j;
    j = paramLayoutParams.OooOoo;
    localLayout.OoooOO0 = j;
    j = paramLayoutParams.OooooO0;
    localLayout.o00ooo = j;
    j = paramLayoutParams.getMarginEnd();
    localLayout.Oooo0o0 = j;
    localLayout = this.OooO0o0;
    int k = paramLayoutParams.getMarginStart();
    localLayout.Oooo0o = k;
  }
  
  public final void OooO0oo(int paramInt, Constraints.LayoutParams paramLayoutParams)
  {
    OooO0oO(paramInt, paramLayoutParams);
    Object localObject = this.OooO0OO;
    float f = paramLayoutParams.o0OOO0o;
    ((ConstraintSet.PropertySet)localObject).OooO0Oo = f;
    localObject = this.OooO0o;
    f = paramLayoutParams.oo0o0Oo;
    ((ConstraintSet.Transform)localObject).OooO0O0 = f;
    f = paramLayoutParams.o0O0O00;
    ((ConstraintSet.Transform)localObject).OooO0OO = f;
    f = paramLayoutParams.o000OOo;
    ((ConstraintSet.Transform)localObject).OooO0Oo = f;
    f = paramLayoutParams.o000000;
    ((ConstraintSet.Transform)localObject).OooO0o0 = f;
    f = paramLayoutParams.o000000O;
    ((ConstraintSet.Transform)localObject).OooO0o = f;
    f = paramLayoutParams.o000000o;
    ((ConstraintSet.Transform)localObject).OooO0oO = f;
    f = paramLayoutParams.o00000;
    ((ConstraintSet.Transform)localObject).OooO0oo = f;
    f = paramLayoutParams.o00000O0;
    ((ConstraintSet.Transform)localObject).OooOO0 = f;
    f = paramLayoutParams.o00000O;
    ((ConstraintSet.Transform)localObject).OooOO0O = f;
    f = paramLayoutParams.o00000OO;
    ((ConstraintSet.Transform)localObject).OooOO0o = f;
    f = paramLayoutParams.o0OO00O;
    ((ConstraintSet.Transform)localObject).OooOOO = f;
    boolean bool = paramLayoutParams.o0Oo0oo;
    ((ConstraintSet.Transform)localObject).OooOOO0 = bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Constraint
 * JD-Core Version:    0.7.0.1
 */