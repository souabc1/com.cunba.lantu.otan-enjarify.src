package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import java.util.HashMap;

public class DesignTool
  implements ProxyInterface
{
  public static final HashMap OooO0oO;
  public static final HashMap OooO0oo;
  public final MotionLayout OooO00o;
  public MotionScene OooO0O0;
  public String OooO0OO = null;
  public String OooO0Oo = null;
  public int OooO0o;
  public int OooO0o0;
  
  static
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    OooO0oO = (HashMap)localObject1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    OooO0oo = localHashMap;
    Object localObject2 = Integer.valueOf(4);
    Object localObject3 = Pair.create(localObject2, localObject2);
    String str1 = "layout_constraintBottom_toBottomOf";
    ((HashMap)localObject1).put(localObject3, str1);
    localObject3 = Integer.valueOf(3);
    Object localObject4 = Pair.create(localObject2, localObject3);
    String str2 = "layout_constraintBottom_toTopOf";
    ((HashMap)localObject1).put(localObject4, str2);
    localObject2 = Pair.create(localObject3, localObject2);
    localObject4 = "layout_constraintTop_toBottomOf";
    ((HashMap)localObject1).put(localObject2, localObject4);
    localObject2 = Pair.create(localObject3, localObject3);
    localObject3 = "layout_constraintTop_toTopOf";
    ((HashMap)localObject1).put(localObject2, localObject3);
    localObject2 = Integer.valueOf(6);
    Object localObject5 = Pair.create(localObject2, localObject2);
    String str3 = "layout_constraintStart_toStartOf";
    ((HashMap)localObject1).put(localObject5, str3);
    localObject5 = Integer.valueOf(7);
    Object localObject6 = Pair.create(localObject2, localObject5);
    String str4 = "layout_constraintStart_toEndOf";
    ((HashMap)localObject1).put(localObject6, str4);
    localObject2 = Pair.create(localObject5, localObject2);
    localObject6 = "layout_constraintEnd_toStartOf";
    ((HashMap)localObject1).put(localObject2, localObject6);
    localObject2 = Pair.create(localObject5, localObject5);
    localObject5 = "layout_constraintEnd_toEndOf";
    ((HashMap)localObject1).put(localObject2, localObject5);
    localObject2 = Integer.valueOf(1);
    Object localObject7 = Pair.create(localObject2, localObject2);
    String str5 = "layout_constraintLeft_toLeftOf";
    ((HashMap)localObject1).put(localObject7, str5);
    localObject7 = Integer.valueOf(2);
    Pair localPair = Pair.create(localObject2, localObject7);
    String str6 = "layout_constraintLeft_toRightOf";
    ((HashMap)localObject1).put(localPair, str6);
    localPair = Pair.create(localObject7, localObject7);
    String str7 = "layout_constraintRight_toRightOf";
    ((HashMap)localObject1).put(localPair, str7);
    localObject2 = Pair.create(localObject7, localObject2);
    localObject7 = "layout_constraintRight_toLeftOf";
    ((HashMap)localObject1).put(localObject2, localObject7);
    localObject2 = Integer.valueOf(5);
    localObject2 = Pair.create(localObject2, localObject2);
    ((HashMap)localObject1).put(localObject2, "layout_constraintBaseline_toBaselineOf");
    localObject1 = "layout_marginBottom";
    localHashMap.put(str1, localObject1);
    localHashMap.put(str2, localObject1);
    localObject1 = "layout_marginTop";
    localHashMap.put(localObject4, localObject1);
    localHashMap.put(localObject3, localObject1);
    localObject1 = "layout_marginStart";
    localHashMap.put(str3, localObject1);
    localHashMap.put(str4, localObject1);
    localHashMap.put(localObject6, "layout_marginEnd");
    localHashMap.put(localObject5, "layout_marginEnd");
    localHashMap.put(str5, "layout_marginLeft");
    localHashMap.put(str6, "layout_marginLeft");
    localHashMap.put(str7, "layout_marginRight");
    localHashMap.put(localObject7, "layout_marginRight");
  }
  
  public DesignTool(MotionLayout paramMotionLayout)
  {
    int i = -1;
    this.OooO0o0 = i;
    this.OooO0o = i;
    this.OooO00o = paramMotionLayout;
  }
  
  public String getEndState()
  {
    MotionLayout localMotionLayout = this.OooO00o;
    int i = localMotionLayout.getEndState();
    int j = this.OooO0o;
    if (j == i) {
      return this.OooO0Oo;
    }
    String str = this.OooO00o.getConstraintSetNames(i);
    if (str != null)
    {
      this.OooO0Oo = str;
      this.OooO0o = i;
    }
    return str;
  }
  
  public float getProgress()
  {
    return this.OooO00o.getProgress();
  }
  
  public String getStartState()
  {
    MotionLayout localMotionLayout = this.OooO00o;
    int i = localMotionLayout.getStartState();
    int j = this.OooO0o0;
    if (j == i) {
      return this.OooO0OO;
    }
    String str = this.OooO00o.getConstraintSetNames(i);
    if (str != null)
    {
      this.OooO0OO = str;
      this.OooO0o0 = i;
    }
    return this.OooO00o.getConstraintSetNames(i);
  }
  
  public String getState()
  {
    String str = this.OooO0OO;
    if (str != null)
    {
      str = this.OooO0Oo;
      if (str != null)
      {
        float f1 = getProgress();
        float f2 = 0.01F;
        boolean bool1 = f1 < f2;
        if (!bool1) {
          return this.OooO0OO;
        }
        int i = 1065185444;
        f2 = 0.99F;
        boolean bool2 = f1 < f2;
        if (!bool2) {
          return this.OooO0Oo;
        }
      }
    }
    return this.OooO0OO;
  }
  
  public long getTransitionTimeMs()
  {
    return this.OooO00o.getTransitionTimeMs();
  }
  
  public boolean isInTransition()
  {
    String str = this.OooO0OO;
    if (str != null)
    {
      str = this.OooO0Oo;
      if (str != null) {
        return true;
      }
    }
    boolean bool = false;
    str = null;
    return bool;
  }
  
  public void setState(String paramString)
  {
    if (paramString == null) {
      paramString = "motion_base";
    }
    Object localObject = this.OooO0OO;
    if (localObject == paramString) {
      return;
    }
    this.OooO0OO = paramString;
    int i = 0;
    this.OooO0Oo = null;
    localObject = this.OooO00o;
    MotionScene localMotionScene = ((MotionLayout)localObject).o00OoOoo;
    if (localMotionScene == null)
    {
      localMotionScene = this.OooO0O0;
      ((MotionLayout)localObject).o00OoOoo = localMotionScene;
    }
    int j = ((MotionLayout)localObject).OoooO00(paramString);
    this.OooO0o0 = j;
    if (j != 0)
    {
      localObject = this.OooO00o;
      i = ((MotionLayout)localObject).getStartState();
      if (j == i)
      {
        paramString = this.OooO00o;
        i = 0;
        localObject = null;
        paramString.setProgress(0.0F);
      }
      else
      {
        localObject = this.OooO00o;
        i = ((MotionLayout)localObject).getEndState();
        float f = 1.0F;
        if (j != i)
        {
          localObject = this.OooO00o;
          ((MotionLayout)localObject).Ooooo0o(j);
        }
        paramString = this.OooO00o;
        paramString.setProgress(f);
      }
    }
    this.OooO00o.requestLayout();
  }
  
  public void setToolPosition(float paramFloat)
  {
    MotionLayout localMotionLayout = this.OooO00o;
    MotionScene localMotionScene = localMotionLayout.o00OoOoo;
    if (localMotionScene == null)
    {
      localMotionScene = this.OooO0O0;
      localMotionLayout.o00OoOoo = localMotionScene;
    }
    localMotionLayout.setProgress(paramFloat);
    this.OooO00o.Oooo0(true);
    this.OooO00o.requestLayout();
    this.OooO00o.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.DesignTool
 * JD-Core Version:    0.7.0.1
 */