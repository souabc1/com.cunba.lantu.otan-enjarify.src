package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

public abstract class Violation
  extends RuntimeException
{
  public final Fragment o00OoOoo;
  
  public Violation(Fragment paramFragment, String paramString)
  {
    super(paramString);
    this.o00OoOoo = paramFragment;
  }
  
  public final Fragment getFragment()
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.Violation
 * JD-Core Version:    0.7.0.1
 */