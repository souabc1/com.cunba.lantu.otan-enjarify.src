package com.qinggan.navi;

import java.io.Serializable;
import m54207b69;

public class NaviLaneInfo
  implements Serializable
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  
  public int getLaneDirectionType()
  {
    return this.o00OoOoo;
  }
  
  public int getLaneType()
  {
    return this.o00Ooo00;
  }
  
  public int getLaneValidType()
  {
    return this.o00Ooo0;
  }
  
  public void setLaneDirectionType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setLaneType(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setLaneValidType(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject = m54207b69.F54207b69_11("HE2B25352F0D29312714342D358B");
    localStringBuffer.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("Re082A060E0436221C084E625051");
    ((StringBuilder)localObject).append(str);
    int i = this.o00Ooo00;
    ((StringBuilder)localObject).append(i);
    localObject = ((StringBuilder)localObject).toString();
    localStringBuffer.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = m54207b69.F54207b69_11("yc0E3004100A3A0816121041251F13516D5354");
    ((StringBuilder)localObject).append(str);
    i = this.o00Ooo0;
    ((StringBuilder)localObject).append(i);
    localObject = ((StringBuilder)localObject).toString();
    localStringBuffer.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = m54207b69.F54207b69_11("hG2A0C282C2608343C2A2D3D393436214D4733797A8E7C7D");
    ((StringBuilder)localObject).append(str);
    i = this.o00OoOoo;
    ((StringBuilder)localObject).append(i);
    localObject = ((StringBuilder)localObject).toString();
    localStringBuffer.append((String)localObject);
    localObject = new java/lang/String;
    ((String)localObject).<init>(localStringBuffer);
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviLaneInfo
 * JD-Core Version:    0.7.0.1
 */