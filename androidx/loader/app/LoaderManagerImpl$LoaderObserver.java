package androidx.loader.app;

import androidx.lifecycle.Observer;
import androidx.loader.content.Loader;
import java.io.PrintWriter;

class LoaderManagerImpl$LoaderObserver
  implements Observer
{
  public final Loader OooO00o;
  public final LoaderManager.LoaderCallbacks OooO0O0;
  public boolean OooO0OO;
  
  public void OooO00o(Object paramObject)
  {
    boolean bool = LoaderManagerImpl.OooO0OO;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("  onLoadFinished in ");
      localObject2 = this.OooO00o;
      ((StringBuilder)localObject1).append(localObject2);
      ((StringBuilder)localObject1).append(": ");
      localObject2 = this.OooO00o.OooO0Oo(paramObject);
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    Object localObject1 = this.OooO0O0;
    Object localObject2 = this.OooO00o;
    ((LoaderManager.LoaderCallbacks)localObject1).OooO00o((Loader)localObject2, paramObject);
    this.OooO0OO = true;
  }
  
  public void OooO0O0(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mDeliveredData=");
    boolean bool = this.OooO0OO;
    paramPrintWriter.println(bool);
  }
  
  public boolean OooO0OO()
  {
    return this.OooO0OO;
  }
  
  public void OooO0Oo()
  {
    boolean bool = this.OooO0OO;
    if (bool)
    {
      bool = LoaderManagerImpl.OooO0OO;
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("  Resetting: ");
        localLoader = this.OooO00o;
        ((StringBuilder)localObject).append(localLoader);
      }
      Object localObject = this.OooO0O0;
      Loader localLoader = this.OooO00o;
      ((LoaderManager.LoaderCallbacks)localObject).OooO0O0(localLoader);
    }
  }
  
  public String toString()
  {
    return this.OooO0O0.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.app.LoaderManagerImpl.LoaderObserver
 * JD-Core Version:    0.7.0.1
 */