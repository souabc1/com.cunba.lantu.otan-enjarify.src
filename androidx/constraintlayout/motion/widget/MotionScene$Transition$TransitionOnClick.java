package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.R.styleable;
import org.xmlpull.v1.XmlPullParser;

public class MotionScene$Transition$TransitionOnClick
  implements View.OnClickListener
{
  public final MotionScene.Transition o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00 = -1;
  
  public MotionScene$Transition$TransitionOnClick(Context paramContext, MotionScene.Transition paramTransition, XmlPullParser paramXmlPullParser)
  {
    int i = 17;
    this.o00Ooo0 = i;
    this.o00OoOoo = paramTransition;
    paramTransition = Xml.asAttributeSet(paramXmlPullParser);
    paramXmlPullParser = R.styleable.OnClick;
    paramContext = paramContext.obtainStyledAttributes(paramTransition, paramXmlPullParser);
    int j = paramContext.getIndexCount();
    int k = 0;
    paramXmlPullParser = null;
    while (k < j)
    {
      i = paramContext.getIndex(k);
      int m = R.styleable.OnClick_targetId;
      if (i == m)
      {
        m = this.o00Ooo00;
        i = paramContext.getResourceId(i, m);
        this.o00Ooo00 = i;
      }
      else
      {
        m = R.styleable.OnClick_clickAction;
        if (i == m)
        {
          m = this.o00Ooo0;
          i = paramContext.getInt(i, m);
          this.o00Ooo0 = i;
        }
      }
      k += 1;
    }
    paramContext.recycle();
  }
  
  public void OooO00o(MotionLayout paramMotionLayout, int paramInt, MotionScene.Transition paramTransition)
  {
    int i = this.o00Ooo00;
    int j = -1;
    if (i != j) {
      paramMotionLayout = paramMotionLayout.findViewById(i);
    }
    if (paramMotionLayout == null)
    {
      paramMotionLayout = new java/lang/StringBuilder;
      paramMotionLayout.<init>();
      paramMotionLayout.append("OnClick could not find id ");
      paramInt = this.o00Ooo00;
      paramMotionLayout.append(paramInt);
      return;
    }
    i = MotionScene.Transition.OooO0OO(paramTransition);
    int k = MotionScene.Transition.OooO00o(paramTransition);
    if (i == j)
    {
      paramMotionLayout.setOnClickListener(this);
      return;
    }
    j = this.o00Ooo0;
    int m = j & 0x1;
    int n = 0;
    int i1 = 1;
    if ((m != 0) && (paramInt == i)) {
      m = i1;
    } else {
      m = 0;
    }
    int i2 = j & 0x100;
    if ((i2 != 0) && (paramInt == i)) {
      i2 = i1;
    } else {
      i2 = 0;
    }
    m |= i2;
    i2 = j & 0x1;
    if ((i2 != 0) && (paramInt == i)) {
      i = i1;
    } else {
      i = 0;
    }
    i |= m;
    m = j & 0x10;
    if ((m != 0) && (paramInt == k)) {
      m = i1;
    } else {
      m = 0;
    }
    i |= m;
    j &= 0x1000;
    if ((j != 0) && (paramInt == k)) {
      n = i1;
    }
    paramInt = i | n;
    if (paramInt != 0) {
      paramMotionLayout.setOnClickListener(this);
    }
  }
  
  public boolean OooO0O0(MotionScene.Transition paramTransition, MotionLayout paramMotionLayout)
  {
    MotionScene.Transition localTransition = this.o00OoOoo;
    boolean bool = true;
    if (localTransition == paramTransition) {
      return bool;
    }
    int i = MotionScene.Transition.OooO00o(localTransition);
    localTransition = this.o00OoOoo;
    int j = MotionScene.Transition.OooO0OO(localTransition);
    int k = -1;
    int m = paramMotionLayout.o00OooO0;
    if (j == k)
    {
      if (m == i) {
        bool = false;
      }
      return bool;
    }
    if ((m != j) && (m != i)) {
      bool = false;
    }
    return bool;
  }
  
  public void OooO0OO(MotionLayout paramMotionLayout)
  {
    int i = this.o00Ooo00;
    int j = -1;
    if (i == j) {
      return;
    }
    paramMotionLayout = paramMotionLayout.findViewById(i);
    if (paramMotionLayout == null)
    {
      paramMotionLayout = new java/lang/StringBuilder;
      paramMotionLayout.<init>();
      paramMotionLayout.append(" (*)  could not find id ");
      i = this.o00Ooo00;
      paramMotionLayout.append(i);
      return;
    }
    paramMotionLayout.setOnClickListener(null);
  }
  
  public void onClick(View paramView)
  {
    paramView = MotionScene.OooO0Oo(MotionScene.Transition.OooOOoo(this.o00OoOoo));
    boolean bool1 = paramView.isInteractionEnabled();
    if (!bool1) {
      return;
    }
    MotionScene.Transition localTransition1 = this.o00OoOoo;
    int i = MotionScene.Transition.OooO0OO(localTransition1);
    int k = -1;
    MotionScene.Transition localTransition2;
    MotionScene localMotionScene;
    if (i == k)
    {
      i = paramView.getCurrentState();
      if (i == k)
      {
        i = MotionScene.Transition.OooO00o(this.o00OoOoo);
        paramView.Ooooo0o(i);
        return;
      }
      localTransition2 = new androidx/constraintlayout/motion/widget/MotionScene$Transition;
      localMotionScene = MotionScene.Transition.OooOOoo(this.o00OoOoo);
      localTransition3 = this.o00OoOoo;
      localTransition2.<init>(localMotionScene, localTransition3);
      MotionScene.Transition.OooO0Oo(localTransition2, i);
      i = MotionScene.Transition.OooO00o(this.o00OoOoo);
      MotionScene.Transition.OooO0O0(localTransition2, i);
      paramView.setTransition(localTransition2);
      paramView.OoooOoO();
      return;
    }
    localTransition1 = MotionScene.Transition.OooOOoo(this.o00OoOoo).OooO0OO;
    k = this.o00Ooo0;
    int m = k & 0x1;
    int n = 0;
    MotionScene.Transition localTransition3 = null;
    int i1 = 1;
    float f1 = 1.4E-45F;
    if (m == 0)
    {
      m = k & 0x100;
      if (m == 0)
      {
        m = 0;
        localMotionScene = null;
        break label197;
      }
    }
    m = i1;
    label197:
    int i2 = k & 0x10;
    if (i2 == 0)
    {
      k &= 0x1000;
      if (k == 0)
      {
        k = 0;
        localTransition2 = null;
        break label238;
      }
    }
    k = i1;
    label238:
    float f2;
    MotionScene.Transition localTransition4;
    if ((m != 0) && (k != 0))
    {
      i2 = i1;
      f2 = f1;
    }
    else
    {
      i2 = 0;
      localTransition4 = null;
      f2 = 0.0F;
    }
    if (i2 != 0)
    {
      localTransition4 = MotionScene.Transition.OooOOoo(this.o00OoOoo).OooO0OO;
      MotionScene.Transition localTransition5 = this.o00OoOoo;
      if (localTransition4 != localTransition5) {
        paramView.setTransition(localTransition5);
      }
      i2 = paramView.getCurrentState();
      int i3 = paramView.getEndState();
      if (i2 != i3)
      {
        f2 = paramView.getProgress();
        i3 = 1056964608;
        float f3 = 0.5F;
        boolean bool3 = f2 < f3;
        if (!bool3)
        {
          k = 0;
          localTransition2 = null;
        }
      }
    }
    else
    {
      n = m;
    }
    boolean bool2 = OooO0O0(localTransition1, paramView);
    if (bool2)
    {
      int j;
      if (n != 0)
      {
        j = this.o00Ooo0 & i1;
        if (j != 0)
        {
          localTransition1 = this.o00OoOoo;
          paramView.setTransition(localTransition1);
          paramView.OoooOoO();
          return;
        }
      }
      if (k != 0)
      {
        j = this.o00Ooo0 & 0x10;
        if (j != 0)
        {
          localTransition1 = this.o00OoOoo;
          paramView.setTransition(localTransition1);
          paramView.Ooooo00();
          return;
        }
      }
      float f4;
      if (n != 0)
      {
        j = this.o00Ooo0 & 0x100;
        if (j != 0)
        {
          localTransition1 = this.o00OoOoo;
          paramView.setTransition(localTransition1);
          j = 1065353216;
          f4 = 1.0F;
        }
      }
      for (;;)
      {
        paramView.setProgress(f4);
        break;
        if (k == 0) {
          break;
        }
        j = this.o00Ooo0 & 0x1000;
        if (j == 0) {
          break;
        }
        localTransition1 = this.o00OoOoo;
        paramView.setTransition(localTransition1);
        j = 0;
        f4 = 0.0F;
        localTransition1 = null;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
 * JD-Core Version:    0.7.0.1
 */