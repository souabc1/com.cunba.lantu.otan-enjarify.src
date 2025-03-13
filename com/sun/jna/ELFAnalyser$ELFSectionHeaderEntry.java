package com.sun.jna;

import java.nio.ByteBuffer;
import m54207b69;

class ELFAnalyser$ELFSectionHeaderEntry
{
  public final int OooO00o;
  public String OooO0O0;
  public final int OooO0OO;
  public final int OooO0Oo;
  public final int OooO0o;
  public final int OooO0o0;
  
  public ELFAnalyser$ELFSectionHeaderEntry(boolean paramBoolean, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt(0);
    this.OooO00o = i;
    i = paramByteBuffer.getInt(4);
    this.OooO0OO = i;
    i = 8;
    long l1;
    if (paramBoolean)
    {
      l1 = paramByteBuffer.getLong(i);
    }
    else
    {
      i = paramByteBuffer.getInt(i);
      l1 = i;
    }
    i = (int)l1;
    this.OooO0Oo = i;
    if (paramBoolean)
    {
      i = 24;
      l1 = paramByteBuffer.getLong(i);
    }
    else
    {
      i = paramByteBuffer.getInt(16);
      l1 = i;
    }
    i = (int)l1;
    this.OooO0o0 = i;
    long l2;
    if (paramBoolean)
    {
      paramBoolean = true;
      l2 = paramByteBuffer.getLong(paramBoolean);
    }
    else
    {
      paramBoolean = paramByteBuffer.getInt(20);
      l2 = paramBoolean;
    }
    paramBoolean = (int)l2;
    this.OooO0o = paramBoolean;
  }
  
  public int getFlags()
  {
    return this.OooO0Oo;
  }
  
  public String getName()
  {
    return this.OooO0O0;
  }
  
  public int getNameOffset()
  {
    return this.OooO00o;
  }
  
  public int getOffset()
  {
    return this.OooO0o0;
  }
  
  public int getSize()
  {
    return this.OooO0o;
  }
  
  public int getType()
  {
    return this.OooO0OO;
  }
  
  public void setName(String paramString)
  {
    this.OooO0O0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("hT1119140A353C26444343263C413D3F35214B32394144504C514A374B4886");
    localStringBuilder.append(str);
    int i = this.OooO00o;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("VG6B682B292E2780");
    localStringBuilder.append(str);
    str = this.OooO0O0;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("Ei454A1F131D115A");
    localStringBuilder.append(str);
    i = this.OooO0OO;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("cY757A41383C43306B");
    localStringBuilder.append(str);
    i = this.OooO0Oo;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("h.020F434B4C6251611B");
    localStringBuilder.append(str);
    i = this.OooO0o0;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("N]717E30372B3D66");
    localStringBuilder.append(str);
    i = this.OooO0o;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry
 * JD-Core Version:    0.7.0.1
 */