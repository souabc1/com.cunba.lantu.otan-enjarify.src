package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import m54207b69;

public enum Handle
{
  public HandleHelper o00OoOoo;
  
  static
  {
    Handle localHandle1 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    Object localObject1 = new com/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;
    Object localObject2 = Edge.o00Ooo0;
    Object localObject3 = Edge.o00Ooo00;
    ((CornerHandleHelper)localObject1).<init>((Edge)localObject2, (Edge)localObject3);
    Object localObject4 = m54207b69.F54207b69_11(">P04200212201A1C0B");
    localHandle1.<init>((String)localObject4, 0, (HandleHelper)localObject1);
    o00Ooo00 = localHandle1;
    localObject1 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject4 = new com/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;
    Object localObject5 = Edge.o00Ooo0O;
    ((CornerHandleHelper)localObject4).<init>((Edge)localObject2, (Edge)localObject5);
    Object localObject6 = m54207b69.F54207b69_11("'q253F2331273D3C402D");
    ((Handle)localObject1).<init>((String)localObject6, 1, (HandleHelper)localObject4);
    o00Ooo0 = (Handle)localObject1;
    localObject4 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject6 = new com/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;
    Object localObject7 = Edge.o00Ooo0o;
    ((CornerHandleHelper)localObject6).<init>((Edge)localObject7, (Edge)localObject3);
    Object localObject8 = m54207b69.F54207b69_11("hR101E0809212413251F1D10");
    ((Handle)localObject4).<init>((String)localObject8, 2, (HandleHelper)localObject6);
    o00Ooo0O = (Handle)localObject4;
    localObject6 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject8 = new com/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;
    ((CornerHandleHelper)localObject8).<init>((Edge)localObject7, (Edge)localObject5);
    Object localObject9 = m54207b69.F54207b69_11("]/6D617D7E646776846E717186");
    ((Handle)localObject6).<init>((String)localObject9, 3, (HandleHelper)localObject8);
    o00Ooo0o = (Handle)localObject6;
    localObject8 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject9 = new com/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;
    ((VerticalHandleHelper)localObject9).<init>((Edge)localObject3);
    localObject3 = m54207b69.F54207b69_11("@c2F27273A");
    ((Handle)localObject8).<init>((String)localObject3, 4, (HandleHelper)localObject9);
    o00OooO0 = (Handle)localObject8;
    localObject9 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject3 = new com/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;
    ((HorizontalHandleHelper)localObject3).<init>((Edge)localObject2);
    ((Handle)localObject9).<init>("TOP", 5, (HandleHelper)localObject3);
    o00OooO = (Handle)localObject9;
    Handle localHandle2 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject2 = new com/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;
    ((VerticalHandleHelper)localObject2).<init>((Edge)localObject5);
    localObject3 = m54207b69.F54207b69_11("|I1B01100421");
    localHandle2.<init>((String)localObject3, 6, (HandleHelper)localObject2);
    o00OooOO = localHandle2;
    Handle localHandle3 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject2 = new com/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;
    ((HorizontalHandleHelper)localObject2).<init>((Edge)localObject7);
    localObject3 = m54207b69.F54207b69_11("45777B63647E7D");
    localHandle3.<init>((String)localObject3, 7, (HandleHelper)localObject2);
    o00OooOo = localHandle3;
    Handle localHandle4 = new com/xuexiang/xui/widget/imageview/crop/Handle;
    localObject2 = new com/xuexiang/xui/widget/imageview/crop/CenterHandleHelper;
    ((CenterHandleHelper)localObject2).<init>();
    localObject3 = m54207b69.F54207b69_11("Pb21282E392B35");
    localHandle4.<init>((String)localObject3, 8, (HandleHelper)localObject2);
    o0O00o0 = localHandle4;
    localObject2 = localObject4;
    localObject3 = localObject6;
    localObject4 = localObject8;
    localObject5 = localObject9;
    localObject6 = localHandle2;
    localObject7 = localHandle3;
    localObject8 = localHandle4;
    Handle[] tmp367_364 = new Handle[9];
    Handle[] tmp368_367 = tmp367_364;
    Handle[] tmp368_367 = tmp367_364;
    tmp368_367[0] = localHandle1;
    tmp368_367[1] = localObject1;
    Handle[] tmp375_368 = tmp368_367;
    Handle[] tmp375_368 = tmp368_367;
    tmp375_368[2] = localObject2;
    tmp375_368[3] = localObject3;
    Handle[] tmp382_375 = tmp375_368;
    Handle[] tmp382_375 = tmp375_368;
    tmp382_375[4] = localObject4;
    tmp382_375[5] = localObject9;
    Handle[] tmp391_382 = tmp382_375;
    Handle[] tmp391_382 = tmp382_375;
    tmp391_382[6] = localHandle2;
    tmp391_382[7] = localHandle3;
    tmp391_382[8] = localHandle4;
  }
  
  public Handle(HandleHelper paramHandleHelper)
  {
    this.o00OoOoo = paramHandleHelper;
  }
  
  public void OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3, Rect paramRect, float paramFloat4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    localFloat = Float.valueOf(paramFloat3);
    arrayOfObject[3] = localFloat;
    arrayOfObject[4] = paramRect;
    localFloat = Float.valueOf(paramFloat4);
    arrayOfObject[5] = localFloat;
    m54207b69.F54207b69_00(3837, arrayOfObject);
  }
  
  public void OooO0OO(float paramFloat1, float paramFloat2, Rect paramRect, float paramFloat3)
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
    m54207b69.F54207b69_00(3838, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.crop.Handle
 * JD-Core Version:    0.7.0.1
 */