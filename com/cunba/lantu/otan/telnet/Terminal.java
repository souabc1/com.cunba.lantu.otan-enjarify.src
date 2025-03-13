package com.cunba.lantu.otan.telnet;

import android.content.Context;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import m54207b69;

public class Terminal
{
  public static final Object OooO0oO;
  public static Terminal OooO0oo;
  public final String OooO00o;
  public Telnet OooO0O0;
  public Telnet OooO0OO;
  public Telnet OooO0Oo;
  public final ReentrantLock OooO0o;
  public Boolean OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oO = localObject;
    localObject = new com/cunba/lantu/otan/telnet/Terminal;
    ((Terminal)localObject).<init>();
    OooO0oo = (Terminal)localObject;
  }
  
  private Terminal()
  {
    Object localObject = m54207b69.F54207b69_11("dQ2123737F383C7783467A0B23218A1E1226137E25302A8744894F3D4F3D8E9A469157455745965398584F649CA2574F52687057A4A995A9B4ABAE9DB09EB2A36BB6B26FB47A687A68B9C571BC7C7388C07DC288768876C7D37FCAD06866D38BD096849684D5E18DD89E8C9E8CDDD0DDE6D0");
    this.OooO00o = ((String)localObject);
    localObject = Boolean.TRUE;
    this.OooO0o0 = ((Boolean)localObject);
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.OooO0o = ((ReentrantLock)localObject);
    localObject = new com/cunba/lantu/otan/telnet/Telnet;
    ((Telnet)localObject).<init>();
    this.OooO0O0 = ((Telnet)localObject);
    localObject = new com/cunba/lantu/otan/telnet/Telnet;
    ((Telnet)localObject).<init>();
    this.OooO0OO = ((Telnet)localObject);
    localObject = new com/cunba/lantu/otan/telnet/Telnet;
    ((Telnet)localObject).<init>();
    this.OooO0Oo = ((Telnet)localObject);
    localObject = new java/lang/Thread;
    Terminal.1 local1 = new com/cunba/lantu/otan/telnet/Terminal$1;
    local1.<init>(this);
    String str = m54207b69.F54207b69_11("~84C5E565961511E625C5A676158");
    ((Thread)localObject).<init>(local1, str);
    ((Thread)localObject).start();
  }
  
  public static Terminal getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (Terminal)m54207b69.F54207b69_09(517, arrayOfObject);
  }
  
  public List OooO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    return (List)m54207b69.F54207b69_09(501, arrayOfObject);
  }
  
  public void OooO0o(String[] paramArrayOfString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(506, arrayOfObject);
  }
  
  public boolean OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(507, arrayOfObject);
  }
  
  public void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(508, arrayOfObject);
  }
  
  public String OooO0oo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (String)m54207b69.F54207b69_09(509, arrayOfObject);
  }
  
  public String OooOO0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (String)m54207b69.F54207b69_09(510, arrayOfObject);
  }
  
  public void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(511, arrayOfObject);
  }
  
  public void OooOO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(512, arrayOfObject);
  }
  
  public final void OooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(513, arrayOfObject);
  }
  
  public void OooOOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(514, arrayOfObject);
  }
  
  public void OooOOOO(String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(515, arrayOfObject);
  }
  
  public void OooOOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(516, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.telnet.Terminal
 * JD-Core Version:    0.7.0.1
 */