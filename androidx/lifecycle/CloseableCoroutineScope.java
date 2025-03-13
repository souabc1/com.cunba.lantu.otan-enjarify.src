package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

public final class CloseableCoroutineScope
  implements Closeable, CoroutineScope
{
  public final CoroutineContext o00OoOoo;
  
  public void close()
  {
    JobKt.OooO0Oo(getCoroutineContext(), null, 1, null);
  }
  
  public CoroutineContext getCoroutineContext()
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.CloseableCoroutineScope
 * JD-Core Version:    0.7.0.1
 */