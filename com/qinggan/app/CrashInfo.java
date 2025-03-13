package com.qinggan.app;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import m54207b69;

class CrashInfo
{
  public String OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public String OooO0o0;
  public String OooO0oO;
  
  public CrashInfo() {}
  
  public CrashInfo(Throwable paramThrowable)
  {
    Object localObject1 = new java/io/StringWriter;
    ((StringWriter)localObject1).<init>();
    Object localObject2 = new java/io/PrintWriter;
    ((PrintWriter)localObject2).<init>((Writer)localObject1);
    paramThrowable.printStackTrace((PrintWriter)localObject2);
    localObject1 = ((StringWriter)localObject1).toString();
    this.OooO0OO = ((String)localObject1);
    localObject1 = paramThrowable.getMessage();
    this.OooO0O0 = ((String)localObject1);
    localObject1 = paramThrowable;
    for (;;)
    {
      localObject2 = paramThrowable.getCause();
      if (localObject2 == null) {
        break;
      }
      paramThrowable = paramThrowable.getCause();
      localObject2 = paramThrowable.getStackTrace();
      if (localObject2 != null)
      {
        localObject2 = paramThrowable.getStackTrace();
        i = localObject2.length;
        if (i > 0) {
          localObject1 = paramThrowable;
        }
      }
      localObject2 = paramThrowable.getMessage();
      if (localObject2 != null)
      {
        int j = ((String)localObject2).length();
        if (j > 0) {
          this.OooO0O0 = ((String)localObject2);
        }
      }
    }
    paramThrowable = localObject1.getClass().getName();
    this.OooO00o = paramThrowable;
    paramThrowable = ((Throwable)localObject1).getStackTrace();
    int k = paramThrowable.length;
    int i = 0;
    localObject2 = null;
    if (k > 0)
    {
      paramThrowable = localObject1.getStackTrace()[0];
      localObject1 = paramThrowable.getFileName();
      this.OooO0o0 = ((String)localObject1);
      localObject1 = paramThrowable.getClassName();
      this.OooO0Oo = ((String)localObject1);
      localObject1 = paramThrowable.getMethodName();
      this.OooO0oO = ((String)localObject1);
      k = paramThrowable.getLineNumber();
      this.OooO0o = k;
    }
    else
    {
      paramThrowable = m54207b69.F54207b69_11("Y*5F45434749624A");
      this.OooO0o0 = paramThrowable;
      this.OooO0Oo = paramThrowable;
      this.OooO0oO = paramThrowable;
      this.OooO0o = 0;
    }
  }
  
  public void OooO00o(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(paramString);
    String str = m54207b69.F54207b69_11("5J2F332B323E43292C2C1230364546123A3740827D");
    ((StringBuilder)localObject).append(str);
    str = this.OooO00o;
    ((StringBuilder)localObject).append(str);
    str = "\n";
    ((StringBuilder)localObject).append(str);
    localObject = ((StringBuilder)localObject).toString();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    localObject = m54207b69.F54207b69_11("OW323036352B28443F41233C2F30433E417D88");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0O0;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(str);
    localObject = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    localObject = m54207b69.F54207b69_11("QG3330372B340634322A1230352E8A75");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0o0;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(str);
    localObject = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    localObject = m54207b69.F54207b69_11(",q051A05210A3723170A0B491B28215960");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0Oo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(str);
    localObject = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    localObject = m54207b69.F54207b69_11("GS273C233F28233C2E434541283E4B447883");
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0oO;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(str);
    localObject = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    localObject = m54207b69.F54207b69_11("iy0D120D19123A161E2440161F2729195269");
    localStringBuilder.append((String)localObject);
    int i = this.OooO0o;
    localStringBuilder.append(i);
    localStringBuilder.append(str);
    localObject = localStringBuilder.toString();
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(paramString);
    paramString = m54207b69.F54207b69_11("O1424652555E6A49575A5D151C");
    localStringBuilder.append(paramString);
    paramString = this.OooO0OO;
    localStringBuilder.append(paramString);
    localStringBuilder.append(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.CrashInfo
 * JD-Core Version:    0.7.0.1
 */