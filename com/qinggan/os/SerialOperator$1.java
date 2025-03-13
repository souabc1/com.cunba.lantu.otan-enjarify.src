package com.qinggan.os;

import java.io.InputStream;
import m54207b69;

class SerialOperator$1
  extends Thread
{
  public void run()
  {
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool = SerialOperator.OooO00o((SerialOperator)localObject1);
      if (bool) {
        break;
      }
      try
      {
        localObject1 = this.o00OoOoo;
        localObject1 = SerialOperator.OooO0O0((SerialOperator)localObject1);
        localObject2 = this.o00OoOoo;
        localObject2 = ((SerialOperator)localObject2).OooOO0;
        int i = ((InputStream)localObject1).read((byte[])localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "+p2316041C1521281C191D545B";
        localObject3 = m54207b69.F54207b69_11((String)localObject3);
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(i);
        if (i > 0)
        {
          localObject2 = this.o00OoOoo;
          localObject2 = SerialOperator.OooO0OO((SerialOperator)localObject2);
          if (localObject2 != null)
          {
            localObject2 = this.o00OoOoo;
            localObject2 = SerialOperator.OooO0OO((SerialOperator)localObject2);
            localObject3 = this.o00OoOoo;
            localObject3 = ((SerialOperator)localObject3).OooOO0;
            ((SerialCallback)localObject2).OooO00o((byte[])localObject3, i);
          }
        }
        long l = 200L;
        Thread.sleep(l);
      }
      catch (Exception localException)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = m54207b69.F54207b69_11("?(7B4E5C444D49805451551C13795D595C686D535A5A271E");
        ((StringBuilder)localObject2).append((String)localObject3);
        String str = localException.getMessage();
        ((StringBuilder)localObject2).append(str);
      }
    }
    SerialOperator.OooO0Oo(this.o00OoOoo, true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.SerialOperator.1
 * JD-Core Version:    0.7.0.1
 */