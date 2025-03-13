package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class KeyCycleOscillator
{
  public CurveFit OooO00o;
  public KeyCycleOscillator.CycleOscillator OooO0O0;
  public String OooO0OO;
  public int OooO0Oo = 0;
  public int OooO0o = 0;
  public String OooO0o0 = null;
  public ArrayList OooO0oO;
  
  public KeyCycleOscillator()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0oO = localArrayList;
  }
  
  public float OooO00o(float paramFloat)
  {
    return (float)this.OooO0O0.OooO0O0(paramFloat);
  }
  
  public float OooO0O0(float paramFloat)
  {
    return (float)this.OooO0O0.OooO00o(paramFloat);
  }
  
  public void OooO0OO(int paramInt1, int paramInt2, String paramString, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    KeyCycleOscillator localKeyCycleOscillator = this;
    ArrayList localArrayList = this.OooO0oO;
    KeyCycleOscillator.WavePoint localWavePoint = new androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$WavePoint;
    localWavePoint.<init>(paramInt1, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    localArrayList.add(localWavePoint);
    int i = -1;
    if (paramInt3 != i) {
      this.OooO0o = paramInt3;
    }
    localKeyCycleOscillator.OooO0Oo = paramInt2;
    localKeyCycleOscillator.OooO0o0 = paramString;
  }
  
  public void OooO0Oo(int paramInt1, int paramInt2, String paramString, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Object paramObject)
  {
    KeyCycleOscillator localKeyCycleOscillator = this;
    ArrayList localArrayList = this.OooO0oO;
    KeyCycleOscillator.WavePoint localWavePoint = new androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$WavePoint;
    localWavePoint.<init>(paramInt1, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    localArrayList.add(localWavePoint);
    int i = -1;
    if (paramInt3 != i) {
      this.OooO0o = paramInt3;
    }
    localKeyCycleOscillator.OooO0Oo = paramInt2;
    setCustom(paramObject);
    localKeyCycleOscillator.OooO0o0 = paramString;
  }
  
  public boolean OooO0o0()
  {
    int i = this.OooO0o;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public CurveFit getCurveFit()
  {
    return this.OooO00o;
  }
  
  public void setCustom(Object paramObject) {}
  
  public void setType(String paramString)
  {
    this.OooO0OO = paramString;
  }
  
  public void setup(float paramFloat)
  {
    KeyCycleOscillator localKeyCycleOscillator = this;
    Object localObject1 = this.OooO0oO;
    int i = ((ArrayList)localObject1).size();
    if (i == 0) {
      return;
    }
    Object localObject2 = this.OooO0oO;
    Object localObject3 = new androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$1;
    ((KeyCycleOscillator.1)localObject3).<init>(this);
    Collections.sort((List)localObject2, (Comparator)localObject3);
    localObject2 = new double[i];
    int j = 3;
    localObject3 = new int[] { i, j };
    localObject3 = (double[][])Array.newInstance(Double.TYPE, (int[])localObject3);
    KeyCycleOscillator.CycleOscillator localCycleOscillator = new androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$CycleOscillator;
    int k = this.OooO0Oo;
    Object localObject4 = this.OooO0o0;
    int m = this.OooO0o;
    localCycleOscillator.<init>(k, (String)localObject4, m, i);
    this.OooO0O0 = localCycleOscillator;
    localObject1 = this.OooO0oO.iterator();
    localCycleOscillator = null;
    int n = 0;
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      Object localObject5 = (KeyCycleOscillator.WavePoint)((Iterator)localObject1).next();
      float f1 = ((KeyCycleOscillator.WavePoint)localObject5).OooO0Oo;
      double d1 = f1 * 0.01D;
      localObject2[n] = d1;
      localObject4 = localObject3[n];
      float f2 = ((KeyCycleOscillator.WavePoint)localObject5).OooO0O0;
      double d2 = f2;
      localObject4[0] = d2;
      float f3 = ((KeyCycleOscillator.WavePoint)localObject5).OooO0OO;
      double d3 = f3;
      int i1 = 1;
      localObject4[i1] = d3;
      float f4 = ((KeyCycleOscillator.WavePoint)localObject5).OooO0o0;
      d3 = f4;
      localObject4[2] = d3;
      localObject4 = localKeyCycleOscillator.OooO0O0;
      m = ((KeyCycleOscillator.WavePoint)localObject5).OooO00o;
      localObject5 = localObject4;
      ((KeyCycleOscillator.CycleOscillator)localObject4).OooO0OO(n, m, f1, f3, f4, f2);
      n += i1;
    }
    localKeyCycleOscillator.OooO0O0.setup(paramFloat);
    localObject1 = CurveFit.OooO00o(0, (double[])localObject2, (double[][])localObject3);
    localKeyCycleOscillator.OooO00o = ((CurveFit)localObject1);
  }
  
  public String toString()
  {
    String str = this.OooO0OO;
    DecimalFormat localDecimalFormat = new java/text/DecimalFormat;
    localDecimalFormat.<init>("##.##");
    Iterator localIterator = this.OooO0oO.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      KeyCycleOscillator.WavePoint localWavePoint = (KeyCycleOscillator.WavePoint)localIterator.next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append("[");
      int i = localWavePoint.OooO00o;
      localStringBuilder.append(i);
      localStringBuilder.append(" , ");
      float f = localWavePoint.OooO0O0;
      double d = f;
      str = localDecimalFormat.format(d);
      localStringBuilder.append(str);
      localStringBuilder.append("] ");
      str = localStringBuilder.toString();
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
 * JD-Core Version:    0.7.0.1
 */