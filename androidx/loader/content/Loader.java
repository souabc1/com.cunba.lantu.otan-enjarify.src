package androidx.loader.content;

import android.content.Context;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{
  public boolean OooO;
  public int OooO00o;
  public Loader.OnLoadCompleteListener OooO0O0;
  public Loader.OnLoadCanceledListener OooO0OO;
  public Context OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public boolean OooO0oO;
  public boolean OooO0oo;
  
  public void OooO() {}
  
  public void OooO00o()
  {
    this.OooO0o = true;
    OooO();
  }
  
  public boolean OooO0O0()
  {
    return OooOO0();
  }
  
  public void OooO0OO()
  {
    this.OooO = false;
  }
  
  public String OooO0Oo(Object paramObject)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    DebugUtils.OooO00o(paramObject, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void OooO0o(Object paramObject)
  {
    Loader.OnLoadCompleteListener localOnLoadCompleteListener = this.OooO0O0;
    if (localOnLoadCompleteListener != null) {
      localOnLoadCompleteListener.OooO00o(this, paramObject);
    }
  }
  
  public void OooO0o0()
  {
    Loader.OnLoadCanceledListener localOnLoadCanceledListener = this.OooO0OO;
    if (localOnLoadCanceledListener != null) {
      localOnLoadCanceledListener.OooO00o(this);
    }
  }
  
  public void OooO0oO(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    int i = this.OooO00o;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mListener=");
    paramFileDescriptor = this.OooO0O0;
    paramPrintWriter.println(paramFileDescriptor);
    boolean bool1 = this.OooO0o0;
    if (!bool1)
    {
      bool1 = this.OooO0oo;
      if (!bool1)
      {
        bool1 = this.OooO;
        if (!bool1) {
          break label133;
        }
      }
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    bool1 = this.OooO0o0;
    paramPrintWriter.print(bool1);
    paramPrintWriter.print(" mContentChanged=");
    bool1 = this.OooO0oo;
    paramPrintWriter.print(bool1);
    paramFileDescriptor = " mProcessingChange=";
    paramPrintWriter.print(paramFileDescriptor);
    bool1 = this.OooO;
    paramPrintWriter.println(bool1);
    label133:
    bool1 = this.OooO0o;
    if (!bool1)
    {
      bool1 = this.OooO0oO;
      if (!bool1) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      boolean bool2 = this.OooO0o;
      paramPrintWriter.print(bool2);
      paramString = " mReset=";
      paramPrintWriter.print(paramString);
      bool2 = this.OooO0oO;
      paramPrintWriter.println(bool2);
    }
  }
  
  public void OooO0oo()
  {
    OooOO0o();
  }
  
  public boolean OooOO0()
  {
    return false;
  }
  
  public void OooOO0O()
  {
    boolean bool = this.OooO0o0;
    if (bool)
    {
      OooO0oo();
    }
    else
    {
      bool = true;
      this.OooO0oo = bool;
    }
  }
  
  public void OooOO0o() {}
  
  public void OooOOO() {}
  
  public void OooOOO0() {}
  
  public void OooOOOO() {}
  
  public void OooOOOo()
  {
    OooOOO0();
    this.OooO0oO = true;
    this.OooO0o0 = false;
    this.OooO0o = false;
    this.OooO0oo = false;
    this.OooO = false;
  }
  
  public final void OooOOo()
  {
    this.OooO0o0 = true;
    this.OooO0oO = false;
    this.OooO0o = false;
    OooOOO();
  }
  
  public void OooOOo0()
  {
    boolean bool = this.OooO;
    if (bool) {
      OooOO0O();
    }
  }
  
  public void OooOOoo()
  {
    this.OooO0o0 = false;
    OooOOOO();
  }
  
  public void OooOo0(Loader.OnLoadCompleteListener paramOnLoadCompleteListener)
  {
    Loader.OnLoadCompleteListener localOnLoadCompleteListener = this.OooO0O0;
    if (localOnLoadCompleteListener != null)
    {
      if (localOnLoadCompleteListener == paramOnLoadCompleteListener)
      {
        this.OooO0O0 = null;
        return;
      }
      paramOnLoadCompleteListener = new java/lang/IllegalArgumentException;
      paramOnLoadCompleteListener.<init>("Attempting to unregister the wrong listener");
      throw paramOnLoadCompleteListener;
    }
    paramOnLoadCompleteListener = new java/lang/IllegalStateException;
    paramOnLoadCompleteListener.<init>("No listener register");
    throw paramOnLoadCompleteListener;
  }
  
  public boolean OooOo00()
  {
    boolean bool1 = this.OooO0oo;
    this.OooO0oo = false;
    boolean bool2 = this.OooO | bool1;
    this.OooO = bool2;
    return bool1;
  }
  
  public Context getContext()
  {
    return this.OooO0Oo;
  }
  
  public int getId()
  {
    return this.OooO00o;
  }
  
  public boolean isAbandoned()
  {
    return this.OooO0o;
  }
  
  public boolean isReset()
  {
    return this.OooO0oO;
  }
  
  public boolean isStarted()
  {
    return this.OooO0o0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    DebugUtils.OooO00o(this, localStringBuilder);
    localStringBuilder.append(" id=");
    int i = this.OooO00o;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.Loader
 * JD-Core Version:    0.7.0.1
 */