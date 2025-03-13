package com.qinggan.audiopolicy;

import android.os.IBinder.DeathRecipient;
import java.util.List;

class AudioPolicyManager$7
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    synchronized ()
    {
      ??? = this.OooO00o;
      AudioPolicyManager.OooO0Oo((AudioPolicyManager)???, null);
      ??? = this.OooO00o;
      AudioPolicyManager.OooO0o0((AudioPolicyManager)???, false);
      ??? = this.OooO00o;
      AudioPolicyManager.OooO0o((AudioPolicyManager)???);
      synchronized (AudioPolicyManager.OooOOOO())
      {
        ??? = this.OooO00o;
        ??? = AudioPolicyManager.OooOOOo((AudioPolicyManager)???);
        ((List)???).clear();
        ??? = this.OooO00o;
        AudioPolicyManager.OooO0oO((AudioPolicyManager)???, false);
        return;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioPolicyManager.7
 * JD-Core Version:    0.7.0.1
 */