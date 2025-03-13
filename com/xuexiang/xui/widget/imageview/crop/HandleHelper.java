package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import m54207b69;

abstract class HandleHelper
{
  public Edge OooO00o;
  public Edge OooO0O0;
  public EdgePair OooO0OO;
  
  public HandleHelper(Edge paramEdge1, Edge paramEdge2)
  {
    this.OooO00o = paramEdge1;
    this.OooO0O0 = paramEdge2;
    EdgePair localEdgePair = new com/xuexiang/xui/widget/imageview/crop/EdgePair;
    localEdgePair.<init>(paramEdge1, paramEdge2);
    this.OooO0OO = localEdgePair;
  }
  
  public EdgePair OooO00o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    localFloat = Float.valueOf(paramFloat3);
    arrayOfObject[3] = localFloat;
    return (EdgePair)m54207b69.F54207b69_09(3841, arrayOfObject);
  }
  
  public final float OooO0O0(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    return m54207b69.F54207b69_07(3842, arrayOfObject);
  }
  
  public abstract void OooO0OO(float paramFloat1, float paramFloat2, float paramFloat3, Rect paramRect, float paramFloat4);
  
  public void OooO0Oo(float paramFloat1, float paramFloat2, Rect paramRect, float paramFloat3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    arrayOfObject[3] = paramRect;
    localFloat = Float.valueOf(paramFloat3);
    arrayOfObject[4] = localFloat;
    m54207b69.F54207b69_00(3843, arrayOfObject);
  }
  
  public EdgePair getActiveEdges()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (EdgePair)m54207b69.F54207b69_09(3844, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.crop.HandleHelper
 * JD-Core Version:    0.7.0.1
 */